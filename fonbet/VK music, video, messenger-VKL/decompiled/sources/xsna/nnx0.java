package xsna;

import android.content.Context;
import xsna.pox0;

/* compiled from: WidgetMatchesView.kt */
/* loaded from: classes17.dex */
public final class nnx0 extends i5i {
    public static final int o = iah0.a(20.0f);
    public final wh50 n;

    public nnx0(Context context) {
        super(context, null, 0);
        this.n = androidx.compose.runtime.k.b(new pox0.e(0));
    }

    public static s3q0 B(nnx0 nnx0Var, androidx.compose.runtime.a aVar, int i) {
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1025746400, i, -1, "com.vk.community.design.compose.widget.views.WidgetMatchesView.ThemedContent.<anonymous> (WidgetMatchesView.kt:29)");
            }
            mnx0.i(nnx0Var.getState(), null, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    private final pox0.e getState() {
        return (pox0.e) ((zak0) this.n).getValue();
    }

    private final void setState(pox0.e eVar) {
        ((zak0) this.n).setValue(eVar);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1742606991);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1742606991, i2, -1, "com.vk.community.design.compose.widget.views.WidgetMatchesView.ThemedContent (WidgetMatchesView.kt:24)");
            }
            qmx0.a(getState().a, null, getOnOpenUrl(), kai.c(1025746400, new dv4(this, 13), M), M, 3072, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oa5(this, i, 16);
        }
    }

    @Override // xsna.mmx0
    public final void h(pox0 pox0Var) {
        if (pox0Var instanceof pox0.e) {
            setState((pox0.e) pox0Var);
        }
    }
}
