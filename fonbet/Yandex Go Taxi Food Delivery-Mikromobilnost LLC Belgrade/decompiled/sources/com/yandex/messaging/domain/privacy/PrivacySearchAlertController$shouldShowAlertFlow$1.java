package com.yandex.messaging.domain.privacy;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "isAlertShown", "Loyj0;", "Lcom/yandex/messaging/core/net/entities/PrivacyBucket;", "Lzy11;", "privacyResult", "<anonymous>", "(ZLoyj0;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.privacy.PrivacySearchAlertController$shouldShowAlertFlow$1", f = "PrivacySearchAlertController.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PrivacySearchAlertController$shouldShowAlertFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivacySearchAlertController$shouldShowAlertFlow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PrivacySearchAlertController$shouldShowAlertFlow$1 privacySearchAlertController$shouldShowAlertFlow$1 = new PrivacySearchAlertController$shouldShowAlertFlow$1(this.this$0, (Continuation) obj3);
        privacySearchAlertController$shouldShowAlertFlow$1.Z$0 = booleanValue;
        privacySearchAlertController$shouldShowAlertFlow$1.L$0 = (oyj0) obj2;
        return privacySearchAlertController$shouldShowAlertFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() != false) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            b.b(obj);
            boolean z2 = this.Z$0;
            oyj0 oyj0Var = (oyj0) this.L$0;
            if (!z2) {
                a aVar = this.this$0;
                this.label = 1;
                obj = a.a(aVar, oyj0Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
    }
}
