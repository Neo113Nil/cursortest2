package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SelectionMagnifier.kt */
@b6l(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {83}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class rdi0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ if2<ov70, tq2> $animatable;
    final /* synthetic */ mtk0<ov70> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: SelectionMagnifier.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ if2<ov70, tq2> b;
        public final /* synthetic */ yvj c;

        public a(if2<ov70, tq2> if2Var, yvj yvjVar) {
            this.b = if2Var;
            this.c = yvjVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            long j = ((ov70) obj).a;
            if2<ov70, tq2> if2Var = this.b;
            if ((if2Var.d().a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (if2Var.d().a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                Object e = if2Var.e(new ov70(j), spjVar);
                return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
            }
            myc0.h(this.c, null, null, new qdi0(if2Var, j, null), 3);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdi0(mtk0<ov70> mtk0Var, if2<ov70, tq2> if2Var, spj<? super rdi0> spjVar) {
        super(2, spjVar);
        this.$targetValue$delegate = mtk0Var;
        this.$animatable = if2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        rdi0 rdi0Var = new rdi0(this.$targetValue$delegate, this.$animatable, spjVar);
        rdi0Var.L$0 = obj;
        return rdi0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rdi0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            izg0 M = nr2.M(new dj60(this.$targetValue$delegate, 22));
            a aVar = new a(this.$animatable, yvjVar);
            this.label = 1;
            if (M.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
