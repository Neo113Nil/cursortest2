package defpackage;

import com.yandex.go.scooters.offers.v2.components.tariffs.ScootersTariffListView;

/* loaded from: classes13.dex */
public final class o5p0 implements m5p0 {
    public final /* synthetic */ ScootersTariffListView a;

    public o5p0(ScootersTariffListView scootersTariffListView) {
        this.a = scootersTariffListView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        z5n0 z5n0Var = (z5n0) obj;
        boolean z = z5n0Var instanceof x5n0;
        ScootersTariffListView scootersTariffListView = this.a;
        if (z) {
            scootersTariffListView.loading();
            return;
        }
        if (z5n0Var instanceof y5n0) {
            scootersTariffListView.success((y5n0) z5n0Var);
        } else if (z5n0Var instanceof w5n0) {
            scootersTariffListView.error();
        } else {
            w511.b();
        }
    }
}
