package com.yandex.go.superapp.order.multi.old.interactors;

import com.yandex.go.superapp.order.multi.old.provider.g;
import defpackage.clk0;
import defpackage.cy70;
import defpackage.dgs;
import defpackage.jc00;
import defpackage.o2y0;
import defpackage.ps70;
import defpackage.tje;
import defpackage.tse;
import defpackage.v1p;
import defpackage.wl40;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.widgets.domain.b;

/* loaded from: classes6.dex */
public final class a {
    public final g a;
    public final cy70 b;
    public final dgs c;
    public final clk0 d;
    public final v1p e;
    public final com.yandex.go.taxi.order.multi.feed.domain.a f;
    public final ps70 g;
    public final b h;
    public final jc00 i;

    public a(g gVar, cy70 cy70Var, dgs dgsVar, clk0 clk0Var, v1p v1pVar, com.yandex.go.taxi.order.multi.feed.domain.a aVar, ps70 ps70Var, b bVar, jc00 jc00Var, tse tseVar) {
        this.a = gVar;
        this.b = cy70Var;
        this.c = dgsVar;
        this.d = clk0Var;
        this.e = v1pVar;
        this.f = aVar;
        this.g = ps70Var;
        this.h = bVar;
        this.i = jc00Var;
        tje.N(tseVar, null, null, new OrderInitialStateInteractor$1(this, null), 3);
    }

    public final o2y0 a(wl40 wl40Var) {
        Object obj;
        List list = wl40Var.a;
        dgs dgsVar = this.c;
        dgsVar.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            o2y0 o2y0Var = (o2y0) obj;
            WeakReference weakReference = dgsVar.a;
            if (o2y0Var == (weakReference != null ? (o2y0) weakReference.get() : null)) {
                break;
            }
        }
        o2y0 o2y0Var2 = (o2y0) obj;
        if (o2y0Var2 == null) {
            return null;
        }
        WeakReference weakReference2 = dgsVar.a;
        if (o2y0Var2 == (weakReference2 != null ? (o2y0) weakReference2.get() : null)) {
            WeakReference weakReference3 = dgsVar.a;
            if (weakReference3 != null) {
                weakReference3.clear();
            }
            dgsVar.a = null;
        }
        return o2y0Var2;
    }
}
