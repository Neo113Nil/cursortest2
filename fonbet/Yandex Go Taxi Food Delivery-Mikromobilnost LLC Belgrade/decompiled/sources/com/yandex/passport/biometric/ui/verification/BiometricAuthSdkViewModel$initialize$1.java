package com.yandex.passport.biometric.ui.verification;

import com.yandex.passport.common.ebs.BiometricAuthSdkProperties;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.mvg;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.EbsCryptoSdk;
import ru.rt.ebs.cryptosdk.entities.models.VerificationWithoutEsiaRequest;
import ru.rt.ebs.cryptosdk.navigation.models.VerificationLauncher;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.biometric.ui.verification.BiometricAuthSdkViewModel$initialize$1", f = "BiometricAuthSdkViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BiometricAuthSdkViewModel$initialize$1 extends SuspendLambda implements wls {
    public final /* synthetic */ e a;
    public final /* synthetic */ BiometricAuthSdkProperties b;
    public final /* synthetic */ VerificationLauncher c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricAuthSdkViewModel$initialize$1(e eVar, BiometricAuthSdkProperties biometricAuthSdkProperties, VerificationLauncher verificationLauncher, Continuation continuation) {
        super(2, continuation);
        this.a = eVar;
        this.b = biometricAuthSdkProperties;
        this.c = verificationLauncher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BiometricAuthSdkViewModel$initialize$1(this.a, this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BiometricAuthSdkViewModel$initialize$1 biometricAuthSdkViewModel$initialize$1 = (BiometricAuthSdkViewModel$initialize$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        biometricAuthSdkViewModel$initialize$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.b.b(obj);
        try {
            EbsCryptoSdk.startVerificationWithoutEsia$default(new VerificationWithoutEsiaRequest.Builder(e.W(this.b)).build(), this.c, null, 4, null);
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "EbsCryptoSdk.startVerificationWithoutEsia failed", e);
            }
            r0 r0Var = this.a.b;
            d dVar = new d(e);
            r0Var.getClass();
            r0Var.m(null, dVar);
        }
        return zy11.a;
    }
}
