package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vkontakte.android.R;
import java.util.Arrays;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.f8s;
import xsna.g8s;
import xsna.h8s;
import xsna.jke;
import xsna.q630;
import xsna.s2x;
import xsna.us2;

/* compiled from: ClipsLinksEditContentView.kt */
/* loaded from: classes16.dex */
public final class eke extends ame<jke, uje> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        j((jke) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(jke.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar2.M(2118069524);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | 384;
        if ((i & 3072) == 0) {
            i2 |= M.y(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2118069524, i2, -1, "com.vk.clips.attachments.impl.publish.links.edit.view.ClipsLinksEditContentView.Content (ClipsLinksEditContentView.kt:87)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String N = d370.N(R.string.clips_links_item_from_publication_create_link_title, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.g;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N, null, ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8186);
            f9t.e(txj0.h(aVar3, 12), M, 6);
            int i3 = i2 & 112;
            int i4 = (i2 & 7168) | i3 | 4096;
            h(i4, M, (String) jk50.c(aVar.a, M).getValue(), izsVar, null);
            i(i4, M, (String) jk50.c(aVar.b, M).getValue(), izsVar, null);
            float f = 16;
            f9t.e(txj0.h(aVar3, f), M, 6);
            gio0 a2 = cp8.d.a.a(d370.N(R.string.clips_links_item_from_publication_create_link_add, 0, M), null, M, 3072, 6);
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean booleanValue = ((Boolean) jk50.c(aVar.c, M).getValue()).booleanValue();
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            boolean z = i3 == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new zje(izsVar, 0);
                M.R(x);
            }
            bhu0.d((gzs) x, buttonStyle, buttonAppearance, F, buttonSize, null, null, a2, booleanValue, null, M, 28080, 3424);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ake(this, aVar, izsVar, q630Var2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(final int i, androidx.compose.runtime.a aVar, final String str, final izs izsVar, q630 q630Var) {
        final q630 q630Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-126630289);
        int i3 = (M.J(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i & 3072) == 0) {
            i4 |= M.y(this) ? 2048 : 1024;
        }
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-126630289, i4, -1, "com.vk.clips.attachments.impl.publish.links.edit.view.ClipsLinksEditContentView.LinkInput (ClipsLinksEditContentView.kt:117)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new rwr();
                M.R(x);
            }
            rwr rwrVar = (rwr) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = or.a(str, 0L, 6, M);
            }
            wh50 wh50Var = (wh50) x2;
            String N = d370.N(R.string.clips_links_item_from_publication_create_link_rules_text, 0, M);
            int i5 = ((i4 >> 6) & 112) | 64;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1247446174, i5, -1, "com.vk.clips.attachments.impl.publish.links.edit.view.ClipsLinksEditContentView.getRulesText (ClipsLinksEditContentView.kt:199)");
            }
            int K = drm0.K(0, 6, N, X3.j.d, false) - 1;
            int K2 = drm0.K(0, 6, N, X3.j.e, false) - 1;
            String y = brm0.y(brm0.y(N, X3.j.d, ""), X3.j.e, "");
            M.K(499911148);
            us2.b bVar = new us2.b();
            bVar.g(y);
            if (androidx.compose.runtime.b.d()) {
                i2 = i4;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                i2 = i4;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            bVar.d(new hik0(ylu0Var.getText().f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), K, K2);
            bVar.c(K, K2, "rules", "");
            us2 n = bVar.n();
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            q630 f = txj0.f(jvi.d(aVar2, rwrVar), 1.0f);
            hly a2 = h8s.a.a(d370.N(R.string.clips_links_item_from_publication_create_link_address_title, 0, M), false, null, null, null, M, 196608, 30);
            tho0 tho0Var = (tho0) wh50Var.getValue();
            int i6 = i2 & 112;
            boolean z = i6 == 32;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new yu1(4, izsVar, wh50Var);
                M.R(x3);
            }
            u2x a3 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x3, d370.N(R.string.clips_links_item_from_publication_hint, 0, M), 0L, 0L, new rgy(6), null, null, null, null, false, null, M, 0, 196608, 32632), InputSelect$State.Default, false, null, M, 24624, 12);
            M = M;
            boolean J = M.J(n) | (i6 == 32);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                x4 = new tn0(8, n, izsVar);
                M.R(x4);
            }
            nvu0.a(a3, f, a2, null, f8s.a.b(n, (izs) x4, null, M, 10), M, 0, 8);
            M.G();
            s3q0 s3q0Var = s3q0.a;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new dke(rwrVar, null);
                M.R(x5);
            }
            bap.g(s3q0Var, (wzs) x5, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.bke
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    eke.this.h(I, (androidx.compose.runtime.a) obj, str, izsVar, q630Var2);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(final int i, androidx.compose.runtime.a aVar, final String str, final izs izsVar, q630 q630Var) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(247725312);
        int i2 = i | (M.J(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(247725312, i3, -1, "com.vk.clips.attachments.impl.publish.links.edit.view.ClipsLinksEditContentView.NameInput (ClipsLinksEditContentView.kt:168)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = or.a(str, 0L, 6, M);
            }
            wh50 wh50Var = (wh50) x;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            hly a2 = h8s.a.a(d370.N(R.string.clips_links_item_from_publication_create_link_url_title, 0, M), false, null, null, null, M, 196608, 30);
            tho0 a3 = tho0.a((tho0) wh50Var.getValue(), str);
            boolean z = (i3 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new defpackage.s(5, izsVar, wh50Var);
                M.R(x2);
            }
            u2x a4 = g8s.b.a.a(s2x.a.C3649a.b(a3, (izs) x2, d370.N(R.string.clips_links_item_from_publication_create_link_url_hint, 0, M), 0L, 0L, new rgy(7), null, null, null, null, false, null, M, 0, 196608, 32632), InputSelect$State.Default, false, null, M, 24624, 12);
            M = M;
            nvu0.a(a4, txj0.f(aVar2, 1.0f), a2, null, null, M, 48, 24);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.cke
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    eke.this.i(I, (androidx.compose.runtime.a) obj, str, izsVar, q630Var2);
                    return s3q0.a;
                }
            };
        }
    }

    public final void j(jke jkeVar, izs<? super uje, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1341784691);
        int i2 = i | (M.J(jkeVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1341784691, i2, -1, "com.vk.clips.attachments.impl.publish.links.edit.view.ClipsLinksEditContentView.ThemedContent (ClipsLinksEditContentView.kt:59)");
            }
            int i3 = (i2 << 3) & 7168;
            jke.c cVar = (jke.c) d(jke.b.a, (n0u0[]) Arrays.copyOf(new n0u0[]{jkeVar.a, jkeVar.b}, 2), M, (((4102 | i3) >> 3) & 896) | 6).getValue();
            float f = 8;
            q630 H = s200.H(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 7);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, 1, hr80.m(H, ylu0Var.getBackground().g, vog0.b(12)));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (cVar instanceof jke.a) {
                M.K(-669113873);
                g((jke.a) cVar, izsVar, null, M, i3 | (i2 & 112) | 4096);
            } else {
                M.K(-672472816);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vy7(i, 2, this, jkeVar, izsVar);
        }
    }
}
