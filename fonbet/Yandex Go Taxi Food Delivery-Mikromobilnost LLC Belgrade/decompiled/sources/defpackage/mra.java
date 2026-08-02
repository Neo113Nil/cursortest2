package defpackage;

import android.view.View;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationHeaderView;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes12.dex */
public final class mra implements zo31 {
    public final ChargersStationHeaderView a;
    public final ListHeaderComponent b;
    public final ShimmeringBar c;
    public final ShimmeringBar d;

    public mra(ChargersStationHeaderView chargersStationHeaderView, ListHeaderComponent listHeaderComponent, ShimmeringBar shimmeringBar, ShimmeringBar shimmeringBar2) {
        this.a = chargersStationHeaderView;
        this.b = listHeaderComponent;
        this.c = shimmeringBar;
        this.d = shimmeringBar2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
