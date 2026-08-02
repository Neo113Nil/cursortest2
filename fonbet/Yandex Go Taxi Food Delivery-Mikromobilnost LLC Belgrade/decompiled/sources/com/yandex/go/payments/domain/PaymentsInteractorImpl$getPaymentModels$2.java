package com.yandex.go.payments.domain;

import defpackage.aiq0;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.gw00;
import defpackage.h0a0;
import defpackage.jl40;
import defpackage.lea0;
import defpackage.lv90;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mvg;
import defpackage.n2v0;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.superapp.payment.SuperAppPaymentMethodsInteractor$observeSavedPaymentMethodsChanged$$inlined$safeCollectIn$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Loea0;", "<anonymous>", "(Ltse;)Loea0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PaymentsInteractorImpl$getPaymentModels$2", f = "PaymentsInteractorImpl.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentsInteractorImpl$getPaymentModels$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $forceUpdate;
    final /* synthetic */ h0a0 $geoContext;
    final /* synthetic */ String $serviceFeature;
    final /* synthetic */ boolean $withTips;
    int label;
    final /* synthetic */ l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsInteractorImpl$getPaymentModels$2(l0 l0Var, String str, boolean z, h0a0 h0a0Var, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = l0Var;
        this.$serviceFeature = str;
        this.$withTips = z;
        this.$geoContext = h0a0Var;
        this.$forceUpdate = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentsInteractorImpl$getPaymentModels$2(this.this$0, this.$serviceFeature, this.$withTips, this.$geoContext, this.$forceUpdate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentsInteractorImpl$getPaymentModels$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ru.yandex.taxi.superapp.payment.a aVar;
        pzt0 pzt0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l0 l0Var = this.this$0;
            PaymentsInteractorImpl$getPaymentModels$2$paymentOptions$1 paymentsInteractorImpl$getPaymentModels$2$paymentOptions$1 = new PaymentsInteractorImpl$getPaymentModels$2$paymentOptions$1(l0Var, this.$serviceFeature, this.$withTips, this.$geoContext, this.$forceUpdate, null);
            this.label = 1;
            l0Var.c.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new PaymentsInteractorImpl$checkGpayAndMakeRequest$2(paymentsInteractorImpl$getPaymentModels$2$paymentOptions$1, l0Var, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        oea0 oea0Var = (oea0) obj;
        n2v0 n2v0Var = this.this$0.f;
        if (n2v0Var != null && ((pzt0Var = (aVar = (ru.yandex.taxi.superapp.payment.a) n2v0Var.b).g) == null || !pzt0Var.isActive())) {
            kotlinx.coroutines.flow.t T = kotlinx.coroutines.flow.e.T(new mth(((com.yandex.go.payments.paymentlist.data.c) aVar.c).u, 4), 1);
            aVar.b.getClass();
            aVar.g = tje.N(aVar.a, null, null, new SuperAppPaymentMethodsInteractor$observeSavedPaymentMethodsChanged$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(T, uyj.a), null, aVar), 3);
        }
        aiq0 aiq0Var = this.this$0.e;
        com.yandex.go.payments.data.k kVar = aiq0Var.b;
        Set e = kVar.a().e();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : e) {
            if (cvu0.x((String) obj3, aiq0Var.a, false)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            lv90 b = kVar.b(str);
            Pair pair = b == null ? null : new Pair(str, b);
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        Map s = kotlin.collections.b.s(arrayList2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(s.size()));
        for (Map.Entry entry : s.entrySet()) {
            String str2 = (String) entry.getKey();
            linkedHashMap.put(evu0.d0(str2, "_", str2), entry.getValue());
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str3 = (String) entry2.getKey();
            lv90 lv90Var = (lv90) entry2.getValue();
            Iterator it2 = oea0Var.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                lea0 lea0Var = (lea0) obj2;
                if (jl40.l(lv90Var.b, lea0Var.getId()) && lv90Var.a() == lea0Var.c()) {
                    break;
                }
            }
            if (((lea0) obj2) == null) {
                aiq0Var.a(null, str3);
            }
        }
        return oea0Var;
    }
}
