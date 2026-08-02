package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.hzg;
import xsna.q630;

/* compiled from: CommunityCreateReviewView.kt */
/* loaded from: classes18.dex */
public final class o7k extends i6v0<hzg, kyg> {
    public final Object f;

    /* compiled from: CommunityCreateReviewView.kt */
    @b6l(c = "com.vk.ecomm.reviews.impl.communities.createreview.presentation.view.CreateCommunityReviewView$ThemedContent$1$1", f = "CommunityCreateReviewView.kt", l = {}, m = "invokeSuspend")
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
            return o7k.this.new a(this.$lifecycleOwner, this.$keyboardController, this.$focusManager, spjVar);
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
            ((wj50) o7k.this.f).a(new v53(10, this.$keyboardController, this.$focusManager), this.$lifecycleOwner);
            return s3q0.a;
        }
    }

    public o7k(qyg qygVar, Context context, f4z f4zVar) {
        super(context, qygVar);
        this.f = f4zVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((hzg) ao50Var, izsVar, aVar, 512);
    }

    public final void h(hzg hzgVar, izs<? super kyg, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2010820832);
        int i2 = i | (M.J(hzgVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2010820832, i2, -1, "com.vk.ecomm.reviews.impl.communities.createreview.presentation.view.CreateCommunityReviewView.ThemedContent (CommunityCreateReviewView.kt:49)");
            }
            f5z f5zVar = (f5z) M.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            nek0 nek0Var = (nek0) M.r(uvi.q);
            vvr vvrVar = (vvr) M.r(uvi.i);
            s3q0 s3q0Var = s3q0.a;
            int i3 = i2 & 896;
            boolean y = (i3 == 256 || M.y(this)) | M.y(f5zVar) | M.J(nek0Var) | M.y(vvrVar);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                Object aVar2 = new a(f5zVar, nek0Var, vvrVar, null);
                M.R(aVar2);
                x = aVar2;
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            wh50 d = d(hzg.c.a, new n0u0[]{hzgVar.a, hzgVar.c, hzgVar.b}, M, 518 | i3);
            float f = 12;
            q630 d2 = rte0.d(n34.t(q630.a.a, dz5.I(6, 0, M, false), null), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            gzg.a(i2 & 112, M, d370.N(R.string.community_review_title, 0, M), izsVar);
            jqu0.a(null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 15);
            ijk.a((fm50) d.getValue(), null, null, "StateChange", kai.c(54403613, new ov7(izsVar, 1), M), M, 27648, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ri1(i, 2, this, hzgVar, izsVar);
        }
    }
}
