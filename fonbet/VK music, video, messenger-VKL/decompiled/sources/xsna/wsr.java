package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.kbb;
import xsna.v8i0;
import xsna.y8i0;

/* compiled from: Delay.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 415}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class wsr extends SuspendLambda implements yzs<yvj, lsr<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ ksr<Object> $this_debounceInternal;
    final /* synthetic */ izs<Object, Long> $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* compiled from: Delay.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ lsr<Object> $downstream;
        final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref$ObjectRef ref$ObjectRef, spj spjVar, lsr lsrVar) {
            super(1, spjVar);
            this.$downstream = lsrVar;
            this.$lastValue = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new a(this.$lastValue, spjVar, this.$downstream);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                lsr<Object> lsrVar = this.$downstream;
                con0 con0Var = tyx.h;
                Object obj2 = this.$lastValue.element;
                if (obj2 == con0Var) {
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
            this.$lastValue.element = null;
            return s3q0.a;
        }
    }

    /* compiled from: Delay.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<kbb<? extends Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ lsr<Object> $downstream;
        final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref$ObjectRef ref$ObjectRef, spj spjVar, lsr lsrVar) {
            super(2, spjVar);
            this.$lastValue = ref$ObjectRef;
            this.$downstream = lsrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.$lastValue, spjVar, this.$downstream);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(kbb<? extends Object> kbbVar, spj<? super s3q0> spjVar) {
            return ((b) create(new kbb(kbbVar.a), spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v6, types: [T, xsna.con0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref$ObjectRef<Object> ref$ObjectRef;
            Ref$ObjectRef<Object> ref$ObjectRef2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ?? r7 = ((kbb) this.L$0).a;
                ref$ObjectRef = this.$lastValue;
                boolean z = r7 instanceof kbb.b;
                if (!z) {
                    ref$ObjectRef.element = r7;
                }
                lsr<Object> lsrVar = this.$downstream;
                if (z) {
                    Throwable a = kbb.a(r7);
                    if (a != null) {
                        throw a;
                    }
                    Object obj2 = ref$ObjectRef.element;
                    if (obj2 != null) {
                        if (obj2 == tyx.h) {
                            obj2 = null;
                        }
                        this.L$0 = r7;
                        this.L$1 = ref$ObjectRef;
                        this.label = 1;
                        if (lsrVar.emit(obj2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef2 = ref$ObjectRef;
                    }
                    ref$ObjectRef.element = tyx.j;
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
            kotlin.a.a(obj);
            ref$ObjectRef = ref$ObjectRef2;
            ref$ObjectRef.element = tyx.j;
            return s3q0.a;
        }
    }

    /* compiled from: Delay.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {204}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<zhd0<? super Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ ksr<Object> $this_debounceInternal;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: Delay.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ zhd0<Object> b;

            /* compiled from: Delay.kt */
            @b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {204}, m = "emit")
            /* renamed from: xsna.wsr$c$a$a, reason: collision with other inner class name */
            public static final class C3956a extends ContinuationImpl {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3956a(a<? super T> aVar, spj<? super C3956a> spjVar) {
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
                C3956a c3956a;
                int i;
                if (spjVar instanceof C3956a) {
                    c3956a = (C3956a) spjVar;
                    int i2 = c3956a.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c3956a.label = i2 - Integer.MIN_VALUE;
                        Object obj = c3956a.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = c3956a.label;
                        if (i != 0) {
                            kotlin.a.a(obj);
                            if (t == null) {
                                t = (T) tyx.h;
                            }
                            c3956a.label = 1;
                            if (this.b.t(t, c3956a) == coroutineSingletons) {
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
                c3956a = new C3956a(this, spjVar);
                Object obj2 = c3956a.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c3956a.label;
                if (i != 0) {
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ksr<Object> ksrVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$this_debounceInternal = ksrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            c cVar = new c(this.$this_debounceInternal, spjVar);
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
                ksr<Object> ksrVar = this.$this_debounceInternal;
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
    public wsr(izs<Object, Long> izsVar, ksr<Object> ksrVar, spj<? super wsr> spjVar) {
        super(3, spjVar);
        this.$timeoutMillisSelector = izsVar;
        this.$this_debounceInternal = ksrVar;
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, lsr<Object> lsrVar, spj<? super s3q0> spjVar) {
        wsr wsrVar = new wsr(this.$timeoutMillisSelector, this.$this_debounceInternal, spjVar);
        wsrVar.L$0 = yvjVar;
        wsrVar.L$1 = lsrVar;
        return wsrVar.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        if (r10.emit(r11, r20) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        if (r12.g(r20) != r1) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00f7 -> B:6:0x0022). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lsr lsrVar;
        Ref$ObjectRef ref$ObjectRef;
        b9f0 b9f0Var;
        Ref$LongRef ref$LongRef;
        Ref$ObjectRef ref$ObjectRef2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            lsr lsrVar2 = (lsr) this.L$1;
            whd0 b2 = phd0.b(yvjVar, 0, new c(this.$this_debounceInternal, null), 3);
            lsrVar = lsrVar2;
            ref$ObjectRef = new Ref$ObjectRef();
            b9f0Var = b2;
            if (ref$ObjectRef.element != tyx.j) {
            }
        } else if (i == 1) {
            ref$LongRef = (Ref$LongRef) this.L$3;
            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
            b9f0Var = (b9f0) this.L$1;
            lsrVar = (lsr) this.L$0;
            kotlin.a.a(obj);
            ref$ObjectRef.element = null;
            Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
            Ref$LongRef ref$LongRef2 = ref$LongRef;
            ref$ObjectRef2 = ref$ObjectRef3;
            v8i0 v8i0Var = new v8i0(getContext());
            if (ref$ObjectRef2.element != 0) {
            }
            v8i0Var.j(b9f0Var.g(), new b(ref$ObjectRef2, null, lsrVar));
            this.L$0 = lsrVar;
            this.L$1 = b9f0Var;
            this.L$2 = ref$ObjectRef2;
            this.L$3 = null;
            this.label = 2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef2 = (Ref$ObjectRef) this.L$2;
            b9f0 b9f0Var2 = (b9f0) this.L$1;
            lsr lsrVar3 = (lsr) this.L$0;
            kotlin.a.a(obj);
            lsrVar = lsrVar3;
            b9f0Var = b9f0Var2;
            ref$ObjectRef = ref$ObjectRef2;
            if (ref$ObjectRef.element != tyx.j) {
                return s3q0.a;
            }
            ref$LongRef = new Ref$LongRef();
            Object obj2 = ref$ObjectRef.element;
            if (obj2 != null) {
                izs<Object, Long> izsVar = this.$timeoutMillisSelector;
                con0 con0Var = tyx.h;
                if (obj2 == con0Var) {
                    obj2 = null;
                }
                long longValue = izsVar.invoke(obj2).longValue();
                ref$LongRef.element = longValue;
                if (longValue < 0) {
                    throw new IllegalArgumentException("Debounce timeout should not be negative");
                }
                if (longValue == 0) {
                    Object obj3 = ref$ObjectRef.element;
                    if (obj3 == con0Var) {
                        obj3 = null;
                    }
                    this.L$0 = lsrVar;
                    this.L$1 = b9f0Var;
                    this.L$2 = ref$ObjectRef;
                    this.L$3 = ref$LongRef;
                    this.label = 1;
                }
            }
            Ref$ObjectRef ref$ObjectRef32 = ref$ObjectRef;
            Ref$LongRef ref$LongRef22 = ref$LongRef;
            ref$ObjectRef2 = ref$ObjectRef32;
            v8i0 v8i0Var2 = new v8i0(getContext());
            if (ref$ObjectRef2.element != 0) {
                long j = ref$LongRef22.element;
                a aVar = new a(ref$ObjectRef2, null, lsrVar);
                ic80 ic80Var = new ic80(j);
                hc80 hc80Var = hc80.b;
                ttp0.d(3, hc80Var);
                v8i0Var2.k(new v8i0.a(ic80Var, hc80Var, y8i0.a.b, y8i0.e, aVar, null), false);
            }
            v8i0Var2.j(b9f0Var.g(), new b(ref$ObjectRef2, null, lsrVar));
            this.L$0 = lsrVar;
            this.L$1 = b9f0Var;
            this.L$2 = ref$ObjectRef2;
            this.L$3 = null;
            this.label = 2;
        }
    }
}
