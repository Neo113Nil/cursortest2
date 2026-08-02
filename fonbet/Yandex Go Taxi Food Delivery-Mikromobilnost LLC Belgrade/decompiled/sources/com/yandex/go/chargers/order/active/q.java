package com.yandex.go.chargers.order.active;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardButtonNameV2;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardOpenReason;
import defpackage.aba;
import defpackage.ad5;
import defpackage.bba;
import defpackage.bvf0;
import defpackage.cba;
import defpackage.cyx;
import defpackage.dba;
import defpackage.eba;
import defpackage.em9;
import defpackage.fba;
import defpackage.gba;
import defpackage.gci0;
import defpackage.hba;
import defpackage.il9;
import defpackage.jl40;
import defpackage.md6;
import defpackage.nna;
import defpackage.ol9;
import defpackage.pk9;
import defpackage.rk9;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.uaa;
import defpackage.uyj;
import defpackage.vaa;
import defpackage.w511;
import defpackage.waa;
import defpackage.xaa;
import defpackage.yaa;
import defpackage.yvf0;
import defpackage.zaa;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class q extends ad5 {
    public final ol9 A;
    public final cyx B;
    public final com.yandex.go.chargers.data.e C;
    public final yvf0 D;
    public final il9 E;
    public final String F;
    public final ChargersAnalytics$ChargersActiveOrderCardOpenReason G;
    public final md6 H;
    public rk9 I;
    public final r0 J;
    public final em9 x;
    public final nna y;
    public final com.yandex.go.chargers.domain.b z;

    public q(em9 em9Var, nna nnaVar, com.yandex.go.chargers.domain.b bVar, ol9 ol9Var, cyx cyxVar, com.yandex.go.chargers.data.e eVar, yvf0 yvf0Var, il9 il9Var, String str, ChargersAnalytics$ChargersActiveOrderCardOpenReason chargersAnalytics$ChargersActiveOrderCardOpenReason, md6 md6Var) {
        super(pk9.class);
        this.x = em9Var;
        this.y = nnaVar;
        this.z = bVar;
        this.A = ol9Var;
        this.B = cyxVar;
        this.C = eVar;
        this.D = yvf0Var;
        this.E = il9Var;
        this.F = str;
        this.G = chargersAnalytics$ChargersActiveOrderCardOpenReason;
        this.H = md6Var;
        this.I = new rk9(0);
        this.J = bvf0.c(EmptyList.a);
    }

    public static final ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 Kg(q qVar, hba hbaVar) {
        qVar.getClass();
        if (hbaVar instanceof waa) {
            return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Deeplink;
        }
        if (jl40.l(hbaVar, xaa.a)) {
            return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Details;
        }
        if (jl40.l(hbaVar, zaa.a)) {
            return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.FinishOrder;
        }
        if (hbaVar instanceof cba) {
            return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Promotion;
        }
        if (jl40.l(hbaVar, eba.a)) {
            return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Support;
        }
        if (jl40.l(hbaVar, gba.a)) {
            return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Unknown;
        }
        if (jl40.l(hbaVar, vaa.a)) {
            return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.PlusOptionOffer;
        }
        if (hbaVar instanceof aba) {
            return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.PlusOptionDetail;
        }
        if (jl40.l(hbaVar, fba.a)) {
            return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.TakeMore;
        }
        if (hbaVar instanceof bba) {
            return null;
        }
        if (!jl40.l(hbaVar, dba.a) && !jl40.l(hbaVar, uaa.a)) {
            if (jl40.l(hbaVar, yaa.a)) {
                return null;
            }
            w511.b();
            return null;
        }
        return ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Unknown;
    }

    public static LinkedHashSet Lg(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((Map) it.next()).get("creative_id");
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.E.h.a.l(null);
    }

    public final tpr Mg() {
        il9 il9Var = this.E;
        tpr a = il9Var.c.a();
        com.yandex.go.chargers.data.e eVar = il9Var.g;
        gci0 d = kotlinx.coroutines.flow.e.d(eVar.d);
        String str = this.F;
        e0 e0Var = new e0(d, str);
        r0 r0Var = eVar.d;
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.l(a, e0Var, kotlinx.coroutines.flow.e.t(new rol0(new ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1(kotlinx.coroutines.flow.e.t(new z(kotlinx.coroutines.flow.e.d(r0Var), str)), il9Var, str, null))), kotlinx.coroutines.flow.e.d(il9Var.h.a), new c0(kotlinx.coroutines.flow.e.d(r0Var), il9Var), new ChargersActiveOrderUiStateInteractor$uiStateFlow$3(il9Var, this.G, null)));
        il9Var.a.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
