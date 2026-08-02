package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.generated.VkColorToken;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ReviewCreateReviewBottomBar.kt */
/* loaded from: classes18.dex */
public final class ahg0 {
    public static final void a(boolean z, boolean z2, boolean z3, gzs gzsVar, final gzs gzsVar2, q630 q630Var, String str, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var3;
        q630 q630Var4;
        int i2;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar.M(-1749441817);
        int i3 = i | (M.l(z) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.y(gzsVar) ? 2048 : 1024) | (M.y(gzsVar2) ? 16384 : 8192) | 196608;
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                q630Var3 = q630.a.a;
            } else {
                M.h();
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1749441817, i3, -1, "com.vk.ecomm.design.compose.createreviewbottombar.BottomBar (ReviewCreateReviewBottomBar.kt:42)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var3);
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
            if (z3) {
                M.K(1140871086);
                q630Var4 = q630Var3;
                i2 = 0;
                jqu0.a(null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 15);
                aVar3 = M;
            } else {
                q630Var4 = q630Var3;
                i2 = 0;
                M.K(1139095313);
                aVar3 = M;
            }
            aVar3.j();
            b((i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 384 | (i3 & 7168), aVar3, str, gzsVar, null, z, z2);
            String N = d370.N(R.string.create_review_bottom_bar_publication_rules, i2, aVar3);
            String O = d370.O(R.string.create_review_bottom_bar_note, new Object[]{""}, aVar3);
            int i4 = (aVar3.J(N) ? 1 : 0) | (aVar3.J(O) ? 1 : 0) | ((i3 & 57344) == 16384 ? 1 : i2);
            Object x = aVar3.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            Object obj = x;
            if (i4 != 0 || x == c0012a) {
                s8u0 s8u0Var = new s8u0(i2);
                s8u0Var.e(O);
                int g = s8u0Var.g(new h2v0("create_community_review_agreement", new zqv0(new klv0(null, VkColorToken.TextLink), 14), new i9z() { // from class: xsna.ygg0
                    @Override // xsna.i9z
                    public final void a(q8z q8zVar) {
                        gzs.this.invoke();
                    }
                }));
                try {
                    s8u0Var.e(N);
                    s3q0 s3q0Var = s3q0.a;
                    s8u0Var.f(g);
                    aVar3.R(s8u0Var);
                    obj = s8u0Var;
                } catch (Throwable th) {
                    s8u0Var.f(g);
                    throw th;
                }
            }
            us2 j = ((s8u0) obj).j(8, aVar3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, i2, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.D0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i2, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var.getText().s;
            gcv gcvVar = new gcv(dt1.a.o);
            Object x2 = aVar3.x();
            Object obj2 = x2;
            if (x2 == c0012a) {
                viu viuVar = new viu(17);
                aVar3.R(viuVar);
                obj2 = viuVar;
            }
            float f = 16;
            androidx.compose.runtime.a aVar5 = aVar3;
            yqv0.d(j, s200.H(egi0.b(gcvVar, true, (izs) obj2), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 2), j2, 3, null, 0, false, 0, null, null, frv0Var, aVar5, 0, 0, 8120);
            androidx.compose.runtime.a aVar6 = aVar5;
            aVar6.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var4;
            aVar2 = aVar6;
        } else {
            M.h();
            q630Var2 = q630Var;
            aVar2 = M;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new zgg0(z, z2, z3, gzsVar, gzsVar2, q630Var2, str, i);
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final String str, final gzs gzsVar, q630 q630Var, final boolean z, final boolean z2) {
        int i2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        String a;
        androidx.compose.runtime.a M = aVar.M(-1134548472);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1134548472, i3, -1, "com.vk.ecomm.design.compose.createreviewbottombar.ProgressButton (ReviewCreateReviewBottomBar.kt:96)");
            }
            q630.a aVar3 = q630.a.a;
            q630 E = s200.E(txj0.f(aVar3, 1.0f), 16, 12);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            q630 E2 = ahn.E(txj0.f(aVar3, 1.0f), str);
            if (z2) {
                M.K(1200679088);
                M.j();
                a = "";
            } else {
                a = zq.a(M, 592921238, R.string.create_review_bottom_bar_send_button_label, M, 0);
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, E2, null, z2, false, null, null, null, a, null, null, null, null, z, null, null, null, aVar2, ((i3 >> 9) & 14) | X2.b.f | ((i3 << 18) & 29360128), (i3 << 21) & 29360128, 0, 4058976);
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
            s.d = new wzs() { // from class: xsna.xgg0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ahg0.b(ne7.I(i | 1), (androidx.compose.runtime.a) obj, str, gzsVar, q630Var2, z, z2);
                    return s3q0.a;
                }
            };
        }
    }
}
