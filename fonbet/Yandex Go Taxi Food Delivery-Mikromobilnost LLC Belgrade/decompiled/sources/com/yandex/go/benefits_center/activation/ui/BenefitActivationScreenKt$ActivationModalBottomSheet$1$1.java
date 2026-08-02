package com.yandex.go.benefits_center.activation.ui;

import defpackage.m3u0;
import defpackage.mvg;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.benefits_center.activation.ui.BenefitActivationScreenKt$ActivationModalBottomSheet$1$1", f = "BenefitActivationScreen.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BenefitActivationScreenKt$ActivationModalBottomSheet$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ m3u0 $currentInputRef;
    final /* synthetic */ tls $handleAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitActivationScreenKt$ActivationModalBottomSheet$1$1(tls tlsVar, m3u0 m3u0Var, Continuation continuation) {
        super(2, continuation);
        this.$handleAction = tlsVar;
        this.$currentInputRef = m3u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BenefitActivationScreenKt$ActivationModalBottomSheet$1$1(this.$handleAction, this.$currentInputRef, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BenefitActivationScreenKt$ActivationModalBottomSheet$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0025 -> B:5:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            kotlin.b.b(r6)
            goto L28
        Ld:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r5)
            r5 = 0
            return r5
        L14:
            kotlin.b.b(r6)
        L17:
            o430 r6 = defpackage.e3n.b
            kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.SECONDS
            long r3 = defpackage.kp50.U(r2, r6)
            r5.label = r2
            java.lang.Object r6 = kotlinx.coroutines.a.j(r3, r5)
            if (r6 != r0) goto L28
            return r0
        L28:
            tls r6 = r5.$handleAction
            lm5 r1 = new lm5
            m3u0 r3 = r5.$currentInputRef
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r1.<init>(r3)
            r6.invoke(r1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.go.benefits_center.activation.ui.BenefitActivationScreenKt$ActivationModalBottomSheet$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
