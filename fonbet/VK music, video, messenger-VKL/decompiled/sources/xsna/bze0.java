package xsna;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.getkeepsafe.relinker.MissingLibraryException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.zip.ZipFile;
import xsna.y03;

/* compiled from: ReLinkerInstance.java */
/* loaded from: classes12.dex */
public final class bze0 {
    public final HashSet a;
    public final tqn0 b;
    public final y03 c;

    public bze0() {
        tqn0 tqn0Var = new tqn0();
        y03 y03Var = new y03();
        this.a = new HashSet();
        this.b = tqn0Var;
        this.c = y03Var;
    }

    public static void c(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public final File a(Context context, String str) {
        return new File(context.getDir("lib", 0), this.b.a(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x011d, code lost:
    
        r2.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Context context, String str) {
        y03.a b;
        String[] strArr;
        String str2;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        tqn0 tqn0Var = this.b;
        HashSet hashSet = this.a;
        if (hashSet.contains(str)) {
            c("%s already loaded previously!", str);
            return;
        }
        y03.a aVar = null;
        try {
            tqn0Var.getClass();
            System.loadLibrary(str);
            hashSet.add(str);
            c("%s (%s) was loaded normally!", str, null);
        } catch (UnsatisfiedLinkError e) {
            c("Loading the library normally failed: %s", Log.getStackTraceString(e));
            c("%s (%s) was not loaded normally, re-linking...", str, null);
            File a = a(context, str);
            if (!a.exists()) {
                File dir = context.getDir("lib", 0);
                File a2 = a(context, str);
                File[] listFiles = dir.listFiles(new aze0(tqn0Var.a(str)));
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (!file.getAbsolutePath().equals(a2.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                tqn0Var.getClass();
                String[] strArr2 = Build.SUPPORTED_ABIS;
                if (strArr2.length <= 0) {
                    String str3 = Build.CPU_ABI2;
                    strArr2 = (str3 == null || str3.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str3};
                }
                String a3 = tqn0Var.a(str);
                this.c.getClass();
                try {
                    b = y03.b(context, a3, strArr2);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (b == null) {
                        try {
                            strArr = y03.c(context, a3);
                        } catch (Exception e2) {
                            strArr = new String[]{e2.toString()};
                        }
                        StringBuilder a4 = t33.a("Could not find '", a3, "'. Looked for: ");
                        a4.append(Arrays.toString(strArr2));
                        a4.append(", but only found: ");
                        throw new MissingLibraryException(i5s.a(a4, Arrays.toString(strArr), "."));
                    }
                    ZipFile zipFile = b.a;
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (i < 5) {
                            c("Found %s! Extracting...", a3);
                            try {
                                if (a.exists() || a.createNewFile()) {
                                    try {
                                        inputStream2 = zipFile.getInputStream(b.b);
                                        try {
                                            fileOutputStream2 = new FileOutputStream(a);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                long j = 0;
                                                while (true) {
                                                    int read = inputStream2.read(bArr);
                                                    if (read == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream2.write(bArr, 0, read);
                                                    j += read;
                                                    a3 = a3;
                                                }
                                                fileOutputStream2.flush();
                                                fileOutputStream2.getFD().sync();
                                                if (j == a.length()) {
                                                    y03.a(inputStream2);
                                                    y03.a(fileOutputStream2);
                                                    a.setReadable(true, false);
                                                    a.setExecutable(true, false);
                                                    a.setWritable(true);
                                                    break;
                                                }
                                                y03.a(inputStream2);
                                                y03.a(fileOutputStream2);
                                            } catch (FileNotFoundException unused) {
                                                str2 = a3;
                                                y03.a(inputStream2);
                                                y03.a(fileOutputStream2);
                                                i = i2;
                                                a3 = str2;
                                            } catch (IOException unused2) {
                                                str2 = a3;
                                                y03.a(inputStream2);
                                                y03.a(fileOutputStream2);
                                                i = i2;
                                                a3 = str2;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = fileOutputStream2;
                                                y03.a(inputStream);
                                                y03.a(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused3) {
                                            str2 = a3;
                                            fileOutputStream2 = null;
                                            y03.a(inputStream2);
                                            y03.a(fileOutputStream2);
                                            i = i2;
                                            a3 = str2;
                                        } catch (IOException unused4) {
                                            str2 = a3;
                                            fileOutputStream2 = null;
                                            y03.a(inputStream2);
                                            y03.a(fileOutputStream2);
                                            i = i2;
                                            a3 = str2;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            inputStream = inputStream2;
                                            fileOutputStream = null;
                                            y03.a(inputStream);
                                            y03.a(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused5) {
                                        str2 = a3;
                                        inputStream2 = null;
                                    } catch (IOException unused6) {
                                        str2 = a3;
                                        inputStream2 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        inputStream = null;
                                    }
                                }
                            } catch (IOException unused7) {
                            }
                            str2 = a3;
                            i = i2;
                            a3 = str2;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    aVar = b;
                    if (aVar != null) {
                        try {
                            aVar.a.close();
                        } catch (IOException unused8) {
                        }
                    }
                    throw th;
                }
            }
            String absolutePath = a.getAbsolutePath();
            tqn0Var.getClass();
            System.load(absolutePath);
            hashSet.add(str);
            c("%s (%s) was re-linked!", str, null);
        }
    }
}
