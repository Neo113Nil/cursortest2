package xsna;

import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.runtime.a;

/* compiled from: VideoAdsSuspendBottomSheet.kt */
/* loaded from: classes6.dex */
public final class c0s0 extends jmu0 {
    public e0s0 h1;
    public b i1;

    /* compiled from: VideoAdsSuspendBottomSheet.kt */
    public static final class a extends wpi {
        public static final int i = cn70.b(8);
        public static final int j = cn70.b(8);
        public final e0s0 g;
        public final b h;

        public a(Context context, e0s0 e0s0Var, b bVar) {
            super(context, tzp0.a(null, 3));
            this.g = e0s0Var;
            this.h = bVar;
            int i2 = i;
            n0(i2);
            o0(i2);
            p0(0);
            m0(j);
            F0(true);
            B(cn70.c(16), true, true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            c0s0 c0s0Var = new c0s0();
            c0s0Var.h1 = this.g;
            c0s0Var.i1 = this.h;
            return c0s0Var;
        }
    }

    /* compiled from: VideoAdsSuspendBottomSheet.kt */
    public interface b {
        void b();

        void c();

        void d();

        void onClosed();
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(1964326218);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1964326218, 8, -1, "com.vk.video.growth.impl.adssuspend.VideoAdsSuspendBottomSheet.ThemedContent (VideoAdsSuspendBottomSheet.kt:21)");
        }
        e0s0 e0s0Var = this.h1;
        if (e0s0Var == null) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return;
        }
        boolean y = aVar.y(this);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new nrq0(this, 2);
            aVar.R(x);
        }
        gzs gzsVar = (gzs) x;
        boolean y2 = aVar.y(this);
        Object x2 = aVar.x();
        if (y2 || x2 == c0012a) {
            x2 = new iri0(this, 16);
            aVar.R(x2);
        }
        d0s0.b(e0s0Var, gzsVar, (gzs) x2, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        b bVar = this.i1;
        if (bVar != null) {
            bVar.onClosed();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        b bVar = this.i1;
        if (bVar != null) {
            bVar.d();
        }
    }
}
