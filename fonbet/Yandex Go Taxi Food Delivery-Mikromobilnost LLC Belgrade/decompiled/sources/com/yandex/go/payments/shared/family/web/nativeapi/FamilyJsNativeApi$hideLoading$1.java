package com.yandex.go.payments.shared.family.web.nativeapi;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.tse0;
import defpackage.wls;
import defpackage.y9p;
import defpackage.z9p;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.web.nativeapi.FamilyJsNativeApi$hideLoading$1", f = "FamilyJsNativeApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class FamilyJsNativeApi$hideLoading$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ FamilyJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyJsNativeApi$hideLoading$1(FamilyJsNativeApi familyJsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = familyJsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyJsNativeApi$hideLoading$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FamilyJsNativeApi$hideLoading$1 familyJsNativeApi$hideLoading$1 = (FamilyJsNativeApi$hideLoading$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        familyJsNativeApi$hideLoading$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z9p z9pVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        z9pVar = this.this$0.familyAccountAnalytics;
        y9p y9pVar = z9pVar.c;
        y9pVar.a.a("FamilyAccount.WebInitiatedLoading.Hidden", tse0.n(y9pVar), 1, new HashMap());
        sls hideLoadingAction = this.this$0.getHideLoadingAction();
        if (hideLoadingAction != null) {
            hideLoadingAction.invoke();
        }
        this.this$0.callbackResult(this.$promiseId);
        return zy11.a;
    }
}
