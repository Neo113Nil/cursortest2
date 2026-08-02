package com.yandex.go.superapp.biometrics.data;

import defpackage.b26;
import defpackage.c26;
import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x16;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.biometrics.data.BiometricsBleReceiverConnectionRepository$disconnectOnDeviceUnavailable$1", f = "BiometricsBleReceiverConnectionRepository.kt", l = {HProv.PP_EXPORT_CSP}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BiometricsBleReceiverConnectionRepository$disconnectOnDeviceUnavailable$1 extends SuspendLambda implements wls {
    final /* synthetic */ x16 $connection;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc26;", ACSPConstants.STATUS, "", "<anonymous>", "(Lc26;)Z"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.superapp.biometrics.data.BiometricsBleReceiverConnectionRepository$disconnectOnDeviceUnavailable$1$1", f = "BiometricsBleReceiverConnectionRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.superapp.biometrics.data.BiometricsBleReceiverConnectionRepository$disconnectOnDeviceUnavailable$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((c26) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c26 c26Var = (c26) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                b.b(obj);
                return Boolean.valueOf(c26Var instanceof b26);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricsBleReceiverConnectionRepository$disconnectOnDeviceUnavailable$1(x16 x16Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$connection = x16Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BiometricsBleReceiverConnectionRepository$disconnectOnDeviceUnavailable$1(this.$connection, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BiometricsBleReceiverConnectionRepository$disconnectOnDeviceUnavailable$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            gci0 gci0Var = ((com.yandex.go.ble.connection.a) this.$connection).d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.label = 1;
            obj = e.z(gci0Var, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        c26 c26Var = (c26) obj;
        zy11 zy11Var = zy11.a;
        if (c26Var == null) {
            return zy11Var;
        }
        this.this$0.a(this.$connection);
        return zy11Var;
    }
}
