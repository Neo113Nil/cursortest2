package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.ebt;
import xsna.q630;

/* compiled from: GamesDetailItemsMapper.kt */
/* loaded from: classes17.dex */
public final class nft {
    public static final void a(final ksy ksyVar, final ebt ebtVar, final xvy xvyVar, final rha rhaVar, final izs<? super mat, s3q0> izsVar, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1964668260);
        if ((i2 & 6) == 0) {
            i3 = (M.J(ksyVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(ebtVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(xvyVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(rhaVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.y(izsVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.o(i) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1964668260, i3, -1, "com.vk.games.presentation.detail.screen.GamesDetailItems (GamesDetailItemsMapper.kt:29)");
            }
            float f = kqu0.r;
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            q630 H2 = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i == 0 ? 4 : 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            if (ebtVar.equals(ebt.b.a)) {
                M.K(-1739396823);
                i6t.a(H2, M, 0);
                M.j();
            } else if (ebtVar.equals(ebt.j.a)) {
                M.K(-1739392340);
                u7t.a(H, M, 0);
                M.j();
            } else if (ebtVar.equals(ebt.g.a)) {
                M.K(-1739387932);
                no50.a(H2, M, 0);
                M.j();
            } else if (ebtVar instanceof ebt.c) {
                M.K(-1739383986);
                cft.a(H2, M, 0);
                M.j();
            } else if (ebtVar instanceof ebt.f) {
                M.K(1913811466);
                mo50.a(((ebt.f) ebtVar).a, rhaVar, izsVar, xvyVar, H2, M, ((i3 >> 6) & 1008) | ((i3 << 3) & 7168));
                M.j();
            } else if (ebtVar instanceof ebt.e) {
                M.K(-1739369165);
                lft.a(((ebt.e) ebtVar).a, null, M, 0);
                M.j();
            } else if (ebtVar instanceof ebt.a) {
                M.K(1914246427);
                e9t.c(((ebt.a) ebtVar).a, izsVar, rhaVar, xvyVar, H2, M, ((i3 >> 9) & 112) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168));
                M.j();
            } else if (ebtVar instanceof ebt.i) {
                M.K(1914603578);
                ebt.i iVar = (ebt.i) ebtVar;
                hgt.a(iVar.a, rhaVar, izsVar, xvyVar, s200.H(ksy.c(ksyVar, aVar2, 7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iVar.b ? 0 : 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, ((i3 >> 6) & 1008) | ((i3 << 3) & 7168));
                M.j();
            } else if (ebtVar instanceof ebt.h) {
                M.K(1915056922);
                ebt.h hVar = (ebt.h) ebtVar;
                hgt.a(hVar.a, rhaVar, izsVar, xvyVar, s200.H(ksy.c(ksyVar, aVar2, 7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hVar.b ? 0 : 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, ((i3 >> 6) & 1008) | ((i3 << 3) & 7168));
                M.j();
            } else if (ebtVar instanceof ebt.d) {
                M.K(1915498114);
                gft.a(((ebt.d) ebtVar).a, rhaVar, izsVar, xvyVar, H2, M, ((i3 >> 6) & 1008) | ((i3 << 3) & 7168));
                M.j();
            } else {
                M.K(1915788956);
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
            s.d = new wzs() { // from class: xsna.mft
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    nft.a(ksy.this, ebtVar, xvyVar, rhaVar, izsVar, i, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
