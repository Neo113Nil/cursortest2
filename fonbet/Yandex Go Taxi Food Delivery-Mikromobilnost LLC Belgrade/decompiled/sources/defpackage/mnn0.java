package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.scooters.presentation.finish_info.statistics.ScootersFinishInfoStatisticsCard;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes6.dex */
public final class mnn0 implements zo31 {
    public final ScootersFinishInfoStatisticsCard a;
    public final ListItemComponent b;
    public final GoImageView c;
    public final ShimmeringBar d;
    public final RecyclerView e;

    public mnn0(ScootersFinishInfoStatisticsCard scootersFinishInfoStatisticsCard, ListItemComponent listItemComponent, GoImageView goImageView, ShimmeringBar shimmeringBar, RecyclerView recyclerView) {
        this.a = scootersFinishInfoStatisticsCard;
        this.b = listItemComponent;
        this.c = goImageView;
        this.d = shimmeringBar;
        this.e = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
