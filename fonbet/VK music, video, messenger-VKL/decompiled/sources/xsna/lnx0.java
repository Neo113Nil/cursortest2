package xsna;

import android.content.Context;
import xsna.pox0;
import xsna.q630;

/* compiled from: WidgetMatchView.kt */
/* loaded from: classes17.dex */
public final class lnx0 extends i5i {
    public final wh50 n;

    public lnx0(Context context) {
        super(context, null, 0);
        this.n = androidx.compose.runtime.k.b(null);
    }

    private final pox0.d getWidgetMatchState() {
        return (pox0.d) ((zak0) this.n).getValue();
    }

    private final void setWidgetMatchState(pox0.d dVar) {
        ((zak0) this.n).setValue(dVar);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> v95Var;
        androidx.compose.runtime.a M = aVar.M(-1865692373);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1865692373, i2, -1, "com.vk.community.design.compose.widget.views.WidgetMatchView.ThemedContent (WidgetMatchView.kt:23)");
            }
            pox0.d widgetMatchState = getWidgetMatchState();
            if (widgetMatchState == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    v95Var = new s77(this, i, 16);
                    s.d = v95Var;
                }
                return;
            }
            qmx0.a(widgetMatchState.a, q630.a.a, getOnOpenUrl(), kai.c(1513729788, new te1(widgetMatchState, 14), M), M, 3120, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            v95Var = new v95(this, i, 17);
            s.d = v95Var;
        }
    }

    @Override // xsna.mmx0
    public final void h(pox0 pox0Var) {
        if (pox0Var instanceof pox0.d) {
            setWidgetMatchState((pox0.d) pox0Var);
        }
    }
}
