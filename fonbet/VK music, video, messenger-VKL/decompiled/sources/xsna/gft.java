package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.djc;
import xsna.dt1;
import xsna.mat;
import xsna.p7t;
import xsna.q630;

/* compiled from: GamesCategoryDetailHolder.kt */
/* loaded from: classes17.dex */
public final class gft {
    public static final void a(qka qkaVar, rha rhaVar, izs izsVar, xvy xvyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(938470829);
        if ((i & 6) == 0) {
            i2 = (M.J(qkaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rhaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(xvyVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(938470829, i2, -1, "com.vk.games.presentation.components.GamesCategoryDetailHolder (GamesCategoryDetailHolder.kt:35)");
            }
            boolean d = vbh0.d(M);
            q630 f = txj0.f(q630Var, 1.0f);
            if (d) {
                M.K(2042729723);
                d(qkaVar.a, rhaVar, izsVar, xvyVar, f, M, i2 & 8176);
                M.j();
            } else {
                M.K(2042983551);
                c(qkaVar.a, rhaVar, izsVar, xvyVar, f, M, i2 & 8176);
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
            s.d = new a9t(qkaVar, rhaVar, izsVar, xvyVar, q630Var, i, 1);
        }
    }

    public static final void b(final List list, final int i, final rha rhaVar, final izs izsVar, final xvy xvyVar, q630 q630Var, final int i2, androidx.compose.runtime.a aVar, final int i3) {
        final q630 q630Var2;
        rha rhaVar2 = rhaVar;
        androidx.compose.runtime.a M = aVar.M(1047771241);
        int i4 = (i3 & 6) == 0 ? (M.J(list) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i4 |= M.o(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.J(rhaVar2) ? 256 : 128;
        }
        int i5 = 2048;
        if ((i3 & 3072) == 0) {
            i4 |= M.y(izsVar) ? 2048 : 1024;
        }
        xvy xvyVar2 = xvyVar;
        if ((i3 & 24576) == 0) {
            i4 |= M.J(xvyVar2) ? 16384 : 8192;
        }
        int i6 = i4 | 196608;
        if ((1572864 & i3) == 0) {
            i6 |= M.o(i2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i6 & 1, (599187 & i6) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1047771241, i6, -1, "com.vk.games.presentation.components.ItemsRow (GamesCategoryDetailHolder.kt:125)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(hVar, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a2 = yu50.a(M, c, cri.a.d, 1296806543, list);
            final int i7 = 0;
            while (a2.hasNext()) {
                Object next = a2.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    e43.t();
                    throw null;
                }
                final h8t h8tVar = (h8t) next;
                int i9 = i6 & 7168;
                boolean J = (i9 == i5) | M.J(h8tVar) | M.o(i7);
                Object x = M.x();
                Object obj = a.C0011a.a;
                if (J || x == obj) {
                    x = new izs() { // from class: xsna.eft
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            izs.this.invoke(new mat.e(new djc.b(h8tVar.d, Integer.valueOf(i7), null, null)));
                            return s3q0.a;
                        }
                    };
                    M.R(x);
                }
                izs izsVar2 = (izs) x;
                int i10 = i6;
                i8t i8tVar = new i8t(i7, 0, p7t.b.a);
                q630 E = ahn.E(aVar2, "gameItem_" + i2 + '_' + i7);
                q630.a aVar4 = aVar2;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 g = E.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                boolean z = rhaVar2.b;
                float f2 = rhaVar2.c;
                boolean J2 = (i9 == 2048) | M.J(h8tVar);
                Object x2 = M.x();
                if (J2 || x2 == obj) {
                    x2 = new xq1(7, izsVar, h8tVar);
                    M.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                boolean J3 = (i9 == 2048) | M.J(h8tVar);
                Object x3 = M.x();
                if (J3 || x3 == obj) {
                    x3 = new n0(16, izsVar, h8tVar);
                    M.R(x3);
                }
                o7t.e(h8tVar, izsVar2, i8tVar, rhaVar2, vbh0.f(g, z, xvyVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, null, gzsVar, (gzs) x3, 52), M, (i10 << 3) & 7168);
                rhaVar2 = rhaVar;
                xvyVar2 = xvyVar;
                i5 = 2048;
                aVar2 = aVar4;
                i7 = i8;
                i6 = i10;
            }
            q630.a aVar5 = aVar2;
            M.j();
            M.K(1296846659);
            int size = i - list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                f9t.e(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 0);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar5;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.fft
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    gft.b(list, i, rhaVar, izsVar, xvyVar, q630Var2, i2, (androidx.compose.runtime.a) obj2, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(ArrayList arrayList, rha rhaVar, izs izsVar, xvy xvyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-187845382);
        if ((i & 6) == 0) {
            i2 = (M.J(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        rha rhaVar2 = rhaVar;
        if ((i & 48) == 0) {
            i2 |= M.J(rhaVar2) ? 32 : 16;
        }
        izs izsVar2 = izsVar;
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar2) ? 256 : 128;
        }
        xvy xvyVar2 = xvyVar;
        if ((i & 3072) == 0) {
            i2 |= M.J(xvyVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-187845382, i2, -1, "com.vk.games.presentation.components.LandscapeLayout (GamesCategoryDetailHolder.kt:95)");
            }
            ArrayList U0 = j5g.U0(new wow(arrayList), 4, 4, true);
            q630 F = s200.F(kqu0.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var, 1.0f));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            M.K(1035016202);
            Iterator it = U0.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                List list = (List) next;
                int i5 = i2 << 3;
                b(list, 4, rhaVar2, izsVar2, xvyVar2, null, i3, M, (i5 & 896) | 48 | (i5 & 7168) | (i5 & 57344));
                rhaVar2 = rhaVar;
                izsVar2 = izsVar;
                xvyVar2 = xvyVar;
                i3 = i4;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xg7(arrayList, rhaVar, izsVar, xvyVar, q630Var, i);
        }
    }

    public static final void d(ArrayList arrayList, rha rhaVar, izs izsVar, xvy xvyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(249910732);
        if ((i & 6) == 0) {
            i2 = (M.J(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        rha rhaVar2 = rhaVar;
        if ((i & 48) == 0) {
            i2 |= M.J(rhaVar2) ? 32 : 16;
        }
        izs izsVar2 = izsVar;
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar2) ? 256 : 128;
        }
        xvy xvyVar2 = xvyVar;
        if ((i & 3072) == 0) {
            i2 |= M.J(xvyVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(249910732, i2, -1, "com.vk.games.presentation.components.PhonePortraitLayout (GamesCategoryDetailHolder.kt:67)");
            }
            ArrayList U0 = j5g.U0(new wow(arrayList), 2, 2, true);
            q630 F = s200.F(kqu0.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var, 1.0f));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            M.K(455841638);
            Iterator it = U0.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                List list = (List) next;
                int i5 = i2 << 3;
                b(list, 2, rhaVar2, izsVar2, xvyVar2, null, i3, M, (i5 & 896) | 48 | (i5 & 7168) | (i5 & 57344));
                rhaVar2 = rhaVar;
                izsVar2 = izsVar;
                xvyVar2 = xvyVar;
                i3 = i4;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dft(arrayList, rhaVar, izsVar, xvyVar, q630Var, i);
        }
    }
}
