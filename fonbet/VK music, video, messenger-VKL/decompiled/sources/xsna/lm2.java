package xsna;

import androidx.compose.animation.EnterExitState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* compiled from: AnimatedVisibility.kt */
@b6l(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {746}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class lm2 extends SuspendLambda implements wzs<qhd0<Boolean>, spj<? super s3q0>, Object> {
    final /* synthetic */ wlp0<EnterExitState> $childTransition;
    final /* synthetic */ mtk0<wzs<EnterExitState, EnterExitState, Boolean>> $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: AnimatedVisibility.kt */
    public static final class a extends Lambda implements gzs<Boolean> {
        final /* synthetic */ wlp0<EnterExitState> $childTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wlp0<EnterExitState> wlp0Var) {
            super(0);
            this.$childTransition = wlp0Var;
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            wlp0<EnterExitState> wlp0Var = this.$childTransition;
            Object B = wlp0Var.a.B();
            EnterExitState enterExitState = EnterExitState.PostExit;
            return Boolean.valueOf(B == enterExitState && ((zak0) wlp0Var.d).getValue() == enterExitState);
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    public static final class b<T> implements lsr {
        public final /* synthetic */ qhd0<Boolean> b;
        public final /* synthetic */ wlp0<EnterExitState> c;
        public final /* synthetic */ mtk0<wzs<EnterExitState, EnterExitState, Boolean>> d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(qhd0<Boolean> qhd0Var, wlp0<EnterExitState> wlp0Var, mtk0<? extends wzs<? super EnterExitState, ? super EnterExitState, Boolean>> mtk0Var) {
            this.b = qhd0Var;
            this.c = wlp0Var;
            this.d = mtk0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            boolean z;
            if (((Boolean) obj).booleanValue()) {
                wzs value = this.d.getValue();
                wlp0<EnterExitState> wlp0Var = this.c;
                z = ((Boolean) value.invoke(wlp0Var.a.B(), ((zak0) wlp0Var.d).getValue())).booleanValue();
            } else {
                z = false;
            }
            this.b.setValue(Boolean.valueOf(z));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lm2(wlp0<EnterExitState> wlp0Var, mtk0<? extends wzs<? super EnterExitState, ? super EnterExitState, Boolean>> mtk0Var, spj<? super lm2> spjVar) {
        super(2, spjVar);
        this.$childTransition = wlp0Var;
        this.$shouldDisposeBlockUpdated$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        lm2 lm2Var = new lm2(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, spjVar);
        lm2Var.L$0 = obj;
        return lm2Var;
    }

    @Override // xsna.wzs
    public final Object invoke(qhd0<Boolean> qhd0Var, spj<? super s3q0> spjVar) {
        return ((lm2) create(qhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            qhd0 qhd0Var = (qhd0) this.L$0;
            izg0 M = nr2.M(new a(this.$childTransition));
            b bVar = new b(qhd0Var, this.$childTransition, this.$shouldDisposeBlockUpdated$delegate);
            this.label = 1;
            if (M.collect(bVar, this) == coroutineSingletons) {
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
