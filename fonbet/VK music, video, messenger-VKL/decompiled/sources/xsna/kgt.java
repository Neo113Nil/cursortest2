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
import xsna.dt1;
import xsna.p7t;
import xsna.q630;
import xsna.udt;

/* compiled from: GamesVerticalList.kt */
/* loaded from: classes17.dex */
public final class kgt {
    public static final void a(final udt.h.f fVar, final rha rhaVar, final izs izsVar, final xvy xvyVar, final q630 q630Var, final int i, final int i2, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        int i5;
        udt.h.f fVar2 = fVar;
        rha rhaVar2 = rhaVar;
        izs izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(-1745383906);
        if ((i3 & 6) == 0) {
            i4 = (M.J(fVar2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.J(rhaVar2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.y(izsVar2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= M.J(xvyVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= M.o(i) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= M.o(i2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1745383906, i4, -1, "com.vk.games.presentation.components.sections.GamesGrid (GamesVerticalList.kt:60)");
            }
            ArrayList U0 = j5g.U0(new wow(fVar2.g), i, i, true);
            q630 F = s200.F(kqu0.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var, 1.0f));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(4, dt1.a.l), dt1.a.n, M, 6);
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
            M.K(-1304699039);
            Iterator it = U0.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    e43.t();
                    throw null;
                }
                List list = (List) next;
                q630.a aVar3 = q630.a.a;
                q630 f = txj0.f(aVar3, 1.0f);
                a.l lVar2 = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar2, dt1.a.k, M, 0);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, f);
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
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                M.K(608581751);
                Iterator it2 = list.iterator();
                int i8 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        e43.t();
                        throw null;
                    }
                    h8t h8tVar = (h8t) next2;
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    xpy xpyVar = new xpy(1.0f, true);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode3 = Long.hashCode(n34.n(M));
                    sy90 D3 = M.D();
                    q630 c3 = qri.c(M, xpyVar);
                    cri.h7.getClass();
                    Iterator it3 = it2;
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
                    k9q0.w(M, d, cri.a.f);
                    k9q0.w(M, D3, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c3, cri.a.d);
                    i8t i8tVar = new i8t(i8, i6, p7t.b.a);
                    q630 z = txj0.z(txj0.f(ahn.E(aVar3, "gameItem_" + i2 + '_' + i8), 1.0f), null, 3);
                    boolean z2 = rhaVar2.b;
                    String str = fVar2.e;
                    float f2 = rhaVar2.c;
                    int i10 = i4 & 896;
                    boolean J = (i10 == 256) | M.J(h8tVar);
                    Object x = M.x();
                    Object obj = a.C0011a.a;
                    if (J || x == obj) {
                        i5 = i6;
                        x = new com.vk.catalog2.common.ui.holders.b(13, izsVar2, h8tVar);
                        M.R(x);
                    } else {
                        i5 = i6;
                    }
                    gzs gzsVar = (gzs) x;
                    boolean J2 = (i10 == 256) | M.J(h8tVar);
                    Object x2 = M.x();
                    if (J2 || x2 == obj) {
                        x2 = new com.vk.voip.a(13, izsVar2, h8tVar);
                        M.R(x2);
                    }
                    o7t.e(h8tVar, izsVar2, i8tVar, rhaVar, vbh0.f(z, z2, xvyVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, str, gzsVar, (gzs) x2, 36), M, ((i4 >> 3) & 112) | ((i4 << 6) & 7168));
                    M.G();
                    fVar2 = fVar;
                    rhaVar2 = rhaVar;
                    izsVar2 = izsVar;
                    i4 = i4;
                    aVar3 = aVar3;
                    i8 = i9;
                    it2 = it3;
                    i6 = i5;
                }
                M.j();
                M.G();
                fVar2 = fVar;
                rhaVar2 = rhaVar;
                izsVar2 = izsVar;
                i6 = i7;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.jgt
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    kgt.a(udt.h.f.this, rhaVar, izsVar, xvyVar, q630Var, i, i2, (androidx.compose.runtime.a) obj2, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final udt.h.f fVar, final rha rhaVar, final izs izsVar, final xvy xvyVar, final q630 q630Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a M = aVar.M(-718816049);
        int i3 = i2 | (M.J(fVar) ? 4 : 2) | (M.J(rhaVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(xvyVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192) | (M.o(i) ? 131072 : 65536);
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-718816049, i3, -1, "com.vk.games.presentation.components.sections.GamesVerticalList (GamesVerticalList.kt:38)");
            }
            a(fVar, rhaVar, izsVar, xvyVar, ahn.E(q630Var, "verticalItemList"), vbh0.d(M) ? 2 : 4, i, M, (i3 & 8190) | ((i3 << 3) & 3670016));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(rhaVar, izsVar, xvyVar, q630Var, i, i2) { // from class: xsna.igt
                public final /* synthetic */ rha c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ xvy e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ int g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    kgt.b(udt.h.f.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
