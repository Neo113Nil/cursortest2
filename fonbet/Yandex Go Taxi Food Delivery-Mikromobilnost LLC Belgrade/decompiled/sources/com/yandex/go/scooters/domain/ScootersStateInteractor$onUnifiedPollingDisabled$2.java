package com.yandex.go.scooters.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isUnifiedPollingEnabled", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersStateInteractor$onUnifiedPollingDisabled$2", f = "ScootersStateInteractor.kt", l = {HProv.PP_SET_PIN, 111}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ScootersStateInteractor$onUnifiedPollingDisabled$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a0 this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.domain.ScootersStateInteractor$onUnifiedPollingDisabled$2$1", f = "ScootersStateInteractor.kt", l = {108}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.domain.ScootersStateInteractor$onUnifiedPollingDisabled$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ tls $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tls tlsVar, Continuation continuation) {
            super(1, continuation);
            this.$action = tlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.$action, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tls tlsVar = this.$action;
                this.label = 1;
                if (tlsVar.invoke(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersStateInteractor$onUnifiedPollingDisabled$2(a0 a0Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = a0Var;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersStateInteractor$onUnifiedPollingDisabled$2 scootersStateInteractor$onUnifiedPollingDisabled$2 = new ScootersStateInteractor$onUnifiedPollingDisabled$2(this.this$0, this.$action, continuation);
        scootersStateInteractor$onUnifiedPollingDisabled$2.Z$0 = ((Boolean) obj).booleanValue();
        return scootersStateInteractor$onUnifiedPollingDisabled$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ScootersStateInteractor$onUnifiedPollingDisabled$2) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (kotlinx.coroutines.flow.e.k(r7.h.a(), new com.yandex.go.scooters.domain.ScootersStateInteractor$doConditionalActiveOrdersPolling$2(r2, null), r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r7.invoke(r6) == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (z) {
                a0 a0Var = this.this$0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$action, null);
                this.Z$0 = z;
                this.label = 1;
            } else {
                tls tlsVar = this.$action;
                this.Z$0 = z;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
