package xsna;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TransformableState.kt */
@b6l(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", l = {691}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ypl extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<mkp0, spj<? super s3q0>, Object> $block;
    final /* synthetic */ MutatePriority $transformPriority;
    int label;
    final /* synthetic */ aql this$0;

    /* compiled from: TransformableState.kt */
    @b6l(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", l = {694}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<mkp0, spj<? super s3q0>, Object> {
        final /* synthetic */ wzs<mkp0, spj<? super s3q0>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ aql this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(aql aqlVar, wzs<? super mkp0, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = aqlVar;
            this.$block = wzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, this.$block, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(mkp0 mkp0Var, spj<? super s3q0> spjVar) {
            return ((a) create(mkp0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    mkp0 mkp0Var = (mkp0) this.L$0;
                    ((zak0) this.this$0.d).setValue(Boolean.TRUE);
                    wzs<mkp0, spj<? super s3q0>, Object> wzsVar = this.$block;
                    this.label = 1;
                    if (wzsVar.invoke(mkp0Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ((zak0) this.this$0.d).setValue(Boolean.FALSE);
                return s3q0.a;
            } catch (Throwable th) {
                ((zak0) this.this$0.d).setValue(Boolean.FALSE);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ypl(aql aqlVar, MutatePriority mutatePriority, wzs<? super mkp0, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super ypl> spjVar) {
        super(2, spjVar);
        this.this$0 = aqlVar;
        this.$transformPriority = mutatePriority;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ypl(this.this$0, this.$transformPriority, this.$block, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ypl) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            aql aqlVar = this.this$0;
            ni50 ni50Var = aqlVar.c;
            zpl zplVar = aqlVar.b;
            MutatePriority mutatePriority = this.$transformPriority;
            a aVar = new a(aqlVar, this.$block, null);
            this.label = 1;
            if (ni50Var.c(zplVar, mutatePriority, aVar, this) == coroutineSingletons) {
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
