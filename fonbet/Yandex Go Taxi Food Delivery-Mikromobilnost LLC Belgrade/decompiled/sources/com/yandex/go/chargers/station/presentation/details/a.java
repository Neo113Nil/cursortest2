package com.yandex.go.chargers.station.presentation.details;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardButtonNameV3;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardOpenReasonV2;
import com.yandex.go.chargers.data.j;
import com.yandex.go.chargers.orchestrator_user_events.api.ChargersOrchestratorUserEventType;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;
import defpackage.b64;
import defpackage.bra;
import defpackage.cms;
import defpackage.dxa;
import defpackage.em9;
import defpackage.gra;
import defpackage.hqa;
import defpackage.iqa;
import defpackage.jl40;
import defpackage.jms;
import defpackage.jqa;
import defpackage.jra;
import defpackage.ksa;
import defpackage.lsa;
import defpackage.oma;
import defpackage.pzt0;
import defpackage.qo9;
import defpackage.rra;
import defpackage.sra;
import defpackage.swa;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tsa;
import defpackage.twa;
import defpackage.uj9;
import defpackage.uo9;
import defpackage.vpr;
import defpackage.vva;
import defpackage.wwa;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements vpr, jms {
    public final /* synthetic */ sra a;

    public a(sra sraVar) {
        this.a = sraVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        boolean z;
        List list;
        lsa lsaVar = (lsa) obj;
        boolean z2 = lsaVar instanceof ksa;
        sra sraVar = this.a;
        if (z2) {
            if (!sraVar.I) {
                jra jraVar = sraVar.z;
                ChargersStationOpenReason chargersStationOpenReason = sraVar.G;
                jraVar.getClass();
                gra graVar = ((ksa) lsaVar).a;
                String str2 = graVar.i;
                swa swaVar = graVar.e;
                jraVar.c = str2;
                jraVar.d = (swaVar != null ? swaVar.b : null) != null;
                List list2 = graVar.h;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((qo9) it.next()).a);
                }
                vva vvaVar = graVar.l;
                Integer valueOf = vvaVar != null ? Integer.valueOf(vvaVar.a) : null;
                if (swaVar != null && (list = swaVar.c) != null) {
                    List list3 = list;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        loop1: while (it2.hasNext()) {
                            List list4 = ((twa) it2.next()).b;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                Iterator it3 = list4.iterator();
                                while (it3.hasNext()) {
                                    if (((wwa) it3.next()).e instanceof dxa) {
                                        z = true;
                                        break loop1;
                                    }
                                }
                            }
                        }
                    }
                }
                z = false;
                List list5 = graVar.b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    uj9 uj9Var = ((uo9) it4.next()).d;
                    ChargersAnalytics$ChargersLocationCardButtonNameV3 chargersAnalytics$ChargersLocationCardButtonNameV3 = uj9Var instanceof jqa ? ChargersAnalytics$ChargersLocationCardButtonNameV3.TakeCharger : uj9Var instanceof hqa ? ChargersAnalytics$ChargersLocationCardButtonNameV3.ReturnCharger : uj9Var instanceof iqa ? ChargersAnalytics$ChargersLocationCardButtonNameV3.SelectToReturn : null;
                    if (chargersAnalytics$ChargersLocationCardButtonNameV3 != null) {
                        arrayList2.add(chargersAnalytics$ChargersLocationCardButtonNameV3);
                    }
                }
                em9 em9Var = jraVar.a;
                ChargersAnalytics$ChargersLocationCardOpenReasonV2 b = jra.b(chargersStationOpenReason);
                boolean z3 = jraVar.d;
                String str3 = jraVar.c;
                if (str3 == null) {
                    str3 = "";
                }
                em9Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("badge_ids", arrayList);
                hashMap.put("open_reason", b.getEventValue());
                if (valueOf != null) {
                    hashMap.put("surge_gauge_value", valueOf);
                }
                hashMap.put("is_surge_action_available", Boolean.valueOf(z));
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(((ChargersAnalytics$ChargersLocationCardButtonNameV3) it5.next()).getEventValue());
                }
                hashMap.put("button_names", arrayList3);
                hashMap.put("trace_id", str3);
                hashMap.put("promo_badge", Boolean.valueOf(z3));
                em9Var.a.a("Chargers.LocationCard.Shown", hashMap, 7, new HashMap());
                ((com.yandex.go.chargers.orchestrator_user_events.domain.b) sraVar.D).a(ChargersOrchestratorUserEventType.STATION);
                sraVar.I = true;
            }
            ksa ksaVar = (ksa) lsaVar;
            oma omaVar = ksaVar.b;
            if (omaVar != null) {
                sraVar.Lg(omaVar, true);
            }
            ((rra) sraVar.Dg()).g8(lsaVar);
            gra graVar2 = ksaVar.a;
            j jVar = sraVar.C;
            String str4 = sraVar.F;
            bra braVar = graVar2.n;
            boolean z4 = graVar2.o.intValue() >= 0;
            if (str4 == null) {
                tsa tsaVar = sraVar.E;
                str = b64.l("station:", tsaVar.b, ":", tsaVar.a);
            } else {
                str = str4;
            }
            if (braVar == null || !z4) {
                String str5 = str;
                if (str4 == null) {
                    jVar.b(str5);
                }
                pzt0 pzt0Var = sraVar.J;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                sraVar.J = null;
            } else {
                int i = braVar.a;
                if (i > 0) {
                    jVar.d(i, str);
                } else {
                    jVar.c(str);
                }
                bra braVar2 = graVar2.n;
                if (braVar2 != null) {
                    pzt0 pzt0Var2 = sraVar.J;
                    if (pzt0Var2 != null) {
                        pzt0Var2.a(null);
                    }
                    sraVar.J = null;
                    sraVar.J = tje.N(sraVar.Jg(), null, null, new ChargersStationDetailsPresenter$startFooterTimerUpdates$1(sraVar, str, graVar2, braVar2, null), 3);
                }
            }
        } else {
            pzt0 pzt0Var3 = sraVar.J;
            if (pzt0Var3 != null) {
                pzt0Var3.a(null);
            }
            sraVar.J = null;
            ((rra) sraVar.Dg()).g8(lsaVar);
        }
        return zy11.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vpr) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.a, sra.class, "renderStationDetails", "renderStationDetails(Lcom/yandex/go/chargers/station/presentation/details/ChargersStationDetailsUiState;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
