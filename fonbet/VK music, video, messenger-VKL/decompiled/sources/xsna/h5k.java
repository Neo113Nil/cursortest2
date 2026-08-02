package xsna;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import xsna.j5k;
import xsna.yrl;

/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* loaded from: classes.dex */
public final class h5k implements f5k {
    public static final a c = new a();
    public final yrl<f5k> a;
    public final AtomicReference<f5k> b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    public static final class a implements fw50 {
        @Override // xsna.fw50
        public final j5k.a a() {
            return null;
        }

        @Override // xsna.fw50
        public final File b() {
            return null;
        }

        @Override // xsna.fw50
        public final File c() {
            return null;
        }

        @Override // xsna.fw50
        public final File d() {
            return null;
        }

        @Override // xsna.fw50
        public final File e() {
            return null;
        }

        @Override // xsna.fw50
        public final File f() {
            return null;
        }

        @Override // xsna.fw50
        public final File g() {
            return null;
        }
    }

    public h5k(yrl<f5k> yrlVar) {
        this.a = yrlVar;
        ((yt80) yrlVar).a(new dej(this));
    }

    @Override // xsna.f5k
    public final void a(@NonNull final String str, final long j, @NonNull final wn5 wn5Var) {
        ((yt80) this.a).a(new yrl.a() { // from class: xsna.g5k
            @Override // xsna.yrl.a
            public final void a(f9e0 f9e0Var) {
                ((f5k) f9e0Var.get()).a(str, j, wn5Var);
            }
        });
    }

    @Override // xsna.f5k
    @NonNull
    public final fw50 b(@NonNull String str) {
        f5k f5kVar = this.b.get();
        return f5kVar == null ? c : f5kVar.b(str);
    }

    @Override // xsna.f5k
    public final boolean c() {
        f5k f5kVar = this.b.get();
        return f5kVar != null && f5kVar.c();
    }

    @Override // xsna.f5k
    public final boolean d(@NonNull String str) {
        f5k f5kVar = this.b.get();
        return f5kVar != null && f5kVar.d(str);
    }
}
