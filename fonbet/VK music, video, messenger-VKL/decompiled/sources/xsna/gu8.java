package xsna;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* compiled from: ByteOutput.java */
/* loaded from: classes.dex */
public abstract class gu8 {
    public static boolean a = false;
    public static boolean b;

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str == null ? "" : str.concat(": "));
        if (str2 == null) {
            str2 = "<empty log>";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String b(Throwable th) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                try {
                    th.printStackTrace(printStream);
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    printStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream2;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            c(null, th2.toString());
            return "cannot get stacktrace";
        }
    }

    public static void c(String str, String str2) {
        if (a) {
            a(str, str2);
        }
    }

    public static void d(String str) {
        if (a && Log.isLoggable("[myTarget]", 4)) {
            a(null, str);
        }
    }

    public static void e(String str, String str2) {
        if (a) {
            Log.e("[myTarget]", a(str, str2));
        }
    }

    public static void f(String str, String str2) {
        if (a) {
            a(str, str2);
        }
    }

    public abstract void g(byte[] bArr, int i, int i2) throws IOException;
}
