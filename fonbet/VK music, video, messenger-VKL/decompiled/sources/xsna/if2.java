package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.wq2;

/* compiled from: Animatable.kt */
/* loaded from: classes11.dex */
public final class if2<T, V extends wq2> {
    public final itp0<T, V> a;
    public final T b;
    public final kq2<T, V> c;
    public final wh50 d;
    public final wh50 e;
    public final ji50 f;
    public final xmk0<T> g;
    public final V h;
    public final V i;
    public final V j;
    public final V k;

    /* compiled from: Animatable.kt */
    @b6l(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ if2<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(if2<T, V> if2Var, T t, spj<? super a> spjVar) {
            super(1, spjVar);
            this.this$0 = if2Var;
            this.$targetValue = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new a(this.this$0, this.$targetValue, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if2.b(this.this$0);
            Object a = if2.a(this.this$0, this.$targetValue);
            ((zak0) this.this$0.c.c).setValue(a);
            ((zak0) this.this$0.e).setValue(a);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public if2(Object obj, itp0 itp0Var, Object obj2) {
        this.a = itp0Var;
        this.b = obj2;
        kq2<T, V> kq2Var = new kq2<>(itp0Var, obj, null, 60);
        this.c = kq2Var;
        this.d = androidx.compose.runtime.k.b(Boolean.FALSE);
        this.e = androidx.compose.runtime.k.b(obj);
        this.f = new ji50();
        this.g = new xmk0<>(obj2, 3);
        V v = kq2Var.d;
        boolean z = v instanceof sq2;
        V v2 = z ? qf2.e : v instanceof tq2 ? qf2.f : v instanceof uq2 ? qf2.g : qf2.h;
        this.h = v2;
        V v3 = z ? qf2.a : v instanceof tq2 ? qf2.b : v instanceof uq2 ? qf2.c : qf2.d;
        this.i = v3;
        this.j = v2;
        this.k = v3;
    }

    public static final Object a(if2 if2Var, Object obj) {
        itp0<T, V> itp0Var = if2Var.a;
        V v = if2Var.k;
        V v2 = if2Var.j;
        if (!epx.f(v2, if2Var.h) || !epx.f(v, if2Var.i)) {
            V invoke = itp0Var.a().invoke(obj);
            int b = invoke.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (invoke.a(i) < v2.a(i) || invoke.a(i) > v.a(i)) {
                    invoke.e(swe0.f(invoke.a(i), v2.a(i), v.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return itp0Var.b().invoke(invoke);
            }
        }
        return obj;
    }

    public static final void b(if2 if2Var) {
        kq2<T, V> kq2Var = if2Var.c;
        kq2Var.d.d();
        kq2Var.e = Long.MIN_VALUE;
        ((zak0) if2Var.d).setValue(Boolean.FALSE);
    }

    public static Object c(if2 if2Var, Object obj, iq2 iq2Var, izs izsVar, spj spjVar, int i) {
        if ((i & 2) != 0) {
            iq2Var = if2Var.g;
        }
        iq2 iq2Var2 = iq2Var;
        T invoke = if2Var.a.b().invoke(if2Var.c.d);
        if ((i & 8) != 0) {
            izsVar = null;
        }
        izs izsVar2 = izsVar;
        Object d = if2Var.d();
        itp0<T, V> itp0Var = if2Var.a;
        return ji50.a(if2Var.f, new hf2(if2Var, invoke, new w3o0(iq2Var2, itp0Var, d, obj, itp0Var.a().invoke(invoke)), if2Var.c.e, izsVar2, null), spjVar);
    }

    public final T d() {
        return (T) ((zak0) this.c.c).getValue();
    }

    public final Object e(T t, spj<? super s3q0> spjVar) {
        Object a2 = ji50.a(this.f, new a(this, t, null), spjVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }

    public final Object f(ContinuationImpl continuationImpl) {
        Object a2 = ji50.a(this.f, new jf2(this, null), continuationImpl);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }

    public /* synthetic */ if2(Object obj, itp0 itp0Var, Object obj2, int i) {
        this(obj, itp0Var, (i & 4) != 0 ? null : obj2);
    }
}
