package com.yandex.go.ads.mobile_ads_sdk;

import defpackage.bgc;
import defpackage.fs20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ads.mobile_ads_sdk.MobileAdsInitializer$onAppCreated$1", f = "MobileAdsInitializer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MobileAdsInitializer$onAppCreated$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileAdsInitializer$onAppCreated$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobileAdsInitializer$onAppCreated$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MobileAdsInitializer$onAppCreated$1 mobileAdsInitializer$onAppCreated$1 = (MobileAdsInitializer$onAppCreated$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mobileAdsInitializer$onAppCreated$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        fs20 fs20Var = (fs20) this.this$0.d.get();
        fs20Var.a.initialize(new bgc(12));
        return zy11.a;
    }
}
