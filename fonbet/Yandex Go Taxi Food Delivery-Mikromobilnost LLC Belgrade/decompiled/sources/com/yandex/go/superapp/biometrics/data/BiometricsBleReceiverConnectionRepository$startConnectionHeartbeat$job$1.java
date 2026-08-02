package com.yandex.go.superapp.biometrics.data;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.ac51;
import defpackage.bvf0;
import defpackage.cc51;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.kv5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tse;
import defpackage.wls;
import defpackage.zb51;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.biometrics.data.BiometricsBleReceiverConnectionRepository$startConnectionHeartbeat$job$1", f = "BiometricsBleReceiverConnectionRepository.kt", l = {112}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BiometricsBleReceiverConnectionRepository$startConnectionHeartbeat$job$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.superapp.biometrics.data.BiometricsBleReceiverConnectionRepository$startConnectionHeartbeat$job$1$1", f = "BiometricsBleReceiverConnectionRepository.kt", l = {114, HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.superapp.biometrics.data.BiometricsBleReceiverConnectionRepository$startConnectionHeartbeat$job$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
        
            if (kotlinx.coroutines.a.j(r6, r8) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        
            if (r9 == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
        
            return r1;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0067 -> B:15:0x0023). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    b.b(obj);
                    if (!(((ac51) obj) instanceof zb51)) {
                        a aVar = this.this$0;
                        aVar.e = 0;
                        aVar.a(null);
                        bvf0.j(tseVar, null);
                    }
                    o430 o430Var = e3n.b;
                    long U = kp50.U(5, DurationUnit.SECONDS);
                    this.L$0 = tseVar;
                    this.L$1 = null;
                    this.label = 2;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
            }
            b.b(obj);
            if (!bvf0.D(tseVar)) {
                return zy11.a;
            }
            a aVar2 = this.this$0;
            kv5 kv5Var = new kv5(9, aVar2);
            this.L$0 = tseVar;
            this.L$1 = null;
            this.label = 1;
            obj = aVar2.e("c7e6a6b8-9f4a-4f3e-8d7c-5b2e1f9a8c7d", cc51.a, kv5Var, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricsBleReceiverConnectionRepository$startConnectionHeartbeat$job$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BiometricsBleReceiverConnectionRepository$startConnectionHeartbeat$job$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BiometricsBleReceiverConnectionRepository$startConnectionHeartbeat$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            Lifecycle lifecycle = aVar.a;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
