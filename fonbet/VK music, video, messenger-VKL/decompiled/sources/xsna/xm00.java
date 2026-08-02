package xsna;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: StoreFlowExt.kt */
/* loaded from: classes3.dex */
public final class xm00<T, R> implements ttk0<R> {
    public final ttk0<T> b;
    public final izs<T, R> c;
    public final bpn0 d = new bpn0(new cvs(this, 14));
    public final bpn0 e = new bpn0(new v100(this, 1));

    /* compiled from: StoreFlowExt.kt */
    public static final class a {
        public static final a a = new a();
    }

    /* compiled from: StoreFlowExt.kt */
    @b6l(c = "com.vk.mvi.flow.MappedStateFlow", f = "StoreFlowExt.kt", l = {83}, m = "collect")
    public static final class b extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ xm00<T, R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xm00<T, R> xm00Var, spj<? super b> spjVar) {
            super(spjVar);
            this.this$0 = xm00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* compiled from: StoreFlowExt.kt */
    public static final class c<T> implements lsr {
        public final /* synthetic */ xm00<T, R> b;
        public final /* synthetic */ Ref$ObjectRef<Object> c;
        public final /* synthetic */ lsr<R> d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(xm00<T, R> xm00Var, Ref$ObjectRef<Object> ref$ObjectRef, lsr<? super R> lsrVar) {
            this.b = xm00Var;
            this.c = ref$ObjectRef;
            this.d = lsrVar;
        }

        @Override // xsna.lsr
        public final Object emit(T t, spj<? super s3q0> spjVar) {
            xm00<T, R> xm00Var = this.b;
            R invoke = xm00Var.b(t) ? (T) ((AtomicReference) xm00Var.e.getValue()).get() : xm00Var.c.invoke(t);
            Ref$ObjectRef<Object> ref$ObjectRef = this.c;
            if (epx.f(invoke, ref$ObjectRef.element)) {
                return s3q0.a;
            }
            ref$ObjectRef.element = invoke;
            Object emit = this.d.emit(invoke, spjVar);
            return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xm00(ttk0<? extends T> ttk0Var, izs<? super T, ? extends R> izsVar) {
        this.b = ttk0Var;
        this.c = izsVar;
    }

    public final boolean b(T t) {
        bpn0 bpn0Var = this.d;
        Object obj = ((AtomicReference) bpn0Var.getValue()).get();
        if (epx.f(obj, t)) {
            return true;
        }
        AtomicReference atomicReference = (AtomicReference) bpn0Var.getValue();
        while (!atomicReference.compareAndSet(obj, t)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        bpn0 bpn0Var2 = this.e;
        Object obj2 = ((AtomicReference) bpn0Var2.getValue()).get();
        R invoke = this.c.invoke(t);
        AtomicReference atomicReference2 = (AtomicReference) bpn0Var2.getValue();
        while (!atomicReference2.compareAndSet(obj2, invoke)) {
            if (atomicReference2.get() != obj2) {
                AtomicReference atomicReference3 = (AtomicReference) bpn0Var.getValue();
                while (!atomicReference3.compareAndSet(t, obj) && atomicReference3.get() == t) {
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ksr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(lsr<? super R> lsrVar, spj<?> spjVar) {
        b bVar;
        int i;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = (T) a.a;
                    c cVar = new c(this, ref$ObjectRef, lsrVar);
                    bVar.label = 1;
                    if (this.b.collect(cVar, bVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        bVar = new b(this, spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }

    @Override // xsna.ttk0
    public final R getValue() {
        while (!b(this.b.getValue())) {
        }
        return (R) ((AtomicReference) this.e.getValue()).get();
    }
}
