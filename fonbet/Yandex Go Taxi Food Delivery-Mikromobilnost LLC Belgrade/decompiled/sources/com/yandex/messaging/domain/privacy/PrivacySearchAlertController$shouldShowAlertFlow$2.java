package com.yandex.messaging.domain.privacy;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldShow", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.privacy.PrivacySearchAlertController$shouldShowAlertFlow$2", f = "PrivacySearchAlertController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PrivacySearchAlertController$shouldShowAlertFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacySearchAlertController$shouldShowAlertFlow$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PrivacySearchAlertController$shouldShowAlertFlow$2 privacySearchAlertController$shouldShowAlertFlow$2 = new PrivacySearchAlertController$shouldShowAlertFlow$2(this.this$0, continuation);
        privacySearchAlertController$shouldShowAlertFlow$2.Z$0 = ((Boolean) obj).booleanValue();
        return privacySearchAlertController$shouldShowAlertFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        PrivacySearchAlertController$shouldShowAlertFlow$2 privacySearchAlertController$shouldShowAlertFlow$2 = (PrivacySearchAlertController$shouldShowAlertFlow$2) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        privacySearchAlertController$shouldShowAlertFlow$2.invokeSuspend(zy11Var);
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
        if (!this.Z$0) {
            this.this$0.d.a();
        }
        return zy11.a;
    }
}
