package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import java.util.Arrays;
import xsna.cri;
import xsna.dt1;
import xsna.gnd;
import xsna.q630;

/* compiled from: ClipsCoauthorsSelectorContentView.kt */
/* loaded from: classes16.dex */
public final class and extends ame<gnd, vmd> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((gnd) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(final gnd.a aVar, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        final q630 q630Var2;
        q630.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(2053371298);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2053371298, i2, -1, "com.vk.clips.coauthors.selector.ui.ClipsCoauthorsSelectorContentView.FullscreenLoader (ClipsCoauthorsSelectorContentView.kt:86)");
            }
            boolean z = aVar instanceof gnd.a.b;
            q630.a aVar4 = q630.a.a;
            if (z || (aVar instanceof gnd.a.c) || (aVar instanceof gnd.a.d)) {
                aVar3 = aVar4;
                M.K(1899842790);
                M.j();
            } else {
                if (!(aVar instanceof gnd.a.C2950a)) {
                    throw alb0.c(1899837534, M);
                }
                M.K(-1234318467);
                SpinnerState spinnerState = (SpinnerState) jk50.a(((gnd.a.C2950a) aVar).h, M, 0, 3).getValue();
                if (spinnerState == null) {
                    M.K(-1234259320);
                    M.j();
                    aVar3 = aVar4;
                } else {
                    M.K(-1234259319);
                    q630 d = txj0.d(aVar4, 1.0f);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, d);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d2, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    aVar3 = aVar4;
                    zfr0.d(spinnerState, ra8.a.b(aVar4, dt1.a.f), null, null, null, 0L, 0L, null, null, M, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
                    M.G();
                    boolean o = M.o(spinnerState.ordinal()) | ((i2 & 112) == 32);
                    Object x = M.x();
                    if (o || x == a.C0011a.a) {
                        x = new zmd(spinnerState, izsVar, null);
                        M.R(x);
                    }
                    bap.g(spinnerState, (wzs) x, M, 0);
                    M.j();
                    s3q0 s3q0Var = s3q0.a;
                }
                M.j();
            }
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
            s.d = new wzs() { // from class: xsna.ymd
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    and.this.g(aVar, izsVar, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void h(gnd gndVar, izs<? super vmd, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1845161513);
        int i2 = 2;
        int i3 = i | (M.J(gndVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        int i4 = 1;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1845161513, i3, -1, "com.vk.clips.coauthors.selector.ui.ClipsCoauthorsSelectorContentView.ThemedContent (ClipsCoauthorsSelectorContentView.kt:44)");
            }
            int i5 = (i3 << 3) & 7168;
            gnd.a aVar3 = (gnd.a) d(gnd.a.c.a, (n0u0[]) Arrays.copyOf(new n0u0[]{gndVar.d, gndVar.b, gndVar.a, gndVar.c}, 4), M, (((4102 | i5) >> 3) & 896) | 6).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 12;
            aVar2 = M;
            phv0.b(rte0.d(q630.a.a, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), kai.c(-1715607227, new x7d(1, aVar3, izsVar), M), kai.c(-1637486138, new bc1(i2, aVar3, izsVar), M), null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(917908368, new tp7(i4, aVar3, izsVar), M), aVar2, 805306800, 376);
            g(aVar3, izsVar, null, M, i5 | (i3 & 112) | 4096);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xmd(i, 0, this, gndVar, izsVar);
        }
    }
}
