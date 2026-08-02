package com.yandex.go.navigator.gas_stations.filters;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.fcl0;
import defpackage.kyh0;
import defpackage.sls;
import defpackage.tje;
import defpackage.v2h0;
import defpackage.xng0;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/navigator/gas_stations/filters/SearchOnlyAlongRouteFilter;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lkotlin/Function0;", "runnable", "setDebounceClickListener", "(Lsls;)V", "", "gasStationAlongRouteOnly", "showNoGasStationError", "render", "(ZZ)V", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "toggleComponent", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchOnlyAlongRouteFilter extends GoLinearLayout {
    public static final int $stable = 8;
    private final ListItemSwitchComponent toggleComponent;

    public SearchOnlyAlongRouteFilter(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ListItemSwitchComponent listItemSwitchComponent = new ListItemSwitchComponent(context, null, 0, 6, null);
        listItemSwitchComponent.setTitle(kyh0.navigator_gas_station_only_on_route_title);
        listItemSwitchComponent.setTitleTypeface(3);
        listItemSwitchComponent.setLeadImage(v2h0.ic_gas_station_filter_icon);
        xw31.J(listItemSwitchComponent, Integer.valueOf(tje.u(16, listItemSwitchComponent.getContext())), null, null, null);
        this.toggleComponent = listItemSwitchComponent;
        setOrientation(1);
        addView(listItemSwitchComponent);
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.toggleComponent.setLeadImage(v2h0.ic_gas_station_filter_icon);
        super.applyTheme(themeType);
    }

    public final void render(boolean gasStationAlongRouteOnly, boolean showNoGasStationError) {
        this.toggleComponent.setChecked(gasStationAlongRouteOnly);
        ListItemSwitchComponent listItemSwitchComponent = this.toggleComponent;
        if (!showNoGasStationError) {
            listItemSwitchComponent.setSubtitle("");
        } else {
            listItemSwitchComponent.setSubtitle(kyh0.navigator_gas_station_only_on_route_subtitle);
            this.toggleComponent.setSubtitleColorAttr(xng0.error);
        }
    }

    public final void setDebounceClickListener(sls runnable) {
        this.toggleComponent.setDebounceClickListener(new fcl0(17, runnable));
    }

    public SearchOnlyAlongRouteFilter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SearchOnlyAlongRouteFilter(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public SearchOnlyAlongRouteFilter(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ SearchOnlyAlongRouteFilter(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
