package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkMiniInfoCell.kt */
/* loaded from: classes17.dex */
public final class b4v0 {
    /* JADX WARN: Removed duplicated region for block: B:110:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final ar20 ar20Var, final MiniInfoCell$Mode miniInfoCell$Mode, q630 q630Var, zq20 zq20Var, br20 br20Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        int i4;
        zq20 zq20Var2;
        int i5;
        int i6;
        br20 br20Var2;
        int i7;
        gzs<s3q0> gzsVar3;
        int i8;
        final gzs<s3q0> gzsVar4;
        br20 br20Var3;
        zq20 zq20Var3;
        androidx.compose.runtime.f s;
        int i9;
        gzs<s3q0> gzsVar5;
        gzs<s3q0> gzsVar6;
        gzs<s3q0> gzsVar7;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1191932194);
        int i10 = (M.J(ar20Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i10 |= M.o(miniInfoCell$Mode.ordinal()) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i10 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i10 |= M.J(q630Var2) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i4 = i10 | 3072;
                zq20Var2 = zq20Var;
            } else {
                zq20 zq20Var4 = zq20Var;
                i4 = i10 | (M.J(zq20Var4) ? 2048 : 1024);
                zq20Var2 = zq20Var4;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i6 = i4 | 24576;
                br20Var2 = br20Var;
            } else {
                br20 br20Var4 = br20Var;
                i6 = i4 | (M.J(br20Var4) ? 16384 : 8192);
                br20Var2 = br20Var4;
            }
            i7 = i2 & 32;
            if (i7 == 0) {
                i6 |= 196608;
            } else if ((196608 & i) == 0) {
                gzsVar3 = gzsVar;
                i6 |= M.y(gzsVar3) ? 131072 : 65536;
                i8 = i2 & 64;
                if (i8 != 0) {
                    i6 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i6 |= M.y(gzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                if (M.t(i6 & 1, (i6 & 599187) != 599186)) {
                    q630.a aVar3 = q630.a.a;
                    if (i11 != 0) {
                        q630Var2 = aVar3;
                    }
                    if (i3 != 0) {
                        zq20Var2 = null;
                    }
                    if (i5 != 0) {
                        br20Var2 = null;
                    }
                    if (i7 != 0) {
                        gzsVar3 = null;
                    }
                    gzs<s3q0> gzsVar8 = i8 != 0 ? null : gzsVar2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1191932194, i6, -1, "com.vk.core.compose.component.cell.miniinfo.VkMiniInfoCell (VkMiniInfoCell.kt:58)");
                    }
                    M.K(-1935547675);
                    vvr vvrVar = (vvr) M.r(uvi.i);
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = ir.h(M);
                    }
                    sg50 sg50Var = (sg50) x;
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        gzsVar5 = gzsVar8;
                        i9 = i6;
                        x2 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                        M.R(x2);
                    } else {
                        i9 = i6;
                        gzsVar5 = gzsVar8;
                    }
                    guw guwVar = (guw) x2;
                    M.K(-1309346537);
                    M.K(-1309353969);
                    q630 f = txj0.f(txj0.j(32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var2), 1.0f);
                    if (((Boolean) ((zak0) ar20Var.c).getValue()).booleanValue()) {
                        boolean y = M.y(vvrVar);
                        Object x3 = M.x();
                        if (y || x3 == c0012a) {
                            x3 = new u5p0(vvrVar, 12);
                            M.R(x3);
                        }
                        f = f.g(x19.R(aVar3, (izs) x3));
                    }
                    M.j();
                    if (gzsVar3 != null || gzsVar5 != null) {
                        q630 a = cuw.a(aVar3, sg50Var, guwVar);
                        if (gzsVar3 == null) {
                            M.K(920711061);
                            Object x4 = M.x();
                            if (x4 == c0012a) {
                                x4 = new gwd0(17);
                                M.R(x4);
                            }
                            M.j();
                            gzsVar6 = (gzs) x4;
                        } else {
                            M.K(306794680);
                            M.j();
                            gzsVar6 = gzsVar3;
                        }
                        if (gzsVar5 == null) {
                            M.K(920771573);
                            Object x5 = M.x();
                            if (x5 == c0012a) {
                                x5 = new vqf0(14);
                                M.R(x5);
                            }
                            M.j();
                            gzsVar7 = (gzs) x5;
                        } else {
                            M.K(306796508);
                            M.j();
                            gzsVar7 = gzsVar5;
                        }
                        f = f.g(ojc.d(a, sg50Var, guwVar, true, null, gzsVar7, gzsVar6, 440));
                    }
                    M.j();
                    q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, f);
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, F);
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
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    if (zq20Var2 == null) {
                        M.K(649105406);
                        M.j();
                        aVar2 = aVar3;
                    } else {
                        M.K(649105407);
                        aVar2 = aVar3;
                        zq20Var2.a(miniInfoCell$Mode, txj0.q(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 20), M, (i9 >> 3) & 14);
                        f9t.e(txj0.v(aVar2, kqu0.v), M, 0);
                        s3q0 s3q0Var = s3q0.a;
                        M.j();
                    }
                    gor0 gor0Var = new gor0(dt1.a.l);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    ar20Var.a(miniInfoCell$Mode, gor0Var.g(new xpy(1.0f, true)), M, ((i9 >> 3) & 14) | ((i9 << 6) & 896));
                    if (br20Var2 == null) {
                        M.K(649642729);
                    } else {
                        M.K(649642730);
                        f9t.e(txj0.v(aVar2, kqu0.v), M, 0);
                        br20Var2.a(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 0);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    M.j();
                    M.G();
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    gzsVar4 = gzsVar5;
                    zq20Var3 = zq20Var2;
                    br20Var3 = br20Var2;
                } else {
                    M.h();
                    gzsVar4 = gzsVar2;
                    zq20Var3 = zq20Var2;
                    br20Var3 = br20Var2;
                }
                final zq20 zq20Var5 = zq20Var3;
                final br20 br20Var5 = br20Var3;
                final gzs<s3q0> gzsVar9 = gzsVar3;
                s = M.s();
                if (s != null) {
                    final q630 q630Var3 = q630Var2;
                    s.d = new wzs() { // from class: xsna.a4v0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            b4v0.a(ar20.this, miniInfoCell$Mode, q630Var3, zq20Var5, br20Var5, gzsVar9, gzsVar4, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            gzsVar3 = gzsVar;
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            if (M.t(i6 & 1, (i6 & 599187) != 599186)) {
            }
            final zq20 zq20Var52 = zq20Var3;
            final br20 br20Var52 = br20Var3;
            final gzs gzsVar92 = gzsVar3;
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        gzsVar3 = gzsVar;
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        if (M.t(i6 & 1, (i6 & 599187) != 599186)) {
        }
        final zq20 zq20Var522 = zq20Var3;
        final br20 br20Var522 = br20Var3;
        final gzs gzsVar922 = gzsVar3;
        s = M.s();
        if (s != null) {
        }
    }
}
