package com.yandex.go.taxi.order.bubble;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.go.taxi.order.bubble.model.Bubble$Type;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import com.yandex.go.taxi.order.overlay.OrderBubblesPresenter$listenCompanions$$inlined$map$1$2$1;
import com.yandex.go.taxi.order.overlay.OrderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1;
import defpackage.bvf0;
import defpackage.i3y;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.txu0;
import defpackage.y570;
import defpackage.zuj0;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class b {
    public final Context a;
    public final zuj0 b;
    public final k7x0 c;
    public final i3y d = kotlin.a.b(LazyThreadSafetyMode.NONE, new y570(26));

    public b(Context context, zuj0 zuj0Var, k7x0 k7x0Var) {
        this.a = context;
        this.b = zuj0Var;
        this.c = k7x0Var;
    }

    public final Object a(List list, Bubble$Type bubble$Type, OrderBubblesPresenter$listenCompanions$$inlined$map$1$2$1 orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1) {
        return bvf0.n(new OrderBubblesMapper$mapAnimatedBubbles$2(list, this, bubble$Type, true, null), orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1);
    }

    public final Object b(List list, Map map, DriveState driveState, float f, OrderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1 orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1) {
        return bvf0.n(new OrderBubblesMapper$mapBubbles$2(list, this, map, driveState, f, null), orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1);
    }

    public final txu0 c(RouteInfo.ImageIcon imageIcon) {
        Object valueOf = Float.valueOf(0.5f);
        String str = imageIcon.c;
        List list = imageIcon.a;
        if (str.length() == 0) {
            return null;
        }
        String a = ((m7x0) this.c).a(imageIcon.c);
        float floatValue = ((Number) (list.size() > 0 ? list.get(0) : valueOf)).floatValue();
        if (1 < list.size()) {
            valueOf = list.get(1);
        }
        return new txu0(a, new PointF(floatValue, ((Number) valueOf).floatValue()));
    }
}
