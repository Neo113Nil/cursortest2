package com.yandex.go.sdk_registry.wrappers.mob;

import com.yandex.mob.d;
import defpackage.ap20;
import defpackage.eop0;
import defpackage.krt;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uot;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sdk_registry.wrappers.mob.MobSdkComponentHolderKt$startMainMobAppLifecycle$1", f = "MobSdkComponentHolder.kt", l = {190, 194, 195}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MobSdkComponentHolderKt$startMainMobAppLifecycle$1 extends SuspendLambda implements tls {
    final /* synthetic */ ap20 $dependencies;
    final /* synthetic */ eop0 $dispatchers;
    final /* synthetic */ d $mob;
    final /* synthetic */ Ref$BooleanRef $needsLightweightInit;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.sdk_registry.wrappers.mob.MobSdkComponentHolderKt$startMainMobAppLifecycle$1$1", f = "MobSdkComponentHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.sdk_registry.wrappers.mob.MobSdkComponentHolderKt$startMainMobAppLifecycle$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ d $mob;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(2, continuation);
            this.$mob = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$mob, continuation);
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
            this.$mob.c();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobSdkComponentHolderKt$startMainMobAppLifecycle$1(Ref$BooleanRef ref$BooleanRef, eop0 eop0Var, ap20 ap20Var, d dVar, Continuation continuation) {
        super(1, continuation);
        this.$needsLightweightInit = ref$BooleanRef;
        this.$dispatchers = eop0Var;
        this.$dependencies = ap20Var;
        this.$mob = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MobSdkComponentHolderKt$startMainMobAppLifecycle$1(this.$needsLightweightInit, this.$dispatchers, this.$dependencies, this.$mob, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MobSdkComponentHolderKt$startMainMobAppLifecycle$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (kotlinx.coroutines.a.d(r7) != r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                if (this.$needsLightweightInit.element) {
                    ((krt) this.$dispatchers).getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mob, null);
                    this.label = 1;
                    if (tje.k0(mdhVar, anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i == 1) {
                kotlin.b.b(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    throw new KotlinNothingValueException();
                }
                kotlin.b.b(obj);
                this.label = 3;
            }
            uot uotVar = this.$dependencies.k;
            d dVar = this.$mob;
            this.label = 2;
            if (uotVar.a(dVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.label = 3;
        } catch (Throwable th) {
            this.$mob.i();
            this.$needsLightweightInit.element = true;
            throw th;
        }
    }
}
