package xsna;

import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "com.vk.core.compose.component.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {578}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class q02 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ zzs<ez1, ugo<Object>, Object, spj<? super s3q0>, Object> $block;
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ e12<Object> this$0;

    /* compiled from: AnchoredDraggable.kt */
    @b6l(c = "com.vk.core.compose.component.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {580}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<Pair<? extends ugo<Object>, Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ zzs<ez1, ugo<Object>, Object, spj<? super s3q0>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e12<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(zzs<? super ez1, ? super ugo<Object>, Object, ? super spj<? super s3q0>, ? extends Object> zzsVar, e12<Object> e12Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$block = zzsVar;
            this.this$0 = e12Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$block, this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Pair<? extends ugo<Object>, Object> pair, spj<? super s3q0> spjVar) {
            return ((a) create(pair, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Pair pair = (Pair) this.L$0;
                ugo<Object> ugoVar = (ugo) pair.d();
                Object g = pair.g();
                zzs<ez1, ugo<Object>, Object, spj<? super s3q0>, Object> zzsVar = this.$block;
                u02 u02Var = this.this$0.m;
                this.label = 1;
                if (zzsVar.invoke(u02Var, ugoVar, g, this) == coroutineSingletons) {
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
    public q02(e12<Object> e12Var, Object obj, zzs<? super ez1, ? super ugo<Object>, Object, ? super spj<? super s3q0>, ? extends Object> zzsVar, spj<? super q02> spjVar) {
        super(1, spjVar);
        this.this$0 = e12Var;
        this.$targetValue = obj;
        this.$block = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new q02(this.this$0, this.$targetValue, this.$block, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((q02) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.this$0.i(this.$targetValue);
            e12<Object> e12Var = this.this$0;
            mh mhVar = new mh(e12Var, 5);
            a aVar = new a(this.$block, e12Var, null);
            this.label = 1;
            if (d02.h(mhVar, aVar, this) == coroutineSingletons) {
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
