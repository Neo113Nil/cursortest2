package com.objsys.asn1j.runtime;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public class Diag {
    private static Diag mInstance;
    private PrintStream mPrintStream;
    private int mTraceLevel;

    private Diag() {
        this.mPrintStream = System.out;
        this.mTraceLevel = 0;
    }

    public static void hexDump(InputStream inputStream, PrintStream printStream) {
        if (mInstance.isEnabled()) {
            StringBuffer stringBuffer = new StringBuffer(100);
            StringBuffer stringBuffer2 = new StringBuffer(100);
            new Integer(0);
            int i = 0;
            while (true) {
                try {
                    int read = inputStream.read();
                    if (read == -1) {
                        break;
                    }
                    String str = new String(Integer.toHexString(read));
                    int length = str.length();
                    if (length < 2) {
                        stringBuffer.append(MoneyInputEditView.DEFAULT_VALUE);
                        stringBuffer.append(str);
                    } else if (length > 2) {
                        stringBuffer.append(str.charAt(length - 2));
                        stringBuffer.append(str.charAt(length - 1));
                    } else {
                        stringBuffer.append(str);
                    }
                    stringBuffer.append(HexString.CHAR_SPACE);
                    if (read < 32 || read > 127) {
                        stringBuffer2.append('.');
                    } else {
                        stringBuffer2.append((char) read);
                    }
                    i++;
                    if (i % 16 == 0) {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append((Object) stringBuffer);
                        stringBuffer3.append(" ");
                        stringBuffer3.append((Object) stringBuffer2);
                        printStream.getClass();
                        stringBuffer.setLength(0);
                        stringBuffer2.setLength(0);
                    }
                } catch (IOException e) {
                    printStream.getClass();
                    new StringBuffer("I/O exception: ").append(e.toString());
                }
            }
            if (stringBuffer.length() > 0) {
                while (stringBuffer.length() < 48) {
                    stringBuffer.append(HexString.CHAR_SPACE);
                }
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append((Object) stringBuffer);
                stringBuffer4.append(" ");
                stringBuffer4.append((Object) stringBuffer2);
                printStream.getClass();
            }
        }
    }

    public static synchronized Diag instance() {
        Diag diag;
        synchronized (Diag.class) {
            try {
                if (mInstance == null) {
                    mInstance = new Diag();
                }
                diag = mInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return diag;
    }

    public static void prtln(byte[] bArr, int i, int i2) {
        if (instance().isEnabled()) {
            if (i2 <= 8) {
                prtln(Asn1Util.toHexString(bArr, i, i2));
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(Asn1Util.toHexString(bArr, i, 8));
            stringBuffer.append(" ...");
            prtln(stringBuffer.toString());
        }
    }

    public static int setTraceLevel(int i) {
        return instance().setTraceLevel2(i);
    }

    public boolean isEnabled() {
        return this.mTraceLevel > 0;
    }

    public void println(String str, int i) {
        if (isEnabled(i)) {
            this.mPrintStream.getClass();
        }
    }

    public boolean setEnabled(boolean z) {
        boolean z2 = this.mTraceLevel > 0;
        this.mTraceLevel = z ? 1 : 0;
        return z2;
    }

    public void setPrintStream(PrintStream printStream) {
        this.mPrintStream = printStream;
    }

    public int setTraceLevel2(int i) {
        int i2 = this.mTraceLevel;
        this.mTraceLevel = i;
        return i2;
    }

    public boolean isEnabled(int i) {
        return this.mTraceLevel >= i;
    }

    private Diag(PrintStream printStream) {
        this.mPrintStream = printStream;
        this.mTraceLevel = 0;
    }

    public void println(String str) {
        if (this.mTraceLevel > 0) {
            this.mPrintStream.getClass();
        }
    }

    public static void prtln(String str, int i) {
        instance().println(str, i);
    }

    public static void prtln(byte[] bArr, int i, int i2, int i3) {
        if (instance().isEnabled(i3)) {
            prtln(bArr, i, i2);
        }
    }

    public static void prtln(String str) {
        instance().println(str);
    }

    public static void hexDump(byte[] bArr, int i) {
        if (mInstance.isEnabled(i)) {
            hexDump(new ByteArrayInputStream(bArr), System.out);
        }
    }

    public static void hexDump(byte[] bArr) {
        hexDump(new ByteArrayInputStream(bArr), System.out);
    }
}
