package defpackage;

import com.yandex.go.scooters.offers.v2.components.tariffs.ui.ScootersTariffListItemView;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.a;

/* loaded from: classes13.dex */
public final class jqx0 extends wys {
    public static final /* synthetic */ int S = 0;
    public final ScootersTariffListItemView R;

    public jqx0(tls tlsVar, tls tlsVar2, ScootersTariffListItemView scootersTariffListItemView) {
        super(scootersTariffListItemView);
        this.R = scootersTariffListItemView;
        scootersTariffListItemView.setTaskPostingAction(new a(this, 1));
        scootersTariffListItemView.setOnClickAction(new lxo0(29, this, tlsVar, tlsVar2));
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        this.R.bindData((i5p0) obj);
    }
}
