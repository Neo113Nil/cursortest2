package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: PseudoProgressbar.kt */
@b6l(c = "com.vk.photo.editor.features.mlenhance.PseudoProgressbar$start$1", f = "PseudoProgressbar.kt", l = {35, 43}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class vae0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $timeStep;
    final /* synthetic */ Ref$FloatRef $x;
    final /* synthetic */ float $xStep;
    float F$0;
    float F$1;
    float F$2;
    int label;
    final /* synthetic */ wae0 this$0;

    /* compiled from: PseudoProgressbar.kt */
    @b6l(c = "com.vk.photo.editor.features.mlenhance.PseudoProgressbar$start$1$1", f = "PseudoProgressbar.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ float $randomStep;
        int label;
        final /* synthetic */ wae0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wae0 wae0Var, float f, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = wae0Var;
            this.$randomStep = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$randomStep, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            wae0 wae0Var = this.this$0;
            float f = wae0Var.b + this.$randomStep;
            wae0Var.b = f;
            wae0Var.a.invoke(Float.valueOf(f));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vae0(wae0 wae0Var, long j, Ref$FloatRef ref$FloatRef, float f, spj<? super vae0> spjVar) {
        super(2, spjVar);
        this.this$0 = wae0Var;
        this.$timeStep = j;
        this.$x = ref$FloatRef;
        this.$xStep = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vae0(this.this$0, this.$timeStep, this.$x, this.$xStep, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vae0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007a, code lost:
    
        if (xsna.myc0.k(r1, r5, r9) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (xsna.qsl.b(r4, r9) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x007a -> B:11:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.a(obj);
                Ref$FloatRef ref$FloatRef = this.$x;
                float f = ref$FloatRef.element + this.$xStep;
                ref$FloatRef.element = f;
                this.this$0.getClass();
                float pow = (float) Math.pow(f, 0.35f);
                wae0 wae0Var = this.this$0;
                float f2 = pow - wae0Var.b;
                float f3 = 0.7f * f2;
                wae0Var.getClass();
                float random = (((1.3f * f2) - f3) * ((float) Math.random())) + f3;
                bdn bdnVar = bdn.a;
                ge00 ge00Var = ie00.a;
                a aVar = new a(this.this$0, random, null);
                this.F$0 = pow;
                this.F$1 = f2;
                this.F$2 = random;
                this.label = 2;
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        kotlin.a.a(obj);
        if (this.this$0.b >= 1.0f) {
            return s3q0.a;
        }
        long j = this.$timeStep;
        this.label = 1;
    }
}
