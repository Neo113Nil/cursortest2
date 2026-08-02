package com.yandex.go.delivery.tracking.map_overlay;

import android.graphics.PointF;
import com.yandex.mapkit.ScreenRect;
import defpackage.bvf0;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.sdi;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import ru.yandex.taxi.logistics.deliveries.map.search.DeliverySearchViews;

/* loaded from: classes12.dex */
public final class r {
    public final tt2 a;
    public final sdi b;
    public DeliverySearchViews c;
    public pzt0 d;

    public r(tt2 tt2Var, sdi sdiVar) {
        this.a = tt2Var;
        this.b = sdiVar;
    }

    public final void a() {
        DeliverySearchViews deliverySearchViews = this.c;
        if (deliverySearchViews == null) {
            return;
        }
        deliverySearchViews.setVisibility(0);
        this.a.getClass();
        sjh sjhVar = uyj.a;
        this.d = tje.N(bvf0.a(o400.a), null, null, new DeliverySearchViewsPresenter$attach$1(this, deliverySearchViews, null), 3);
    }

    public final void b(ScreenRect screenRect) {
        float x = screenRect.getTopLeft().getX();
        float y = screenRect.getTopLeft().getY();
        PointF pointF = new PointF(((screenRect.getBottomRight().getX() - x) / 2.0f) + x, ((screenRect.getBottomRight().getY() - y) / 2.0f) + y);
        DeliverySearchViews deliverySearchViews = this.c;
        if (deliverySearchViews != null) {
            deliverySearchViews.setPulsingCirclesViewAnchor(pointF);
        }
    }
}
