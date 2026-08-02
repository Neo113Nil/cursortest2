package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import java.util.Arrays;
import xsna.cri;
import xsna.dt1;
import xsna.ir5;
import xsna.o2k;
import xsna.q630;
import xsna.yjq0;
import xsna.zjq0;

/* compiled from: UserEditProfileMviView.kt */
/* loaded from: classes5.dex */
public final class siq0 extends i6v0<zjq0, aiq0> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        j((zjq0) ao50Var, izsVar, aVar, 512);
    }

    public final void h(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(1307400050);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1307400050, i, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.UserEditProfileMviView.Loader (UserEditProfileMviView.kt:95)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar.invoke(M, 6);
            zfr0.d(SpinnerState.Loading, ra8.a.b(aVar2, dt1.a.f), null, null, null, 0L, 0L, null, null, M, 6, IronSourceError.ERROR_CODE_INIT_FAILED);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i8c(this, jaiVar, i, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(zjq0.a.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        izs izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(1430241109);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar2) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1430241109, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.UserEditProfileMviView.MainContent (UserEditProfileMviView.kt:152)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 D2 = p490.D(n34.t(txj0.f(aVar2, 1.0f), dz5.I(0, 1, M, false), null), p490.x(M), 14);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            yzt0<Boolean> yzt0Var = bVar.b;
            Boolean bool = Boolean.FALSE;
            wh50 d2 = jk50.d(yzt0Var, bool, M, 48);
            wh50 d3 = jk50.d(bVar.a, Boolean.TRUE, M, 48);
            wh50 d4 = jk50.d(bVar.c, bool, M, 48);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bbk0.b(new bv3(d2, d3, d4, 6));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            ir5 ir5Var = (ir5) jk50.d(bVar.d, new ir5.a(0), M, 0).getValue();
            o2k o2kVar = (o2k) jk50.d(bVar.e, o2k.a.a, M, 48).getValue();
            yjq0.b bVar3 = (yjq0.b) jk50.d(bVar.k, yjq0.b.c, M, 48).getValue();
            boolean J = M.J(d2);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new ajd0(d2, 13);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean J2 = M.J(d3);
            Object x3 = M.x();
            if (J2 || x3 == c0012a) {
                x3 = new vpn0(d3, 4);
                M.R(x3);
            }
            gzs gzsVar2 = (gzs) x3;
            boolean J3 = M.J(d4);
            Object x4 = M.x();
            if (J3 || x4 == c0012a) {
                x4 = new g8n0(d4, 5);
                M.R(x4);
            }
            int i3 = (i2 >> 3) & 14;
            hba0.a(izsVar2, null, gzsVar, gzsVar2, (gzs) x4, ir5Var, o2kVar, bVar3, M, i3);
            fww fwwVar = new fww((String) jk50.d(bVar.f, "", M, 48).getValue(), (String) jk50.d(bVar.g, "", M, 48).getValue(), (String) jk50.d(bVar.i, "", M, 48).getValue());
            yjq0.d dVar2 = (yjq0.d) jk50.d(bVar.l, yjq0.d.c, M, 48).getValue();
            yjq0.f fVar = (yjq0.f) jk50.d(bVar.p, yjq0.f.d, M, 48).getValue();
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new y3l0(mtk0Var, 13);
                M.R(x5);
            }
            cu50.a(fwwVar, dVar2, fVar, izsVar, null, (gzs) x5, M, ((i2 << 6) & 7168) | 196608);
            if (((Boolean) jk50.d(bVar.n, bool, M, 48).getValue()).booleanValue()) {
                M.K(1691698109);
                Object x6 = M.x();
                if (x6 == c0012a) {
                    x6 = new c9m0(mtk0Var, 4);
                    M.R(x6);
                }
                j4s.b((gzs) x6, (yjq0.c) jk50.d(bVar.o, yjq0.c.d, M, 48).getValue(), izsVar, null, M, ((i2 << 3) & 896) | 6);
                izsVar2 = izsVar;
            } else {
                izsVar2 = izsVar;
                M.K(1683227793);
            }
            M.j();
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = new u110(mtk0Var, 22);
                M.R(x7);
            }
            jww.a(i3 | 48, M, (gzs) x7, izsVar2, null);
            M.G();
            if (((Boolean) jk50.d(bVar.j, bool, M, 48).getValue()).booleanValue()) {
                M.K(1381371627);
                d9g0.a(izsVar2, M, i3);
            } else {
                M.K(1372322727);
            }
            M.j();
            if (((Boolean) jk50.d(bVar.m, bool, M, 48).getValue()).booleanValue()) {
                M.K(1381499564);
                vwf0.a(izsVar2, M, i3);
            } else {
                M.K(1372322727);
            }
            M.j();
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
            s.d = new er50(this, bVar, izsVar2, q630Var2, i);
        }
    }

    public final void j(zjq0 zjq0Var, izs<? super aiq0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1869066741);
        int i2 = (M.J(zjq0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1869066741, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.UserEditProfileMviView.ThemedContent (UserEditProfileMviView.kt:58)");
            }
            n0u0[] n0u0VarArr = {zjq0Var.a};
            int i3 = (i2 << 3) & 7168;
            zjq0.a.C4181a c4181a = zjq0.a.C4181a.a;
            zjq0.a aVar2 = (zjq0.a) d(c4181a, (n0u0[]) Arrays.copyOf(n0u0VarArr, 1), M, (((4102 | i3) >> 3) & 896) | 6).getValue();
            if (epx.f(aVar2, c4181a)) {
                M.K(-2095809032);
                M.j();
            } else {
                if (!(aVar2 instanceof zjq0.a.b)) {
                    throw alb0.c(-2095810741, M);
                }
                M.K(-545511526);
                l((zjq0.a.b) aVar2, izsVar, rte0.d(q630.a.a, f5v0.c), M, i3 | (i2 & 112) | 4096);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new an7(i, 9, this, zjq0Var, izsVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0136, code lost:
    
        if (r6 == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(zjq0.a.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(1982201552);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1982201552, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.UserEditProfileMviView.Toolbar (UserEditProfileMviView.kt:110)");
            }
            wh50 d = jk50.d(bVar.b, Boolean.FALSE, M, 48);
            nek0 nek0Var = (nek0) M.r(uvi.q);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
            }
            lg90 b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.user_profile_accessibility_close, 0, M);
            int i3 = i2 & 112;
            boolean J = M.J(nek0Var) | (i3 == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (J || x == c0012a2) {
                x = new com.vk.movika.sdk.base.logic.processor.actions.e(21, nek0Var, izsVar);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            boolean J2 = M.J(d);
            Object x2 = M.x();
            if (J2 || x2 == c0012a2) {
                x2 = new m2l0(d, 8);
                M.R(x2);
            }
            TopBar$Before.e a = TopBar$Before.e.a.a(b, N, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2), M, 1572872, 24);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.user_profile_edit, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1060031380, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DoneOutline28> (VkSdkIcons.kt:712)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_done_outline_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N2 = d370.N(R.string.user_profile_accessibility_save, 0, M);
            boolean J3 = M.J(nek0Var) | (i3 == 32);
            Object x3 = M.x();
            if (J3) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
            }
            x3 = new o7k0(3, nek0Var, izsVar);
            M.R(x3);
            gzs gzsVar2 = (gzs) x3;
            boolean J4 = M.J(d);
            Object x4 = M.x();
            if (J4 || x4 == c0012a) {
                x4 = new r6i0(d, 9);
                M.R(x4);
            }
            com.vk.core.compose.component.topbar.a a4 = d.a.a(d.c.C0760d.a.a(a3, N2, gzsVar2, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 2), M, 1572872, 24), null, null, null, M, 24576, 14);
            q630.a aVar2 = q630.a.a;
            muv0.h(a2, aVar2, null, null, null, a, a4, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8092);
            M = M;
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
            s.d = new eet(this, bVar, izsVar, q630Var2, i, 3);
        }
    }

    public final void l(zjq0.a.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-469784039);
        int i2 = (M.J(bVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= M.y(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-469784039, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.UserEditProfileMviView.UserEditContent (UserEditProfileMviView.kt:76)");
            }
            aVar2 = M;
            phv0.b(q630Var, kai.c(-1303980430, new n87(this, bVar, izsVar, 8), M), null, null, null, 0, 0L, 0L, kai.c(-303314627, new pn1(bVar, izsVar, 1, this), M), aVar2, ((i2 >> 6) & 14) | 805306416, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bkk(this, bVar, izsVar, q630Var, i);
        }
    }
}
