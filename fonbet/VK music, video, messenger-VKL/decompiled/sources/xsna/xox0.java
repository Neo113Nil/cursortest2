package xsna;

import android.content.Context;
import xsna.pox0;

/* compiled from: WidgetTextView.kt */
/* loaded from: classes17.dex */
public final class xox0 extends i5i {
    public final wh50 n;

    public xox0(Context context) {
        super(context, null, 0);
        this.n = androidx.compose.runtime.k.b(new pox0.g(0));
    }

    public static s3q0 B(xox0 xox0Var, androidx.compose.runtime.a aVar, int i) {
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1041293574, i, -1, "com.vk.community.design.compose.widget.views.WidgetTextView.ThemedContent.<anonymous> (WidgetTextView.kt:28)");
            }
            wox0.a(xox0Var.getState(), null, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    private final pox0.g getState() {
        return (pox0.g) ((zak0) this.n).getValue();
    }

    private final void setState(pox0.g gVar) {
        ((zak0) this.n).setValue(gVar);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1837776117);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1837776117, i2, -1, "com.vk.community.design.compose.widget.views.WidgetTextView.ThemedContent (WidgetTextView.kt:23)");
            }
            qmx0.a(getState().a, null, getOnOpenUrl(), kai.c(1041293574, new bt3(this, 17), M), M, 3072, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new th3(this, i, 13);
        }
    }

    @Override // xsna.mmx0
    public final void h(pox0 pox0Var) {
        if (pox0Var instanceof pox0.g) {
            setState((pox0.g) pox0Var);
        }
    }
}
