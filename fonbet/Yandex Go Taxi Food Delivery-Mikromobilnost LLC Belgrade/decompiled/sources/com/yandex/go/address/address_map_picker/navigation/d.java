package com.yandex.go.address.address_map_picker.navigation;

import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import defpackage.d9b1;
import defpackage.f21;
import defpackage.gh00;
import defpackage.k56;
import defpackage.ktf0;
import defpackage.pq1;
import defpackage.pv0;
import defpackage.tje;
import defpackage.u2t;
import defpackage.v46;
import defpackage.wl00;
import defpackage.wpb0;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class d implements wl00 {
    public final /* synthetic */ f a;

    public d(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.wl00
    public final void onMapDragged() {
        this.a.M.b();
    }

    @Override // defpackage.wl00
    public final void onMapPressed() {
        this.a.M.h = true;
    }

    @Override // defpackage.wl00
    public final void onMapReleased() {
        com.yandex.go.address.address_map_picker.domain.e eVar = this.a.M;
        eVar.h = false;
        if (eVar.i) {
            eVar.i = false;
            eVar.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.wl00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onMapTapped(float f, float f2) {
        pq1 pq1Var;
        pv0 pv0Var;
        k56 k56Var;
        List list;
        Object obj;
        ktf0 ktf0Var;
        u2t u2tVar;
        f fVar = this.a;
        Point d = ((gh00) fVar.E).e.d(new ScreenPoint(f, f2));
        zzs E = d != null ? ru.yandex.taxi.map.utils.a.E(d, null) : null;
        if (E == null) {
            return false;
        }
        com.yandex.go.address.address_map_picker.domain.g gVar = fVar.L.a;
        wpb0 h = gVar.b.h(gVar.c, E, true);
        if (h != null) {
            tje.N(fVar.o(), null, null, new AddressMapPickerMapLayerRouterImpl$initMapApis$1$2$onMapTapped$1(fVar, h, null), 3);
            return true;
        }
        f21 a = fVar.K.a();
        if (a != null && (pv0Var = a.c) != null && (k56Var = pv0Var.b) != null && (list = k56Var.a) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                v46 v46Var = (v46) obj;
                ktf0 ktf0Var2 = v46Var.c;
                if ((ktf0Var2 != null ? ktf0Var2.a : null) != null && (u2tVar = v46Var.a) != null && d9b1.c(u2tVar, E)) {
                    break;
                }
            }
            v46 v46Var2 = (v46) obj;
            if (v46Var2 != null && (ktf0Var = v46Var2.c) != null) {
                pq1Var = ktf0Var.a;
                if (pq1Var != null) {
                    return false;
                }
                tje.N(fVar.o(), null, null, new AddressMapPickerMapLayerRouterImpl$initMapApis$1$2$onMapTapped$2(fVar, pq1Var, null), 3);
                return true;
            }
        }
        pq1Var = null;
        if (pq1Var != null) {
        }
    }
}
