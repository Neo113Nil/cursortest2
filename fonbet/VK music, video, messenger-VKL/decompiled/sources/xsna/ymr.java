package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import xsna.c16;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: FixedIllustrationImpl.kt */
/* loaded from: classes17.dex */
public final class ymr extends c16.a {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(null);

    public ymr(lg90 lg90Var, String str) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b(str);
    }

    @Override // xsna.c16
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(2068896392);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2068896392, i2, -1, "com.vk.core.compose.component.banner.FixedIllustrationImpl.Content (FixedIllustrationImpl.kt:32)");
            }
            q630.a aVar2 = q630.a.a;
            q630 b = com.vk.core.compose.component.semantics.b.b(rte0.e(txj0.c(txj0.v(aVar2, 150), 1.0f)), (SemanticsConfiguration) ((zak0) this.c).getValue());
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            vjw.a((lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.b).getValue(), txj0.h(txj0.v(aVar2, 194), Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE), null, wkj.a.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 24968, 104);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hue(this, i, 4);
        }
    }
}
