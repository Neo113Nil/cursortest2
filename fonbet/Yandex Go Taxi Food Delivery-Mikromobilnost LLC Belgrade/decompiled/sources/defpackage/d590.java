package defpackage;

import com.yandex.go.scooters.offers.v2.components.tariffs.ui.ScootersTariffListItemView;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.a;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class d590 extends wys {
    public static final /* synthetic */ int S = 0;
    public final ScootersTariffListItemView R;

    public d590(tls tlsVar, ScootersTariffListItemView scootersTariffListItemView) {
        super(scootersTariffListItemView);
        this.R = scootersTariffListItemView;
        scootersTariffListItemView.setTaskPostingAction(new a(this, 0));
        c.z(new s140(this, tlsVar), scootersTariffListItemView);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        if (obj == null) {
            this.R.bindData(null);
        } else {
            ny61.u();
        }
    }
}
