package xsna;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import xsna.kbb;

/* compiled from: Combine.kt */
@b6l(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class u9g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ksr<Object> $flow;
    final /* synthetic */ ksr<Object> $flow2;
    final /* synthetic */ lsr<Object> $this_unsafeFlow;
    final /* synthetic */ yzs<Object, Object, spj<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: Combine.kt */
    public static final class a implements izs<Throwable, s3q0> {
        public final /* synthetic */ gyx b;

        public a(gyx gyxVar) {
            this.b = gyxVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            gyx gyxVar = this.b;
            if (gyxVar.isActive()) {
                gyxVar.P(new AbortFlowException(gyxVar));
            }
            return s3q0.a;
        }
    }

    /* compiled from: Combine.kt */
    @b6l(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<s3q0, spj<? super s3q0>, Object> {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ s7i $collectJob;
        final /* synthetic */ ksr<Object> $flow;
        final /* synthetic */ kotlin.coroutines.d $scopeContext;
        final /* synthetic */ b9f0<Object> $second;
        final /* synthetic */ lsr<Object> $this_unsafeFlow;
        final /* synthetic */ yzs<Object, Object, spj<Object>, Object> $transform;
        int label;

        /* compiled from: Combine.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ kotlin.coroutines.d b;
            public final /* synthetic */ Object c;
            public final /* synthetic */ b9f0<Object> d;
            public final /* synthetic */ lsr<Object> e;
            public final /* synthetic */ yzs<Object, Object, spj<Object>, Object> f;
            public final /* synthetic */ s7i g;

            /* compiled from: Combine.kt */
            @b6l(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 129, 129}, m = "invokeSuspend")
            /* renamed from: xsna.u9g$b$a$a, reason: collision with other inner class name */
            public static final class C3794a extends SuspendLambda implements wzs<s3q0, spj<? super s3q0>, Object> {
                final /* synthetic */ s7i $collectJob;
                final /* synthetic */ b9f0<Object> $second;
                final /* synthetic */ lsr<Object> $this_unsafeFlow;
                final /* synthetic */ yzs<Object, Object, spj<Object>, Object> $transform;
                final /* synthetic */ Object $value;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3794a(b9f0<? extends Object> b9f0Var, lsr<Object> lsrVar, yzs<Object, Object, ? super spj<Object>, ? extends Object> yzsVar, Object obj, s7i s7iVar, spj<? super C3794a> spjVar) {
                    super(2, spjVar);
                    this.$second = b9f0Var;
                    this.$this_unsafeFlow = lsrVar;
                    this.$transform = yzsVar;
                    this.$value = obj;
                    this.$collectJob = s7iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    return new C3794a(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, this.$collectJob, spjVar);
                }

                @Override // xsna.wzs
                public final Object invoke(s3q0 s3q0Var, spj<? super s3q0> spjVar) {
                    return ((C3794a) create(s3q0Var, spjVar)).invokeSuspend(s3q0.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
                
                    if (r1.emit(r9, r8) == r0) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
                
                    if (r9 == r0) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:
                
                    if (r9 == r0) goto L29;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object u;
                    lsr<Object> lsrVar;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.a.a(obj);
                        b9f0<Object> b9f0Var = this.$second;
                        this.label = 1;
                        u = b9f0Var.u(this);
                    } else if (i == 1) {
                        kotlin.a.a(obj);
                        u = ((kbb) obj).a;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            return s3q0.a;
                        }
                        lsrVar = (lsr) this.L$0;
                        kotlin.a.a(obj);
                        this.L$0 = null;
                        this.label = 3;
                    }
                    s7i s7iVar = this.$collectJob;
                    if (u instanceof kbb.b) {
                        Throwable a = kbb.a(u);
                        if (a == null) {
                            throw new AbortFlowException(s7iVar);
                        }
                        throw a;
                    }
                    lsrVar = this.$this_unsafeFlow;
                    yzs<Object, Object, spj<Object>, Object> yzsVar = this.$transform;
                    Object obj2 = this.$value;
                    if (u == tyx.h) {
                        u = null;
                    }
                    this.L$0 = lsrVar;
                    this.label = 2;
                    obj = yzsVar.invoke(obj2, u, this);
                }
            }

            /* compiled from: Combine.kt */
            @b6l(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", l = {125}, m = "emit")
            /* renamed from: xsna.u9g$b$a$b, reason: collision with other inner class name */
            public static final class C3795b extends ContinuationImpl {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3795b(a<? super T> aVar, spj<? super C3795b> spjVar) {
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

            /* JADX WARN: Multi-variable type inference failed */
            public a(kotlin.coroutines.d dVar, Object obj, b9f0<? extends Object> b9f0Var, lsr<Object> lsrVar, yzs<Object, Object, ? super spj<Object>, ? extends Object> yzsVar, s7i s7iVar) {
                this.b = dVar;
                this.c = obj;
                this.d = b9f0Var;
                this.e = lsrVar;
                this.f = yzsVar;
                this.g = s7iVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // xsna.lsr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, spj<? super s3q0> spjVar) {
                C3795b c3795b;
                int i;
                if (spjVar instanceof C3795b) {
                    c3795b = (C3795b) spjVar;
                    int i2 = c3795b.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c3795b.label = i2 - Integer.MIN_VALUE;
                        Object obj2 = c3795b.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = c3795b.label;
                        if (i != 0) {
                            kotlin.a.a(obj2);
                            s3q0 s3q0Var = s3q0.a;
                            C3794a c3794a = new C3794a(this.d, this.e, this.f, obj, this.g, null);
                            c3795b.label = 1;
                            if (ao8.w(this.b, s3q0Var, this.c, c3794a, c3795b) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj2);
                        }
                        return s3q0.a;
                    }
                }
                c3795b = new C3795b(this, spjVar);
                Object obj22 = c3795b.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c3795b.label;
                if (i != 0) {
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ksr<Object> ksrVar, kotlin.coroutines.d dVar, Object obj, b9f0<? extends Object> b9f0Var, lsr<Object> lsrVar, yzs<Object, Object, ? super spj<Object>, ? extends Object> yzsVar, s7i s7iVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$flow = ksrVar;
            this.$scopeContext = dVar;
            this.$cnt = obj;
            this.$second = b9f0Var;
            this.$this_unsafeFlow = lsrVar;
            this.$transform = yzsVar;
            this.$collectJob = s7iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob, spjVar);
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
                ksr<Object> ksrVar = this.$flow;
                a aVar = new a(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob);
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

    /* compiled from: Combine.kt */
    @b6l(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<zhd0<? super Object>, spj<? super s3q0>, Object> {
        final /* synthetic */ ksr<Object> $flow2;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: Combine.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ zhd0<Object> b;

            /* compiled from: Combine.kt */
            @b6l(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", l = {87}, m = "emit")
            /* renamed from: xsna.u9g$c$a$a, reason: collision with other inner class name */
            public static final class C3796a extends ContinuationImpl {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3796a(a<? super T> aVar, spj<? super C3796a> spjVar) {
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
            public final Object emit(Object obj, spj<? super s3q0> spjVar) {
                C3796a c3796a;
                int i;
                if (spjVar instanceof C3796a) {
                    c3796a = (C3796a) spjVar;
                    int i2 = c3796a.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c3796a.label = i2 - Integer.MIN_VALUE;
                        Object obj2 = c3796a.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = c3796a.label;
                        if (i != 0) {
                            kotlin.a.a(obj2);
                            whd0 channel = this.b.getChannel();
                            if (obj == null) {
                                obj = tyx.h;
                            }
                            c3796a.label = 1;
                            if (channel.e.t(obj, c3796a) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj2);
                        }
                        return s3q0.a;
                    }
                }
                c3796a = new C3796a(this, spjVar);
                Object obj22 = c3796a.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c3796a.label;
                if (i != 0) {
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ksr<Object> ksrVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$flow2 = ksrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            c cVar = new c(this.$flow2, spjVar);
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
                ksr<Object> ksrVar = this.$flow2;
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
    /* JADX WARN: Multi-variable type inference failed */
    public u9g(ksr<Object> ksrVar, ksr<Object> ksrVar2, lsr<Object> lsrVar, yzs<Object, Object, ? super spj<Object>, ? extends Object> yzsVar, spj<? super u9g> spjVar) {
        super(2, spjVar);
        this.$flow2 = ksrVar;
        this.$flow = ksrVar2;
        this.$this_unsafeFlow = lsrVar;
        this.$transform = yzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        u9g u9gVar = new u9g(this.$flow2, this.$flow, this.$this_unsafeFlow, this.$transform, spjVar);
        u9gVar.L$0 = obj;
        return u9gVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((u9g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[Catch: all -> 0x001a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x001a, blocks: (B:6:0x0016, B:13:0x0084, B:15:0x008c), top: B:5:0x0016 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b9f0 b9f0Var;
        s7i s7iVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            whd0 b2 = phd0.b(yvjVar, 0, new c(this.$flow2, null), 3);
            gyx a2 = iyx.a();
            b2.s(new a(a2));
            try {
                kotlin.coroutines.d coroutineContext = yvjVar.getCoroutineContext();
                Object fold = coroutineContext.fold(0, mqo0.b);
                kotlin.coroutines.d plus = yvjVar.getCoroutineContext().plus(a2);
                s3q0 s3q0Var = s3q0.a;
                b bVar = new b(this.$flow, coroutineContext, fold, b2, this.$this_unsafeFlow, this.$transform, a2, null);
                this.L$0 = b2;
                this.L$1 = a2;
                this.label = 1;
                if (ao8.y(plus, s3q0Var, bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                b9f0Var = b2;
            } catch (AbortFlowException e) {
                e = e;
                b9f0Var = b2;
                s7iVar = a2;
                if (e.b != s7iVar) {
                }
                b9f0Var.b(null);
                return s3q0.a;
            } catch (Throwable th) {
                th = th;
                b9f0Var = b2;
                b9f0Var.b(null);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s7iVar = (s7i) this.L$1;
            b9f0Var = (b9f0) this.L$0;
            try {
                try {
                    kotlin.a.a(obj);
                } catch (AbortFlowException e2) {
                    e = e2;
                    if (e.b != s7iVar) {
                        throw e;
                    }
                    b9f0Var.b(null);
                    return s3q0.a;
                }
            } catch (Throwable th2) {
                th = th2;
                b9f0Var.b(null);
                throw th;
            }
        }
        b9f0Var.b(null);
        return s3q0.a;
    }
}
