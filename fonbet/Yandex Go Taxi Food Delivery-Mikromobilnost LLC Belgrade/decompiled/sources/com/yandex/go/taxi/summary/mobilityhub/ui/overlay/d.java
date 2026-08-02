package com.yandex.go.taxi.summary.mobilityhub.ui.overlay;

import com.yandex.go.taxi.summary.mobilityhub.ui.overlay.d;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import defpackage.ah00;
import defpackage.b01;
import defpackage.bl00;
import defpackage.bw20;
import defpackage.cw20;
import defpackage.cwa1;
import defpackage.e1v;
import defpackage.f4c0;
import defpackage.fw20;
import defpackage.gci0;
import defpackage.gh00;
import defpackage.k141;
import defpackage.l141;
import defpackage.o1v;
import defpackage.scc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uo21;
import defpackage.xm00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final class d {
    public final fw20 a;
    public final ah00 b;
    public final o1v c;
    public final k141 d;
    public final uo21 e;
    public xm00 f;
    public final bw20 h;
    public final cw20 j;
    public final cw20 k;
    public final ArrayList g = new ArrayList();
    public final b01 i = new b01(15, this);

    /* JADX WARN: Type inference failed for: r1v4, types: [cw20] */
    /* JADX WARN: Type inference failed for: r1v5, types: [cw20] */
    public d(fw20 fw20Var, ah00 ah00Var, o1v o1vVar, k141 k141Var, uo21 uo21Var) {
        this.a = fw20Var;
        this.b = ah00Var;
        this.c = o1vVar;
        this.d = k141Var;
        this.e = uo21Var;
        final int i = 0;
        this.h = new bw20(i, this);
        this.j = new MapObjectTapListener(this) { // from class: cw20
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // com.yandex.mapkit.map.MapObjectTapListener
            public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                int i2 = i;
                d dVar = this.b;
                switch (i2) {
                    case 0:
                        f1v f1vVar = dVar.a.F;
                        f1vVar.a.g(PointType.SOURCE);
                        break;
                    default:
                        f1v f1vVar2 = dVar.a.F;
                        f1vVar2.a.g(PointType.DESTINATION);
                        break;
                }
                return true;
            }
        };
        final int i2 = 1;
        this.k = new MapObjectTapListener(this) { // from class: cw20
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // com.yandex.mapkit.map.MapObjectTapListener
            public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                int i22 = i2;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        f1v f1vVar = dVar.a.F;
                        f1vVar.a.g(PointType.SOURCE);
                        break;
                    default:
                        f1v f1vVar2 = dVar.a.F;
                        f1vVar2.a.g(PointType.DESTINATION);
                        break;
                }
                return true;
            }
        };
    }

    public static final void a(d dVar, List list) {
        f4c0 f4c0Var;
        f4c0 f4c0Var2;
        f4c0 f4c0Var3;
        ArrayList arrayList = dVar.g;
        xm00 xm00Var = dVar.f;
        if (xm00Var == null) {
            return;
        }
        if (list.isEmpty()) {
            dVar.c();
            return;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            f4c0 f4c0Var4 = null;
            if (i < 0) {
                scc.m();
                throw null;
            }
            e1v e1vVar = (e1v) obj;
            Point d = cwa1.d(e1vVar.a);
            Pair pair = (Pair) kotlin.collections.a.S(i, arrayList);
            bl00 bl00Var = e1vVar.b;
            bl00 bl00Var2 = e1vVar.c;
            if (bl00Var != null) {
                if (pair == null || (f4c0Var = (f4c0) pair.c()) == null) {
                    f4c0Var = xm00Var.r(d);
                } else {
                    f4c0Var.o(d);
                }
                f4c0Var.z(bl00Var.a, bl00Var.b);
                f4c0Var.k(2.0f);
                f4c0Var.g(i == 0 ? dVar.j : i == scc.f(list) ? dVar.k : null);
            } else {
                if (pair != null && (f4c0Var2 = (f4c0) pair.c()) != null) {
                    f4c0Var2.d();
                }
                f4c0Var = null;
            }
            if (bl00Var2 != null) {
                if (pair == null || (f4c0Var4 = (f4c0) pair.f()) == null) {
                    f4c0Var4 = xm00Var.r(d);
                } else {
                    f4c0Var4.o(d);
                }
                f4c0Var4.z(bl00Var2.a, bl00Var2.b);
                f4c0Var4.k(2.0f);
            } else if (pair != null && (f4c0Var3 = (f4c0) pair.f()) != null) {
                f4c0Var3.d();
            }
            if (pair == null) {
                arrayList.add(new Pair(f4c0Var, f4c0Var4));
            } else {
                arrayList.set(i, new Pair(f4c0Var, f4c0Var4));
            }
            i = i2;
        }
        while (arrayList.size() > list.size()) {
            Pair pair2 = (Pair) arrayList.remove(scc.f(arrayList));
            f4c0 f4c0Var5 = (f4c0) pair2.c();
            if (f4c0Var5 != null) {
                f4c0Var5.d();
            }
            f4c0 f4c0Var6 = (f4c0) pair2.f();
            if (f4c0Var6 != null) {
                f4c0Var6.d();
            }
        }
    }

    public final void b() {
        xm00 xm00Var = this.f;
        ah00 ah00Var = this.b;
        if (xm00Var == null) {
            this.f = ((gh00) ah00Var).i.p();
        }
        this.e.attach();
        gh00 gh00Var = (gh00) ah00Var;
        gh00Var.c(this.h);
        gh00Var.e(this.i);
        if (((l141) this.d).a()) {
            gh00Var.I(true);
        }
        c cVar = new c(this);
        fw20 fw20Var = this.a;
        fw20Var.Bg(cVar);
        ((gh00) fw20Var.y).e(fw20Var.P);
        gci0 gci0Var = fw20Var.O;
        tpr tprVar = fw20Var.N;
        com.yandex.go.coroutines.b.h(fw20Var.Jg(), new m0(gci0Var, tprVar, new MobilityHubV2OverlayPresenter$dispatchCamera$1(fw20Var, null)));
        com.yandex.go.coroutines.b.h(fw20Var.Jg(), kotlinx.coroutines.flow.e.m(tprVar, gci0Var, fw20Var.M, fw20Var.z.M2(), new MobilityHubV2OverlayPresenter$dispatchCamera$2(fw20Var, null)));
        tje.N(fw20Var.Jg(), null, null, new MobilityHubV2OverlayPresenter$attachUiStateFlow$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.m(tprVar, gci0Var, fw20Var.E.c, fw20Var.C.a(), new MobilityHubV2OverlayPresenter$attachUiStateFlow$1(5, null)), new MobilityHubV2OverlayPresenter$attachUiStateFlow$2(fw20Var, null)), null, fw20Var), 3);
    }

    public final void c() {
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            f4c0 f4c0Var = (f4c0) pair.c();
            if (f4c0Var != null) {
                f4c0Var.d();
            }
            f4c0 f4c0Var2 = (f4c0) pair.f();
            if (f4c0Var2 != null) {
                f4c0Var2.d();
            }
        }
        arrayList.clear();
    }
}
