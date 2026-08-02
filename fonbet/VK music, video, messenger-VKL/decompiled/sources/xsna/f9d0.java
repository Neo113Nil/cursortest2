package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.wra0;
import xsna.zra0;

/* compiled from: PrimaryBlockServicesTileContentImpl.kt */
/* loaded from: classes17.dex */
public final class f9d0 extends s770 {
    public final float c = 150;
    public final float d = 168;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;

    public f9d0(sa10 sa10Var, wzs wzsVar, wzs wzsVar2, wzs wzsVar3, gzs gzsVar, gzs gzsVar2, com.vk.core.compose.component.semantics.a aVar) {
        this.e = androidx.compose.runtime.k.b(sa10Var);
        this.f = androidx.compose.runtime.k.b(wzsVar);
        this.g = androidx.compose.runtime.k.b(wzsVar2);
        this.h = androidx.compose.runtime.k.b(wzsVar3);
        this.i = androidx.compose.runtime.k.b(gzsVar);
        this.j = androidx.compose.runtime.k.b(gzsVar2);
        this.k = androidx.compose.runtime.k.b(aVar);
    }

    @Override // xsna.i7d0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1543413482);
        int i3 = i & 6;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1543413482, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesTileContentImpl.Content (PrimaryBlockServicesTileContentImpl.kt:63)");
            }
            xvy a = zvy.a(0, 3, M);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = bbk0.b(new p6y(a, 29));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            Boolean bool = (Boolean) mtk0Var.getValue();
            bool.getClass();
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object x2 = M.x();
            if (z || x2 == obj) {
                x2 = new y8d0(this, mtk0Var, null);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            Boolean valueOf = Boolean.valueOf(((sa10) ((zak0) this.e).getValue()).c);
            boolean J = (i4 == 32) | M.J(a);
            Object x3 = M.x();
            if (J || x3 == obj) {
                x3 = new z8d0(this, a, null);
                M.R(x3);
            }
            bap.g(valueOf, (wzs) x3, M, 0);
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.k).getValue());
            float f = 10;
            u890 n = s200.n(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            boolean z2 = i4 == 32;
            Object x4 = M.x();
            if (z2 || x4 == obj) {
                x4 = new af50(this, 17);
                M.R(x4);
            }
            z1v0.a(b, a, n, null, bVar, null, false, (izs) x4, M, 196992, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ps1(this, i);
        }
    }

    public final void s(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-836627998);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-836627998, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesTileContentImpl.ProductTilePaginationError (PrimaryBlockServicesTileContentImpl.kt:135)");
            }
            float f = kqu0.r;
            float f2 = kqu0.s;
            q630.a aVar3 = q630.a.a;
            q630 G = s200.G(aVar3, f2, f, f2, f2);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 h = txj0.h(txj0.v(aVar3, this.c), this.d);
            vl20 a = zra0.a.a(null, null, d370.N(R.string.community_profile_priority_block_services_pagination_error_title, 0, M), null, M, 196608, 27);
            String N = d370.N(R.string.community_profile_priority_block_services_pagination_error_retry_button, 0, M);
            qzu0.a.getClass();
            lg90 j1 = qzu0.j1(M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().b;
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonStyle buttonStyle = ButtonStyle.Link;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new x850(this, 16);
                M.R(x);
            }
            aVar2 = M;
            ldv0.d(h, null, a, wra0.b.a(wra0.a.C3954a.a(N, (gzs) x, buttonSize, buttonStyle, buttonAppearance, false, j1, new l5g(j), null, null, null, null, false, false, null, null, aVar2, 2125184, 12582912, 130848), null, null, aVar2, 14), null, null, false, aVar2, 1572864, 50);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new gx(this, q630Var2, i, 9);
        }
    }

    public final void t(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1755469189);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1755469189, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesTileContentImpl.ProductTileSkeleton (PrimaryBlockServicesTileContentImpl.kt:124)");
            }
            jai c = kai.c(756932234, new bk9(this, 2), M);
            q630.a aVar2 = q630.a.a;
            ckv0.a(aVar2, null, c, M, 390, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ps7(this, q630Var, i, 8);
        }
    }
}
