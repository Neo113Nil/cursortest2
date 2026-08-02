package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.q630;

/* compiled from: DzenArticleViewLoading.kt */
/* loaded from: classes18.dex */
public final class vso {
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1017063721);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1017063721, i, -1, "com.vk.dzenarticle.impl.ui.view.ArticleSkeleton (DzenArticleViewLoading.kt:59)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = rte0.d(txj0.h(txj0.f(aVar2, 1.0f), Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE), androidx.compose.ui.graphics.e.a);
            SkeletonType skeletonType = SkeletonType.Block;
            akv0.a(skeletonType, d, M, 54);
            f9t.e(txj0.h(aVar2, 8), M, 6);
            float f = 12;
            float f2 = 16;
            akv0.a(skeletonType, s200.H(txj0.h(txj0.f(aVar2, 1.0f), f), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 246, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), M, 54);
            f9t.e(txj0.h(aVar2, f), M, 6);
            akv0.a(skeletonType, s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(txj0.f(aVar2, 1.0f), f)), M, 54);
            float f3 = 6;
            f9t.e(txj0.h(aVar2, f3), M, 6);
            akv0.a(skeletonType, s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(txj0.f(aVar2, 1.0f), f)), M, 54);
            f9t.e(txj0.h(aVar2, f3), M, 6);
            akv0.a(skeletonType, s200.H(txj0.h(txj0.f(aVar2, 1.0f), f), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 46, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), M, 54);
            if (a690.d(aVar2, f, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new aad(i, 4);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-439658594);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-439658594, i, -1, "com.vk.dzenarticle.impl.ui.view.DzenArticleViewLoading (DzenArticleViewLoading.kt:19)");
            }
            ckv0.a(txj0.d(q630.a.a, 1.0f), ckv0.b(null, M, 1), kfi.a, M, ApiInvocationException.ErrorCodes.CENSOR_MATCH, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bkh(i, 6);
        }
    }
}
