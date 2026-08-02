package xsna;

import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {566}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class p02 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ zzs<dz1, tgo<Object>, Object, spj<? super s3q0>, Object> $block;
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ d12<Object> this$0;

    /* compiled from: AnchoredDraggable.kt */
    @b6l(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {568}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<Pair<? extends tgo<Object>, Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ zzs<dz1, tgo<Object>, Object, spj<? super s3q0>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d12<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(zzs<? super dz1, ? super tgo<Object>, Object, ? super spj<? super s3q0>, ? extends Object> zzsVar, d12<Object> d12Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$block = zzsVar;
            this.this$0 = d12Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$block, this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Pair<? extends tgo<Object>, Object> pair, spj<? super s3q0> spjVar) {
            return ((a) create(pair, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Pair pair = (Pair) this.L$0;
                tgo<Object> tgoVar = (tgo) pair.d();
                Object g = pair.g();
                zzs<dz1, tgo<Object>, Object, spj<? super s3q0>, Object> zzsVar = this.$block;
                t02 t02Var = this.this$0.n;
                this.label = 1;
                if (zzsVar.invoke(t02Var, tgoVar, g, this) == coroutineSingletons) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public p02(d12<Object> d12Var, Object obj, zzs<? super dz1, ? super tgo<Object>, Object, ? super spj<? super s3q0>, ? extends Object> zzsVar, spj<? super p02> spjVar) {
        super(1, spjVar);
        this.this$0 = d12Var;
        this.$targetValue = obj;
        this.$block = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new p02(this.this$0, this.$targetValue, this.$block, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((p02) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.this$0.i(this.$targetValue);
            d12<Object> d12Var = this.this$0;
            z4 z4Var = new z4(d12Var, 3);
            a aVar = new a(this.$block, d12Var, null);
            this.label = 1;
            if (fto0.b(z4Var, aVar, this) == coroutineSingletons) {
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
