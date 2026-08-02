package xsna;

import android.view.Choreographer;
import androidx.compose.runtime.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ComposePerformanceChecker.kt */
/* loaded from: classes3.dex */
public final class gqi {

    /* compiled from: ComposePerformanceChecker.kt */
    @b6l(c = "com.vk.metrics.performance.animation.lazycolumn.ComposePerformanceCheckerKt$AddTrackingLazyList$1$1", f = "ComposePerformanceChecker.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ xvy $this_AddTrackingLazyList;
        final /* synthetic */ gfs $tracker;
        final /* synthetic */ wh50<Boolean> $wasScrolling$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xvy xvyVar, gfs gfsVar, wh50<Boolean> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_AddTrackingLazyList = xvyVar;
            this.$tracker = gfsVar;
            this.$wasScrolling$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$this_AddTrackingLazyList, this.$tracker, this.$wasScrolling$delegate, spjVar);
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
            if (this.$this_AddTrackingLazyList.j.a() && !this.$wasScrolling$delegate.getValue().booleanValue()) {
                this.$tracker.a();
            }
            if (!this.$this_AddTrackingLazyList.j.a() && this.$wasScrolling$delegate.getValue().booleanValue()) {
                this.$tracker.b();
            }
            this.$wasScrolling$delegate.setValue(Boolean.valueOf(this.$this_AddTrackingLazyList.j.a()));
            return s3q0.a;
        }
    }

    /* compiled from: Effects.kt */
    public static final class b implements kgn {
        public final /* synthetic */ gfs a;

        public b(gfs gfsVar) {
            this.a = gfsVar;
        }

        @Override // xsna.kgn
        public final void dispose() {
            gfs gfsVar = this.a;
            gfsVar.a.removeFrameCallback(gfsVar.i);
        }
    }

    public static final void a(xvy xvyVar, gzs<Choreographer> gzsVar, ffs ffsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1787270559);
        if ((i & 6) == 0) {
            i2 = (M.J(xvyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(ffsVar) : M.y(ffsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1787270559, i2, -1, "com.vk.metrics.performance.animation.lazycolumn.AddTrackingLazyList (ComposePerformanceChecker.kt:24)");
            }
            Choreographer x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = gzsVar.invoke();
                M.R(x);
            }
            Choreographer choreographer = (Choreographer) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new gfs(choreographer, ffsVar);
                M.R(x2);
            }
            gfs gfsVar = (gfs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var = (wh50) x3;
            Boolean valueOf = Boolean.valueOf(xvyVar.j.a());
            boolean y = M.y(gfsVar) | ((i2 & 14) == 4);
            Object x4 = M.x();
            if (y || x4 == c0012a) {
                x4 = new a(xvyVar, gfsVar, wh50Var, null);
                M.R(x4);
            }
            bap.g(valueOf, (wzs) x4, M, 0);
            s3q0 s3q0Var = s3q0.a;
            boolean y2 = M.y(gfsVar);
            Object x5 = M.x();
            if (y2 || x5 == c0012a) {
                x5 = new n3i(gfsVar, 1);
                M.R(x5);
            }
            bap.c(s3q0Var, (izs) x5, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fqi(i, 0, xvyVar, gzsVar, ffsVar);
        }
    }
}
