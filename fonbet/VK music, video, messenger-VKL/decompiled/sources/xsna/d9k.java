package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.g9k;

/* compiled from: CreateMarketItemReviewView.kt */
/* loaded from: classes18.dex */
public final class d9k extends i6v0<g9k, z7k> {
    public final Object f;
    public final mzp0 g;
    public final yw90 h;

    /* compiled from: CreateMarketItemReviewView.kt */
    @b6l(c = "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateMarketItemReviewView$ThemedContent$1$1", f = "CreateMarketItemReviewView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ vvr $focusManager;
        final /* synthetic */ nek0 $keyboardController;
        final /* synthetic */ f5z $lifecycleOwner;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f5z f5zVar, nek0 nek0Var, vvr vvrVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$lifecycleOwner = f5zVar;
            this.$keyboardController = nek0Var;
            this.$focusManager = vvrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return d9k.this.new a(this.$lifecycleOwner, this.$keyboardController, this.$focusManager, spjVar);
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
            ((wj50) d9k.this.f).a(new wd3(10, this.$keyboardController, this.$focusManager), this.$lifecycleOwner);
            return s3q0.a;
        }
    }

    /* compiled from: CreateMarketItemReviewView.kt */
    @b6l(c = "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateMarketItemReviewView$ThemedContent$3$1$4$1", f = "CreateMarketItemReviewView.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return d9k.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            d9k d9kVar = d9k.this;
            mzp0 mzp0Var = d9kVar.g;
            if (mzp0Var != null) {
                mzp0Var.d(d9kVar.c());
            }
            yw90 yw90Var = d9k.this.h;
            if (yw90Var != null) {
                yw90Var.a();
            }
            return s3q0.a;
        }
    }

    public d9k(f5z f5zVar, Context context, mzp0 mzp0Var, yw90 yw90Var, f4z f4zVar) {
        super(context, f5zVar);
        this.f = f4zVar;
        this.g = mzp0Var;
        this.h = yw90Var;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((g9k) ao50Var, izsVar, aVar, 512);
    }

    public final void h(g9k g9kVar, izs<? super z7k, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(506175316);
        int i2 = i | (M.J(g9kVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(506175316, i2, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateMarketItemReviewView.ThemedContent (CreateMarketItemReviewView.kt:57)");
            }
            f5z f5zVar = (f5z) M.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            nek0 nek0Var = (nek0) M.r(uvi.q);
            vvr vvrVar = (vvr) M.r(uvi.i);
            s3q0 s3q0Var = s3q0.a;
            int i3 = i2 & 896;
            boolean y = (i3 == 256 || M.y(this)) | M.y(f5zVar) | M.J(nek0Var) | M.y(vvrVar);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                Object aVar3 = new a(f5zVar, nek0Var, vvrVar, null);
                M.R(aVar3);
                x = aVar3;
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            wh50 d = d(g9k.c.a, new n0u0[]{g9kVar.a, g9kVar.d, g9kVar.b, g9kVar.c}, M, 518 | i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(null, kai.c(1579954075, new qv7(izsVar), M), null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(-759838032, new ek4(d, izsVar, this), M), aVar2, 805306416, 381);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new w70(this, g9kVar, izsVar, i, 3);
        }
    }
}
