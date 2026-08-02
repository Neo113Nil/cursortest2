package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersTariffView;

/* loaded from: classes13.dex */
public final class k5p0 implements zo31 {
    public final View a;
    public final ScootersTariffView b;
    public final ScootersTariffView c;

    public k5p0(ViewGroup viewGroup, ScootersTariffView scootersTariffView, ScootersTariffView scootersTariffView2) {
        this.a = viewGroup;
        this.b = scootersTariffView;
        this.c = scootersTariffView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
