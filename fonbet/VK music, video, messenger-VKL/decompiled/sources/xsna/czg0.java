package xsna;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import xsna.hlw;
import xsna.l9s;

/* compiled from: SafeCloseImageReaderProxy.java */
/* loaded from: classes11.dex */
public final class czg0 implements hlw {
    public final hlw d;

    @Nullable
    public final Surface e;
    public final Object a = new Object();
    public volatile int b = 0;
    public volatile boolean c = false;
    public final bzg0 f = new l9s.a() { // from class: xsna.bzg0
        @Override // xsna.l9s.a
        public final void f(l9s l9sVar) {
            czg0 czg0Var = czg0.this;
            synchronized (czg0Var.a) {
                try {
                    czg0Var.b--;
                    if (czg0Var.c && czg0Var.b == 0) {
                        czg0Var.close();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v2, types: [xsna.bzg0] */
    public czg0(@NonNull hlw hlwVar) {
        this.d = hlwVar;
        this.e = hlwVar.getSurface();
    }

    @Override // xsna.hlw
    public final void a(@NonNull hlw.a aVar, @NonNull Executor executor) {
        synchronized (this.a) {
            this.d.a(new m7j(this, aVar), executor);
        }
    }

    @Override // xsna.hlw
    @Nullable
    public final alw b() {
        mtj0 f;
        synchronized (this.a) {
            f = f(this.d.b());
        }
        return f;
    }

    @Override // xsna.hlw
    @Nullable
    public final alw c() {
        mtj0 f;
        synchronized (this.a) {
            f = f(this.d.c());
        }
        return f;
    }

    @Override // xsna.hlw
    public final void close() {
        synchronized (this.a) {
            try {
                Surface surface = this.e;
                if (surface != null) {
                    surface.release();
                }
                this.d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.hlw
    public final void d() {
        synchronized (this.a) {
            this.d.d();
        }
    }

    @Override // xsna.hlw
    public final int e() {
        int e;
        synchronized (this.a) {
            e = this.d.e();
        }
        return e;
    }

    @Nullable
    public final mtj0 f(@Nullable alw alwVar) {
        synchronized (this.a) {
            try {
                if (alwVar == null) {
                    return null;
                }
                this.b++;
                mtj0 mtj0Var = new mtj0(alwVar);
                mtj0Var.d = false;
                mtj0Var.b(this.f);
                return mtj0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.hlw
    @Nullable
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.d.getSurface();
        }
        return surface;
    }
}
