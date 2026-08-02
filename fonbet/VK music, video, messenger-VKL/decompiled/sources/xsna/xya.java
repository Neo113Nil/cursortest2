package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* compiled from: Merge.kt */
/* loaded from: classes11.dex */
public final class xya<T, R> extends vya<T, R> {
    public final SuspendLambda f;

    /* compiled from: Merge.kt */
    @b6l(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ lsr<R> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ xya<T, R> this$0;

        /* compiled from: Merge.kt */
        /* renamed from: xsna.xya$a$a, reason: collision with other inner class name */
        public static final class C4051a<T> implements lsr {
            public final /* synthetic */ Ref$ObjectRef<eyx> b;
            public final /* synthetic */ yvj c;
            public final /* synthetic */ xya<T, R> d;
            public final /* synthetic */ lsr<R> e;

            /* compiled from: Merge.kt */
            @b6l(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
            /* renamed from: xsna.xya$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes8.dex */
            public static final class C4052a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                final /* synthetic */ lsr<R> $collector;
                final /* synthetic */ T $value;
                int label;
                final /* synthetic */ xya<T, R> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C4052a(xya<T, R> xyaVar, lsr<? super R> lsrVar, T t, spj<? super C4052a> spjVar) {
                    super(2, spjVar);
                    this.this$0 = xyaVar;
                    this.$collector = lsrVar;
                    this.$value = t;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    return new C4052a(this.this$0, this.$collector, this.$value, spjVar);
                }

                @Override // xsna.wzs
                public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                    return ((C4052a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                }

                /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.yzs] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.a.a(obj);
                        ?? r5 = this.this$0.f;
                        lsr<R> lsrVar = this.$collector;
                        T t = this.$value;
                        this.label = 1;
                        if (r5.invoke(lsrVar, t, this) == coroutineSingletons) {
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

            /* compiled from: Merge.kt */
            @b6l(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit")
            /* renamed from: xsna.xya$a$a$b */
            /* loaded from: classes8.dex */
            public static final class b extends ContinuationImpl {
                Object L$0;
                Object L$1;
                Object L$2;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C4051a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C4051a<? super T> c4051a, spj<? super b> spjVar) {
                    super(spjVar);
                    this.this$0 = c4051a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C4051a(Ref$ObjectRef<eyx> ref$ObjectRef, yvj yvjVar, xya<T, R> xyaVar, lsr<? super R> lsrVar) {
                this.b = ref$ObjectRef;
                this.c = yvjVar;
                this.d = xyaVar;
                this.e = lsrVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // xsna.lsr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t, spj<? super s3q0> spjVar) {
                b bVar;
                int i;
                C4051a<T> c4051a;
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
                            eyx eyxVar = this.b.element;
                            if (eyxVar != null) {
                                eyxVar.b(new ChildCancelledException());
                                bVar.L$0 = this;
                                bVar.L$1 = t;
                                bVar.L$2 = eyxVar;
                                bVar.label = 1;
                                if (eyxVar.y(bVar) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            c4051a = this;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t = (T) bVar.L$1;
                            c4051a = (C4051a) bVar.L$0;
                            kotlin.a.a(obj);
                        }
                        c4051a.b.element = (T) myc0.h(c4051a.c, null, CoroutineStart.UNDISPATCHED, new C4052a(c4051a.d, c4051a.e, t, null), 1);
                        return s3q0.a;
                    }
                }
                bVar = new b(this, spjVar);
                Object obj2 = bVar.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                }
                c4051a.b.element = (T) myc0.h(c4051a.c, null, CoroutineStart.UNDISPATCHED, new C4052a(c4051a.d, c4051a.e, t, null), 1);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(xya<T, R> xyaVar, lsr<? super R> lsrVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = xyaVar;
            this.$collector = lsrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, this.$collector, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                xya<T, R> xyaVar = this.this$0;
                ksr<S> ksrVar = xyaVar.e;
                C4051a c4051a = new C4051a(ref$ObjectRef, yvjVar, xyaVar, this.$collector);
                this.label = 1;
                if (ksrVar.collect(c4051a, this) == coroutineSingletons) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public xya(yzs<? super lsr<? super R>, ? super T, ? super spj<? super s3q0>, ? extends Object> yzsVar, ksr<? extends T> ksrVar, kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        super(i, dVar, bufferOverflow, ksrVar);
        this.f = (SuspendLambda) yzsVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.yzs] */
    @Override // xsna.sya
    public final sya<R> f(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        return new xya(this.f, this.e, dVar, i, bufferOverflow);
    }

    @Override // xsna.vya
    public final Object j(lsr<? super R> lsrVar, spj<? super s3q0> spjVar) {
        Object d = zvj.d(new a(this, lsrVar, null), spjVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}
