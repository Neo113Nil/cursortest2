package com.yandex.go.safety.center.safetycenter_web.domain.web;

import defpackage.ivl0;
import defpackage.krl0;
import defpackage.kvl0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oh11;
import defpackage.tse;
import defpackage.v770;
import defpackage.wls;
import defpackage.wul0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.safetycenter_web.domain.web.SafetyCenterWebJsApi$showChooseContacts$1", f = "SafetyCenterWebJsApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class SafetyCenterWebJsApi$showChooseContacts$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ SafetyCenterWebJsApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterWebJsApi$showChooseContacts$1(SafetyCenterWebJsApi safetyCenterWebJsApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = safetyCenterWebJsApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterWebJsApi$showChooseContacts$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SafetyCenterWebJsApi$showChooseContacts$1 safetyCenterWebJsApi$showChooseContacts$1 = (SafetyCenterWebJsApi$showChooseContacts$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        safetyCenterWebJsApi$showChooseContacts$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kvl0 kvl0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kvl0Var = this.this$0.safetyCenterWebJsCallbacks;
        ivl0 ivl0Var = new ivl0(this.this$0, this.$promiseId, 0);
        com.yandex.go.safety.center.safetycenter_web.b bVar = (com.yandex.go.safety.center.safetycenter_web.b) ((krl0) kvl0Var).b;
        bVar.A((m950) bVar.G.get(), new oh11(v770.e, null), new wul0(0, ivl0Var));
        return zy11.a;
    }
}
