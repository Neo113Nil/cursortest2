package xsna;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import xsna.b25;

/* compiled from: BaseTokenProvider.kt */
/* loaded from: classes11.dex */
public abstract class hp6 {
    public final Context a;
    public final uft0 b = new uft0();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ReentrantLock d = new ReentrantLock();
    public final laq e = new laq(24, 500, 1.5f, 60000);
    public volatile String f;

    /* compiled from: BaseTokenProvider.kt */
    public final class a implements b25.a {
        public a() {
        }

        @Override // xsna.b25.a
        public final void d(tbu0 tbu0Var) {
            hp6 hp6Var = hp6.this;
            hp6Var.c.set(true);
            hp6Var.f = null;
        }
    }

    public hp6(Context context) {
        this.a = context;
        o25.a().b0(new a());
    }

    public final String a() {
        Object obj = this.f;
        if (obj == null) {
            ReentrantLock reentrantLock = this.d;
            reentrantLock.lock();
            try {
                Object obj2 = this.f;
                if (obj2 == null) {
                    try {
                        this.e.e();
                        obj2 = (o25.a().b() ? c() : b()).q(asu0.a.c()).c();
                        this.f = (String) obj2;
                        this.e.c();
                    } catch (Exception unused) {
                        obj2 = null;
                        this.f = null;
                        this.e.b();
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
                obj = obj2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        return (String) obj;
    }

    public abstract io.reactivex.rxjava3.internal.operators.single.y b();

    public abstract io.reactivex.rxjava3.internal.operators.single.y c();
}
