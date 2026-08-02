package defpackage;

import android.widget.ImageView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardTariffView;

/* loaded from: classes14.dex */
public final class alw extends xwy0 {
    public final IntercityDashboardTariffView O;
    public final pav P;
    public final k7x0 Q;
    public final xen R;

    public alw(IntercityDashboardTariffView intercityDashboardTariffView, pav pavVar, k7x0 k7x0Var, xen xenVar) {
        super(intercityDashboardTariffView);
        this.O = intercityDashboardTariffView;
        this.P = pavVar;
        this.Q = k7x0Var;
        this.R = xenVar;
    }

    public final void W(ImageView imageView, String str) {
        Object tag = imageView.getTag();
        if (jl40.l(tag instanceof String ? (String) tag : null, str)) {
            return;
        }
        if (evu0.J(str)) {
            imageView.setImageDrawable(null);
            imageView.setTag(null);
        } else {
            ((nac) this.P.a(imageView)).c(((m7x0) this.Q).a(str));
            imageView.setTag(str);
        }
    }
}
