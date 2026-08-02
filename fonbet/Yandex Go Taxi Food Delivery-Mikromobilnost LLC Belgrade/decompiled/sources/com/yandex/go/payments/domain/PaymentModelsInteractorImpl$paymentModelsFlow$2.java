package com.yandex.go.payments.domain;

import com.yandex.go.payments.data.model.response.CardProfile;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.paymentlist.experiments.MaasPaymentOptionExperiment;
import defpackage.bms;
import defpackage.e4a0;
import defpackage.i000;
import defpackage.jl40;
import defpackage.jw90;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.of0;
import defpackage.ogz0;
import defpackage.pea0;
import defpackage.qgz0;
import defpackage.qqo;
import defpackage.rcc;
import defpackage.tx90;
import defpackage.xw91;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods;", "paymentMethods", "", "googlePayEnabled", "Li000;", "maas", "Loea0;", "<anonymous>", "(Lcom/yandex/go/payments/data/model/response/PaymentMethods;ZLi000;)Loea0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PaymentModelsInteractorImpl$paymentModelsFlow$2", f = "PaymentModelsInteractorImpl.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentModelsInteractorImpl$paymentModelsFlow$2 extends SuspendLambda implements bms {
    final /* synthetic */ jw90 $availabilityChecker;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentModelsInteractorImpl$paymentModelsFlow$2(j0 j0Var, jw90 jw90Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = j0Var;
        this.$availabilityChecker = jw90Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        PaymentModelsInteractorImpl$paymentModelsFlow$2 paymentModelsInteractorImpl$paymentModelsFlow$2 = new PaymentModelsInteractorImpl$paymentModelsFlow$2(this.this$0, this.$availabilityChecker, (Continuation) obj4);
        paymentModelsInteractorImpl$paymentModelsFlow$2.L$0 = (PaymentMethods) obj;
        paymentModelsInteractorImpl$paymentModelsFlow$2.Z$0 = booleanValue;
        paymentModelsInteractorImpl$paymentModelsFlow$2.L$1 = (i000) obj3;
        return paymentModelsInteractorImpl$paymentModelsFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Object obj2;
        lea0 lea0Var;
        ogz0 ogz0Var;
        UserCardProfileName userCardProfileName;
        PaymentMethods paymentMethods = (PaymentMethods) this.L$0;
        boolean z = this.Z$0;
        i000 i000Var = (i000) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        tx90 tx90Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            ListBuilder a = this.this$0.f.a(paymentMethods, z);
            a aVar = this.this$0.g;
            jw90 jw90Var = this.$availabilityChecker;
            this.L$0 = paymentMethods;
            this.L$1 = i000Var;
            this.L$2 = a;
            this.Z$0 = z;
            this.label = 1;
            Serializable c = aVar.c(paymentMethods, jw90Var, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = a;
            obj = c;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.L$2;
            kotlin.b.b(obj);
        }
        List list2 = (List) obj;
        this.this$0.getClass();
        PaymentMethods.LastPaymentMethod lastPaymentMethod = paymentMethods.k;
        if (lastPaymentMethod == null) {
            lea0Var = null;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                lea0 lea0Var2 = (lea0) obj2;
                if (jl40.l(lea0Var2.getId(), lastPaymentMethod.a)) {
                    e4a0 c2 = lea0Var2.c();
                    e4a0 e4a0Var = lastPaymentMethod.b;
                    if (e4a0Var == null) {
                        e4a0Var = e4a0.R3;
                    }
                    if (c2 == e4a0Var) {
                        break;
                    }
                }
            }
            lea0Var = (lea0) obj2;
        }
        List list3 = list2;
        j0 j0Var = this.this$0;
        jw90 jw90Var2 = this.$availabilityChecker;
        j0Var.getClass();
        ListBuilder a2 = rcc.a();
        if (i000Var != null) {
            MaasPaymentOptionExperiment maasPaymentOptionExperiment = (MaasPaymentOptionExperiment) ((qqo) j0Var.a.a.a.getValue()).b();
            i000.a aVar2 = i000Var.a;
            a2.add(new of0(aVar2.a, aVar2.c, maasPaymentOptionExperiment.c));
        }
        qgz0 qgz0Var = j0Var.d;
        Set a3 = qgz0Var.a.a();
        List list4 = list;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                PaymentMethod$Type c3 = ((lea0) it2.next()).c();
                if (a3.contains(c3) && jw90Var2.a(c3).equals(xw91.C)) {
                    ogz0Var = new ogz0(qgz0Var.b.s());
                    break;
                }
            }
        }
        ogz0Var = null;
        if (ogz0Var != null) {
            a2.add(ogz0Var);
        }
        ArrayList m0 = kotlin.collections.a.m0(a2.j(), list3);
        this.this$0.getClass();
        String str = paymentMethods.p;
        PaymentMethods.LocationInfo locationInfo = paymentMethods.o;
        Integer num = locationInfo != null ? locationInfo.c : null;
        String str2 = locationInfo != null ? locationInfo.b : null;
        CardProfile cardProfile = paymentMethods.a.d;
        if (cardProfile != null && (userCardProfileName = cardProfile.a) != null) {
            tx90Var = new tx90(userCardProfileName);
        }
        return new oea0(list, m0, lea0Var, new pea0(str, num, tx90Var, str2));
    }
}
