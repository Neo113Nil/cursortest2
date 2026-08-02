package com.ybsdk.api;

import com.ybsdk.common.InternalSdkState;
import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tf51;
import defpackage.w511;
import defpackage.xh51;
import defpackage.yh51;
import defpackage.zh51;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/ybsdk/common/InternalSdkState;", "sdkState", "Ltf51;", "balance", "", "Lxf51;", "paymentMethods", "Lai51;", "<anonymous>", "(Lcom/ybsdk/common/InternalSdkState;Ltf51;Ljava/util/List;)Lai51;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.api.PublicApiInteractor$sdkStateFlow$2", f = "PublicApiInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PublicApiInteractor$sdkStateFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublicApiInteractor$sdkStateFlow$2(e eVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        PublicApiInteractor$sdkStateFlow$2 publicApiInteractor$sdkStateFlow$2 = new PublicApiInteractor$sdkStateFlow$2(this.this$0, (Continuation) obj4);
        publicApiInteractor$sdkStateFlow$2.L$0 = (InternalSdkState) obj;
        publicApiInteractor$sdkStateFlow$2.L$1 = (tf51) obj2;
        publicApiInteractor$sdkStateFlow$2.L$2 = (List) obj3;
        return publicApiInteractor$sdkStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        InternalSdkState internalSdkState = (InternalSdkState) this.L$0;
        tf51 tf51Var = (tf51) this.L$1;
        List list = (List) this.L$2;
        this.this$0.getClass();
        if ((internalSdkState instanceof InternalSdkState.Ok) || (internalSdkState instanceof InternalSdkState.PinInput)) {
            return new yh51(tf51Var, list);
        }
        if ((internalSdkState instanceof InternalSdkState.Support) || (internalSdkState instanceof InternalSdkState.StartSessionDeeplink)) {
            return xh51.b;
        }
        if ((internalSdkState instanceof InternalSdkState.OpenProduct) || (internalSdkState instanceof InternalSdkState.YbRegistration)) {
            return xh51.a;
        }
        if (internalSdkState instanceof InternalSdkState.SmsAuthorization) {
            return new zh51(0);
        }
        if ((internalSdkState instanceof InternalSdkState.AccountUpgrade) || (internalSdkState instanceof InternalSdkState.ApplicationStatusCheck) || (internalSdkState instanceof InternalSdkState.Error) || (internalSdkState instanceof InternalSdkState.RequestNewAmToken) || (internalSdkState instanceof InternalSdkState.Unauthenticated) || (internalSdkState instanceof InternalSdkState.UpdateRequired)) {
            return xh51.c;
        }
        w511.b();
        return null;
    }
}
