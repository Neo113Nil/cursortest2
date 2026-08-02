package xsna;

import android.content.Context;
import xsna.pox0;
import xsna.q630;

/* compiled from: WidgetTilesView.kt */
/* loaded from: classes17.dex */
public final class apx0 extends i5i {
    public final wh50 n;

    public apx0(Context context) {
        super(context, null, 0);
        this.n = androidx.compose.runtime.k.b(new pox0.h(0));
    }

    public static s3q0 B(apx0 apx0Var, androidx.compose.runtime.a aVar, int i) {
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1332823172, i, -1, "com.vk.community.design.compose.widget.views.WidgetTilesView.ThemedContent.<anonymous> (WidgetTilesView.kt:30)");
            }
            yox0.a(apx0Var.getState(), apx0Var.getOnOpenUrl(), txj0.f(q630.a.a, 1.0f), aVar, 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    private final pox0.h getState() {
        return (pox0.h) ((zak0) this.n).getValue();
    }

    private final void setState(pox0.h hVar) {
        ((zak0) this.n).setValue(hVar);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-417278037);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-417278037, i2, -1, "com.vk.community.design.compose.widget.views.WidgetTilesView.ThemedContent (WidgetTilesView.kt:25)");
            }
            qmx0.a(getState().a, null, getOnOpenUrl(), kai.c(-1332823172, new aza(this, 12), M), M, 3072, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fne(this, i, 15);
        }
    }

    @Override // xsna.mmx0
    public final void h(pox0 pox0Var) {
        if (pox0Var instanceof pox0.h) {
            setState((pox0.h) pox0Var);
        }
    }
}
