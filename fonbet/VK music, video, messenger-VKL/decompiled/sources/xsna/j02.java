package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {518}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class j02 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ yzs<dz1, tgo<Object>, spj<? super s3q0>, Object> $block;
    int label;
    final /* synthetic */ d12<Object> this$0;

    /* compiled from: AnchoredDraggable.kt */
    @b6l(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {519}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<tgo<Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ yzs<dz1, tgo<Object>, spj<? super s3q0>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d12<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d12 d12Var, spj spjVar, yzs yzsVar) {
            super(2, spjVar);
            this.$block = yzsVar;
            this.this$0 = d12Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, spjVar, this.$block);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(tgo<Object> tgoVar, spj<? super s3q0> spjVar) {
            return ((a) create(tgoVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                tgo<Object> tgoVar = (tgo) this.L$0;
                yzs<dz1, tgo<Object>, spj<? super s3q0>, Object> yzsVar = this.$block;
                t02 t02Var = this.this$0.n;
                this.label = 1;
                if (yzsVar.invoke(t02Var, tgoVar, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j02(d12 d12Var, spj spjVar, yzs yzsVar) {
        super(1, spjVar);
        this.this$0 = d12Var;
        this.$block = yzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new j02(this.this$0, spjVar, this.$block);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((j02) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            d12<Object> d12Var = this.this$0;
            ry0 ry0Var = new ry0(d12Var, 1);
            a aVar = new a(d12Var, null, this.$block);
            this.label = 1;
            if (fto0.b(ry0Var, aVar, this) == coroutineSingletons) {
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
