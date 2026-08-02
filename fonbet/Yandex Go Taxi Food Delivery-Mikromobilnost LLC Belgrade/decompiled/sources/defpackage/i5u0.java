package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class i5u0 implements Runnable {
    public static final Object A = new Object();
    public final Executor a;
    public final dq60 b;
    public final AtomicReference w;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public Object x = A;
    public int y = -1;
    public boolean z = false;

    public i5u0(AtomicReference atomicReference, Executor executor, dq60 dq60Var) {
        this.w = atomicReference;
        this.a = executor;
        this.b = dq60Var;
    }

    public final void a(int i) {
        synchronized (this) {
            try {
                if (this.c.get()) {
                    if (i <= this.y) {
                        return;
                    }
                    this.y = i;
                    if (this.z) {
                        return;
                    }
                    this.z = true;
                    try {
                        this.a.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.z = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.c.get()) {
                    this.z = false;
                    return;
                }
                Object obj = this.w.get();
                int i = this.y;
                while (true) {
                    if (!Objects.equals(this.x, obj)) {
                        this.x = obj;
                        boolean z = obj instanceof j84;
                        dq60 dq60Var = this.b;
                        if (z) {
                            dq60Var.onError(((j84) obj).a);
                        } else {
                            dq60Var.a(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.y || !this.c.get()) {
                                break;
                            }
                            obj = this.w.get();
                            i = this.y;
                        } finally {
                        }
                    }
                }
                this.z = false;
            } finally {
            }
        }
    }
}
