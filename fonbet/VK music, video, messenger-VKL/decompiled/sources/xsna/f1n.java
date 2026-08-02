package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.generated.VkColorToken;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;

/* compiled from: DisclaimerRulesContent.kt */
/* loaded from: classes17.dex */
public final class f1n {
    public static final void a(int i, androidx.compose.runtime.a aVar, final gzs gzsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1572061633);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1572061633, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.rules.DisclaimerRulesContent (DisclaimerRulesContent.kt:21)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            M.K(933969462);
            s8u0 s8u0Var = new s8u0(0);
            s8u0Var.e(d370.N(R.string.clips_posting_rules_prefix, 0, M));
            s8u0Var.e(" ");
            M.K(933974005);
            String N = d370.N(R.string.clips_posting_rules_link_text, 0, M);
            zqv0 zqv0Var = new zqv0(new klv0(null, VkColorToken.AccentBlue), 14);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new i9z() { // from class: xsna.e1n
                    @Override // xsna.i9z
                    public final void a(q8z q8zVar) {
                        gzs.this.invoke();
                    }
                };
                M.R(x);
            }
            int g = s8u0Var.g(new h2v0(N, zqv0Var, (i9z) x));
            try {
                s8u0Var.e(d370.N(R.string.clips_posting_rules_link_text, 0, M));
                s3q0 s3q0Var = s3q0.a;
                s8u0Var.f(g);
                M.j();
                M.j();
                us2 j = s8u0Var.j(8, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.C0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.d(j, null, ylu0Var.getText().p, 0, null, 0, false, 0, null, null, frv0Var, aVar2, 0, 0, 8186);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } catch (Throwable th) {
                s8u0Var.f(g);
                throw th;
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new n74(q630Var, gzsVar, i, 3);
        }
    }
}
