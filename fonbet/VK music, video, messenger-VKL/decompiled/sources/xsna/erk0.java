package xsna;

import android.app.Activity;
import android.os.Looper;
import android.os.MessageQueue;
import com.vk.api.sdk.utils.StartUpMethodPriorityBackoffBaseImpl;
import com.vkontakte.android.MainActivity;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import xsna.c63;

/* compiled from: StartupMethodPriorityBackoffWrapper.kt */
/* loaded from: classes15.dex */
public final class erk0 implements jz2 {
    public final m03 a;
    public final StartUpMethodPriorityBackoffBaseImpl b;
    public final ScheduledFuture<?> c;
    public final a d;

    /* compiled from: StartupMethodPriorityBackoffWrapper.kt */
    public final class a extends c63.b {
        public a() {
        }

        @Override // xsna.c63.b
        public final void A() {
            erk0.e(erk0.this);
        }

        @Override // xsna.c63.b
        public final void m(Activity activity) {
            boolean b = nax.b(activity.getIntent());
            final erk0 erk0Var = erk0.this;
            if (b) {
                erk0Var.a.invoke();
                if (MainActivity.class.isInstance(activity)) {
                    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: xsna.drk0
                        @Override // android.os.MessageQueue.IdleHandler
                        public final boolean queueIdle() {
                            erk0.e(erk0.this);
                            return false;
                        }
                    });
                    return;
                }
            }
            erk0.e(erk0Var);
        }
    }

    public erk0(ScheduledExecutorService scheduledExecutorService, m03 m03Var, StartUpMethodPriorityBackoffBaseImpl startUpMethodPriorityBackoffBaseImpl) {
        this.a = m03Var;
        this.b = startUpMethodPriorityBackoffBaseImpl;
        this.c = scheduledExecutorService.schedule(new or4(this, 13), 16000L, TimeUnit.MILLISECONDS);
        a aVar = new a();
        c63 c63Var = c63.a;
        c63.a(aVar);
        this.d = aVar;
    }

    public static final void e(erk0 erk0Var) {
        c63 c63Var = c63.a;
        c63.c(erk0Var.d);
        erk0Var.c.cancel(true);
        erk0Var.f();
    }

    @Override // xsna.jz2
    public final int a() {
        return this.b.a();
    }

    @Override // xsna.jz2
    public final void b(int i, String str) {
        this.b.b(i, str);
    }

    @Override // xsna.jz2
    public final boolean c(String str) {
        return this.b.c(str);
    }

    @Override // xsna.jz2
    public final void d(String str) {
        this.b.d(str);
    }

    public final void f() {
        StartUpMethodPriorityBackoffBaseImpl startUpMethodPriorityBackoffBaseImpl = this.b;
        ReentrantLock reentrantLock = startUpMethodPriorityBackoffBaseImpl.j;
        reentrantLock.lock();
        try {
            if (startUpMethodPriorityBackoffBaseImpl.l) {
                return;
            }
            StartUpMethodPriorityBackoffBaseImpl.e(startUpMethodPriorityBackoffBaseImpl.f, "clear started");
            startUpMethodPriorityBackoffBaseImpl.l = true;
            startUpMethodPriorityBackoffBaseImpl.f().clear();
            startUpMethodPriorityBackoffBaseImpl.h(false);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.jz2
    public final boolean isActive() {
        return this.b.isActive();
    }
}
