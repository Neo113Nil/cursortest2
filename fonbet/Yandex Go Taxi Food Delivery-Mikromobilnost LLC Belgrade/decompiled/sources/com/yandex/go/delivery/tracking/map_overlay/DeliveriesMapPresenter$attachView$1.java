package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.gci0;
import defpackage.ike;
import defpackage.jel0;
import defpackage.jqr;
import defpackage.mth;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.odi;
import defpackage.qnh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.xli;
import defpackage.zgf;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lxli;", "newDeliveries", "Lzy11;", "<anonymous>", "(Ljava/util/Set;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.map_overlay.DeliveriesMapPresenter$attachView$1", f = "DeliveriesMapPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveriesMapPresenter$attachView$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveriesMapPresenter$attachView$1(l lVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveriesMapPresenter$attachView$1 deliveriesMapPresenter$attachView$1 = new DeliveriesMapPresenter$attachView$1(this.this$0, continuation);
        deliveriesMapPresenter$attachView$1.L$0 = obj;
        return deliveriesMapPresenter$attachView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveriesMapPresenter$attachView$1 deliveriesMapPresenter$attachView$1 = (DeliveriesMapPresenter$attachView$1) create((Set) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveriesMapPresenter$attachView$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set set = (Set) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Set keySet = this.this$0.E.keySet();
        Set g = v4r0.g(set, keySet);
        Set g2 = v4r0.g(keySet, set);
        l lVar = this.this$0;
        Iterator it = g.iterator();
        while (it.hasNext()) {
            String str = ((xli) it.next()).a;
            LinkedHashMap linkedHashMap = lVar.E;
            xli xliVar = new xli(str);
            ru.yandex.taxi.logistics.deliveries.map.android.a aVar = (ru.yandex.taxi.logistics.deliveries.map.android.a) lVar.y.get();
            tt2 tt2Var = lVar.z;
            tpr tprVar = lVar.F;
            odi odiVar = lVar.B;
            k kVar = new k((n4u0) lVar.x.k.getValue(), str);
            qnh qnhVar = new qnh(lVar);
            zgf zgfVar = new zgf(25, lVar);
            jel0 jel0Var = (jel0) lVar.A.get();
            q qVar = new q(aVar, tprVar, odiVar, str, jel0Var, tt2Var, qnhVar, zgfVar, kVar);
            jel0Var.b = str;
            gci0 gci0Var = qVar.g;
            jqr jqrVar = new jqr(new mth(gci0Var, 6), new DeliveryRoutePresenter$onCreate$1(qVar, null), 3);
            ike ikeVar = qVar.e;
            kotlinx.coroutines.flow.e.H(ikeVar, jqrVar);
            tpr t = kotlinx.coroutines.flow.e.t(new n(gci0Var));
            kotlinx.coroutines.flow.e.H(ikeVar, new jqr(new jqr(kotlinx.coroutines.flow.e.l(tprVar, qVar.f, kotlinx.coroutines.flow.e.t(new p(new mth(gci0Var, 6))), t, jel0Var.c, new DeliveryRoutePresenter$launchRouteVoUpdater$1(qVar, null)), new DeliveryRoutePresenter$launchRouteVoUpdater$2(qVar, null), 3), new DeliveryRoutePresenter$launchRouteVoUpdater$3(qVar, null), 3));
            linkedHashMap.put(xliVar, qVar);
        }
        l lVar2 = this.this$0;
        Iterator it2 = g2.iterator();
        while (it2.hasNext()) {
            String str2 = ((xli) it2.next()).a;
            q qVar2 = (q) lVar2.E.get(new xli(str2));
            if (qVar2 != null) {
                qVar2.a();
            }
            lVar2.E.remove(new xli(str2));
        }
        return zy11.a;
    }
}
