package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.chargers.design.components.badges.ChargersBadgesView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationAboutLocationView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationHeaderView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationUsageInstructionView;
import com.yandex.go.chargers.tariff_item_info.api.ChargersTariffsView;
import com.yandex.go.design.divider.CardDivider;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes12.dex */
public final class msa implements zo31 {
    public final FrameLayout a;
    public final ChargersStationAboutLocationView b;
    public final ChargersBadgesView c;
    public final NestedScrollView d;
    public final CardDivider e;
    public final CardDivider f;
    public final CardDivider g;
    public final ChargersStationHeaderView h;
    public final ListItemComponent i;
    public final ChargersTariffsView j;
    public final ChargersStationUsageInstructionView k;

    public msa(FrameLayout frameLayout, ChargersStationAboutLocationView chargersStationAboutLocationView, ChargersBadgesView chargersBadgesView, NestedScrollView nestedScrollView, CardDivider cardDivider, CardDivider cardDivider2, CardDivider cardDivider3, ChargersStationHeaderView chargersStationHeaderView, ListItemComponent listItemComponent, ChargersTariffsView chargersTariffsView, ChargersStationUsageInstructionView chargersStationUsageInstructionView) {
        this.a = frameLayout;
        this.b = chargersStationAboutLocationView;
        this.c = chargersBadgesView;
        this.d = nestedScrollView;
        this.e = cardDivider;
        this.f = cardDivider2;
        this.g = cardDivider3;
        this.h = chargersStationHeaderView;
        this.i = listItemComponent;
        this.j = chargersTariffsView;
        this.k = chargersStationUsageInstructionView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
