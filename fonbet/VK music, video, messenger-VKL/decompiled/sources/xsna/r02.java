package xsna;

import com.ironsource.InterfaceC4319fe;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {InterfaceC4319fe.a.e}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class r02 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ zzs<fz1, vgo<Object>, Object, spj<? super s3q0>, Object> $block;
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ f12<Object> this$0;

    /* compiled from: AnchoredDraggable.kt */
    @b6l(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {1208}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<Pair<? extends vgo<Object>, Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ zzs<fz1, vgo<Object>, Object, spj<? super s3q0>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ f12<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(zzs<? super fz1, ? super vgo<Object>, Object, ? super spj<? super s3q0>, ? extends Object> zzsVar, f12<Object> f12Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$block = zzsVar;
            this.this$0 = f12Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$block, this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Pair<? extends vgo<Object>, Object> pair, spj<? super s3q0> spjVar) {
            return ((a) create(pair, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Pair pair = (Pair) this.L$0;
                vgo<Object> vgoVar = (vgo) pair.d();
                Object g = pair.g();
                zzs<fz1, vgo<Object>, Object, spj<? super s3q0>, Object> zzsVar = this.$block;
                v02 v02Var = this.this$0.o;
                this.label = 1;
                if (zzsVar.invoke(v02Var, vgoVar, g, this) == coroutineSingletons) {
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
    public r02(f12<Object> f12Var, Object obj, zzs<? super fz1, ? super vgo<Object>, Object, ? super spj<? super s3q0>, ? extends Object> zzsVar, spj<? super r02> spjVar) {
        super(1, spjVar);
        this.this$0 = f12Var;
        this.$targetValue = obj;
        this.$block = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new r02(this.this$0, this.$targetValue, this.$block, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((r02) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            f12<Object> f12Var = this.this$0;
            ((zak0) f12Var.m).setValue(this.$targetValue);
            f12<Object> f12Var2 = this.this$0;
            defpackage.e eVar = new defpackage.e(f12Var2, 4);
            a aVar = new a(this.$block, f12Var2, null);
            this.label = 1;
            if (lz1.d(eVar, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        if (this.this$0.a.invoke(this.$targetValue).booleanValue()) {
            float c = this.this$0.c().c(this.$targetValue);
            f12<Object> f12Var3 = this.this$0;
            f12Var3.o.a(c, ((vak0) f12Var3.l).getFloatValue());
            f12<Object> f12Var4 = this.this$0;
            ((zak0) f12Var4.h).setValue(this.$targetValue);
            this.this$0.g(this.$targetValue);
        }
        return s3q0.a;
    }
}
