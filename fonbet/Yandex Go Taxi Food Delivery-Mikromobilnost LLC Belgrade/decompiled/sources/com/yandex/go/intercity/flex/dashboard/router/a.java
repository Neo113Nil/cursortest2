package com.yandex.go.intercity.flex.dashboard.router;

import com.yandex.go.flex.common.actions.create_order.SendOrderDraftAction;
import com.yandex.go.intercity.flex.api.dashboard.analytics.IntercityDashboardFlexAnalytics$PaymentOpenReason;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenFlexScreenAction;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenSelectPaymentMethodScreenAction;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenShuttleClarifyPointAction;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.taxi.order.models.api.preorder.intercity.RawOrderdraftInfo;
import defpackage.anw;
import defpackage.bnw;
import defpackage.bti0;
import defpackage.byx;
import defpackage.c430;
import defpackage.cir;
import defpackage.cma1;
import defpackage.cnw;
import defpackage.dir;
import defpackage.dw;
import defpackage.epw;
import defpackage.hnw;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k6x;
import defpackage.kdw;
import defpackage.kr;
import defpackage.lc0;
import defpackage.llw;
import defpackage.m950;
import defpackage.mlw;
import defpackage.n6u;
import defpackage.odw;
import defpackage.oep0;
import defpackage.oew;
import defpackage.olw;
import defpackage.pep0;
import defpackage.reu;
import defpackage.rg7;
import defpackage.sy60;
import defpackage.tcc;
import defpackage.tdw;
import defpackage.tzt;
import defpackage.u45;
import defpackage.udw;
import defpackage.vdw;
import defpackage.w030;
import defpackage.w511;
import defpackage.xby;
import defpackage.xsq0;
import defpackage.ymw;
import defpackage.yuw0;
import defpackage.yvf0;
import defpackage.zhr;
import defpackage.zsa;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class a implements dw {
    public final cir A;
    public final kdw B;
    public final oep0 C;
    public final w030 a;
    public final yvf0 b;
    public final odw c;
    public final oew w;
    public final yvf0 x;
    public final mlw y;
    public final hnw z;

    public a(w030 w030Var, yvf0 yvf0Var, odw odwVar, oew oewVar, yvf0 yvf0Var2, mlw mlwVar, hnw hnwVar, cir cirVar, kdw kdwVar, oep0 oep0Var) {
        this.a = w030Var;
        this.b = yvf0Var;
        this.c = odwVar;
        this.w = oewVar;
        this.x = yvf0Var2;
        this.y = mlwVar;
        this.z = hnwVar;
        this.A = cirVar;
        this.B = kdwVar;
        this.C = oep0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handle(kr krVar, n6u n6uVar) {
        anw anwVar;
        byx byxVar;
        Object obj;
        String str;
        boolean z = krVar instanceof IntercityOpenSelectPaymentMethodScreenAction;
        oep0 oep0Var = this.C;
        if (z) {
            ((pep0) oep0Var).f((m950) this.b.get(), new epw(IntercityDashboardFlexAnalytics$PaymentOpenReason.FLEX_ACTION), hxx.a);
            return;
        }
        if (krVar instanceof SendOrderDraftAction) {
            c cVar = ((SendOrderDraftAction) krVar).a;
            if (cVar != null) {
                this.w.a(new RawOrderdraftInfo(cVar), new IntercityDashboardFlexActionRouter$handleSendOrderDraftActionInternal$1(0, this, a.class, "goBack", "goBack()V", 0));
                return;
            }
            xby.t(jst.e, "Intercity.Checkout", null, "orderdraft_body is mandatory in SendOrderDraftAction", 6);
            w030 w030Var = this.a;
            u45 e = w030Var.e();
            if (e != null) {
                e.dismiss();
                return;
            } else {
                w030Var.p();
                return;
            }
        }
        if (krVar instanceof IntercityOpenFlexScreenAction) {
            IntercityOpenFlexScreenAction.Query query = ((IntercityOpenFlexScreenAction) krVar).a;
            if (query == null || (str = query.a) == null) {
                return;
            }
            LinkedHashMap c = xsq0.c(query.b);
            yuw0 yuw0Var = ((tdw) this.c).a;
            yuw0Var.A(((udw) yuw0Var.N).a((oew) yuw0Var.J, (mlw) yuw0Var.K, (k6x) yuw0Var.L, (cir) yuw0Var.M), new vdw(str, c), sy60.Q2);
            return;
        }
        if (!(krVar instanceof IntercityOpenShuttleClarifyPointAction)) {
            if (krVar instanceof bti0) {
                ((dir) this.A).a.g(new zhr(((bti0) krVar).a));
                return;
            }
            return;
        }
        IntercityOpenShuttleClarifyPointAction intercityOpenShuttleClarifyPointAction = (IntercityOpenShuttleClarifyPointAction) krVar;
        IntercityOpenShuttleClarifyPointAction.FlexPointType flexPointType = intercityOpenShuttleClarifyPointAction.b;
        if (flexPointType == null) {
            return;
        }
        int i = bnw.a[flexPointType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                byxVar = new byx(Screen.CHOOSE_A, new c430(Mode.INTERCITY_SHUTTLE_STOP_POINT, (b) null, cnw.a(intercityOpenShuttleClarifyPointAction)));
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                byxVar = new byx(Screen.CHOOSE_B, new c430(Mode.INTERCITY_SHUTTLE_STOP_POINT, (b) null, cnw.a(intercityOpenShuttleClarifyPointAction)));
            }
            byx byxVar2 = byxVar;
            IntercityOpenShuttleClarifyPointAction.SourceRouteInfo sourceRouteInfo = intercityOpenShuttleClarifyPointAction.f;
            IntercityOpenShuttleClarifyPointAction.PedestrianParameters pedestrianParameters = sourceRouteInfo != null ? sourceRouteInfo.a : null;
            List<IntercityOpenShuttleClarifyPointAction.AvailablePointToSelection> list = intercityOpenShuttleClarifyPointAction.h;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (IntercityOpenShuttleClarifyPointAction.AvailablePointToSelection availablePointToSelection : list) {
                String str2 = availablePointToSelection.a;
                Double[] dArr = availablePointToSelection.b;
                String str3 = availablePointToSelection.c;
                String str4 = availablePointToSelection.d;
                String str5 = availablePointToSelection.e;
                if (str5 == null) {
                    str5 = "";
                }
                arrayList.add(new ymw(str2, dArr, str3, str4, str5));
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((ymw) obj).a, intercityOpenShuttleClarifyPointAction.d)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ymw ymwVar = (ymw) obj;
            if (ymwVar != null) {
                IntercityOpenShuttleClarifyPointAction.FlexPointType flexPointType2 = intercityOpenShuttleClarifyPointAction.b;
                Double[] dArr2 = intercityOpenShuttleClarifyPointAction.e.a;
                reu reuVar = new reu(12, dArr2.length != 2 ? zzs.f : new zzs(dArr2[1].doubleValue(), dArr2[0].doubleValue(), 0, null, null, 28));
                IntercityOpenShuttleClarifyPointAction.ModalScreenContent modalScreenContent = intercityOpenShuttleClarifyPointAction.g;
                anwVar = new anw(flexPointType2, byxVar2, ymwVar, reuVar, new rg7(modalScreenContent.a, modalScreenContent.b, modalScreenContent.c), pedestrianParameters != null ? pedestrianParameters.a : null, pedestrianParameters != null ? pedestrianParameters.b : null, arrayList);
                if (anwVar != null) {
                    return;
                }
                Iterator it2 = ((olw) this.y).b.iterator();
                while (it2.hasNext()) {
                    llw llwVar = (llw) it2.next();
                    cma1.L(llwVar.itemView());
                    llwVar.onPause();
                }
                ((pep0) oep0Var).f(new zsa(17, (com.yandex.go.intercity.flex.dashboard.point_selection.a) this.x.get(), new lc0(this, anwVar, intercityOpenShuttleClarifyPointAction, flexPointType, 24), new tzt(24, this)), anwVar, hxx.a);
                return;
            }
        }
        anwVar = null;
        if (anwVar != null) {
        }
    }
}
