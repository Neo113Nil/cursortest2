package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.a;
import com.vk.profile.design.compose.header.b;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AuthorHeaderContent.kt */
/* loaded from: classes5.dex */
public final class g85 {
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.List] */
    public static final void a(final AuthorHeaderConfig authorHeaderConfig, final ja5 ja5Var, final float f, final boolean z, final q630 q630Var, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        int a;
        androidx.compose.runtime.a M = aVar.M(1666024538);
        int i2 = i | (M.J(authorHeaderConfig) ? 4 : 2) | (M.J(ja5Var) ? 32 : 16) | (M.n(f) ? 256 : 128) | (M.l(false) ? 2048 : 1024) | (M.l(z) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536) | (M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1666024538, i2, -1, "com.vk.profile.design.compose.header.content.AuthorHeaderContent (AuthorHeaderContent.kt:22)");
            }
            AuthorHeaderConfig.Header header = authorHeaderConfig.a;
            com.vk.profile.design.compose.header.a aVar2 = header.a;
            int i3 = AuthorHeaderConfig.a.$EnumSwitchMapping$0[authorHeaderConfig.d.a.ordinal()];
            if (i3 == 1) {
                a.C1660a c1660a = aVar2 instanceof a.C1660a ? (a.C1660a) aVar2 : null;
                a = com.vk.profile.design.compose.header.c.a(c1660a != null ? c1660a.a : null);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                com.vk.profile.design.compose.header.b bVar = header.b;
                if (bVar instanceof b.C1661b) {
                    a = ((b.C1661b) bVar).a.size();
                } else {
                    if (!epx.f(bVar, b.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a.C1660a c1660a2 = aVar2 instanceof a.C1660a ? (a.C1660a) aVar2 : null;
                    a = com.vk.profile.design.compose.header.c.a(c1660a2 != null ? c1660a2.a : null);
                }
            }
            Integer valueOf = Integer.valueOf(a);
            boolean o = M.o(a) | ((i2 & 112) == 32);
            Object x = M.x();
            if (o || x == a.C0011a.a) {
                x = new f85(ja5Var, a, null);
                M.R(x);
            }
            bap.g(valueOf, (wzs) x, M, 0);
            q630 f2 = txj0.f(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f2);
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
            d95.d(authorHeaderConfig, ja5Var, f, z, z2, M, (65534 & i2) | ((i2 >> 3) & 458752));
            k95.c(authorHeaderConfig.b, authorHeaderConfig.d, authorHeaderConfig.c, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(ja5Var, f, z, q630Var, z2, i) { // from class: xsna.e85
                public final /* synthetic */ ja5 c;
                public final /* synthetic */ float d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ boolean g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    g85.a(AuthorHeaderConfig.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
