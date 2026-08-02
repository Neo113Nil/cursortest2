package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.chargers.tariff_item_info.api.ChargersTariffsView;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes12.dex */
public final class kya implements zo31 {
    public final ChargersTariffsView a;
    public final BadgeView b;
    public final RecyclerView c;
    public final LinearLayout d;
    public final ShimmeringBar e;
    public final RobotoTextView f;

    public kya(ChargersTariffsView chargersTariffsView, BadgeView badgeView, RecyclerView recyclerView, LinearLayout linearLayout, ShimmeringBar shimmeringBar, RobotoTextView robotoTextView) {
        this.a = chargersTariffsView;
        this.b = badgeView;
        this.c = recyclerView;
        this.d = linearLayout;
        this.e = shimmeringBar;
        this.f = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
