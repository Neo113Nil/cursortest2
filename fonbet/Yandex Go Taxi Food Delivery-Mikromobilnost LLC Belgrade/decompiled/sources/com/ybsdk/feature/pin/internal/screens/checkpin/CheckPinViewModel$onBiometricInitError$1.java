package com.ybsdk.feature.pin.internal.screens.checkpin;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinViewModel$onBiometricInitError$1", f = "CheckPinViewModel.kt", l = {417}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CheckPinViewModel$onBiometricInitError$1 extends SuspendLambda implements wls {
    final /* synthetic */ Throwable $biometricError;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPinViewModel$onBiometricInitError$1(b bVar, Throwable th, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$biometricError = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckPinViewModel$onBiometricInitError$1(this.this$0, this.$biometricError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckPinViewModel$onBiometricInitError$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.U.set(false);
            com.ybsdk.feature.pin.internal.domain.b bVar = this.this$0.E;
            Throwable th = this.$biometricError;
            this.label = 1;
            obj = bVar.e(th, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b bVar2 = this.this$0;
        if (booleanValue) {
            bVar2.z0();
        } else {
            bVar2.o0(this.$biometricError);
        }
        return zy11.a;
    }
}
