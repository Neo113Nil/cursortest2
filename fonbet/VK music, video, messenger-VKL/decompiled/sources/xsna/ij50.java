package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.gm50;

/* compiled from: MviAbstractComposeView.kt */
@b6l(c = "com.vk.mvi.compose.MviAbstractComposeView$renderWith$1$1", f = "MviAbstractComposeView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ij50 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ n0u0<Object>[] $scenes;
    final /* synthetic */ wh50<Object> $state;
    int label;
    final /* synthetic */ jj50<ao50, kj50> this$0;

    /* compiled from: MviAbstractComposeView.kt */
    public static final class a implements izs<?, s3q0> {
        public final /* synthetic */ wh50<Object> b;

        public a(wh50<Object> wh50Var) {
            this.b = wh50Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Object obj) {
            this.b.setValue((fm50) obj);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij50(n0u0<Object>[] n0u0VarArr, jj50<ao50, kj50> jj50Var, wh50<Object> wh50Var, spj<? super ij50> spjVar) {
        super(2, spjVar);
        this.$scenes = n0u0VarArr;
        this.this$0 = jj50Var;
        this.$state = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ij50(this.$scenes, this.this$0, this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ij50) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        n0u0<Object>[] n0u0VarArr = this.$scenes;
        jj50<ao50, kj50> jj50Var = this.this$0;
        wh50<Object> wh50Var = this.$state;
        for (n0u0<Object> n0u0Var : n0u0VarArr) {
            a aVar = new a(wh50Var);
            jj50Var.getClass();
            gm50.a.b(jj50Var, n0u0Var, aVar);
        }
        return s3q0.a;
    }
}
