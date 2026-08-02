package xsna;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.kjf0;

/* compiled from: ProductCardViewStatesMerger.kt */
@b6l(c = "com.vk.ecomm.market.good.good2.presentation.ProductCardViewStatesMerger$subscribeToOneState$1", f = "ProductCardViewStatesMerger.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class lnd0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<List<? extends kjf0.a>, d210, s3q0> $onState;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mnd0 this$0;

    /* compiled from: ProductCardViewStatesMerger.kt */
    @b6l(c = "com.vk.ecomm.market.good.good2.presentation.ProductCardViewStatesMerger$subscribeToOneState$1$1", f = "ProductCardViewStatesMerger.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<Pair<? extends List<? extends kjf0.a>, ? extends d210>, ind0, spj<? super Pair<? extends Pair<? extends List<? extends kjf0.a>, ? extends d210>, ? extends ind0>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // xsna.yzs
        public final Object invoke(Pair<? extends List<? extends kjf0.a>, ? extends d210> pair, ind0 ind0Var, spj<? super Pair<? extends Pair<? extends List<? extends kjf0.a>, ? extends d210>, ? extends ind0>> spjVar) {
            a aVar = new a(3, spjVar);
            aVar.L$0 = pair;
            aVar.L$1 = ind0Var;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.L$0;
            ind0 ind0Var = (ind0) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return new Pair(pair, ind0Var);
        }
    }

    /* compiled from: ProductCardViewStatesMerger.kt */
    public static final class b<T> implements lsr {
        public final /* synthetic */ yvj b;
        public final /* synthetic */ mnd0 c;
        public final /* synthetic */ wzs<List<? extends kjf0.a>, d210, s3q0> d;

        /* compiled from: ProductCardViewStatesMerger.kt */
        @b6l(c = "com.vk.ecomm.market.good.good2.presentation.ProductCardViewStatesMerger$subscribeToOneState$1$2$1", f = "ProductCardViewStatesMerger.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ List<kjf0.a> $mergeResult;
            final /* synthetic */ wzs<List<? extends kjf0.a>, d210, s3q0> $onState;
            final /* synthetic */ d210 $pageData;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(wzs<? super List<? extends kjf0.a>, ? super d210, s3q0> wzsVar, List<? extends kjf0.a> list, d210 d210Var, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$onState = wzsVar;
                this.$mergeResult = list;
                this.$pageData = d210Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.$onState, this.$mergeResult, this.$pageData, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.$onState.invoke(this.$mergeResult, this.$pageData);
                return s3q0.a;
            }
        }

        /* compiled from: ProductCardViewStatesMerger.kt */
        @b6l(c = "com.vk.ecomm.market.good.good2.presentation.ProductCardViewStatesMerger$subscribeToOneState$1$2", f = "ProductCardViewStatesMerger.kt", l = {54, 57}, m = "emit")
        /* renamed from: xsna.lnd0$b$b, reason: collision with other inner class name */
        public static final class C3277b extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ b<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3277b(b<? super T> bVar, spj<? super C3277b> spjVar) {
                super(spjVar);
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* compiled from: ProductCardViewStatesMerger.kt */
        @b6l(c = "com.vk.ecomm.market.good.good2.presentation.ProductCardViewStatesMerger$subscribeToOneState$1$2$mergeResult$1", f = "ProductCardViewStatesMerger.kt", l = {}, m = "invokeSuspend")
        public static final class c extends SuspendLambda implements wzs<yvj, spj<? super List<? extends kjf0.a>>, Object> {
            final /* synthetic */ List<kjf0.a> $legacyItemsList;
            final /* synthetic */ ind0 $mvi;
            int label;
            final /* synthetic */ mnd0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(mnd0 mnd0Var, List<? extends kjf0.a> list, ind0 ind0Var, spj<? super c> spjVar) {
                super(2, spjVar);
                this.this$0 = mnd0Var;
                this.$legacyItemsList = list;
                this.$mvi = ind0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new c(this.this$0, this.$legacyItemsList, this.$mvi, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super List<? extends kjf0.a>> spjVar) {
                return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                mnd0 mnd0Var = this.this$0;
                List<kjf0.a> list = this.$legacyItemsList;
                ind0 ind0Var = this.$mvi;
                mnd0Var.getClass();
                ListBuilder e = e43.e();
                for (kjf0.a aVar : list) {
                    if (aVar.b != null) {
                        e.add(aVar);
                    } else {
                        int i = aVar.a;
                        if (i == 0) {
                            eld0 eld0Var = ind0Var.e;
                            if (eld0Var != null) {
                                e.add(hld0.a(eld0Var, i));
                            }
                        } else if (i == 1) {
                            qld0 qld0Var = ind0Var.h;
                            if (qld0Var != null) {
                                e.add(hld0.a(qld0Var, i));
                            }
                        } else if (i == 22) {
                            ikd0 ikd0Var = ind0Var.f;
                            if (ikd0Var != null) {
                                e.add(hld0.a(ikd0Var, i));
                            }
                        } else if (i == 23) {
                            lkd0 lkd0Var = ind0Var.g;
                            if (lkd0Var != null) {
                                e.add(hld0.a(lkd0Var, i));
                            }
                        } else {
                            e.add(aVar);
                        }
                    }
                }
                return e.g();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(yvj yvjVar, mnd0 mnd0Var, wzs<? super List<? extends kjf0.a>, ? super d210, s3q0> wzsVar) {
            this.b = yvjVar;
            this.c = mnd0Var;
            this.d = wzsVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
        
            if (xsna.myc0.k(r2, r4, r0) != r1) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // xsna.lsr
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Pair<? extends Pair<? extends List<? extends kjf0.a>, d210>, ind0> pair, spj<? super s3q0> spjVar) {
            C3277b c3277b;
            int i;
            d210 d210Var;
            if (spjVar instanceof C3277b) {
                c3277b = (C3277b) spjVar;
                int i2 = c3277b.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3277b.label = i2 - Integer.MIN_VALUE;
                    Object obj = c3277b.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c3277b.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        Pair<? extends List<? extends kjf0.a>, d210> d = pair.d();
                        ind0 g = pair.g();
                        List<? extends kjf0.a> d2 = d.d();
                        d210 g2 = d.g();
                        ovj a2 = hqu0.a();
                        c cVar = new c(this.c, d2, g, null);
                        c3277b.L$0 = null;
                        c3277b.L$1 = null;
                        c3277b.L$2 = null;
                        c3277b.L$3 = g2;
                        c3277b.label = 1;
                        Object k = myc0.k(a2, cVar, c3277b);
                        if (k != coroutineSingletons) {
                            obj = k;
                            d210Var = g2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        zvj.c(this.b, null);
                        return s3q0.a;
                    }
                    d210Var = (d210) c3277b.L$3;
                    kotlin.a.a(obj);
                    bdn bdnVar = bdn.a;
                    ge00 ge00Var = ie00.a;
                    a aVar = new a(this.d, (List) obj, d210Var, null);
                    c3277b.L$0 = null;
                    c3277b.L$1 = null;
                    c3277b.L$2 = null;
                    c3277b.L$3 = null;
                    c3277b.L$4 = null;
                    c3277b.label = 2;
                }
            }
            c3277b = new C3277b(this, spjVar);
            Object obj2 = c3277b.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = c3277b.label;
            if (i != 0) {
            }
            bdn bdnVar2 = bdn.a;
            ge00 ge00Var2 = ie00.a;
            a aVar2 = new a(this.d, (List) obj2, d210Var, null);
            c3277b.L$0 = null;
            c3277b.L$1 = null;
            c3277b.L$2 = null;
            c3277b.L$3 = null;
            c3277b.L$4 = null;
            c3277b.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lnd0(mnd0 mnd0Var, wzs<? super List<? extends kjf0.a>, ? super d210, s3q0> wzsVar, spj<? super lnd0> spjVar) {
        super(2, spjVar);
        this.this$0 = mnd0Var;
        this.$onState = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        lnd0 lnd0Var = new lnd0(this.this$0, this.$onState, spjVar);
        lnd0Var.L$0 = obj;
        return lnd0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lnd0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            mnd0 mnd0Var = this.this$0;
            caj0 caj0Var = mnd0Var.c;
            caj0 caj0Var2 = mnd0Var.b;
            a aVar = new a(3, null);
            b bVar = new b(yvjVar, this.this$0, this.$onState);
            this.L$0 = null;
            this.label = 1;
            Object d = zvj.d(new u9g(caj0Var2, caj0Var, bVar, aVar, null), this);
            if (d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                d = s3q0.a;
            }
            if (d == obj2) {
                return obj2;
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
