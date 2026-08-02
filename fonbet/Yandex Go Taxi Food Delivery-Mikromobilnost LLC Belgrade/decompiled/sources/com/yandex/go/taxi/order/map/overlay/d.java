package com.yandex.go.taxi.order.map.overlay;

import com.yandex.mapkit.geometry.Point;
import defpackage.czo0;
import defpackage.f4c0;
import defpackage.hbp0;
import defpackage.pzt0;
import defpackage.xq00;
import defpackage.yj2;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class d {
    public static final Point n = new Point(0.0d, 0.0d);
    public final f4c0 a;
    public final ArrayList b;
    public final f4c0 c;
    public final f4c0 d;
    public final com.yandex.go.pin.api.widget.b e;
    public pzt0 j;
    public pzt0 k;
    public pzt0 l;
    public final hbp0 f = new hbp0(new czo0(14), "", null);
    public final com.yandex.go.coroutines.h g = new com.yandex.go.coroutines.h(new OrderMapOverlayIconHolder$checkInPin$1(this, null));
    public final yj2 h = new yj2();
    public final xq00 i = new xq00(0);
    public boolean m = true;

    public d(f4c0 f4c0Var, ArrayList arrayList, f4c0 f4c0Var2, f4c0 f4c0Var3, com.yandex.go.pin.api.widget.b bVar) {
        this.a = f4c0Var;
        this.b = arrayList;
        this.c = f4c0Var2;
        this.d = f4c0Var3;
        this.e = bVar;
        Point point = n;
        f4c0Var.o(point);
        f4c0Var.i(false);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f4c0) it.next()).i(false);
        }
        f4c0 f4c0Var4 = this.c;
        f4c0Var4.o(point);
        f4c0Var4.i(false);
        this.d.i(false);
    }
}
