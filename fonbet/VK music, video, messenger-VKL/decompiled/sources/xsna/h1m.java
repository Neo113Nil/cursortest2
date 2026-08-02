package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StoreFlowExt.kt */
/* loaded from: classes3.dex */
public final class h1m<T> implements ttk0<T> {
    public final ksr<T> b;
    public final gzs<T> c;

    /* compiled from: StoreFlowExt.kt */
    @b6l(c = "com.vk.mvi.flow.DerivedStateFlow", f = "StoreFlowExt.kt", l = {50}, m = "collect")
    public static final class a extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ h1m<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h1m<T> h1mVar, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = h1mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* compiled from: StoreFlowExt.kt */
    @b6l(c = "com.vk.mvi.flow.DerivedStateFlow$collect$2", f = "StoreFlowExt.kt", l = {51, 51}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<?>, Object> {
        final /* synthetic */ lsr<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ h1m<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(h1m<T> h1mVar, lsr<? super T> lsrVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = h1mVar;
            this.$collector = lsrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.this$0, this.$collector, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<?> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            if (((xsna.ttk0) r5).collect(r1, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                ksr l = rsr.l(this.this$0.b);
                this.label = 1;
                obj = rsr.v(l, yvjVar, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    throw new KotlinNothingValueException();
                }
                kotlin.a.a(obj);
            }
            lsr<T> lsrVar = this.$collector;
            this.label = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h1m(ksr<? extends T> ksrVar, gzs<? extends T> gzsVar) {
        this.b = ksrVar;
        this.c = gzsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ksr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(lsr<? super T> lsrVar, spj<?> spjVar) {
        a aVar;
        int i;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b bVar = new b(this, lsrVar, null);
                    aVar.label = 1;
                    if (zvj.d(bVar, aVar) == coroutineSingletons) {
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
        aVar = new a(this, spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }

    @Override // xsna.ttk0
    public final T getValue() {
        return this.c.invoke();
    }
}
