package com.yandex.go.superapp.biometrics.domain;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.x831;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lx831;", "<anonymous>", "(Ltse;)Lx831;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.biometrics.domain.BiometricVerificationInteractor$verifyBiometricWithReceiver$2", f = "BiometricVerificationInteractor.kt", l = {104, HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BiometricVerificationInteractor$verifyBiometricWithReceiver$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $flowId;
    final /* synthetic */ int $rssiThreshold;
    final /* synthetic */ String $service;
    final /* synthetic */ long $timeout;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricVerificationInteractor$verifyBiometricWithReceiver$2(a aVar, String str, String str2, int i, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$flowId = str;
        this.$service = str2;
        this.$rssiThreshold = i;
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BiometricVerificationInteractor$verifyBiometricWithReceiver$2 biometricVerificationInteractor$verifyBiometricWithReceiver$2 = new BiometricVerificationInteractor$verifyBiometricWithReceiver$2(this.this$0, this.$flowId, this.$service, this.$rssiThreshold, this.$timeout, continuation);
        biometricVerificationInteractor$verifyBiometricWithReceiver$2.L$0 = obj;
        return biometricVerificationInteractor$verifyBiometricWithReceiver$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BiometricVerificationInteractor$verifyBiometricWithReceiver$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (r13 == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r13 == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h = tje.h(tseVar, null, null, new BiometricVerificationInteractor$verifyBiometricWithReceiver$2$disconnectedDeferred$1(this.this$0, this.$rssiThreshold, this.$timeout, null), 3);
            this.this$0.b.d.d();
            a aVar = this.this$0;
            String str = this.$flowId;
            String str2 = this.$service;
            this.L$0 = null;
            this.L$1 = h;
            this.label = 1;
            obj = aVar.a(str, str2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return (x831) obj;
            }
            h = (noh) this.L$1;
            kotlin.b.b(obj);
        }
        x831 x831Var = (x831) obj;
        if (!h.k0()) {
            h.a(null);
            return x831Var;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        obj = h.k(this);
    }
}
