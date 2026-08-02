package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationScreenKt$BiometricVerificationScreen$3$1$1", f = "BiometricVerificationScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BiometricVerificationScreenKt$BiometricVerificationScreen$3$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $onResultCode;
    final /* synthetic */ int $resultCode;
    final /* synthetic */ m3u0 $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricVerificationScreenKt$BiometricVerificationScreen$3$1$1(wls wlsVar, int i, m3u0 m3u0Var, Continuation continuation) {
        super(2, continuation);
        this.$onResultCode = wlsVar;
        this.$resultCode = i;
        this.$state$delegate = m3u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BiometricVerificationScreenKt$BiometricVerificationScreen$3$1$1(this.$onResultCode, this.$resultCode, this.$state$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BiometricVerificationScreenKt$BiometricVerificationScreen$3$1$1 biometricVerificationScreenKt$BiometricVerificationScreen$3$1$1 = (BiometricVerificationScreenKt$BiometricVerificationScreen$3$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        biometricVerificationScreenKt$BiometricVerificationScreen$3$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$onResultCode.invoke(new Integer(this.$resultCode), ((BiometricVerificationViewModel$State) this.$state$delegate.getValue()).getTrackId());
        return zy11.a;
    }
}
