package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.ButtonSize;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.rmw;

/* compiled from: TopshelfCardControls.kt */
/* loaded from: classes2.dex */
public final class wap0 {
    public static final void a(final iap0 iap0Var, final xap0 xap0Var, final jap0 jap0Var, final boolean z, final gzs gzsVar, final gzs gzsVar2, final q630 q630Var, final rv5 rv5Var, androidx.compose.runtime.a aVar, final int i) {
        iap0 iap0Var2;
        int i2;
        gzs gzsVar3;
        rv5 rv5Var2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(210566401);
        if ((i & 6) == 0) {
            iap0Var2 = iap0Var;
            i2 = (M.J(iap0Var2) ? 4 : 2) | i;
        } else {
            iap0Var2 = iap0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(xap0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(jap0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            gzsVar3 = gzsVar;
            i2 |= M.y(gzsVar3) ? 16384 : 8192;
        } else {
            gzsVar3 = gzsVar;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(gzsVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(q630Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            rv5Var2 = rv5Var;
            i2 |= M.J(rv5Var2) ? 8388608 : 4194304;
        } else {
            rv5Var2 = rv5Var;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(210566401, i3, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.controls.Buttons (TopshelfCardControls.kt:66)");
            }
            tap0 tap0Var = jap0Var.e;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(tap0Var.a);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            M.K(-823062217);
            if (z) {
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630Var2 = new xpy(1.0f, true);
            } else {
                q630Var2 = q630.a.a;
            }
            c(iap0Var2, jap0Var, z, gzsVar3, q630Var2, rv5Var2, M, ((i3 >> 3) & 8176) | (458752 & (i3 >> 6)));
            M.j();
            if (xap0Var == null) {
                M.K(-822562126);
            } else {
                M.K(-822562125);
                int i4 = i3 >> 9;
                d(xap0Var, jap0Var, gzsVar2, null, rv5Var, M, ((i3 >> 3) & 112) | (i4 & 896) | (i4 & 57344));
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
            s.d = new wzs() { // from class: xsna.uap0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wap0.a(iap0.this, xap0Var, jap0Var, z, gzsVar, gzsVar2, q630Var, rv5Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(xap0 xap0Var, jap0 jap0Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        int i3;
        long c;
        int i4;
        float f;
        androidx.compose.runtime.a M = aVar.M(-1827121669);
        if ((i & 6) == 0) {
            i2 = (M.J(xap0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(jap0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 256 : 128;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1827121669, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.controls.MilkshakeSecondaryIconButton (TopshelfCardControls.kt:282)");
            }
            hbp0 hbp0Var = jap0Var.e.d;
            lgu0 b = hr80.z().b(hbp0Var.b, hbp0Var.c, M, 0);
            uog0 b2 = vog0.b(hbp0Var.e);
            float w = hr80.z().w(hbp0Var.a, M, 0);
            String a = xap0Var.b.a(0, M);
            wh50 d = ((mgu0) b).d(true, M, 0);
            hap0 hap0Var = hbp0Var.d;
            M.K(-972455135);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-972455135, 0, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.controls.resolveColor (TopshelfCardControls.kt:341)");
            }
            if (hap0Var == null) {
                long j = l5g.j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                i3 = i2;
                c = j;
            } else {
                i3 = i2;
                c = l5g.c(14, hap0Var.a.a(0, M), 0.24f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            q630 q = txj0.q(q630Var, w);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q);
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
            k9q0.w(M, c2, cri.a.d);
            ra8 ra8Var = ra8.a;
            q630.a aVar4 = q630.a.a;
            q630 m = hr80.m(rte0.d(ra8Var.a(aVar4), b2), c, androidx.compose.ui.graphics.e.a);
            if (hap0Var != null) {
                f = hap0Var.b;
                i4 = 0;
            } else {
                i4 = 0;
                f = 0;
            }
            if (pco.a(f, i4) > 0) {
                m = kh7.a(m, f, c);
            }
            ja8.a(m, M, i4);
            aVar2 = M;
            nzu0.c(gzsVar2, rmw.b.a(null, xap0Var.a, M, i4, 3), a, rte0.d(ra8Var.a(aVar4), b2), w, ((l5g) d.getValue()).a, true, null, true, null, null, aVar2, ((i3 >> 6) & 14) | 1572928, 1664);
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
            s.d = new vrx(xap0Var, jap0Var, gzsVar, q630Var, i);
        }
    }

    public static final void c(final iap0 iap0Var, final jap0 jap0Var, boolean z, final gzs gzsVar, final q630 q630Var, final rv5 rv5Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z2;
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1439770507);
        if ((i & 6) == 0) {
            i2 = (M.J(iap0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(jap0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(rv5Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1439770507, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.controls.PrimaryButton (TopshelfCardControls.kt:130)");
            }
            dbp0 dbp0Var = jap0Var.e.c;
            ButtonSize buttonSize = dbp0Var.a;
            String a = iap0Var.a.a(0, M);
            M.K(-1634793172);
            M.j();
            M.K(-1632849192);
            aVar2 = M;
            bhu0.e(gzsVar2, buttonSize, dbp0Var.b, dbp0Var.c, txj0.h(q630Var, hr80.z().w(buttonSize, M, 0)), null, false, false, rmw.b.a(null, iap0Var.b, M, 0, 3), null, null, a, null, null, null, null, true, rv5Var, a, null, aVar2, ((i2 >> 9) & 14) | 1073741824, (i2 << 9) & 234881024, 0, 3272160);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final boolean z3 = z2;
            s.d = new wzs() { // from class: xsna.vap0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wap0.c(iap0.this, jap0Var, z3, gzsVar, q630Var, rv5Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(xap0 xap0Var, jap0 jap0Var, gzs gzsVar, q630 q630Var, rv5 rv5Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs gzsVar2;
        jap0 jap0Var2;
        xap0 xap0Var2;
        androidx.compose.runtime.a M = aVar.M(-1463675143);
        if ((i & 6) == 0) {
            i2 = (M.J(xap0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(jap0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= M.J(rv5Var) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1463675143, i3, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.controls.SecondaryIconButton (TopshelfCardControls.kt:205)");
            }
            M.K(-1836766182);
            q630.a aVar2 = q630.a.a;
            gzsVar2 = gzsVar;
            b(xap0Var, jap0Var, gzsVar2, aVar2, M, i3 & 8190);
            xap0Var2 = xap0Var;
            jap0Var2 = jap0Var;
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            gzsVar2 = gzsVar;
            jap0Var2 = jap0Var;
            xap0Var2 = xap0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b4c(xap0Var2, jap0Var2, gzsVar2, q630Var, rv5Var, i);
        }
    }

    public static final void e(xap0 xap0Var, tbp0 tbp0Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1643581882);
        int i2 = i | (M.J(xap0Var) ? 4 : 2) | (M.J(tbp0Var) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1643581882, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.controls.TopshelfTopEndButton (TopshelfCardControls.kt:108)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, tbp0Var.c, tbp0Var.d, tbp0Var.e, txj0.q(q630Var, tbp0Var.a), null, false, false, rmw.b.a(null, xap0Var.a, M, 0, 3), null, new pco(tbp0Var.b), null, null, null, null, null, true, null, xap0Var.b.a(0, M), null, aVar2, ((i2 >> 6) & 14) | 1073741824, 0, 0, 3536352);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new xw(i, 2, xap0Var, tbp0Var, gzsVar, q630Var);
        }
    }
}
