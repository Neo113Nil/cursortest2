package xsna;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.playlists.playlist_ui.model.ClipsPlaylistUiLoadingState;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.zzc;

/* compiled from: Content.kt */
/* loaded from: classes16.dex */
public final class zhj {
    public static final void a(final zzc zzcVar, final gzs gzsVar, final q630 q630Var, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1305446548);
        int i2 = i | (M.J(zzcVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.l(z2) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1305446548, i2, -1, "com.vk.clips.playlists.playlist_ui.ui.ClipsPlaylistUiItem (Content.kt:229)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            Configuration configuration = (Configuration) M.r(AndroidCompositionLocals_androidKt.a);
            azl azlVar = (azl) M.r(uvi.h);
            zzc.a aVar2 = zzcVar.b;
            boolean z3 = (aVar2 instanceof zzc.a.C4211a) && (((zzc.a.C4211a) aVar2).a instanceof zzc.b.a);
            s3q0 s3q0Var = s3q0.a;
            boolean J = M.J(azlVar) | ((i2 & 7168) == 2048) | M.y(configuration);
            Object x2 = M.x();
            if (J || x2 == obj) {
                phj phjVar = new phj(z, azlVar, configuration, sg50Var, null);
                M.R(phjVar);
                x2 = phjVar;
            }
            bap.g(s3q0Var, (wzs) x2, M, 6);
            zzc.a aVar3 = zzcVar.b;
            M.K(403724459);
            q630 a = o19.a(q630Var, z3 ? 1.0f : 0.64f);
            if (!z2) {
                a = a.g(ojc.b(q630.a.a, sg50Var, (buw) M.r(cuw.a), false, null, gzsVar, 28));
            }
            M.j();
            a8b0.a(aVar3, z2, a, M, (i2 >> 9) & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(gzsVar, q630Var, z, z2, i) { // from class: xsna.khj
                public final /* synthetic */ gzs c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    zhj.a(zzc.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final List list, final boolean z, final boolean z2, final Integer num, final izs izsVar, final boolean z3, final ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z4;
        boolean z5;
        izs izsVar2;
        a.C0011a.C0012a c0012a;
        s3q0 s3q0Var;
        boolean J;
        Object shjVar;
        a.C0011a.C0012a c0012a2;
        s3q0 s3q0Var2;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(1740832532);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z4 = z;
            i2 |= M.l(z4) ? 32 : 16;
        } else {
            z4 = z;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(num) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.o(clipsPlaylistUiLoadingState == null ? -1 : clipsPlaylistUiLoadingState.ordinal()) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1740832532, i2, -1, "com.vk.clips.playlists.playlist_ui.ui.ClipsPlaylistUiView (Content.kt:80)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (x == c0012a3) {
                x = androidx.compose.runtime.k.d(new wow(list));
                M.R(x);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) x;
            wow wowVar = new wow(list);
            int i5 = i2 & 14;
            boolean z6 = i5 == 4;
            Object x2 = M.x();
            if (z6 || x2 == c0012a3) {
                x2 = new qhj(list, snapshotStateList, null);
                M.R(x2);
            }
            bap.g(wowVar, (wzs) x2, M, i5);
            int i6 = 57344 & i2;
            boolean z7 = i6 == 16384;
            Object x3 = M.x();
            if (z7 || x3 == c0012a3) {
                x3 = new x4a(3, izsVar, snapshotStateList);
                M.R(x3);
            }
            wzs wzsVar = (wzs) x3;
            Object x4 = M.x();
            if (x4 == c0012a3) {
                x4 = new pue(2);
                M.R(x4);
            }
            final zzf0 r = sp.r(wzsVar, null, (wzs) x4, null, M, 384, 58);
            Configuration configuration = (Configuration) M.r(AndroidCompositionLocals_androidKt.a);
            final vtu vtuVar = (vtu) M.r(uvi.l);
            int i7 = i2 & 7168;
            boolean J2 = (i7 == 2048) | M.J(r) | M.y(configuration);
            Object x5 = M.x();
            if (J2) {
                c0012a = c0012a3;
            } else {
                c0012a = c0012a3;
                if (x5 != c0012a) {
                    bap.g(num, (wzs) x5, M, (i2 >> 9) & 14);
                    s3q0Var = s3q0.a;
                    J = ((i2 & 896) != 256) | M.J(r) | (i6 != 16384) | ((i2 & 112) != 32);
                    Object x6 = M.x();
                    if (!J || x6 == c0012a) {
                        a.C0011a.C0012a c0012a4 = c0012a;
                        boolean z8 = z4;
                        c0012a2 = c0012a4;
                        s3q0Var2 = s3q0Var;
                        i3 = i7;
                        shjVar = new shj(r, z2, izsVar, z8, null);
                        M.R(shjVar);
                    } else {
                        shjVar = x6;
                        s3q0Var2 = s3q0Var;
                        i3 = i7;
                        c0012a2 = c0012a;
                    }
                    bap.g(s3q0Var2, (wzs) shjVar, M, 6);
                    q630.a aVar2 = q630.a.a;
                    q630 d = txj0.d(aVar2, 1.0f);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, d);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (M.N() != null) {
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
                    k9q0.w(M, c, cri.a.d);
                    xvy xvyVar = r.o;
                    q630 a2 = q9g.a(txj0.d(n34.t(aVar2, dz5.I(0, 1, M, false), null), 1.0f), 1.0f);
                    if (z3) {
                        a2 = a2.g(yzf0.a(aVar2, r));
                    }
                    q630 E = ahn.E(a2, "PlaylistListInModal");
                    u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    boolean J3 = (i3 == 2048) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576) | M.J(r) | M.y(vtuVar) | (i6 == 16384);
                    Object x7 = M.x();
                    if (J3 || x7 == c0012a2) {
                        i4 = i2;
                        izs izsVar3 = new izs() { // from class: xsna.lhj
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                nvy nvyVar = (nvy) obj;
                                jai jaiVar = ydi.a;
                                boolean z9 = z3;
                                ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState2 = clipsPlaylistUiLoadingState;
                                if (!z9 && (clipsPlaylistUiLoadingState2 == ClipsPlaylistUiLoadingState.TopLoading || clipsPlaylistUiLoadingState2 == ClipsPlaylistUiLoadingState.BothLoading)) {
                                    nvyVar.h(-1, "Loader", jaiVar);
                                }
                                woi woiVar = new woi(1);
                                SnapshotStateList snapshotStateList2 = snapshotStateList;
                                nvyVar.e(snapshotStateList2.size(), new whj(woiVar, snapshotStateList2), new xhj(snapshotStateList2, 0), new jai(2039820996, new yhj(snapshotStateList2, r, num, z9, izsVar, vtuVar), true));
                                if (clipsPlaylistUiLoadingState2 == ClipsPlaylistUiLoadingState.BottomLoading || clipsPlaylistUiLoadingState2 == ClipsPlaylistUiLoadingState.BothLoading) {
                                    nvyVar.h(-2, "Loader", jaiVar);
                                }
                                return s3q0.a;
                            }
                        };
                        izsVar2 = izsVar;
                        M.R(izsVar3);
                        x7 = izsVar3;
                    } else {
                        izsVar2 = izsVar;
                        i4 = i2;
                    }
                    M = M;
                    z5 = z3;
                    lqy.a(E, xvyVar, n, null, null, null, false, null, (izs) x7, M, 384, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                    c(((i4 >> 6) & 896) | ((i4 >> 12) & 112) | 6, M, izsVar2, z5);
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            x5 = new rhj(num, r, configuration, null);
            M.R(x5);
            bap.g(num, (wzs) x5, M, (i2 >> 9) & 14);
            s3q0Var = s3q0.a;
            J = ((i2 & 896) != 256) | M.J(r) | (i6 != 16384) | ((i2 & 112) != 32);
            Object x62 = M.x();
            if (J) {
            }
            a.C0011a.C0012a c0012a42 = c0012a;
            boolean z82 = z4;
            c0012a2 = c0012a42;
            s3q0Var2 = s3q0Var;
            i3 = i7;
            shjVar = new shj(r, z2, izsVar, z82, null);
            M.R(shjVar);
            bap.g(s3q0Var2, (wzs) shjVar, M, 6);
            q630.a aVar22 = q630.a.a;
            q630 d2 = txj0.d(aVar22, 1.0f);
            a.m mVar2 = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar2, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, d2);
            cri.h7.getClass();
            LayoutNode.a aVar32 = cri.a.b;
            if (M.N() != null) {
            }
        } else {
            z5 = z3;
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final boolean z9 = z5;
            final izs izsVar4 = izsVar2;
            s.d = new wzs() { // from class: xsna.mhj
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zhj.b(list, z, z2, num, izsVar4, z9, clipsPlaylistUiLoadingState, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final izs izsVar, boolean z) {
        int i2;
        final boolean z2;
        androidx.compose.runtime.a M = aVar.M(1844561214);
        int i3 = i & 6;
        r9g r9gVar = r9g.a;
        if (i3 == 0) {
            i2 = (M.J(r9gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1844561214, i2, -1, "com.vk.clips.playlists.playlist_ui.ui.ReadyButton (Content.kt:189)");
            }
            q630 z3 = txj0.z(txj0.f(q630.a.a, 1.0f), null, 3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z2 = z;
            mm2.b(r9gVar, z2, hr80.m(z3, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), null, null, null, kai.c(2077509990, new nhj(izsVar, 0), M), M, (i2 & 14) | 1572864 | (i2 & 112), 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ohj
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zhj.c(ne7.I(i | 1), (androidx.compose.runtime.a) obj, izsVar, z2);
                    return s3q0.a;
                }
            };
        }
    }
}
