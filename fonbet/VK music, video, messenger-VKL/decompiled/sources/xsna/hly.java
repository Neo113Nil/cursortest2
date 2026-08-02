package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.i8s;
import xsna.q630;
import xsna.ty6;

/* compiled from: LabelImpl.kt */
/* loaded from: classes17.dex */
public final class hly implements h8s {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public hly(String str, boolean z, i8s.b bVar, i8s.a aVar, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(bVar);
        this.d = androidx.compose.runtime.k.b(aVar);
        this.e = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.h8s
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        hly hlyVar;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-820715584);
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
                androidx.compose.runtime.b.f(-820715584, i2, -1, "com.vk.core.compose.component.form.LabelImpl.Content (LabelImpl.kt:39)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.e).getValue());
            rdi.u();
            q630 b2 = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hn20.f, 1, b);
            rdi.u();
            q630 H = s200.H(b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hn20.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            wh50 wh50Var = this.b;
            boolean booleanValue = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
            wh50 wh50Var2 = this.a;
            if (booleanValue) {
                M.K(-639658083);
                str = d370.O(R.string.vk_form_field_required_field_title_description, new Object[]{(String) ((zak0) wh50Var2).getValue()}, M);
                M.j();
            } else {
                M.K(-639488575);
                M.j();
                str = (String) ((zak0) wh50Var2).getValue();
            }
            tpg0 tpg0Var = tpg0.a;
            q630.a aVar4 = q630.a.a;
            q630 b3 = tpg0Var.b(1.0f, aVar4, true);
            float f = kqu0.r;
            q630 H2 = s200.H(b3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            float f2 = f;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            boolean J = M.J(str);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new zl1(str, 3);
                M.R(x);
            }
            q630 b4 = egi0.b(aVar4, false, (izs) x);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, b4);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar2, M, c2678a);
            k9q0.w(M, c3, dVar);
            String str2 = (String) ((zak0) wh50Var2).getValue();
            q630 b5 = tpg0Var.b(1.0f, aVar4, false);
            rdi.u();
            M.K(908647608);
            if (androidx.compose.runtime.b.d()) {
                i4 = -1;
                androidx.compose.runtime.b.f(908647608, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeFormFieldDefaults.labelTextColor (MilkshakeFormFieldDefaults.kt:28)");
            } else {
                i4 = -1;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, i4, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().r;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            rdi.u();
            M.K(-1095975078);
            if (androidx.compose.runtime.b.d()) {
                i5 = -1;
                i6 = 0;
                androidx.compose.runtime.b.f(-1095975078, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeFormFieldDefaults.labelTextStyle (MilkshakeFormFieldDefaults.kt:25)");
            } else {
                i5 = -1;
                i6 = 0;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, i6, i5, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            iyk0 iyk0Var2 = rrv0.c;
            wuv0 wuv0Var = (wuv0) M.r(iyk0Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            int i7 = i5;
            i3 = i6;
            yqv0.c(str2, b5, j, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, 100663296, 48, 5880);
            M = M;
            if (((Boolean) ((zak0) wh50Var).getValue()).booleanValue()) {
                M.K(899223025);
                q630 H3 = s200.H(aVar4, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                f2 = f2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i3, i7, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var2.getText().k;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, i3, i7, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.Y;
                aVar2 = aVar4;
                yqv0.c("*", H3, j2, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, M, 6, 0, 8184);
                M = M;
            } else {
                aVar2 = aVar4;
                M.K(896117166);
            }
            M.j();
            M.G();
            hlyVar = this;
            i8s.b bVar3 = (i8s.b) ((zak0) hlyVar.c).getValue();
            if (bVar3 == null) {
                M.K(-902530795);
                M.j();
            } else {
                M.K(663622764);
                ((fly) bVar3).a(s200.H(tpg0Var.a(aVar2, dt1.a.l), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), M, i3);
                M.j();
                s3q0 s3q0Var = s3q0.a;
            }
            M.G();
            i8s.a aVar5 = (i8s.a) ((zak0) hlyVar.d).getValue();
            if (aVar5 == null) {
                M.K(-637802455);
                M.j();
            } else {
                M.K(810709720);
                aVar5.a(aVar2, M, 6);
                M.j();
                s3q0 s3q0Var2 = s3q0.a;
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            hlyVar = this;
            i3 = 0;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gly(hlyVar, q630Var, i, i3);
        }
    }
}
