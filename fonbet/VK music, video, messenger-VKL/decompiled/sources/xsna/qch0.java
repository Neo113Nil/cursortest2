package xsna;

import android.view.Choreographer;
import androidx.compose.runtime.a;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ScreenScrollComposeChecker.kt */
/* loaded from: classes3.dex */
public final class qch0 {

    /* compiled from: ScreenScrollComposeChecker.kt */
    @b6l(c = "com.vk.metrics.performance.animation.lazycolumn.ScreenScrollComposeCheckerKt$AttachLazyList$1$1", f = "ScreenScrollComposeChecker.kt", l = {31}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ kgh0 $scrollStoreOps;
        final /* synthetic */ wh50<Boolean> $shouldSend$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kgh0 kgh0Var, wh50<Boolean> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$scrollStoreOps = kgh0Var;
            this.$shouldSend$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$scrollStoreOps, this.$shouldSend$delegate, spjVar);
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
                long j = this.$scrollStoreOps.a;
                this.label = 1;
                if (qsl.b(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$shouldSend$delegate.setValue(Boolean.TRUE);
            return s3q0.a;
        }
    }

    /* compiled from: ScreenScrollComposeChecker.kt */
    public static final class b implements ffs {
        public final /* synthetic */ ScrollScreenType a;
        public final /* synthetic */ kgh0 b;
        public final /* synthetic */ wh50 c;

        public b(ScrollScreenType scrollScreenType, kgh0 kgh0Var, wh50 wh50Var) {
            this.a = scrollScreenType;
            this.b = kgh0Var;
            this.c = wh50Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.ffs
        public final void a(int i, int i2, long j, long j2) {
            igh0 igh0Var = new igh0(i, i2, j, j2);
            ScrollScreenType scrollScreenType = this.a;
            kgh0 kgh0Var = this.b;
            qch0.b(scrollScreenType, kgh0Var, igh0Var, false);
            if (((Boolean) this.c.getValue()).booleanValue()) {
                qch0.b(scrollScreenType, kgh0Var, igh0Var, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(xvy xvyVar, ScrollScreenType scrollScreenType, kgh0 kgh0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1005058774);
        if ((i & 6) == 0) {
            i2 = (M.J(xvyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(scrollScreenType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(kgh0Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1005058774, i2, -1, "com.vk.metrics.performance.animation.lazycolumn.AttachLazyList (ScreenScrollComposeChecker.kt:25)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = Choreographer.getInstance();
                M.R(x);
            }
            Choreographer choreographer = (Choreographer) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            s3q0 s3q0Var = s3q0.a;
            boolean z = (i2 & 896) == 256;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new a(kgh0Var, wh50Var, null);
                M.R(x3);
            }
            bap.g(s3q0Var, (wzs) x3, M, 6);
            Boolean bool = (Boolean) wh50Var.getValue();
            bool.getClass();
            wh50 c = androidx.compose.runtime.k.c(bool, M, 0);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new b(scrollScreenType, kgh0Var, c);
                M.R(x4);
            }
            b bVar = (b) x4;
            boolean y = M.y(choreographer);
            Object x5 = M.x();
            if (y || x5 == c0012a) {
                x5 = new jw30(choreographer, 24);
                M.R(x5);
            }
            gqi.a(xvyVar, (gzs) x5, bVar, M, (i2 & 14) | 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ju80(i, 2, xvyVar, scrollScreenType, kgh0Var);
        }
    }

    public static final void b(ScrollScreenType scrollScreenType, kgh0 kgh0Var, igh0 igh0Var, boolean z) {
        Pair pair = new Pair(0L, 0);
        Pair pair2 = (Pair) kgh0Var.b.invoke(scrollScreenType, Boolean.valueOf(z));
        if (pair2 == null) {
            pair2 = pair;
        }
        long longValue = ((Number) pair2.d()).longValue();
        int intValue = ((Number) pair2.g()).intValue();
        Pair pair3 = (Pair) kgh0Var.c.invoke(scrollScreenType, Boolean.valueOf(z));
        if (pair3 != null) {
            pair = pair3;
        }
        kgh0Var.d.invoke(scrollScreenType, Long.valueOf(longValue + igh0Var.a), Integer.valueOf(intValue + igh0Var.b), Long.valueOf(((Number) pair.d()).longValue() + igh0Var.c), Integer.valueOf(((Number) pair.g()).intValue() + igh0Var.d), Boolean.valueOf(z));
    }
}
