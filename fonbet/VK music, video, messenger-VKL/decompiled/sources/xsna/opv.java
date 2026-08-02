package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;

/* compiled from: IconButton.kt */
/* loaded from: classes11.dex */
public final class opv {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final jai jaiVar, final gzs gzsVar, lpv lpvVar, final q630 q630Var, r5j0 r5j0Var, final boolean z) {
        final lpv lpvVar2;
        final r5j0 r5j0Var2;
        int i2;
        int i3;
        r5j0 a;
        int i4;
        lpv lpvVar3;
        androidx.compose.runtime.a M = aVar.M(1413012038);
        int i5 = i | (M.y(gzsVar) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.l(z) ? 256 : 128) | 91136;
        if (M.t(i5 & 1, (599187 & i5) != 599186)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1037266503, 6, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:42)");
                }
                long j = ((l5g) M.r(zfj.a)).a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-561618718, 6, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
                }
                t7g t7gVar = (t7g) M.r(u7g.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                lpv lpvVar4 = t7gVar.Y;
                if (lpvVar4 == null) {
                    long j2 = l5g.j;
                    i2 = -465921;
                    lpvVar4 = new lpv(j2, j, j2, l5g.c(14, j, hpk0.a));
                    t7gVar.Y = lpvVar4;
                } else {
                    i2 = -465921;
                }
                long j3 = lpvVar4.b;
                if (l5g.d(j3, j)) {
                    i3 = i5;
                } else {
                    long c = l5g.c(14, j, hpk0.a);
                    i3 = i5;
                    lpvVar4 = new lpv(lpvVar4.a, j != 16 ? j : j3, lpvVar4.c, c != 16 ? c : lpvVar4.d);
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-377108005, 6, -1, "androidx.compose.material3.IconButtonDefaults.<get-standardShape> (IconButtonDefaults.kt:849)");
                }
                a = p6j0.a(i3k0.b, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i4 = i3 & i2;
                lpvVar3 = lpvVar4;
            } else {
                M.h();
                i4 = i5 & (-465921);
                lpvVar3 = lpvVar;
                a = r5j0Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1413012038, i4, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
            }
            r5j0 r5j0Var3 = a;
            b((i4 & 896) | ((i4 >> 3) & 14) | ((i4 << 3) & 112) | 1769472, M, jaiVar, gzsVar, lpvVar3, q630Var, r5j0Var3, z);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            r5j0Var2 = r5j0Var3;
            lpvVar2 = lpvVar3;
        } else {
            M.h();
            lpvVar2 = lpvVar;
            r5j0Var2 = r5j0Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, jaiVar, gzsVar, lpvVar2, q630Var, r5j0Var2, z) { // from class: xsna.mpv
                public final /* synthetic */ gzs b;
                public final /* synthetic */ q630 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ lpv e;
                public final /* synthetic */ r5j0 f;
                public final /* synthetic */ jai g;

                {
                    this.b = gzsVar;
                    this.c = q630Var;
                    this.d = z;
                    this.e = lpvVar2;
                    this.f = r5j0Var2;
                    this.g = jaiVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    opv.a(ne7.I(1572865), (androidx.compose.runtime.a) obj, this.g, this.b, this.e, this.c, this.f, this.d);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final jai jaiVar, final gzs gzsVar, final lpv lpvVar, final q630 q630Var, final r5j0 r5j0Var, final boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1134296466);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(r5j0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(lpvVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(jaiVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1134296466, i3, -1, "androidx.compose.material3.IconButtonImpl (IconButton.kt:171)");
            }
            M.K(977045485);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            M.j();
            icv icvVar = zax.a;
            q630 g = q630Var.g(zr20.a);
            float f = i3k0.c;
            q630 f2 = kn4.f(ojc.b(hr80.m(rte0.d(txj0.r(byc0.b(i3k0.d + f + f, i3k0.a), g), r5j0Var), z ? lpvVar.a : lpvVar.c, r5j0Var), sg50Var, ilg0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7), z, new plg0(0), gzsVar, 8));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int m = n34.m(M);
            sy90 D = M.D();
            q630 c = qri.c(M, f2);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m))) {
                kr.a(m, M, m, bVar);
            }
            k9q0.w(M, c, cri.a.d);
            rvi.a(vcl0.b(z ? lpvVar.b : lpvVar.d, zfj.a), jaiVar, M, ((i3 >> 15) & 112) | 8);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.npv
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    opv.b(ne7.I(i | 1), (androidx.compose.runtime.a) obj, jaiVar, gzsVar, lpvVar, q630Var, r5j0Var, z);
                    return s3q0.a;
                }
            };
        }
    }
}
