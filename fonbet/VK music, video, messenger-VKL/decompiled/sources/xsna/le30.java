package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.pe30;

/* compiled from: MoviePosterEventHandler.kt */
/* loaded from: classes.dex */
public final class le30 {
    public final ydt0 a;

    /* compiled from: MoviePosterEventHandler.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.movies.detail.poster.MoviePosterEventHandler$EventsEffect$1$1", f = "MoviePosterEventHandler.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class a extends SuspendLambda implements wzs<pe30, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = le30.this.new a(this.$context, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(pe30 pe30Var, spj<? super s3q0> spjVar) {
            return ((a) create(pe30Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            pe30 pe30Var = (pe30) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (!(pe30Var instanceof pe30.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ydt0 ydt0Var = le30.this.a;
            int i = ((pe30.a) pe30Var).b;
            ydt0Var.getClass();
            return s3q0.a;
        }
    }

    public le30(ydt0 ydt0Var) {
        this.a = ydt0Var;
    }

    public final void a(ksr ksrVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1188344409);
        if ((i & 6) == 0) {
            i2 = (M.J(ksrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1188344409, i2, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.poster.MoviePosterEventHandler.EventsEffect (MoviePosterEventHandler.kt:17)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
            boolean y = M.y(context) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new a(context, null);
                M.R(x);
            }
            c1q.a(ksrVar, (wzs) x, M, i2 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new j6l(this, ksrVar, i, 3));
        }
    }
}
