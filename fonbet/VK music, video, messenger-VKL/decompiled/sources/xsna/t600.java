package xsna;

import com.airbnb.lottie.compose.LottieCancellationBehavior;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LottieAnimatable.kt */
@b6l(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class t600 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
    final /* synthetic */ h700 $clipSpec;
    final /* synthetic */ i700 $composition;
    final /* synthetic */ boolean $continueFromPreviousAnimate;
    final /* synthetic */ float $initialProgress;
    final /* synthetic */ int $iteration;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ float $speed;
    final /* synthetic */ boolean $useCompositionFrameRate;
    int label;
    final /* synthetic */ w600 this$0;

    /* compiled from: LottieAnimatable.kt */
    @b6l(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
        final /* synthetic */ int $iteration;
        final /* synthetic */ int $iterations;
        final /* synthetic */ eyx $parentJob;
        int label;
        final /* synthetic */ w600 this$0;

        /* compiled from: LottieAnimatable.kt */
        /* renamed from: xsna.t600$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3722a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LottieCancellationBehavior.values().length];
                try {
                    iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LottieCancellationBehavior lottieCancellationBehavior, eyx eyxVar, int i, int i2, w600 w600Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$cancellationBehavior = lottieCancellationBehavior;
            this.$parentJob = eyxVar;
            this.$iterations = i;
            this.$iteration = i2;
            this.this$0 = w600Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$cancellationBehavior, this.$parentJob, this.$iterations, this.$iteration, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
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
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                kotlin.a.a(r5)
                goto L5e
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                kotlin.a.a(r5)
            L18:
                com.airbnb.lottie.compose.LottieCancellationBehavior r5 = r4.$cancellationBehavior
                int[] r1 = xsna.t600.a.C3722a.$EnumSwitchMapping$0
                int r5 = r5.ordinal()
                r5 = r1[r5]
                if (r5 != r2) goto L32
                xsna.eyx r5 = r4.$parentJob
                boolean r5 = r5.isActive()
                if (r5 == 0) goto L2f
                int r5 = r4.$iterations
                goto L34
            L2f:
                int r5 = r4.$iteration
                goto L34
            L32:
                int r5 = r4.$iterations
            L34:
                xsna.w600 r1 = r4.this$0
                r4.label = r2
                r1.getClass()
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r5 != r3) goto L4a
                xsna.u600 r3 = new xsna.u600
                r3.<init>(r1, r5)
                java.lang.Object r5 = xsna.wuw.a(r3, r4)
                goto L5b
            L4a:
                xsna.v600 r3 = new xsna.v600
                r3.<init>(r1, r5)
                kotlin.coroutines.d r5 = r4.getContext()
                xsna.g830 r5 = xsna.i830.a(r5)
                java.lang.Object r5 = r5.k(r3, r4)
            L5b:
                if (r5 != r0) goto L5e
                return r0
            L5e:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L18
                xsna.s3q0 r5 = xsna.s3q0.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: xsna.t600.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LottieAnimatable.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LottieCancellationBehavior.values().length];
            try {
                iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LottieCancellationBehavior.Immediately.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t600(w600 w600Var, int i, int i2, boolean z, float f, h700 h700Var, i700 i700Var, float f2, boolean z2, boolean z3, LottieCancellationBehavior lottieCancellationBehavior, spj<? super t600> spjVar) {
        super(1, spjVar);
        this.this$0 = w600Var;
        this.$iteration = i;
        this.$iterations = i2;
        this.$reverseOnRepeat = z;
        this.$speed = f;
        this.$clipSpec = h700Var;
        this.$composition = i700Var;
        this.$initialProgress = f2;
        this.$useCompositionFrameRate = z2;
        this.$continueFromPreviousAnimate = z3;
        this.$cancellationBehavior = lottieCancellationBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new t600(this.this$0, this.$iteration, this.$iterations, this.$reverseOnRepeat, this.$speed, this.$clipSpec, this.$composition, this.$initialProgress, this.$useCompositionFrameRate, this.$continueFromPreviousAnimate, this.$cancellationBehavior, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((t600) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                this.this$0.m(this.$iteration);
                w600 w600Var = this.this$0;
                int i2 = this.$iterations;
                ((zak0) w600Var.d).setValue(Integer.valueOf(i2));
                w600 w600Var2 = this.this$0;
                boolean z = this.$reverseOnRepeat;
                ((zak0) w600Var2.e).setValue(Boolean.valueOf(z));
                w600 w600Var3 = this.this$0;
                float f = this.$speed;
                ((zak0) w600Var3.g).setValue(Float.valueOf(f));
                w600 w600Var4 = this.this$0;
                ((zak0) w600Var4.f).setValue(this.$clipSpec);
                w600 w600Var5 = this.this$0;
                ((zak0) w600Var5.j).setValue(this.$composition);
                this.this$0.n(this.$initialProgress);
                w600 w600Var6 = this.this$0;
                boolean z2 = this.$useCompositionFrameRate;
                ((zak0) w600Var6.h).setValue(Boolean.valueOf(z2));
                if (!this.$continueFromPreviousAnimate) {
                    ((zak0) this.this$0.m).setValue(Long.MIN_VALUE);
                }
                if (this.$composition == null) {
                    w600.h(this.this$0, false);
                    return s3q0.a;
                }
                if (Float.isInfinite(this.$speed)) {
                    w600 w600Var7 = this.this$0;
                    w600Var7.n(w600Var7.j());
                    w600.h(this.this$0, false);
                    this.this$0.m(this.$iterations);
                    return s3q0.a;
                }
                w600.h(this.this$0, true);
                int i3 = b.$EnumSwitchMapping$0[this.$cancellationBehavior.ordinal()];
                if (i3 == 1) {
                    dVar = r570.b;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = EmptyCoroutineContext.b;
                }
                a aVar = new a(this.$cancellationBehavior, iyx.f(getContext()), this.$iterations, this.$iteration, this.this$0, null);
                this.label = 1;
                if (myc0.k(dVar, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            iyx.e(getContext());
            w600.h(this.this$0, false);
            return s3q0.a;
        } catch (Throwable th) {
            w600.h(this.this$0, false);
            throw th;
        }
    }
}
