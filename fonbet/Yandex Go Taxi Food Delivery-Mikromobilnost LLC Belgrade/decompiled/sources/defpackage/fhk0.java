package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;

/* loaded from: classes14.dex */
public final class fhk0 implements ghk0 {
    public final RideCardDriverSectionView a;
    public final p9y0 b;

    static {
        int i = RideCardDriverSectionView.$stable;
    }

    public fhk0(RideCardDriverSectionView rideCardDriverSectionView, p9y0 p9y0Var) {
        this.a = rideCardDriverSectionView;
        this.b = p9y0Var;
    }

    @Override // defpackage.ghk0
    public final void a(ibk0 ibk0Var, wrs0 wrs0Var) {
        this.a.setDriverClickListener(new ehk0(this, ibk0Var, wrs0Var));
    }

    @Override // defpackage.ghk0
    public final View asView() {
        return this.a;
    }

    @Override // defpackage.ghk0
    public final void b(ibk0 ibk0Var, wrs0 wrs0Var) {
        this.a.setCarPlateClickListener(new ehk0(ibk0Var, this, wrs0Var));
    }

    @Override // defpackage.ghk0
    public final void c(ygk0 ygk0Var) {
        this.a.render(ygk0Var);
    }
}
