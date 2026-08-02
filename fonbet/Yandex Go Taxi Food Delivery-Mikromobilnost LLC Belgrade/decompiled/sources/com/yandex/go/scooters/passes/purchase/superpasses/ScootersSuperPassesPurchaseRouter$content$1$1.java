package com.yandex.go.scooters.passes.purchase.superpasses;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesOpenedFromScreen;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesOpenedType;
import defpackage.agd;
import defpackage.b3b1;
import defpackage.dfo0;
import defpackage.m1p0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qxm0;
import defpackage.s1p0;
import defpackage.tcc;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls1p0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Ls1p0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.superpasses.ScootersSuperPassesPurchaseRouter$content$1$1", f = "ScootersSuperPassesPurchaseRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesPurchaseRouter$content$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ qxm0 $scootersAnalytics;
    final /* synthetic */ yfd $this_buildContent;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesPurchaseRouter$content$1$1(yfd yfdVar, qxm0 qxm0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_buildContent = yfdVar;
        this.$scootersAnalytics = qxm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersSuperPassesPurchaseRouter$content$1$1 scootersSuperPassesPurchaseRouter$content$1$1 = new ScootersSuperPassesPurchaseRouter$content$1$1(this.$this_buildContent, this.$scootersAnalytics, continuation);
        scootersSuperPassesPurchaseRouter$content$1$1.L$0 = obj;
        return scootersSuperPassesPurchaseRouter$content$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersSuperPassesPurchaseRouter$content$1$1 scootersSuperPassesPurchaseRouter$content$1$1 = (ScootersSuperPassesPurchaseRouter$content$1$1) create((s1p0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersSuperPassesPurchaseRouter$content$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s1p0 s1p0Var = (s1p0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ScootersAnalytics$ScootersPassesOpenedType scootersAnalytics$ScootersPassesOpenedType = ScootersAnalytics$ScootersPassesOpenedType.Superpasses;
        ScootersAnalytics$ScootersPassesOpenedFromScreen c = b3b1.c(((dfo0) ((agd) this.$this_buildContent).a).a);
        String str = ((dfo0) ((agd) this.$this_buildContent).a).b;
        List list = s1p0Var.c.d;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((m1p0) it.next()).a);
        }
        this.$scootersAnalytics.e(scootersAnalytics$ScootersPassesOpenedType, c, arrayList, str);
        return zy11.a;
    }
}
