package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.aki;
import defpackage.bki;
import defpackage.cxa0;
import defpackage.ems;
import defpackage.fxb0;
import defpackage.gxb0;
import defpackage.ha91;
import defpackage.hni;
import defpackage.ixa0;
import defpackage.jl40;
import defpackage.mm91;
import defpackage.mvg;
import defpackage.nxa0;
import defpackage.ny61;
import defpackage.pal0;
import defpackage.qal0;
import defpackage.ral0;
import defpackage.rfl0;
import defpackage.rm91;
import defpackage.sal0;
import defpackage.soi;
import defpackage.sth;
import defpackage.tcc;
import defpackage.tth;
import defpackage.ual0;
import defpackage.uji;
import defpackage.uoi;
import defpackage.uth;
import defpackage.vji;
import defpackage.w511;
import defpackage.wji;
import defpackage.xji;
import defpackage.xli;
import defpackage.yji;
import defpackage.zji;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Luth;", "mode", "Luoi;", "mapAnimation", "", "Lbki;", "deliveryPoints", "Lixa0;", "performerPosition", "Lual0;", "routeState", "Lnxa0;", "<anonymous>", "(Luth;Luoi;Ljava/util/List;Lixa0;Lual0;)Lnxa0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.map_overlay.DeliveryRoutePresenter$launchRouteVoUpdater$1", f = "DeliveryRoutePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryRoutePresenter$launchRouteVoUpdater$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRoutePresenter$launchRouteVoUpdater$1(q qVar, Continuation continuation) {
        super(6, continuation);
        this.this$0 = qVar;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        DeliveryRoutePresenter$launchRouteVoUpdater$1 deliveryRoutePresenter$launchRouteVoUpdater$1 = new DeliveryRoutePresenter$launchRouteVoUpdater$1(this.this$0, (Continuation) obj6);
        deliveryRoutePresenter$launchRouteVoUpdater$1.L$0 = (uth) obj;
        deliveryRoutePresenter$launchRouteVoUpdater$1.L$1 = (uoi) obj2;
        deliveryRoutePresenter$launchRouteVoUpdater$1.L$2 = (List) obj3;
        deliveryRoutePresenter$launchRouteVoUpdater$1.L$3 = (ixa0) obj4;
        deliveryRoutePresenter$launchRouteVoUpdater$1.L$4 = (ual0) obj5;
        return deliveryRoutePresenter$launchRouteVoUpdater$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rfl0 rfl0Var;
        cxa0 cxa0Var;
        Iterator it;
        ha91 ha91Var;
        uth uthVar = (uth) this.L$0;
        uoi uoiVar = (uoi) this.L$1;
        List list = (List) this.L$2;
        ixa0 ixa0Var = (ixa0) this.L$3;
        ual0 ual0Var = (ual0) this.L$4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = jl40.l(uthVar, tth.b) || ((uthVar instanceof sth) && ((sth) uthVar).a.contains(new xli(this.this$0.c)));
        List list2 = list;
        q qVar = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it) {
            bki bkiVar = (bki) it2.next();
            qVar.getClass();
            double d = bkiVar.getCoordinates().a;
            double d2 = bkiVar.getCoordinates().b;
            boolean isActive = bkiVar.isActive();
            if (bkiVar instanceof aki) {
                aki akiVar = (aki) bkiVar;
                mm91 mm91Var = akiVar.d;
                if (mm91Var instanceof fxb0) {
                    fxb0 fxb0Var = (fxb0) mm91Var;
                    it = it2;
                    ha91Var = new vji(fxb0Var.b, fxb0Var.c, fxb0Var.d);
                } else {
                    it = it2;
                    if (!mm91Var.equals(gxb0.b)) {
                        w511.b();
                        return null;
                    }
                    int i = hni.a[akiVar.a.ordinal()];
                    if (i == 1) {
                        ha91Var = xji.b;
                    } else {
                        if (i != 2 && i != 3 && i != 4) {
                            w511.b();
                            return null;
                        }
                        ha91Var = wji.b;
                    }
                }
            } else {
                it = it2;
                if (!(bkiVar instanceof zji)) {
                    w511.b();
                    return null;
                }
                ha91Var = uji.b;
            }
            arrayList.add(new yji(d, d2, ha91Var, isActive));
        }
        this.this$0.getClass();
        if (ual0Var instanceof sal0) {
            rfl0Var = new rfl0(((sal0) ual0Var).a);
        } else if (jl40.l(ual0Var, pal0.a)) {
            rfl0Var = new rfl0(null);
        } else if (jl40.l(ual0Var, qal0.a)) {
            rfl0Var = new rfl0(null);
        } else if (ual0Var instanceof ral0) {
            rfl0Var = new rfl0(null);
        } else {
            if (!jl40.l(ual0Var, qal0.b)) {
                w511.b();
                return null;
            }
            rfl0Var = new rfl0(null);
        }
        if (ixa0Var != null) {
            this.this$0.getClass();
            double d3 = ixa0Var.c;
            double d4 = ixa0Var.d;
            Double d5 = ixa0Var.f;
            rm91 rm91Var = ixa0Var.a;
            String str = ixa0Var.b;
            cxa0Var = new cxa0(d3, d4, d5, rm91Var, str, (str == null || str.isEmpty() || !(uthVar instanceof sth)) ? false : true);
        } else {
            cxa0Var = null;
        }
        return new nxa0(rfl0Var, cxa0Var, arrayList, z && jl40.l(uoiVar, soi.a));
    }
}
