package com.yandex.go.superapp.biometrics.data;

import com.yandex.go.superapp.biometrics.data.models.BiometricsBleReceiverDisconnectReason;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/superapp/biometrics/data/models/BiometricsBleReceiverDisconnectReason;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.biometrics.data.BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$timeoutFlow$1", f = "BiometricsBleReceiverConnectionRepository.kt", l = {219, 220}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$timeoutFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $timeout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$timeoutFlow$1(long j, Continuation continuation) {
        super(2, continuation);
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$timeoutFlow$1 biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$timeoutFlow$1 = new BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$timeoutFlow$1(this.$timeout, continuation);
        biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$timeoutFlow$1.L$0 = obj;
        return biometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$timeoutFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BiometricsBleReceiverConnectionRepository$disconnectOnRulesViolation$timeoutFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (kotlinx.coroutines.a.j(r6, r8) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long j = this.$timeout;
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        BiometricsBleReceiverDisconnectReason biometricsBleReceiverDisconnectReason = BiometricsBleReceiverDisconnectReason.Timeout;
        this.L$0 = null;
        this.label = 2;
    }
}
