package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import xsna.kbb;

/* compiled from: Delay.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {412}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class ysr extends SuspendLambda implements yzs<yvj, lsr<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ ksr<Object> $this_sample;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* compiled from: Delay.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<kbb<? extends Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
        final /* synthetic */ b9f0<s3q0> $ticker;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref$ObjectRef<Object> ref$ObjectRef, b9f0<s3q0> b9f0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$lastValue = ref$ObjectRef;
            this.$ticker = b9f0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$lastValue, this.$ticker, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(kbb<? extends Object> kbbVar, spj<? super s3q0> spjVar) {
            return ((a) create(new kbb(kbbVar.a), spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v8, types: [T, xsna.con0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ?? r4 = ((kbb) this.L$0).a;
            Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
            boolean z = r4 instanceof kbb.b;
            if (!z) {
                ref$ObjectRef.element = r4;
            }
            b9f0<s3q0> b9f0Var = this.$ticker;
            if (z) {
                Throwable a = kbb.a(r4);
                if (a != null) {
                    throw a;
                }
                b9f0Var.b(new ChildCancelledException());
                ref$ObjectRef.element = tyx.j;
            }
            return s3q0.a;
        }
    }

    /* compiled from: Delay.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {293}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<s3q0, spj<? super s3q0>, Object> {
        final /* synthetic */ lsr<Object> $downstream;
        final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref$ObjectRef ref$ObjectRef, spj spjVar, lsr lsrVar) {
            super(2, spjVar);
            this.$lastValue = ref$ObjectRef;
            this.$downstream = lsrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$lastValue, spjVar, this.$downstream);
        }

        @Override // xsna.wzs
        public final Object invoke(s3q0 s3q0Var, spj<? super s3q0> spjVar) {
            return ((b) create(s3q0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
                Object obj2 = ref$ObjectRef.element;
                if (obj2 == null) {
                    return s3q0.a;
                }
                ref$ObjectRef.element = null;
                lsr<Object> lsrVar = this.$downstream;
                if (obj2 == tyx.h) {
                    obj2 = null;
                }
                this.label = 1;
                if (lsrVar.emit(obj2, this) == coroutineSingletons) {
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

    /* compiled from: Delay.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", l = {273}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<zhd0<? super Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ ksr<Object> $this_sample;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: Delay.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ zhd0<Object> b;

            /* compiled from: Delay.kt */
            @b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", l = {273}, m = "emit")
            /* renamed from: xsna.ysr$c$a$a, reason: collision with other inner class name */
            public static final class C4136a extends ContinuationImpl {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C4136a(a<? super T> aVar, spj<? super C4136a> spjVar) {
                    super(spjVar);
                    this.this$0 = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            }

            public a(zhd0<Object> zhd0Var) {
                this.b = zhd0Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // xsna.lsr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, spj<? super s3q0> spjVar) {
                C4136a c4136a;
                int i;
                if (spjVar instanceof C4136a) {
                    c4136a = (C4136a) spjVar;
                    int i2 = c4136a.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c4136a.label = i2 - Integer.MIN_VALUE;
                        Object obj = c4136a.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = c4136a.label;
                        if (i != 0) {
                            kotlin.a.a(obj);
                            if (t == null) {
                                t = (T) tyx.h;
                            }
                            c4136a.label = 1;
                            if (this.b.t(t, c4136a) == coroutineSingletons) {
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
                c4136a = new C4136a(this, spjVar);
                Object obj2 = c4136a.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c4136a.label;
                if (i != 0) {
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ksr<Object> ksrVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$this_sample = ksrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            c cVar = new c(this.$this_sample, spjVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // xsna.wzs
        public final Object invoke(zhd0<? super Object> zhd0Var, spj<? super s3q0> spjVar) {
            return ((c) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                zhd0 zhd0Var = (zhd0) this.L$0;
                ksr<Object> ksrVar = this.$this_sample;
                a aVar = new a(zhd0Var);
                this.label = 1;
                if (ksrVar.collect(aVar, this) == coroutineSingletons) {
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
    public ysr(long j, ksr<Object> ksrVar, spj<? super ysr> spjVar) {
        super(3, spjVar);
        this.$periodMillis = j;
        this.$this_sample = ksrVar;
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, lsr<Object> lsrVar, spj<? super s3q0> spjVar) {
        ysr ysrVar = new ysr(this.$periodMillis, this.$this_sample, spjVar);
        ysrVar.L$0 = yvjVar;
        ysrVar.L$1 = lsrVar;
        return ysrVar.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b9f0 b9f0Var;
        Ref$ObjectRef ref$ObjectRef;
        lsr lsrVar;
        b9f0 b2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            lsr lsrVar2 = (lsr) this.L$1;
            whd0 b3 = phd0.b(yvjVar, -1, new c(this.$this_sample, null), 1);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            b9f0Var = b3;
            ref$ObjectRef = ref$ObjectRef2;
            lsrVar = lsrVar2;
            b2 = phd0.b(yvjVar, 0, new xsr(this.$periodMillis, null), 1);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b2 = (b9f0) this.L$3;
            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
            b9f0Var = (b9f0) this.L$1;
            lsrVar = (lsr) this.L$0;
            kotlin.a.a(obj);
        }
        while (ref$ObjectRef.element != tyx.j) {
            v8i0 v8i0Var = new v8i0(getContext());
            v8i0Var.j(b9f0Var.g(), new a(ref$ObjectRef, b2, null));
            v8i0Var.j(b2.e(), new b(ref$ObjectRef, null, lsrVar));
            this.L$0 = lsrVar;
            this.L$1 = b9f0Var;
            this.L$2 = ref$ObjectRef;
            this.L$3 = b2;
            this.label = 1;
            if (v8i0Var.g(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return s3q0.a;
    }
}
