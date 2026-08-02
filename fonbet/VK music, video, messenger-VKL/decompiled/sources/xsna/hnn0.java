package xsna;

import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Switch.kt */
/* loaded from: classes11.dex */
public final class hnn0 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final aak0<Float> f;

    static {
        float f2 = vnn0.g;
        a = f2;
        b = vnn0.n;
        c = vnn0.m;
        float f3 = vnn0.j;
        d = f3;
        e = (f3 - f2) / 2;
        f = new aak0<>();
    }

    public static final void a(boolean z, izs izsVar, q630 q630Var, boolean z2, cnn0 cnn0Var, sg50 sg50Var, androidx.compose.runtime.a aVar, int i) {
        boolean z3;
        int i2;
        boolean z4;
        androidx.compose.runtime.a aVar2;
        sg50 sg50Var2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-263339167);
        if ((i & 6) == 0) {
            z3 = z;
            i2 = (M.l(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            z4 = z2;
            i3 |= M.l(z4) ? 16384 : 8192;
        } else {
            z4 = z2;
        }
        if ((196608 & i) == 0) {
            i3 |= M.J(cnn0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.J(sg50Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-263339167, i4, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
            }
            if (sg50Var == null) {
                M.K(1768604058);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = ir.h(M);
                }
                M.j();
                sg50Var2 = (sg50) x;
            } else {
                M.K(334145757);
                M.j();
                sg50Var2 = sg50Var;
            }
            if (izsVar != null) {
                icv icvVar = zax.a;
                q630Var2 = zr20.a.g(new b1p0(z3, sg50Var2, false, z4, new plg0(2), izsVar));
            } else {
                q630Var2 = q630.a.a;
            }
            q630 g = q630Var.g(q630Var2);
            dt1.a.getClass();
            int i5 = i4 << 3;
            int i6 = i4 >> 6;
            aVar2 = M;
            b(txj0.n(txj0.B(g, dt1.a.f, 2), c, d), z, z2, cnn0Var, sg50Var2, p6j0.a(vnn0.e, M), aVar2, (i5 & 112) | (i6 & 896) | (i6 & 7168) | (i5 & 57344));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new pve0(z, izsVar, q630Var, z2, cnn0Var, sg50Var, i);
        }
    }

    public static final void b(final q630 q630Var, final boolean z, final boolean z2, final cnn0 cnn0Var, final wax waxVar, final r5j0 r5j0Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Throwable th;
        long j;
        long j2;
        long j3;
        androidx.compose.runtime.a M = aVar.M(-670917213);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(cnn0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(waxVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(r5j0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-670917213, i2, -1, "androidx.compose.material3.SwitchImpl (Switch.kt:143)");
            }
            if (!z2) {
                th = null;
                j = z ? cnn0Var.j : cnn0Var.n;
            } else if (z) {
                th = null;
                j = cnn0Var.b;
            } else {
                th = null;
                j = cnn0Var.f;
            }
            long j4 = z2 ? z ? cnn0Var.a : cnn0Var.e : z ? cnn0Var.i : cnn0Var.m;
            r5j0 a2 = p6j0.a(vnn0.l, M);
            float f2 = vnn0.k;
            if (z2) {
                j2 = j4;
                j3 = z ? cnn0Var.c : cnn0Var.g;
            } else {
                j2 = j4;
                j3 = z ? cnn0Var.k : cnn0Var.o;
            }
            q630 m = hr80.m(r18.a(f2, j3, q630Var, a2), j, a2);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int m2 = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw th;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            q630 m3 = hr80.m(cuw.a(ra8.a.b(q630.a.a, dt1.a.e).g(new fso0(waxVar, z, lb30.a(MotionSchemeKeyTokens.FastSpatial, M))), waxVar, ilg0.a(vnn0.i / 2, 4)), j2, r5j0Var);
            cp10 d3 = ja8.d(dt1.a.f, false);
            int m4 = n34.m(M);
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, m3);
            if (M.N() == null) {
                n34.r();
                throw th;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D2, eVar);
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m4))) {
                kr.a(m4, M, m4, bVar);
            }
            k9q0.w(M, c3, dVar);
            M.K(1236071411);
            M.j();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.gnn0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hnn0.b(q630.this, z, z2, cnn0Var, waxVar, r5j0Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
