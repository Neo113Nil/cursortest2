package defpackage;

import com.yandex.go.flex.main_screen.data.widgets.layout.dto.EdgeInsetsDto;
import com.yandex.go.flex.main_screen.data.widgets.layout.dto.LayoutDto;
import com.yandex.go.flex.main_screen.data.widgets.orders.OrdersWidgetData;
import com.yandex.go.flex.main_screen.data.widgets.tracking.TrackingListProperties$Styles;
import com.yandex.go.superapp.orders.card.experiments.y;

/* loaded from: classes.dex */
public final class h601 {
    public final umx a;
    public final y b;

    public h601(umx umxVar, y yVar) {
        this.a = umxVar;
        this.b = yVar;
    }

    public final i601 a(OrdersWidgetData ordersWidgetData) {
        hzx hzxVar;
        String str = ordersWidgetData != null ? ordersWidgetData.a : null;
        LayoutDto layoutDto = ordersWidgetData != null ? ordersWidgetData.b : null;
        if (layoutDto == null) {
            hzxVar = null;
        } else {
            EdgeInsetsDto edgeInsetsDto = layoutDto.a;
            hzxVar = new hzx(edgeInsetsDto == null ? null : new lkn(edgeInsetsDto.getA(), edgeInsetsDto.getB(), edgeInsetsDto.getC(), edgeInsetsDto.getD()));
        }
        return new i601(str, hzxVar, !this.b.u() ? TrackingListProperties$Styles.OLD_SUPERAPP_MAIN_SCREEN : jl40.l(ordersWidgetData != null ? ordersWidgetData.c : null, "focus") ? TrackingListProperties$Styles.FOCUS : TrackingListProperties$Styles.LONG);
    }
}
