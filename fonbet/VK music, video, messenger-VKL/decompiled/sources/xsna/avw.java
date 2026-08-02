package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: InfiniteTransition.kt */
/* loaded from: classes11.dex */
public final class avw {
    public final ci50<a<?, ?>> a = new ci50<>(new a[16]);
    public final wh50 b = androidx.compose.runtime.k.b(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final wh50 d = androidx.compose.runtime.k.b(Boolean.TRUE);

    /* compiled from: InfiniteTransition.kt */
    public final class a<T, V extends wq2> implements mtk0<T> {
        public Number b;
        public Number c;
        public final jtp0 d;
        public final wh50 e;
        public iq2<T> f;
        public w3o0<T, V> g;
        public boolean h;
        public boolean i;
        public long j;

        public a(Number number, Number number2, jtp0 jtp0Var, yuw yuwVar) {
            this.b = number;
            this.c = number2;
            this.d = jtp0Var;
            this.e = androidx.compose.runtime.k.b(number);
            this.f = yuwVar;
            this.g = new w3o0<>(yuwVar, jtp0Var, this.b, this.c, null);
        }

        @Override // xsna.mtk0
        public final T getValue() {
            return (T) ((zak0) this.e).getValue();
        }
    }

    /* compiled from: InfiniteTransition.kt */
    @b6l(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, 193}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<mtk0<Long>> $toolingOverride;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ avw this$0;

        /* compiled from: InfiniteTransition.kt */
        @b6l(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends SuspendLambda implements wzs<Float, spj<? super Boolean>, Object> {
            /* synthetic */ float F$0;
            int label;

            public a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(2, spjVar);
                aVar.F$0 = ((Number) obj).floatValue();
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(Float f, spj<? super Boolean> spjVar) {
                return ((a) create(Float.valueOf(f.floatValue()), spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return Boolean.valueOf(this.F$0 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wh50<mtk0<Long>> wh50Var, avw avwVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$toolingOverride = wh50Var;
            this.this$0 = avwVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.$toolingOverride, this.this$0, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x007b, code lost:
        
            if (xsna.rsr.o(r12, r1, r11) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x007d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
        
            if (xsna.wuw.a(r5, r11) == r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007b -> B:6:0x0042). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005e -> B:6:0x0042). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar;
            Ref$FloatRef ref$FloatRef;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar2 = (yvj) this.L$0;
                Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                ref$FloatRef2.element = 1.0f;
                yvjVar = yvjVar2;
                ref$FloatRef = ref$FloatRef2;
            } else if (i == 1) {
                Ref$FloatRef ref$FloatRef3 = (Ref$FloatRef) this.L$1;
                yvj yvjVar3 = (yvj) this.L$0;
                kotlin.a.a(obj);
                ref$FloatRef = ref$FloatRef3;
                yvjVar = yvjVar3;
                if (ref$FloatRef.element == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    izg0 M = nr2.M(new atm(yvjVar, 13));
                    a aVar = new a(2, null);
                    this.L$0 = yvjVar;
                    this.L$1 = ref$FloatRef;
                    this.label = 2;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref$FloatRef ref$FloatRef4 = (Ref$FloatRef) this.L$1;
                yvj yvjVar4 = (yvj) this.L$0;
                kotlin.a.a(obj);
                ref$FloatRef = ref$FloatRef4;
                yvjVar = yvjVar4;
            }
            wa waVar = new wa(this.$toolingOverride, this.this$0, ref$FloatRef, yvjVar, 3);
            this.L$0 = yvjVar;
            this.L$1 = ref$FloatRef;
            this.label = 1;
        }
    }

    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-318043801);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-318043801, i2, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            if (((Boolean) ((zak0) this.d).getValue()).booleanValue() || ((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                M.K(-144841960);
                boolean y = M.y(this);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new b(wh50Var, this, null);
                    M.R(x2);
                }
                bap.g(this, (wzs) x2, M, i2 & 14);
                M.j();
            } else {
                M.K(-143455237);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ncb(this, i, 5);
        }
    }
}
