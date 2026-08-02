package xsna;

import android.os.Bundle;
import io.jsonwebtoken.JwtParser;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedDeque;

/* compiled from: CompositeUncaughtExceptionHandler.kt */
/* loaded from: classes18.dex */
public final class wui implements Thread.UncaughtExceptionHandler {
    public static volatile Thread.UncaughtExceptionHandler c;
    public static final wui a = new wui();
    public static final ConcurrentLinkedDeque<Thread.UncaughtExceptionHandler> b = new ConcurrentLinkedDeque<>();
    public static final Object d = new Object();
    public static String e = "";
    public static String f = "";

    public static String a() {
        return e;
    }

    public static String b() {
        return f;
    }

    public static String c(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        StackTraceElement[] stackTrace = th.getStackTrace();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (brm0.B(stackTraceElement.getClassName(), "com.vk.", false) || brm0.B(stackTraceElement.getClassName(), "com.vkontakte.android.", false)) {
                arrayList.add(stackTraceElement);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        List<StackTraceElement> list = arrayList;
        if (isEmpty) {
            list = null;
        }
        if (list == null) {
            list = Arrays.asList(th.getStackTrace());
        }
        for (StackTraceElement stackTraceElement2 : list) {
            printWriter.println(stackTraceElement2.getClassName() + JwtParser.SEPARATOR_CHAR + stackTraceElement2.getMethodName());
        }
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        String a2 = tb00.a(stringWriter2);
        String str = a2.length() > 0 ? a2 : null;
        if (str != null) {
            return str;
        }
        String q0 = drm0.q0(stringWriter2, ' ');
        if (q0.length() <= 0) {
            return UUID.randomUUID().toString();
        }
        int length = q0.length();
        return q0.substring(0, length <= 32 ? length : 32);
    }

    public final String toString() {
        return "CompositeUncaughtExceptionHandler(appUncaughtExceptionHandlers=" + b + ", systemUncaughtExceptionHandler=" + c + ')';
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String uuid = UUID.randomUUID().toString();
            String c2 = c(th);
            synchronized (d) {
                e = uuid;
                f = c2;
                s3q0 s3q0Var = s3q0.a;
            }
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            Bundle bundle = new rhp0().a;
            bundle.putString("CRASH_ID", uuid);
            bundle.putString("CRASH_STACKTRACE_HASH", c2);
            bVar.f(bundle);
            Iterator<Thread.UncaughtExceptionHandler> it = b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().uncaughtException(thread, th);
                } catch (Exception e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                }
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
