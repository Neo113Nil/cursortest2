package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.DropdownSide;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.s2x;

/* compiled from: SelectImpl.kt */
/* loaded from: classes17.dex */
public final class u8i0 extends s2x.b {
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;

    public u8i0() {
        throw null;
    }

    public u8i0(String str, boolean z, izs izsVar, String str2, r2x r2xVar, long j, long j2, frv0 frv0Var, SemanticsConfiguration semanticsConfiguration, jai jaiVar) {
        this.c = androidx.compose.runtime.k.b(str);
        this.d = androidx.compose.runtime.k.b(izsVar);
        this.e = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.f = androidx.compose.runtime.k.b(str2);
        this.g = androidx.compose.runtime.k.b(r2xVar);
        this.h = androidx.compose.runtime.k.b(Boolean.FALSE);
        this.i = androidx.compose.runtime.k.b(jaiVar);
        this.j = zy60.d(j);
        this.k = zy60.d(j2);
        this.l = androidx.compose.runtime.k.b(frv0Var);
        this.m = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.s2x
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        wh50 wh50Var;
        uog0 d;
        androidx.compose.runtime.a M = aVar.M(-246456536);
        if ((i & 6) == 0) {
            i2 = i | (M.J(q630Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-246456536, i2, -1, "com.vk.core.compose.component.input.SelectImpl.Content (SelectImpl.kt:65)");
            }
            wh50 wh50Var2 = this.e;
            Boolean bool = (Boolean) ((zak0) wh50Var2).getValue();
            boolean booleanValue = bool.booleanValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1696619747, 384, -1, "com.vk.core.compose.component.input.InputSelect.Right.AnimatedChevronIcon.Companion.invoke (InputSelect.kt:73)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-580324014, 6, -1, "com.vk.core.compose.component.input.remember (AnimatedChevronIconImpl.kt:56)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new mh2(booleanValue);
                M.R(x);
            }
            mh2 mh2Var = (mh2) x;
            ((zak0) mh2Var.b).setValue(bool);
            ((zak0) mh2Var.c).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var3 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.i.a(0);
                M.R(x3);
            }
            rg50 rg50Var = (rg50) x3;
            float j1 = ((azl) M.r(uvi.h)).j1(rg50Var.getIntValue());
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.m).getValue());
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            InputSelect$State inputSelect$State = (InputSelect$State) ((zak0) this.b).getValue();
            boolean booleanValue2 = ((Boolean) ((zak0) wh50Var2).getValue()).booleanValue();
            boolean b2 = b();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new gqe0(rg50Var, 2);
                M.R(x4);
            }
            q630.a aVar3 = q630.a.a;
            q630 a2 = o19.a(egi.o(aVar3, (izs) x4), b() ? 1.0f : 0.64f);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x5;
            boolean b3 = b();
            plg0 plg0Var = new plg0(6);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x6 = M.x();
            if (z || x6 == c0012a) {
                x6 = new cf00(this, 24);
                M.R(x6);
            }
            q630 b4 = ojc.b(a2, sg50Var, null, b3, plg0Var, (gzs) x6, 8);
            s1v.k();
            rqv0.a(inputSelect$State, booleanValue2, b2, s200.C(b4, on20.f), ((Boolean) wh50Var3.getValue()).booleanValue() ? DropdownSide.Above : DropdownSide.Bottom, null, null, kai.c(-1440946525, new np7(2, this, mh2Var), M), M, 12582912, 96);
            boolean booleanValue3 = ((Boolean) ((zak0) wh50Var2).getValue()).booleanValue();
            boolean z2 = i3 == 32;
            Object x7 = M.x();
            if (z2 || x7 == c0012a) {
                x7 = new b290(this, 15);
                M.R(x7);
            }
            gzs gzsVar = (gzs) x7;
            q630 j = txj0.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 500, 1, txj0.v(aVar3, j1));
            Object x8 = M.x();
            if (x8 == c0012a) {
                wh50Var = wh50Var3;
                x8 = new oeg0(1, wh50Var);
                M.R(x8);
            } else {
                wh50Var = wh50Var3;
            }
            izs izsVar = (izs) x8;
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                M.K(-299715449);
                s1v.k();
                float f = on20.c;
                s1v.k();
                d = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                M.j();
            } else {
                M.K(-299490079);
                s1v.k();
                float f2 = on20.c;
                s1v.k();
                d = vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 3);
                M.j();
            }
            oqu0.a(100666368, 0L, M, kai.c(1961776617, new ryq(this, 1), M), gzsVar, izsVar, j, null, d, booleanValue3);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jt7(this, q630Var, i, 1);
        }
    }

    public final void c(spg0 spg0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(948599316);
        if ((i & 6) == 0) {
            i2 = (M.J(spg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(948599316, i2, -1, "com.vk.core.compose.component.input.SelectImpl.ClearIcon (SelectImpl.kt:158)");
            }
            dt1.a.getClass();
            q630 H = s200.H(spg0Var.a(q630.a.a, dt1.a.l), kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
            }
            lg90 b = or.b(M, 1833859693, R.drawable.vk_icon_cancel_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            s1v.k();
            on20 on20Var = on20.a;
            boolean z = true;
            long i4 = sd9.i(M);
            String N = d370.N(R.string.vk_accessibility_clear_input, 0, M);
            if ((i2 & 112) != 32) {
                z = false;
            }
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new f540(this, 24);
                M.R(x);
            }
            i3 = 2;
            aVar2 = M;
            nzu0.c((gzs) x, b, N, H, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i4, false, null, false, null, null, aVar2, 64, 2000);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            i3 = 2;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ofj(this, spg0Var, i, i3);
        }
    }
}
