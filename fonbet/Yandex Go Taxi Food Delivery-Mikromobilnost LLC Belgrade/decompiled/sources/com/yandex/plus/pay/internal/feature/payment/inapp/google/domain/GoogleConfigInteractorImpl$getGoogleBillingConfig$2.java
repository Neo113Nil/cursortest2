package com.yandex.plus.pay.internal.feature.payment.inapp.google.domain;

import com.yandex.plus.pay.api.google.model.GoogleBillingConfig;
import com.yandex.plus.pay.api.model.PlusPayGoogleBillingConfig;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/plus/pay/api/model/PlusPayGoogleBillingConfig;", "<anonymous>", "(Ltse;)Lcom/yandex/plus/pay/api/model/PlusPayGoogleBillingConfig;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.GoogleConfigInteractorImpl$getGoogleBillingConfig$2", f = "GoogleConfigInteractorImpl.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class GoogleConfigInteractorImpl$getGoogleBillingConfig$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleConfigInteractorImpl$getGoogleBillingConfig$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoogleConfigInteractorImpl$getGoogleBillingConfig$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleConfigInteractorImpl$getGoogleBillingConfig$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            this.label = 1;
            obj = a.a(aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        GoogleBillingConfig googleBillingConfig = (GoogleBillingConfig) obj;
        if (googleBillingConfig == null) {
            return null;
        }
        a aVar2 = this.this$0;
        String upperCase = evu0.k0(googleBillingConfig.getCountryCode()).toString().toUpperCase(Locale.ROOT);
        Iterable iterable = (Iterable) aVar2.c.invoke();
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            hashSet.add(evu0.k0((String) it.next()).toString().toUpperCase(Locale.ROOT));
        }
        return new PlusPayGoogleBillingConfig(upperCase, hashSet.contains(upperCase));
    }
}
