package xsna;

import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.ite;
import xsna.q630;
import xsna.tlo0;

/* compiled from: ClipsPlaylistsFolderNamingContentView.kt */
/* loaded from: classes16.dex */
public final class wse extends ame<ite, jse> {
    public final xqi<ite.a<gte>> f;

    public wse(xqi xqiVar, kse kseVar, Context context, boolean z) {
        super(context, kseVar, z);
        this.f = xqiVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((ite) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(ite.a.C3080a c3080a, izs<? super jse, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1730730818);
        int i2 = i | (M.J(c3080a) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1730730818, i2, -1, "com.vk.clips.playlists.folders.naming.ui.ClipsPlaylistsFolderNamingContentView.Content (ClipsPlaylistsFolderNamingContentView.kt:60)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            wh50 d = jk50.d(c3080a.a, new tho0("", 0L, 6), M, 48);
            yzt0<tlo0> yzt0Var = c3080a.b;
            tlo0.Companion.getClass();
            wh50 d2 = jk50.d(yzt0Var, new tlo0.h(""), M, 0);
            yzt0<Boolean> yzt0Var2 = c3080a.c;
            Boolean bool = Boolean.FALSE;
            vse.a((tho0) d.getValue(), ((tlo0) d2.getValue()).a(context).toString(), ((Boolean) jk50.d(yzt0Var2, bool, M, 48).getValue()).booleanValue(), ((Boolean) jk50.d(c3080a.d, bool, M, 48).getValue()).booleanValue(), ((Boolean) jk50.d(c3080a.f, Boolean.TRUE, M, 48).getValue()).booleanValue(), izsVar, M, (i2 << 12) & 458752);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jqc(i, 1, this, c3080a, izsVar);
        }
    }

    public final void h(ite iteVar, izs<? super jse, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1129386586);
        int i2 = i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1129386586, i2, -1, "com.vk.clips.playlists.folders.naming.ui.ClipsPlaylistsFolderNamingContentView.ThemedContent (ClipsPlaylistsFolderNamingContentView.kt:34)");
            }
            int i3 = i2 & 896;
            ite.a aVar2 = (ite.a) ((zak0) this.f.e).getValue();
            if (aVar2 instanceof ite.a.C3080a) {
                M.K(-779057156);
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
                g((ite.a.C3080a) aVar2, izsVar, M, i3 | (i2 & 112) | 512);
                M.G();
                M.j();
            } else {
                if (!epx.f(aVar2, ite.a.b.a)) {
                    throw alb0.c(-2103343528, M);
                }
                M.K(-2103317378);
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
            s.d = new mt(i, 1, this, iteVar, izsVar);
        }
    }
}
