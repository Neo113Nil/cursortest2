package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationAboutLocationView;

/* loaded from: classes12.dex */
public final class hra implements zo31 {
    public final ChargersStationAboutLocationView a;
    public final RecyclerView b;
    public final RecyclerView c;
    public final RecyclerView d;

    public hra(ChargersStationAboutLocationView chargersStationAboutLocationView, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3) {
        this.a = chargersStationAboutLocationView;
        this.b = recyclerView;
        this.c = recyclerView2;
        this.d = recyclerView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
