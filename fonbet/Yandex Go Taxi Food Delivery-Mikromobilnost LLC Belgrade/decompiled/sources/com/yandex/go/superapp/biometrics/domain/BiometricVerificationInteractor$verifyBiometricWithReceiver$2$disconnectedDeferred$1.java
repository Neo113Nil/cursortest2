package com.yandex.go.superapp.biometrics.domain;

import com.yandex.go.superapp.biometrics.data.models.BiometricsBleReceiverDisconnectReason;
import defpackage.jy5;
import defpackage.mvg;
import defpackage.n831;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v831;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lx831;", "<anonymous>", "(Ltse;)Lx831;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.biometrics.domain.BiometricVerificationInteractor$verifyBiometricWithReceiver$2$disconnectedDeferred$1", f = "BiometricVerificationInteractor.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BiometricVerificationInteractor$verifyBiometricWithReceiver$2$disconnectedDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $rssiThreshold;
    final /* synthetic */ long $timeout;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricVerificationInteractor$verifyBiometricWithReceiver$2$disconnectedDeferred$1(a aVar, int i, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$rssiThreshold = i;
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BiometricVerificationInteractor$verifyBiometricWithReceiver$2$disconnectedDeferred$1(this.this$0, this.$rssiThreshold, this.$timeout, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BiometricVerificationInteractor$verifyBiometricWithReceiver$2$disconnectedDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar2 = this.this$0;
            b bVar = aVar2.b;
            Integer num = new Integer(this.$rssiThreshold);
            long j = this.$timeout;
            this.L$0 = aVar2;
            this.label = 1;
            Enum b = bVar.d.b(num, j, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = b;
            aVar = aVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$0;
            kotlin.b.b(obj);
        }
        aVar.getClass();
        int i2 = jy5.a[((BiometricsBleReceiverDisconnectReason) obj).ordinal()];
        if (i2 == 1) {
            return n831.a;
        }
        if (i2 == 2) {
            return v831.b;
        }
        if (i2 == 3) {
            return v831.a;
        }
        w511.b();
        return null;
    }
}
