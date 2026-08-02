package xsna;

import android.content.Context;
import xsna.pox0;

/* compiled from: WidgetDonationView.kt */
/* loaded from: classes17.dex */
public final class anx0 extends i5i {
    public final wh50 n;

    public anx0(Context context) {
        super(context, null, 0);
        this.n = androidx.compose.runtime.k.b(null);
    }

    private final pox0.a getWidgetDonationState() {
        return (pox0.a) ((zak0) this.n).getValue();
    }

    private final void setWidgetDonationState(pox0.a aVar) {
        ((zak0) this.n).setValue(aVar);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> th3Var;
        androidx.compose.runtime.a M = aVar.M(-2115177003);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2115177003, i2, -1, "com.vk.community.design.compose.widget.views.WidgetDonationView.ThemedContent (WidgetDonationView.kt:22)");
            }
            pox0.a widgetDonationState = getWidgetDonationState();
            if (widgetDonationState == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    th3Var = new q0r(this, i, 9);
                    s.d = th3Var;
                }
                return;
            }
            qmx0.a(widgetDonationState.a, null, getOnOpenUrl(), kai.c(471529702, new uqc(7, this, widgetDonationState), M), M, 3072, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            th3Var = new th3(this, i, 12);
            s.d = th3Var;
        }
    }

    @Override // xsna.mmx0
    public final void h(pox0 pox0Var) {
        if (pox0Var instanceof pox0.a) {
            setWidgetDonationState((pox0.a) pox0Var);
        }
    }
}
