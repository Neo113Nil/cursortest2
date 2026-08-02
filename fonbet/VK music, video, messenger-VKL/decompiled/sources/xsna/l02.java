package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {1159}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class l02 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ yzs<fz1, vgo<Object>, spj<? super s3q0>, Object> $block;
    int label;
    final /* synthetic */ f12<Object> this$0;

    /* compiled from: AnchoredDraggable.kt */
    @b6l(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {1160}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<vgo<Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ yzs<fz1, vgo<Object>, spj<? super s3q0>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ f12<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f12 f12Var, spj spjVar, yzs yzsVar) {
            super(2, spjVar);
            this.$block = yzsVar;
            this.this$0 = f12Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, spjVar, this.$block);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(vgo<Object> vgoVar, spj<? super s3q0> spjVar) {
            return ((a) create(vgoVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                vgo<Object> vgoVar = (vgo) this.L$0;
                yzs<fz1, vgo<Object>, spj<? super s3q0>, Object> yzsVar = this.$block;
                v02 v02Var = this.this$0.o;
                this.label = 1;
                if (yzsVar.invoke(v02Var, vgoVar, this) == coroutineSingletons) {
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
    public l02(f12 f12Var, spj spjVar, yzs yzsVar) {
        super(1, spjVar);
        this.this$0 = f12Var;
        this.$block = yzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new l02(this.this$0, spjVar, this.$block);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((l02) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            f12<Object> f12Var = this.this$0;
            in0 in0Var = new in0(f12Var, 2);
            a aVar = new a(f12Var, null, this.$block);
            this.label = 1;
            if (lz1.d(in0Var, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        Object a2 = this.this$0.c().a(((vak0) this.this$0.j).getFloatValue());
        if (a2 != null) {
            if (Math.abs(((vak0) this.this$0.j).getFloatValue() - this.this$0.c().c(a2)) < 0.5f && this.this$0.a.invoke(a2).booleanValue()) {
                ((zak0) this.this$0.h).setValue(a2);
                this.this$0.g(a2);
            }
        }
        return s3q0.a;
    }
}
