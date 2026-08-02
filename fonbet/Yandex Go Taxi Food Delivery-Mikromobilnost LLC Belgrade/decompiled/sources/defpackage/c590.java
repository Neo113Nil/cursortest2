package defpackage;

import android.view.View;
import com.yandex.go.scooters.passes.v2.list.ScootersPackageView;

/* loaded from: classes13.dex */
public final class c590 extends lys {
    public static final /* synthetic */ int S = 0;

    public static void c0(ScootersPackageView scootersPackageView, vj90 vj90Var) {
        CharSequence charSequence = vj90Var.d;
        CharSequence charSequence2 = vj90Var.e;
        if (!scootersPackageView.isSelected()) {
            scootersPackageView.getTitle().setText(charSequence2);
            scootersPackageView.getPrice().setText(vj90Var.f);
            scootersPackageView.getDescription().setText(charSequence);
        } else {
            int t = qje.t(xng0.textOnControl, scootersPackageView.getContext());
            scootersPackageView.getTitle().setText(qeb1.f(charSequence2, t, 1.0f));
            scootersPackageView.getPrice().setText(qeb1.f(vj90Var.g, t, 1.0f));
            scootersPackageView.getDescription().setText(qeb1.f(charSequence, t, 1.0f));
            scootersPackageView.getArrowView().setVisibility(charSequence.length() != 0 ? 0 : 8);
        }
    }

    @Override // defpackage.wys
    public final boolean X() {
        return true;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        c7o0 c7o0Var = (c7o0) obj;
        ScootersPackageView scootersPackageView = (ScootersPackageView) ((View) this.R);
        scootersPackageView.setEnabled(c7o0Var.c);
        scootersPackageView.setSelected(c7o0Var.b);
        scootersPackageView.getArrowView().setVisibility(8);
        c0(scootersPackageView, c7o0Var.a);
        if (scootersPackageView.isSelected()) {
            return;
        }
        scootersPackageView.getArrowView().getLayoutParams().height = 0;
    }
}
