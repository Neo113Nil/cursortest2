package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vkontakte.android.R;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: BasicTooltip.kt */
/* loaded from: classes11.dex */
public final class ru6 {
    public static final void a(fxb0 fxb0Var, jai jaiVar, h6p0 h6p0Var, jai jaiVar2, androidx.compose.runtime.a aVar, int i) {
        fxb0 fxb0Var2;
        int i2;
        wh50 wh50Var;
        androidx.compose.runtime.a M = aVar.M(-1221877520);
        if ((i & 6) == 0) {
            fxb0Var2 = fxb0Var;
            i2 = (M.J(fxb0Var2) ? 4 : 2) | i;
        } else {
            fxb0Var2 = fxb0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(h6p0Var) : M.y(h6p0Var) ? 256 : 128;
        }
        int i3 = i & 3072;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= M.l(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.l(true) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.l(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.y(jaiVar2) ? 67108864 : 33554432;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (38347923 & i4) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1221877520, i4, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int m = n34.m(M);
            sy90 D = M.D();
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m))) {
                kr.a(m, M, m, bVar);
            }
            k9q0.w(M, c, cri.a.d);
            if (h6p0Var.isVisible()) {
                M.K(-1891243071);
                wh50Var = wh50Var2;
                b(fxb0Var2, h6p0Var, yvjVar, false, wh50Var, jaiVar, M, ((i4 << 15) & 3670016) | (i4 & 14) | 196608 | ((i4 >> 3) & 112) | ((i4 >> 6) & 896));
                M.j();
            } else {
                wh50Var = wh50Var2;
                M.K(-1890863476);
                M.j();
            }
            c(h6p0Var, wh50Var, jaiVar2, M, ((i4 >> 18) & 14) | 384 | ((i4 >> 3) & 112) | ((i4 >> 12) & 7168) | (57344 & (i4 << 3)) | ((i4 >> 9) & 458752));
            M.G();
            boolean z = (i4 & 896) == 256 || ((i4 & 512) != 0 && M.y(h6p0Var));
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new x7(h6p0Var, 10);
                M.R(x3);
            }
            bap.c(h6p0Var, (izs) x3, M, (i4 >> 6) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gu6(fxb0Var, jaiVar, h6p0Var, jaiVar2, i);
        }
    }

    public static final void b(final fxb0 fxb0Var, final h6p0 h6p0Var, final yvj yvjVar, final boolean z, final wh50 wh50Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1413720282);
        if ((i & 6) == 0) {
            i2 = (M.J(fxb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(h6p0Var) : M.y(h6p0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(yvjVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(wh50Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(jaiVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1413720282, i2, -1, "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.kt:169)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1282333990, 6, -1, "androidx.compose.material3.internal.BasicTooltipStrings.description (BasicTooltip.android.kt:25)");
            }
            String N = d370.N(R.string.tooltip_description, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean y = ((i2 & 896) == 256) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && M.y(h6p0Var))) | M.y(yvjVar) | ((458752 & i2) == 131072);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new ry3(h6p0Var, yvjVar, wh50Var, 1);
                M.R(x);
            }
            nb2.a(fxb0Var, (gzs) x, new gxb0(z, SecureFlagPolicy.Inherit, true), kai.c(-1287705660, new lu6(N, jaiVar), M), M, (i2 & 14) | 3072, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.hu6
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ru6.b(fxb0.this, h6p0Var, yvjVar, z, wh50Var, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(h6p0 h6p0Var, wh50 wh50Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1873232064);
        if ((i & 6) == 0) {
            i2 = (M.l(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(h6p0Var) : M.y(h6p0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(wh50Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(false) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(jaiVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1873232064, i2, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:146)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1966841262, 6, -1, "androidx.compose.material3.internal.BasicTooltipStrings.label (BasicTooltip.android.kt:23)");
            }
            String N = d370.N(R.string.tooltip_label, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 p = sdi.p(fvr.u(skn0.b(skn0.b(aVar2, h6p0Var, new nu6(h6p0Var)), h6p0Var, new ou6(h6p0Var)).g(new ri90(new jh3(N, yvjVar, h6p0Var, 1))), new gb(3, yvjVar, h6p0Var)), new qu6(h6p0Var, wh50Var));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int m = n34.m(M);
            sy90 D = M.D();
            q630 c = qri.c(M, p);
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
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m))) {
                kr.a(m, M, m, bVar);
            }
            k9q0.w(M, c, cri.a.d);
            if (er.f((i2 >> 15) & 14, M, jaiVar)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new iu6(h6p0Var, wh50Var, jaiVar, i);
        }
    }
}
