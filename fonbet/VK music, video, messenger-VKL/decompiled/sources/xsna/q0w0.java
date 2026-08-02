package xsna;

import androidx.recyclerview.widget.t0;
import com.vk.log.L;

/* compiled from: VkViewPoolProvider.kt */
/* loaded from: classes17.dex */
public final class q0w0 extends androidx.recyclerview.widget.t0 {

    /* compiled from: VkViewPoolProvider.kt */
    public static final class a implements l100 {
        public static final a b = new a();

        @Override // xsna.l100
        public final void a(String str) {
            L.e("ViewPoolProvider", str);
        }

        @Override // xsna.l100
        public final void c(RuntimeException runtimeException) {
            if (runtimeException.getCause() instanceof InterruptedException) {
                L.e(runtimeException, "ViewPoolProvider");
            } else {
                com.vk.metrics.eventtracking.b.a.q(runtimeException);
            }
        }
    }

    /* compiled from: VkViewPoolProvider.kt */
    public static final class b implements t0.a {
        public r0w0 a;

        @Override // androidx.recyclerview.widget.t0.a
        public final void a(t0.d dVar) {
            r0w0 r0w0Var = this.a;
            if (r0w0Var != null) {
                dhr0.a.getClass();
                dhr0.X(r0w0Var);
            }
            r0w0 r0w0Var2 = new r0w0(dVar);
            this.a = r0w0Var2;
            dhr0.f(r0w0Var2);
        }

        @Override // androidx.recyclerview.widget.t0.a
        public final void b(t0.d dVar) {
            r0w0 r0w0Var = this.a;
            if (r0w0Var != null) {
                dhr0.a.getClass();
                dhr0.X(r0w0Var);
            }
            this.a = null;
        }
    }

    public q0w0(t0.b bVar) {
        super(bVar, a.b, new b());
    }
}
