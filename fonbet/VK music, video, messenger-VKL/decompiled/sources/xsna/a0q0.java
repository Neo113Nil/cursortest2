package xsna;

import android.os.SystemClock;
import com.vk.im.log.LogLevel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Arrays;
import java.util.Locale;
import xsna.c0q0;

/* compiled from: UiQueueTaskExecutor.java */
/* loaded from: classes2.dex */
public final class a0q0 implements Runnable {
    public final /* synthetic */ Object b;
    public final /* synthetic */ c0q0 c;

    public a0q0(c0q0 c0q0Var, Object obj) {
        this.c = c0q0Var;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.e = c0q0.a.FINISHING;
        try {
            f9w f9wVar = c0q0.h;
            Object[] objArr = {this.c.d, Long.valueOf(SystemClock.uptimeMillis() - this.c.g)};
            f9wVar.getClass();
            if (!f9wVar.d(LogLevel.VERBOSE)) {
                String str = f9wVar.a;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.LogType logType = L.LogType.v;
                    Locale locale = Locale.US;
                    Object[] copyOf = Arrays.copyOf(objArr, 2);
                    L.u(l, logType, new Object[]{str, String.format(locale, "succeed %s (%d ms)", Arrays.copyOf(copyOf, copyOf.length))});
                }
            }
            this.c.d.e(this.b);
            this.c.d.getClass();
        } catch (Throwable th) {
            c0q0.h("Unable to complete task with success", th);
        }
        this.c.e();
        this.c.f();
    }
}
