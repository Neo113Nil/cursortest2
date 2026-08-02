package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dnn0;
import xsna.dt1;
import xsna.h3v;
import xsna.q630;
import xsna.qco0;

/* compiled from: HideAppContentView.kt */
/* loaded from: classes15.dex */
public final class k3v extends i6v0<l3v, x2v> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((l3v) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(h3v.a aVar, izs<? super x2v, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-1272326875);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1272326875, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.settings.modal.hide_content.HideAppContentView.MainScreen (HideAppContentView.kt:58)");
            }
            yzt0<Boolean> yzt0Var = aVar.a;
            Boolean bool = Boolean.FALSE;
            boolean booleanValue = ((Boolean) jk50.d(yzt0Var, bool, M, 48).getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) jk50.d(aVar.b, bool, M, 48).getValue()).booleanValue();
            boolean booleanValue3 = ((Boolean) jk50.d(aVar.c, bool, M, 48).getValue()).booleanValue();
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            q630 f = txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 1.0f);
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            dsn.a(f, ylu0Var.p().a, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 8);
            M = M;
            plg0 plg0Var = new plg0(0);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new qhf(izsVar, 3);
                M.R(x);
            }
            q630 a2 = d1p0.a(aVar3, booleanValue, false, plg0Var, (izs) x, 10);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new oc0(24);
                M.R(x2);
            }
            wiu0.c(qco0.a.a(100663296, 254, M, d370.N(R.string.bl_hide_push_info_title, 0, M), null), egi0.b(a2, true, (izs) x2), null, dnn0.a.a(booleanValue, M), M, 0, 4);
            plg0 plg0Var2 = new plg0(0);
            boolean z2 = i3 == 32;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new nsh(izsVar, 1);
                M.R(x3);
            }
            q630 a3 = d1p0.a(aVar3, booleanValue2, false, plg0Var2, (izs) x3, 10);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new bz(27);
                M.R(x4);
            }
            wiu0.c(qco0.a.a(100663296, 250, M, d370.N(R.string.bl_hide_app_content_title, 0, M), d370.N(R.string.bl_hide_app_content_subtitle, 0, M)), egi0.b(a3, true, (izs) x4), null, dnn0.a.a(booleanValue2, M), M, 0, 4);
            f9t.e(txj0.h(aVar3, 8), M, 6);
            if (booleanValue3) {
                M.K(-1468027878);
                String N = d370.N(R.string.bl_screenshots_unavailable_title, 0, M);
                String N2 = d370.N(R.string.bl_screenshots_unavailable_description, 0, M);
                String N3 = d370.N(R.string.bl_clearly, 0, M);
                Object x5 = M.x();
                if (x5 == c0012a) {
                    x5 = new g8(27);
                    M.R(x5);
                }
                izs izsVar2 = (izs) x5;
                boolean z3 = i3 == 32;
                Object x6 = M.x();
                if (z3 || x6 == c0012a) {
                    x6 = new c97(izsVar, 5);
                    M.R(x6);
                }
                p7u0.e(N, N2, N3, izsVar2, (gzs) x6, null, null, null, null, null, null, null, null, M, 3072, 0, 8160);
                M = M;
            } else {
                M.K(-1472126605);
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
            s.d = new zle(i, 2, this, aVar, izsVar);
        }
    }

    public final void i(l3v l3vVar, izs<? super x2v, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1953818634);
        int i2 = (M.J(l3vVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1953818634, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.settings.modal.hide_content.HideAppContentView.ThemedContent (HideAppContentView.kt:46)");
            }
            int i3 = i2 & 896;
            wh50 d = d(h3v.b.a, new n0u0[]{l3vVar.a}, M, 518 | i3);
            if (((h3v) d.getValue()) instanceof h3v.a) {
                M.K(814403431);
                h((h3v.a) ((h3v) d.getValue()), izsVar, M, (i2 & 112) | 512 | i3);
            } else {
                M.K(812524056);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a9c(this, l3vVar, izsVar, i, 2);
        }
    }
}
