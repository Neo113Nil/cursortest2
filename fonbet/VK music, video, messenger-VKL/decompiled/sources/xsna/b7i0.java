package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.s2x;
import xsna.t2x;

/* compiled from: SelectClickableImpl.kt */
/* loaded from: classes17.dex */
public final class b7i0 extends s2x.b {
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;

    public b7i0() {
        throw null;
    }

    public b7i0(String str, gzs gzsVar, String str2, long j, long j2, frv0 frv0Var, r2x r2xVar, SemanticsConfiguration semanticsConfiguration) {
        this.c = androidx.compose.runtime.k.b(str);
        this.d = androidx.compose.runtime.k.b(gzsVar);
        this.e = androidx.compose.runtime.k.b(str2);
        this.f = zy60.d(j);
        this.g = zy60.d(j2);
        this.h = androidx.compose.runtime.k.b(frv0Var);
        this.i = androidx.compose.runtime.k.b(r2xVar);
        this.j = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.s2x
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1225897784);
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
                androidx.compose.runtime.b.f(1225897784, i2, -1, "com.vk.core.compose.component.input.SelectClickableImpl.Content (SelectClickableImpl.kt:47)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-141445858, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronDown24> (VkSdkIcons.kt:420)");
            }
            lg90 b = or.b(M, -450463739, R.drawable.vk_icon_chevron_down_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            wh50 wh50Var = this.d;
            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
            s1v.k();
            hkg0 a = t2x.b.a.a(b, null, gzsVar, on20.a.a(M), null, M, 196664, 16);
            q630 b2 = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.j).getValue());
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b2);
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
            InputSelect$State inputSelect$State = (InputSelect$State) ((zak0) this.b).getValue();
            boolean b3 = b();
            q630 a2 = o19.a(q630.a.a, b() ? 1.0f : 0.64f);
            s1v.k();
            q630 d2 = rte0.d(a2, vog0.b(on20.c));
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = ir.h(M);
            }
            q630 b4 = ojc.b(d2, (sg50) x, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false), b(), null, (gzs) ((zak0) wh50Var).getValue(), 24);
            s1v.k();
            rqv0.a(inputSelect$State, false, b3, s200.C(b4, on20.f), null, null, null, kai.c(-1854585533, new o5l(1, this, a), M), M, 12582960, 112);
            aVar2 = M;
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
            s.d = new qiz(this, q630Var, i, 2);
        }
    }
}
