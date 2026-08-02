package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.generated.VkColorToken;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;

/* compiled from: AboutAppCommunityContent.kt */
/* loaded from: classes6.dex */
public final class w0 {
    public static final void a(final String str, final String str2, final String str3, final boolean z, final gzs gzsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        com.vk.core.compose.component.cell.content.x xVar;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        androidx.compose.runtime.a M = aVar.M(881858945);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(str3) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(881858945, i2, -1, "com.vk.superapp.presentation.about.compose.AboutAppCommunityContent (AboutAppCommunityContent.kt:28)");
            }
            int i3 = i2 << 3;
            com.vk.core.compose.component.cell.content.t a = com.vk.core.compose.component.cell.content.e.a(phw.a.a(fwu0.l(null, str, null, null, M, i3 & 112, 61), null, null, null, null, M, 196616, 30), Cell$Left.Main.Size.Medium, null, null, null, null, null, M, 100663344, 252);
            androidx.compose.runtime.a aVar3 = M;
            if (z) {
                aVar3.K(-854658816);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1159845476, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Verified16> (VkSdkIcons.kt:3652)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_verified_16, 0, aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                com.vk.core.compose.component.cell.content.x a3 = Cell$Middle.d.a.InterfaceC0732a.C0733a.a(a2, VkColorToken.IconAccent.a(6, aVar3), null, null, aVar3, 24584, 12);
                aVar3 = aVar3;
                aVar3.j();
                xVar = a3;
            } else {
                aVar3.K(-854497523);
                aVar3.j();
                xVar = null;
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.d.b.a(str2, null, xVar, 1, null, null, aVar4, ((i2 >> 3) & 14) | 12610560, 98);
            androidx.compose.runtime.a aVar5 = aVar4;
            if (drm0.N(str3)) {
                aVar5.K(-854079891);
                aVar5.j();
                h1Var = null;
            } else {
                aVar5.K(-854243106);
                h1Var = Cell$Middle.c.b.b(str3, 1, null, null, null, aVar5, ((i2 >> 6) & 14) | 12583344, 120);
                aVar5 = aVar5;
                aVar5.j();
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar5, 0);
            int hashCode = Long.hashCode(n34.n(aVar5));
            sy90 D = aVar5.D();
            q630 c = qri.c(aVar5, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
            if (aVar5.N() == null) {
                n34.r();
                throw null;
            }
            aVar5.H();
            if (aVar5.L()) {
                aVar5.I(aVar6);
            } else {
                aVar5.f();
            }
            k9q0.w(aVar5, a5, cri.a.f);
            k9q0.w(aVar5, D, cri.a.e);
            k9q0.w(aVar5, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(aVar5, cri.a.h);
            k9q0.w(aVar5, c, cri.a.d);
            q630.a aVar7 = q630.a.a;
            androidx.compose.runtime.a aVar8 = aVar5;
            com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(R.string.apps_about_app_community_title, 0, aVar5), null, null, null, null, null, null, null, false, aVar8, 805306368, 510), ahn.E(aVar7, "communityTitleStatic"), b.d.a, null, null, null, true, aVar8, 1573296, 56);
            wiu0.b(ahn.E(s200.H(aVar7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, 7), "communityCell"), false, a, Cell$Middle.a.a(a4, h1Var, null, null, aVar8, 196608, 28), null, gzsVar, null, aVar8, (i3 & 458752) | 6, 82);
            aVar2 = aVar8;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, str2, str3, z, gzsVar, q630Var, i) { // from class: xsna.v0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    w0.a(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
