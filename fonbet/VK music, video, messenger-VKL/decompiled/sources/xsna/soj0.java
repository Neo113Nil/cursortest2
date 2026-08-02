package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SimilarVideosHorizontalSkeletonDelegate.kt */
/* loaded from: classes7.dex */
public final class soj0 {
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1971828299);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1971828299, i, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.VideoPreviewSkeleton (SimilarVideosHorizontalSkeletonDelegate.kt:118)");
            }
            akv0.a(SkeletonType.Block, rte0.d(txj0.h(txj0.v(q630.a.a, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), vog0.b(10)), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d69(i);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1080210694);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1080210694, i, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.VideoSkeletonItem (SimilarVideosHorizontalSkeletonDelegate.kt:103)");
            }
            float f = Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
            q630.a aVar2 = q630.a.a;
            float f2 = 4;
            q630 d = rte0.d(s200.E(txj0.v(aVar2, f), 6, f2), vog0.b(10));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            a(0, M);
            e(0, M);
            d(0, M);
            if (xga0.c(aVar2, f2, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zh3(i, 7);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(483462301);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(483462301, i, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.VideoSkeletonShimmer (SimilarVideosHorizontalSkeletonDelegate.kt:84)");
            }
            ckv0.a(q630.a.a, ckv0.b(null, M, 1), zki.b, M, ApiInvocationException.ErrorCodes.CENSOR_MATCH, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tx3(i);
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1575695103);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1575695103, i, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.VideoSubtitleSkeleton (SimilarVideosHorizontalSkeletonDelegate.kt:141)");
            }
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, 11), M, 6);
            akv0.a(SkeletonType.Block, rte0.d(txj0.h(txj0.v(aVar2, 80), 8), vog0.b(10)), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uki(i, 4);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-526468859);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-526468859, i, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.VideoTitleSkeleton (SimilarVideosHorizontalSkeletonDelegate.kt:129)");
            }
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, 11), M, 6);
            akv0.a(SkeletonType.Block, rte0.d(txj0.h(txj0.v(aVar2, 120), 8), vog0.b(10)), M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uhd(i, 9);
        }
    }
}
