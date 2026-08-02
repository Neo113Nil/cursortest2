package defpackage;

import android.view.View;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationDetailsBrickView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes12.dex */
public final class kra implements zo31 {
    public final ChargersStationDetailsBrickView a;
    public final RobotoTextView b;
    public final ShimmeringBar c;
    public final RobotoTextView d;
    public final ShimmeringBar e;

    public kra(ChargersStationDetailsBrickView chargersStationDetailsBrickView, RobotoTextView robotoTextView, ShimmeringBar shimmeringBar, RobotoTextView robotoTextView2, ShimmeringBar shimmeringBar2) {
        this.a = chargersStationDetailsBrickView;
        this.b = robotoTextView;
        this.c = shimmeringBar;
        this.d = robotoTextView2;
        this.e = shimmeringBar2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
