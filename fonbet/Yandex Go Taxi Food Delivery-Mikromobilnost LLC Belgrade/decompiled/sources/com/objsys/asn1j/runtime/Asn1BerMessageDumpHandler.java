package com.objsys.asn1j.runtime;

import java.io.PrintStream;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public class Asn1BerMessageDumpHandler implements Asn1TaggedEventHandler {
    static final int MaxBytesPerLine = 12;
    int mOffset = 0;
    PrintStream mPrintStream;

    public Asn1BerMessageDumpHandler(PrintStream printStream) {
        this.mPrintStream = printStream;
    }

    private void printOffset() {
        int length = 4 - Integer.toString(this.mOffset).length();
        int i = 0;
        while (true) {
            PrintStream printStream = this.mPrintStream;
            if (i >= length) {
                printStream.getClass();
                this.mPrintStream.getClass();
                return;
            } else {
                printStream.getClass();
                i++;
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1TaggedEventHandler
    public void contents(byte[] bArr) {
        if (bArr.length == 0) {
            return;
        }
        printOffset();
        StringBuffer stringBuffer = new StringBuffer(100);
        StringBuffer stringBuffer2 = new StringBuffer(100);
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            stringBuffer.append(Asn1Util.toHexString(bArr[i]));
            stringBuffer.append(HexString.CHAR_SPACE);
            byte b = bArr[i];
            if (b < 32 || b > Byte.MAX_VALUE) {
                stringBuffer2.append('.');
            } else {
                stringBuffer2.append((char) b);
            }
            i++;
            if (i % 12 == 0) {
                if (z) {
                    z = false;
                } else {
                    this.mPrintStream.getClass();
                }
                PrintStream printStream = this.mPrintStream;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append((Object) stringBuffer);
                stringBuffer3.append(Extension.COLON_SPACE);
                stringBuffer3.append((Object) stringBuffer2);
                printStream.getClass();
                stringBuffer.setLength(0);
                stringBuffer2.setLength(0);
            }
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() < 36) {
                stringBuffer.append(HexString.CHAR_SPACE);
            }
            if (!z) {
                this.mPrintStream.getClass();
            }
            PrintStream printStream2 = this.mPrintStream;
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append((Object) stringBuffer);
            stringBuffer4.append(Extension.COLON_SPACE);
            stringBuffer4.append((Object) stringBuffer2);
            printStream2.getClass();
        }
        this.mOffset += bArr.length;
    }

    @Override // com.objsys.asn1j.runtime.Asn1TaggedEventHandler
    public void endElement(Asn1Tag asn1Tag) {
    }

    @Override // com.objsys.asn1j.runtime.Asn1TaggedEventHandler
    public void startElement(Asn1Tag asn1Tag, int i, byte[] bArr) {
        printOffset();
        int i2 = 0;
        while (i2 < bArr.length) {
            PrintStream printStream = this.mPrintStream;
            Asn1Util.toHexString(bArr[i2]);
            printStream.getClass();
            this.mPrintStream.getClass();
            i2++;
        }
        while (true) {
            PrintStream printStream2 = this.mPrintStream;
            if (i2 >= 12) {
                printStream2.getClass();
                PrintStream printStream3 = this.mPrintStream;
                asn1Tag.isConstructed();
                printStream3.getClass();
                PrintStream printStream4 = this.mPrintStream;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(asn1Tag.toString());
                stringBuffer.append(" ");
                printStream4.getClass();
                PrintStream printStream5 = this.mPrintStream;
                Integer.toString(i);
                printStream5.getClass();
                this.mOffset += bArr.length;
                return;
            }
            printStream2.getClass();
            i2++;
        }
    }
}
