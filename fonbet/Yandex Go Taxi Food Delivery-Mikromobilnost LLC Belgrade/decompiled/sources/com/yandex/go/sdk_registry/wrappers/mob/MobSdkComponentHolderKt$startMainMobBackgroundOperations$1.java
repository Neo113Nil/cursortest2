package com.yandex.go.sdk_registry.wrappers.mob;

import com.yandex.go.sdk_registry.api.SdkLogLevel;
import defpackage.dab1;
import defpackage.eop0;
import defpackage.kl20;
import defpackage.krt;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qop0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sdk_registry.wrappers.mob.MobSdkComponentHolderKt$startMainMobBackgroundOperations$1", f = "MobSdkComponentHolder.kt", l = {230}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MobSdkComponentHolderKt$startMainMobBackgroundOperations$1 extends SuspendLambda implements tls {
    final /* synthetic */ eop0 $dispatchers;
    final /* synthetic */ qop0 $logger;
    final /* synthetic */ kl20 $mob;
    final /* synthetic */ String $tag;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.sdk_registry.wrappers.mob.MobSdkComponentHolderKt$startMainMobBackgroundOperations$1$1", f = "MobSdkComponentHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.sdk_registry.wrappers.mob.MobSdkComponentHolderKt$startMainMobBackgroundOperations$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ qop0 $logger;
        final /* synthetic */ kl20 $mob;
        final /* synthetic */ String $tag;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(qop0 qop0Var, String str, kl20 kl20Var, Continuation continuation) {
            super(2, continuation);
            this.$logger = qop0Var;
            this.$tag = str;
            this.$mob = kl20Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$logger, this.$tag, this.$mob, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
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
            try {
                qop0 qop0Var = this.$logger;
                if (qop0Var != null) {
                    dab1 dab1Var = (dab1) qop0Var;
                    dab1Var.m(SdkLogLevel.INFO, this.$tag, "Starting MOB background operations", null);
                }
                this.$mob.b();
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                qop0 qop0Var2 = this.$logger;
                if (qop0Var2 != null) {
                    dab1 dab1Var2 = (dab1) qop0Var2;
                    dab1Var2.m(SdkLogLevel.ERROR, this.$tag, "Failed to start MOB background operations", e2);
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobSdkComponentHolderKt$startMainMobBackgroundOperations$1(eop0 eop0Var, qop0 qop0Var, String str, kl20 kl20Var, Continuation continuation) {
        super(1, continuation);
        this.$dispatchers = eop0Var;
        this.$logger = qop0Var;
        this.$tag = str;
        this.$mob = kl20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MobSdkComponentHolderKt$startMainMobBackgroundOperations$1(this.$dispatchers, this.$logger, this.$tag, this.$mob, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MobSdkComponentHolderKt$startMainMobBackgroundOperations$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ((krt) this.$dispatchers).getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$logger, this.$tag, this.$mob, null);
            this.label = 1;
            if (tje.k0(mdhVar, anonymousClass1, this) == coroutineSingletons) {
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
