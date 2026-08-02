package com.yandex.go.design.compose.modal.bottomsheet;

import defpackage.jj2;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tje;
import defpackage.tse;
import defpackage.un4;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.design.compose.modal.bottomsheet.SettlingKt$runSettleToTargetState$1", f = "Settling.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 173}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SettlingKt$runSettleToTargetState$1 extends SuspendLambda implements wls {
    final /* synthetic */ float $endOffset;
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ float $offsetDiff;
    final /* synthetic */ jj2 $resultSpec;
    final /* synthetic */ float $startOffset;
    final /* synthetic */ wg6 $this_runSettleToTargetState;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.design.compose.modal.bottomsheet.SettlingKt$runSettleToTargetState$1$1", f = "Settling.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.design.compose.modal.bottomsheet.SettlingKt$runSettleToTargetState$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ float $endOffset;
        final /* synthetic */ float $initialVelocity;
        final /* synthetic */ float $offsetDiff;
        final /* synthetic */ jj2 $resultSpec;
        final /* synthetic */ float $startOffset;
        final /* synthetic */ wg6 $this_runSettleToTargetState;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.design.compose.modal.bottomsheet.SettlingKt$runSettleToTargetState$1$1$1", f = "Settling.kt", l = {176}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.design.compose.modal.bottomsheet.SettlingKt$runSettleToTargetState$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00531 extends SuspendLambda implements wls {
            final /* synthetic */ Ref$ObjectRef<l8x> $animationJob;
            final /* synthetic */ float $endOffset;
            final /* synthetic */ float $initialVelocity;
            final /* synthetic */ float $offsetDiff;
            final /* synthetic */ jj2 $resultSpec;
            final /* synthetic */ float $startOffset;
            final /* synthetic */ wg6 $this_runSettleToTargetState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00531(wg6 wg6Var, float f, jj2 jj2Var, float f2, float f3, float f4, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
                super(2, continuation);
                this.$this_runSettleToTargetState = wg6Var;
                this.$endOffset = f;
                this.$resultSpec = jj2Var;
                this.$initialVelocity = f2;
                this.$startOffset = f3;
                this.$offsetDiff = f4;
                this.$animationJob = ref$ObjectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00531(this.$this_runSettleToTargetState, this.$endOffset, this.$resultSpec, this.$initialVelocity, this.$startOffset, this.$offsetDiff, this.$animationJob, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00531) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    androidx.compose.animation.core.a aVar = this.$this_runSettleToTargetState.q;
                    Float f = new Float(this.$endOffset);
                    jj2 jj2Var = this.$resultSpec;
                    Float f2 = new Float(this.$initialVelocity);
                    un4 un4Var = new un4(this.$startOffset, this.$offsetDiff, this.$this_runSettleToTargetState, this.$animationJob);
                    this.label = 1;
                    if (aVar.c(f, jj2Var, f2, un4Var, this) == coroutineSingletons) {
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
        public AnonymousClass1(float f, float f2, float f3, float f4, jj2 jj2Var, wg6 wg6Var, Continuation continuation) {
            super(2, continuation);
            this.$this_runSettleToTargetState = wg6Var;
            this.$endOffset = f;
            this.$resultSpec = jj2Var;
            this.$initialVelocity = f2;
            this.$startOffset = f3;
            this.$offsetDiff = f4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            wg6 wg6Var = this.$this_runSettleToTargetState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$endOffset, this.$initialVelocity, this.$startOffset, this.$offsetDiff, this.$resultSpec, wg6Var, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        /* JADX WARN: Type inference failed for: r12v3, types: [T, pzt0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$ObjectRef z = qv10.z(obj);
            z.element = tje.N(tseVar, null, null, new C00531(this.$this_runSettleToTargetState, this.$endOffset, this.$resultSpec, this.$initialVelocity, this.$startOffset, this.$offsetDiff, z, null), 3);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettlingKt$runSettleToTargetState$1(float f, float f2, float f3, float f4, jj2 jj2Var, wg6 wg6Var, Continuation continuation) {
        super(2, continuation);
        this.$this_runSettleToTargetState = wg6Var;
        this.$startOffset = f;
        this.$endOffset = f2;
        this.$resultSpec = jj2Var;
        this.$initialVelocity = f3;
        this.$offsetDiff = f4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        wg6 wg6Var = this.$this_runSettleToTargetState;
        return new SettlingKt$runSettleToTargetState$1(this.$startOffset, this.$endOffset, this.$initialVelocity, this.$offsetDiff, this.$resultSpec, wg6Var, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettlingKt$runSettleToTargetState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (defpackage.jl40.O(r3, r11) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r12.f(r4, r11) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.animation.core.a aVar = this.$this_runSettleToTargetState.q;
            Float f = new Float(this.$startOffset);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        wg6 wg6Var = this.$this_runSettleToTargetState;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$endOffset, this.$initialVelocity, this.$startOffset, this.$offsetDiff, this.$resultSpec, wg6Var, null);
        this.label = 2;
    }
}
