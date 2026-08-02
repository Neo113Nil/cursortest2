package com.yandex.go.chargers.order.active;

import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardButtonNameV2;
import com.yandex.go.chargers.dvizh_subscription.api.ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint;
import com.yandex.go.scooters.api.domain.model.ScootersPassesListService;
import defpackage.a60;
import defpackage.aba;
import defpackage.bba;
import defpackage.bp9;
import defpackage.bua;
import defpackage.c21;
import defpackage.cba;
import defpackage.cua;
import defpackage.dba;
import defpackage.eba;
import defpackage.em9;
import defpackage.fba;
import defpackage.gba;
import defpackage.hba;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.jv8;
import defpackage.m950;
import defpackage.md6;
import defpackage.nna;
import defpackage.pxm0;
import defpackage.qk9;
import defpackage.qvn0;
import defpackage.rk9;
import defpackage.rx9;
import defpackage.sy60;
import defpackage.tje;
import defpackage.uaa;
import defpackage.uk9;
import defpackage.v770;
import defpackage.vaa;
import defpackage.vk9;
import defpackage.w511;
import defpackage.waa;
import defpackage.wls;
import defpackage.xaa;
import defpackage.yaa;
import defpackage.yba;
import defpackage.zaa;
import defpackage.zo9;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersActiveOrderModalView$itemsAdapter$1 extends FunctionReferenceImpl implements wls {
    public final void i(hba hbaVar, Map map) {
        q qVar = (q) this.receiver;
        md6 md6Var = qVar.H;
        em9 em9Var = qVar.x;
        nna nnaVar = qVar.y;
        nnaVar.getClass();
        nnaVar.a(map, RealtimeEventType.Clicked);
        if (hbaVar instanceof waa) {
            ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV2 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Deeplink;
            rk9 rk9Var = qVar.I;
            em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV2, rk9Var.a, null, rk9Var.b);
            String str = ((waa) hbaVar).a;
            ((a60) ((vk9) md6Var.c).F).c(str, v770.y);
            return;
        }
        boolean l = jl40.l(hbaVar, xaa.a);
        c21 c21Var = sy60.Q2;
        if (l) {
            ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV22 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Details;
            rk9 rk9Var2 = qVar.I;
            em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV22, rk9Var2.a, null, rk9Var2.b);
            vk9 vk9Var = (vk9) md6Var.c;
            vk9Var.A((m950) vk9Var.O.get(), new yba(((qk9) md6Var.b).a), c21Var);
            return;
        }
        if (hbaVar instanceof cba) {
            ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV23 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Promotion;
            rk9 rk9Var3 = qVar.I;
            em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV23, rk9Var3.a, null, rk9Var3.b);
            String str2 = ((cba) hbaVar).a;
            vk9 vk9Var2 = (vk9) md6Var.c;
            vk9Var2.A((m950) vk9Var2.R.get(), new zo9(str2), c21Var);
            return;
        }
        if (jl40.l(hbaVar, zaa.a)) {
            ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV24 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.FinishOrder;
            rk9 rk9Var4 = qVar.I;
            em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV24, rk9Var4.a, null, rk9Var4.b);
            String str3 = qVar.F;
            vk9 vk9Var3 = (vk9) md6Var.c;
            vk9Var3.A((m950) vk9Var3.M.get(), new bp9(str3), c21Var);
            return;
        }
        if (jl40.l(hbaVar, eba.a)) {
            ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV25 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Support;
            rk9 rk9Var5 = qVar.I;
            em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV25, rk9Var5.a, null, rk9Var5.b);
            tje.N(qVar.Jg(), null, null, new ChargersActiveOrderPresenter$openSupport$1(qVar, null), 3);
            return;
        }
        if (jl40.l(hbaVar, vaa.a)) {
            ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV26 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.PlusOptionOffer;
            rk9 rk9Var6 = qVar.I;
            em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV26, rk9Var6.a, null, rk9Var6.b);
            vk9 vk9Var4 = (vk9) md6Var.c;
            vk9Var4.A((m950) vk9Var4.N.get(), cua.a, new r(vk9Var4));
            return;
        }
        if (hbaVar instanceof aba) {
            ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV27 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.PlusOptionDetail;
            rk9 rk9Var7 = qVar.I;
            em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV27, rk9Var7.a, null, rk9Var7.b);
            String str4 = ((aba) hbaVar).a;
            md6Var.getClass();
            bua buaVar = new bua(str4);
            vk9 vk9Var5 = (vk9) md6Var.c;
            vk9Var5.A((m950) vk9Var5.N.get(), buaVar, new r(vk9Var5));
            return;
        }
        if (jl40.l(hbaVar, fba.a)) {
            ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV28 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.TakeMore;
            rk9 rk9Var8 = qVar.I;
            em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV28, rk9Var8.a, null, rk9Var8.b);
            ((vk9) md6Var.c).r(new jv8(23));
            return;
        }
        if (jl40.l(hbaVar, bba.a)) {
            vk9 vk9Var6 = (vk9) md6Var.c;
            vk9Var6.z((m950) vk9Var6.U.get(), new uk9(0));
            return;
        }
        if (jl40.l(hbaVar, dba.a)) {
            ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV29 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Unknown;
            rk9 rk9Var9 = qVar.I;
            em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV29, rk9Var9.a, null, rk9Var9.b);
            vk9 vk9Var7 = (vk9) md6Var.c;
            vk9Var7.E((m950) vk9Var7.H.get(), new qvn0(new pxm0("chargers", "active_order"), ScootersPassesListService.CHARGERS), c21Var, hxx.a);
            return;
        }
        if (jl40.l(hbaVar, uaa.a)) {
            ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV210 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Unknown;
            rk9 rk9Var10 = qVar.I;
            em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV210, rk9Var10.a, null, rk9Var10.b);
            ((vk9) md6Var.c).r(new jv8(25));
            return;
        }
        if (jl40.l(hbaVar, yaa.a)) {
            vk9 vk9Var8 = (vk9) md6Var.c;
            vk9Var8.A((m950) vk9Var8.S.get(), new rx9(ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint.ACTIVE_ORDER, null, 6), c21Var);
        } else {
            if (!jl40.l(hbaVar, gba.a)) {
                w511.b();
                return;
            }
            ChargersAnalytics$ChargersActiveOrderCardButtonNameV2 chargersAnalytics$ChargersActiveOrderCardButtonNameV211 = ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Unknown;
            rk9 rk9Var11 = qVar.I;
            em9Var.b(chargersAnalytics$ChargersActiveOrderCardButtonNameV211, rk9Var11.a, null, rk9Var11.b);
        }
    }

    @Override // defpackage.wls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        i((hba) obj, (Map) obj2);
        return zy11.a;
    }
}
