package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.scooters.offers.v2.components.scooters.ScootersListComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes13.dex */
public final class jwn0 implements zo31 {
    public final ScootersListComponent a;
    public final RobotoTextView b;
    public final RecyclerView c;
    public final RobotoTextView d;
    public final ShimmeringBar e;
    public final ShimmeringBar f;

    public jwn0(ScootersListComponent scootersListComponent, RobotoTextView robotoTextView, RecyclerView recyclerView, RobotoTextView robotoTextView2, ShimmeringBar shimmeringBar, ShimmeringBar shimmeringBar2) {
        this.a = scootersListComponent;
        this.b = robotoTextView;
        this.c = recyclerView;
        this.d = robotoTextView2;
        this.e = shimmeringBar;
        this.f = shimmeringBar2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
