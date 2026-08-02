package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.scooters.offers.v2.components.tariffs.ScootersTariffListView;
import java.util.List;

/* loaded from: classes13.dex */
public final class p5p0 extends RecyclerView.g {
    public final /* synthetic */ ScootersTariffListView a;

    public p5p0(ScootersTariffListView scootersTariffListView) {
        this.a = scootersTariffListView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        s6n0 s6n0Var;
        List visibleTariffs;
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            ScootersTariffListView scootersTariffListView = this.a;
            s6n0Var = scootersTariffListView.scootersCardV2ProxyAnalytics;
            visibleTariffs = scootersTariffListView.getVisibleTariffs();
            s6n0Var.b(visibleTariffs);
        }
    }
}
