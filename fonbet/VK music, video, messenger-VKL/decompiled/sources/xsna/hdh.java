package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.j7d0;
import xsna.q630;
import xsna.v5v;

/* compiled from: CommunityPrimaryBlockHeaderTextImpl.kt */
/* loaded from: classes17.dex */
public final class hdh extends j7d0.b.AbstractC3109b {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public hdh(com.vk.core.compose.component.semantics.a aVar, String str, boolean z) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(aVar);
    }

    @Override // xsna.j7d0
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1417791934);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1417791934, i2, -1, "com.vk.community.design.compose.primaryblock.CommunityPrimaryBlockHeaderTextImpl.Content (CommunityPrimaryBlockHeaderTextImpl.kt:29)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            wh50 wh50Var = this.a;
            boolean J = M.J((String) ((zak0) wh50Var).getValue());
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                bpn0 bpn0Var = v5v.c;
                x = v5v.a.a("<u>" + ((String) ((zak0) wh50Var).getValue()) + "</u>");
                M.R(x);
            }
            final v5v v5vVar = (v5v) x;
            i3 = 1;
            d8v0.a(v5vVar.b, null, VkOnboarding$HighlighterMarkerType.Type2, VkOnboarding$TintColor.Lime, ((Boolean) ((zak0) this.b).getValue()).booleanValue(), false, false, null, kai.c(1238500940, new zzs() { // from class: xsna.gdh
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    izs izsVar = (izs) obj;
                    ((Boolean) obj2).getClass();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.y(izsVar) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1238500940, intValue, -1, "com.vk.community.design.compose.primaryblock.CommunityPrimaryBlockHeaderTextImpl.Content.<anonymous>.<anonymous> (CommunityPrimaryBlockHeaderTextImpl.kt:40)");
                        }
                        hdh hdhVar = this;
                        boolean booleanValue = ((Boolean) ((zak0) hdhVar.b).getValue()).booleanValue();
                        boolean s = true ^ wlb0.h(aVar3).s();
                        long j = wlb0.h(aVar3).getText().o;
                        bpn0 bpn0Var2 = v5v.c;
                        yqv0.d(d8v0.c(v5v.this, booleanValue, s, j, aVar3, 0), com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) hdhVar.c).getValue()), wlb0.h(aVar3).getText().m, 0, null, 2, false, 1, izsVar, null, wlb0.l(aVar3).J, aVar3, 100663296, ((intValue << 3) & 112) | 6, 4856);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 805309824, 482);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i3 = 1;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h9g(this, q630Var, i, i3);
        }
    }
}
