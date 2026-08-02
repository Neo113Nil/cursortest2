package com.yandex.passport.biometric.ui.verification;

import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.biometric.ui.verification.BiometricAuthSdkActivity$onCreate$1", f = "BiometricAuthSdkActivity.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BiometricAuthSdkActivity$onCreate$1 extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ BiometricAuthSdkActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricAuthSdkActivity$onCreate$1(BiometricAuthSdkActivity biometricAuthSdkActivity, Continuation continuation) {
        super(2, continuation);
        this.b = biometricAuthSdkActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BiometricAuthSdkActivity$onCreate$1(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new BiometricAuthSdkActivity$onCreate$1(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            gci0 gci0Var = ((e) this.b.a.getValue()).c;
            b bVar = new b(this.b);
            this.a = 1;
            if (gci0Var.a.collect(bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
