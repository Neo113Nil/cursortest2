package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes9.dex */
public class ljo {
    public static void a(Throwable th, Throwable th2) {
        if (th != th2) {
            ovc0.a.a(th, th2);
        }
    }

    public static String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
