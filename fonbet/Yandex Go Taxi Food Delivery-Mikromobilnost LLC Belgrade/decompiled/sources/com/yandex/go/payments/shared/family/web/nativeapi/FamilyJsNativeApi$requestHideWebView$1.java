package com.yandex.go.payments.shared.family.web.nativeapi;

import com.yandex.go.payments.shared.family.web.c;
import defpackage.bap;
import defpackage.ff41;
import defpackage.jln;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scg;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.web.nativeapi.FamilyJsNativeApi$requestHideWebView$1", f = "FamilyJsNativeApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class FamilyJsNativeApi$requestHideWebView$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ FamilyJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyJsNativeApi$requestHideWebView$1(FamilyJsNativeApi familyJsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = familyJsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyJsNativeApi$requestHideWebView$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FamilyJsNativeApi$requestHideWebView$1 familyJsNativeApi$requestHideWebView$1 = (FamilyJsNativeApi$requestHideWebView$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        familyJsNativeApi$requestHideWebView$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bap bapVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        bapVar = this.this$0.navigator;
        ((scg) ((ff41) ((c) ((jln) bapVar).b).V.getValue())).b().i();
        this.this$0.callbackResult(this.$promiseId);
        return zy11.a;
    }
}
