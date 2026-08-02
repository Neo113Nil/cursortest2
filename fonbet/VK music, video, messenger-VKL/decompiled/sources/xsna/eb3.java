package xsna;

import com.vk.log.L;
import ru.mail.verify.core.api.UncaughtExceptionListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class eb3 implements UncaughtExceptionListener {
    public static void a(String str, StringBuilder sb, Throwable th) {
        sb.append(th.getMessage());
        gu8.c(str, sb.toString());
    }

    @Override // ru.mail.verify.core.api.UncaughtExceptionListener
    public void uncaughtException(Thread thread, Throwable th) {
        L.j(th, thread == null ? "" : thread.getName(), th.toString());
    }
}
