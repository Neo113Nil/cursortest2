package com.airbnb.lottie.compose;

import defpackage.asz;
import defpackage.fse;
import defpackage.ie60;
import defpackage.l8x;
import defpackage.msz;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class LottieAnimatableImpl$animate$2 extends SuspendLambda implements tls {
    final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
    final /* synthetic */ msz $clipSpec;
    final /* synthetic */ nsz $composition;
    final /* synthetic */ boolean $continueFromPreviousAnimate;
    final /* synthetic */ float $initialProgress;
    final /* synthetic */ int $iteration;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ float $speed;
    final /* synthetic */ boolean $useCompositionFrameRate;
    int label;
    final /* synthetic */ LottieAnimatableImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
    @mvg(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
    /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
        final /* synthetic */ int $iteration;
        final /* synthetic */ int $iterations;
        final /* synthetic */ l8x $parentJob;
        int label;
        final /* synthetic */ LottieAnimatableImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LottieCancellationBehavior lottieCancellationBehavior, l8x l8xVar, int i, int i2, LottieAnimatableImpl lottieAnimatableImpl, Continuation continuation) {
            super(2, continuation);
            this.$cancellationBehavior = lottieCancellationBehavior;
            this.$parentJob = l8xVar;
            this.$iterations = i;
            this.$iteration = i2;
            this.this$0 = lottieAnimatableImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$cancellationBehavior, this.$parentJob, this.$iterations, this.$iteration, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 != r2) goto Ld
                kotlin.b.b(r5)
                goto L5d
            Ld:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ny61.r(r4)
                r4 = 0
                return r4
            L14:
                kotlin.b.b(r5)
            L17:
                com.airbnb.lottie.compose.LottieCancellationBehavior r5 = r4.$cancellationBehavior
                int[] r1 = defpackage.zrz.a
                int r5 = r5.ordinal()
                r5 = r1[r5]
                if (r5 != r2) goto L31
                l8x r5 = r4.$parentJob
                boolean r5 = r5.isActive()
                if (r5 == 0) goto L2e
                int r5 = r4.$iterations
                goto L33
            L2e:
                int r5 = r4.$iteration
                goto L33
            L31:
                int r5 = r4.$iterations
            L33:
                com.airbnb.lottie.compose.LottieAnimatableImpl r1 = r4.this$0
                r4.label = r2
                r1.getClass()
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r5 != r3) goto L49
                com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$2 r3 = new com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$2
                r3.<init>()
                java.lang.Object r5 = defpackage.w5b1.e(r3, r4)
                goto L5a
            L49:
                com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$3 r3 = new com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$3
                r3.<init>()
                fse r5 = r4.get_context()
                r630 r5 = defpackage.jl40.z(r5)
                java.lang.Object r5 = r5.v(r3, r4)
            L5a:
                if (r5 != r0) goto L5d
                return r0
            L5d:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L17
                zy11 r4 = defpackage.zy11.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$animate$2(LottieAnimatableImpl lottieAnimatableImpl, int i, int i2, boolean z, float f, nsz nszVar, float f2, boolean z2, boolean z3, LottieCancellationBehavior lottieCancellationBehavior, Continuation continuation) {
        super(1, continuation);
        this.this$0 = lottieAnimatableImpl;
        this.$iteration = i;
        this.$iterations = i2;
        this.$reverseOnRepeat = z;
        this.$speed = f;
        this.$composition = nszVar;
        this.$initialProgress = f2;
        this.$useCompositionFrameRate = z2;
        this.$continueFromPreviousAnimate = z3;
        this.$cancellationBehavior = lottieCancellationBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LottieAnimatableImpl$animate$2(this.this$0, this.$iteration, this.$iterations, this.$reverseOnRepeat, this.$speed, this.$composition, this.$initialProgress, this.$useCompositionFrameRate, this.$continueFromPreviousAnimate, this.$cancellationBehavior, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((LottieAnimatableImpl$animate$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fse fseVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                this.this$0.f(this.$iteration);
                this.this$0.c.setValue(Integer.valueOf(this.$iterations));
                this.this$0.w.setValue(Boolean.valueOf(this.$reverseOnRepeat));
                this.this$0.y.setValue(Float.valueOf(this.$speed));
                this.this$0.x.setValue(null);
                LottieAnimatableImpl lottieAnimatableImpl = this.this$0;
                lottieAnimatableImpl.B.setValue(this.$composition);
                this.this$0.g(this.$initialProgress);
                this.this$0.z.setValue(Boolean.valueOf(this.$useCompositionFrameRate));
                if (!this.$continueFromPreviousAnimate) {
                    this.this$0.E.setValue(Long.MIN_VALUE);
                }
                if (this.$composition == null) {
                    LottieAnimatableImpl.b(this.this$0, false);
                    return zy11Var;
                }
                boolean isInfinite = Float.isInfinite(this.$speed);
                LottieAnimatableImpl lottieAnimatableImpl2 = this.this$0;
                if (isInfinite) {
                    lottieAnimatableImpl2.g(lottieAnimatableImpl2.d());
                    LottieAnimatableImpl.b(this.this$0, false);
                    this.this$0.f(this.$iterations);
                    return zy11Var;
                }
                LottieAnimatableImpl.b(lottieAnimatableImpl2, true);
                int i2 = asz.a[this.$cancellationBehavior.ordinal()];
                if (i2 == 1) {
                    fseVar = ie60.a;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fseVar = EmptyCoroutineContext.a;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cancellationBehavior, kotlinx.coroutines.a.n(get_context()), this.$iterations, this.$iteration, this.this$0, null);
                this.label = 1;
                if (tje.k0(fseVar, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            kotlinx.coroutines.a.k(get_context());
            LottieAnimatableImpl.b(this.this$0, false);
            return zy11Var;
        } catch (Throwable th) {
            LottieAnimatableImpl.b(this.this$0, false);
            throw th;
        }
    }
}
