package xsna;

import com.vk.music.search.history.SearchHistoryModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ObjectSearchHistoryProvider.kt */
/* loaded from: classes16.dex */
public final class yp70 {
    public final gvh0<SearchHistoryModel> a;
    public final ovj b;
    public final ovj c;
    public final ovj d;
    public final i13 e;
    public final long f;
    public final boolean g;
    public final hpj h;
    public long i;
    public long j;

    /* compiled from: ObjectSearchHistoryProvider.kt */
    @b6l(c = "com.vk.catalog2.feature.music.search.history.provider.ObjectSearchHistoryProvider$onActivateSearchZeroScreen$1", f = "ObjectSearchHistoryProvider.kt", l = {142}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<s3q0> $callbackOnInvalidated;
        int label;

        /* compiled from: ObjectSearchHistoryProvider.kt */
        @b6l(c = "com.vk.catalog2.feature.music.search.history.provider.ObjectSearchHistoryProvider$onActivateSearchZeroScreen$1$1", f = "ObjectSearchHistoryProvider.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.yp70$a$a, reason: collision with other inner class name */
        public static final class C4131a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ gzs<s3q0> $callbackOnInvalidated;
            int label;
            final /* synthetic */ yp70 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4131a(yp70 yp70Var, gzs<s3q0> gzsVar, spj<? super C4131a> spjVar) {
                super(2, spjVar);
                this.this$0 = yp70Var;
                this.$callbackOnInvalidated = gzsVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C4131a(this.this$0, this.$callbackOnInvalidated, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C4131a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                yp70 yp70Var = this.this$0;
                yp70Var.j = ((Number) yp70Var.e.invoke()).longValue();
                this.$callbackOnInvalidated.invoke();
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gzs<s3q0> gzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$callbackOnInvalidated = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return yp70.this.new a(this.$callbackOnInvalidated, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        
            if (r10.j < (((java.lang.Number) r10.e.invoke()).longValue() - r10.f)) goto L22;
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
                yp70 yp70Var = yp70.this;
                if (!yp70Var.g) {
                    return s3q0.a;
                }
                if (yp70Var.i != 0 || yp70Var.j != 0) {
                    if (yp70Var.a.c() == yp70Var.i) {
                        yp70 yp70Var2 = yp70.this;
                    }
                    yp70 yp70Var3 = yp70.this;
                    ovj ovjVar = yp70Var3.d;
                    C4131a c4131a = new C4131a(yp70Var3, this.$callbackOnInvalidated, null);
                    this.label = 1;
                    if (myc0.k(ovjVar, c4131a, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    public yp70() {
        throw null;
    }

    public yp70(gvh0 gvh0Var, long j, boolean z) {
        ovj b = hqu0.b();
        ovj a2 = hqu0.a();
        bdn bdnVar = bdn.a;
        ge00 ge00Var = ie00.a;
        i13 i13Var = new i13(22);
        this.a = gvh0Var;
        this.b = b;
        this.c = a2;
        this.d = ge00Var;
        this.e = i13Var;
        this.f = j;
        this.g = z;
        this.h = zvj.a(whn0.a());
    }

    public final void a(gzs<s3q0> gzsVar) {
        myc0.h(this.h, this.c, null, new a(gzsVar, null), 2);
    }
}
