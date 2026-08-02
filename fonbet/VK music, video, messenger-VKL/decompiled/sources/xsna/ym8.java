package xsna;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BufferedDiskCache.kt */
/* loaded from: classes12.dex */
public final class ym8 {
    public final y7r a;
    public final b320 b;
    public final mvb0 c;
    public final Executor d;
    public final Executor e;
    public final igw f;
    public final uok0 g = new uok0();

    public ym8(y7r y7rVar, b320 b320Var, mvb0 mvb0Var, Executor executor, Executor executor2, igw igwVar) {
        this.a = y7rVar;
        this.b = b320Var;
        this.c = mvb0Var;
        this.d = executor;
        this.e = executor2;
        this.f = igwVar;
    }

    public final void a() {
        this.g.a();
        try {
            e5o0.a(this.e, new vm8(this, 0));
        } catch (Exception e) {
            ahq.k(e, "Failed to schedule disk-cache clear", new Object[0]);
            e5o0.b(e);
        }
    }

    public final boolean b(ww8 ww8Var) {
        uok0 uok0Var = this.g;
        synchronized (uok0Var) {
            if (uok0Var.a.containsKey(ww8Var)) {
                rip ripVar = (rip) uok0Var.a.get(ww8Var);
                synchronized (ripVar) {
                    if (rip.x(ripVar)) {
                        return true;
                    }
                    uok0Var.a.remove(ww8Var);
                    ahq.j(uok0.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(ripVar)), ww8Var.a(), Integer.valueOf(System.identityHashCode(ww8Var)));
                }
            }
            if (this.a.a(ww8Var)) {
                return true;
            }
            igw igwVar = this.f;
            rip b = this.g.b(ww8Var);
            if (b != null) {
                b.close();
                ahq.f(ym8.class, ww8Var.a(), "Found image for %s in staging area");
                igwVar.getClass();
                return true;
            }
            ahq.f(ym8.class, ww8Var.a(), "Did not find image for %s in staging area");
            igwVar.getClass();
            try {
                return this.a.c(ww8Var);
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public final e5o0<rip> c(ww8 ww8Var, rip ripVar) {
        ahq.f(ym8.class, ww8Var.a(), "Found image for %s in staging area");
        this.f.getClass();
        e5o0<rip> e5o0Var = new e5o0<>();
        if (e5o0Var.h(ripVar)) {
            return e5o0Var;
        }
        throw new IllegalStateException("Cannot set the result of a completed task.");
    }

    public final e5o0<rip> d(ww8 ww8Var, AtomicBoolean atomicBoolean) {
        boolean d = lhs.d();
        uok0 uok0Var = this.g;
        if (!d) {
            rip b = uok0Var.b(ww8Var);
            return b != null ? c(ww8Var, b) : e(ww8Var, atomicBoolean);
        }
        lhs.a("BufferedDiskCache#get");
        try {
            rip b2 = uok0Var.b(ww8Var);
            e5o0<rip> c = b2 != null ? c(ww8Var, b2) : e(ww8Var, atomicBoolean);
            lhs.b();
            return c;
        } catch (Throwable th) {
            lhs.b();
            throw th;
        }
    }

    public final e5o0<rip> e(final ww8 ww8Var, final AtomicBoolean atomicBoolean) {
        try {
            return e5o0.a(this.d, new Callable() { // from class: xsna.um8
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ym8 ym8Var = this;
                    igw igwVar = ym8Var.f;
                    if (atomicBoolean.get()) {
                        throw new CancellationException();
                    }
                    uok0 uok0Var = ym8Var.g;
                    ww8 ww8Var2 = ww8Var;
                    rip b = uok0Var.b(ww8Var2);
                    if (b != null) {
                        ahq.f(ym8.class, ww8Var2.a(), "Found image for %s in staging area");
                        igwVar.getClass();
                    } else {
                        ahq.f(ym8.class, ww8Var2.a(), "Did not find image for %s in staging area");
                        igwVar.getClass();
                        try {
                            PooledByteBuffer f = ym8Var.f(ww8Var2);
                            if (f == null) {
                                return null;
                            }
                            kcl v = uvf.v(f);
                            try {
                                b = new rip(v);
                            } finally {
                                v.close();
                            }
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                    if (!Thread.interrupted()) {
                        return b;
                    }
                    if (ahq.a.a(2)) {
                        bhq.b(2, ym8.class.getSimpleName(), "Host thread was interrupted, decreasing reference count");
                    }
                    b.close();
                    throw new InterruptedException();
                }
            });
        } catch (Exception e) {
            ahq.k(e, "Failed to schedule disk-cache read for %s", ww8Var.a());
            return e5o0.b(e);
        }
    }

    public final PooledByteBuffer f(ww8 ww8Var) throws IOException {
        igw igwVar = this.f;
        try {
            ahq.f(ym8.class, ww8Var.a(), "Disk cache read for %s");
            t27 e = this.a.e(ww8Var);
            if (e == null) {
                ahq.f(ym8.class, ww8Var.a(), "Disk cache miss for %s");
                igwVar.g(ww8Var);
                return null;
            }
            ahq.f(ym8.class, ww8Var.a(), "Found entry in disk cache for %s");
            igwVar.e(ww8Var);
            InputStream f = e.f();
            try {
                a320 a = this.b.a(f, (int) e.size());
                f.close();
                ahq.f(ym8.class, ww8Var.a(), "Successful read from disk cache for %s");
                return a;
            } catch (Throwable th) {
                f.close();
                throw th;
            }
        } catch (IOException e2) {
            ahq.k(e2, "Exception reading from cache for %s", ww8Var.a());
            igwVar.h(ww8Var);
            throw e2;
        }
    }

    public final void g(ww8 ww8Var, rip ripVar) {
        ahq.f(ym8.class, ww8Var.a(), "About to write to disk-cache for key %s");
        try {
            this.a.f(ww8Var, new xm8(ripVar, this));
            this.f.getClass();
            ahq.f(ym8.class, ww8Var.a(), "Successful disk-cache write for key %s");
        } catch (IOException e) {
            ahq.k(e, "Failed to write to disk-cache for key %s", ww8Var.a());
        }
    }
}
