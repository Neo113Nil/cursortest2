package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.q630;

/* compiled from: PlaybackQueue.kt */
/* loaded from: classes3.dex */
public abstract class gxa0 {
    public final mtk0<l5g> a;
    public final wh50<Boolean> b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;

    public gxa0(dz40.n nVar, String str, boolean z, boolean z2, boolean z3, mtk0<l5g> mtk0Var, wh50<Boolean> wh50Var) {
        this.a = mtk0Var;
        this.b = wh50Var;
        this.c = androidx.compose.runtime.k.b(nVar);
        this.d = androidx.compose.runtime.k.b(str);
        this.e = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.f = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.g = androidx.compose.runtime.k.b(Boolean.valueOf(z3));
    }

    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1792513036);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1792513036, i, -1, "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue.DefaultSkeletonQueueItem (PlaybackQueue.kt:312)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 16;
            q630 a = wdj0.a(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(txj0.f(aVar2, 1.0f), 60)), null);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 q = txj0.q(aVar2, 48);
            long j = wlb0.h(M).getImage().c;
            tv90 tv90Var = new tv90(6);
            uog0 uog0Var = vog0.a;
            f9t.e(hr80.m(q, j, new uog0(tv90Var, tv90Var, tv90Var, tv90Var)), M, 0);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 H = s200.H(new xpy(1.0f, true), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 H2 = s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            long j2 = wlb0.h(M).getImage().c;
            float f2 = 30;
            tv90 tv90Var2 = new tv90(f2);
            f9t.e(txj0.h(hr80.m(H2, j2, new uog0(tv90Var2, tv90Var2, tv90Var2, tv90Var2)), 12), M, 0);
            q630 H3 = s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, 81, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9);
            long j3 = wlb0.h(M).getImage().c;
            tv90 tv90Var3 = new tv90(f2);
            f9t.e(txj0.h(hr80.m(H3, j3, new uog0(tv90Var3, tv90Var3, tv90Var3, tv90Var3)), 8), M, 0);
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
            s.d = new yg7(this, i, 11);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar, final izs izsVar, xvy xvyVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(809204026);
        if ((i & 6) == 0) {
            i2 = (M.J(xvyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(809204026, i2, -1, "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue.ImmutableQueueItems (PlaybackQueue.kt:260)");
            }
            int i3 = i2 << 6;
            d(h().a(), h().c(), xvyVar, q630Var, null, kai.c(1132583772, new a0t() { // from class: xsna.pwa0
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ((Integer) obj2).getClass();
                    dz40.o oVar = (dz40.o) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 384) == 0) {
                        intValue |= aVar2.J(oVar) ? 256 : 128;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 1153) != 1152)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1132583772, intValue, -1, "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue.ImmutableQueueItems.<anonymous> (PlaybackQueue.kt:267)");
                        }
                        String m = oVar.m();
                        gxa0 gxa0Var = gxa0.this;
                        gya0.a(oVar, epx.f(m, gxa0Var.g()), ((Boolean) ((zak0) gxa0Var.e).getValue()).booleanValue(), ((Boolean) ((zak0) gxa0Var.g).getValue()).booleanValue(), izsVar, ahn.E(q630.a.a, "track"), aVar2, ((intValue >> 6) & 14) | 196608);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, (i3 & 7168) | (i3 & 896) | 196608 | ((i2 << 9) & 3670016));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ake(i, izsVar, xvyVar, q630Var, this);
        }
    }

    public final void c(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final xvy xvyVar, final q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-177392808);
        if ((i & 6) == 0) {
            i2 = (M.J(xvyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-177392808, i3, -1, "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue.MutableQueueItems (PlaybackQueue.kt:150)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.d(new wow(h().a()));
                M.R(x);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) x;
            wow wowVar = new wow(h().a());
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            Object x2 = M.x();
            if (z || x2 == obj) {
                x2 = new ywa0(snapshotStateList, this, null);
                M.R(x2);
            }
            bap.g(wowVar, (wzs) x2, M, 0);
            boolean z2 = (i3 & 112) == 32;
            Object x3 = M.x();
            if (z2 || x3 == obj) {
                x3 = new r85(7, izsVar, snapshotStateList);
                M.R(x3);
            }
            wzs wzsVar = (wzs) x3;
            boolean z3 = i4 == 2048;
            Object x4 = M.x();
            if (z3 || x4 == obj) {
                x4 = new q0r(this, 5);
                M.R(x4);
            }
            final zzf0 r = sp.r(wzsVar, xvyVar, (wzs) x4, null, M, (i3 << 3) & 112, 56);
            if (this.b == null) {
                M.K(-1898485888);
            } else {
                M.K(-1898485887);
                Integer f = r.f();
                boolean J = M.J(r) | (i4 == 2048);
                Object x5 = M.x();
                if (J || x5 == obj) {
                    x5 = new zwa0(r, this, null);
                    M.R(x5);
                }
                bap.g(f, (wzs) x5, M, 0);
            }
            M.j();
            Object x6 = M.x();
            if (x6 == obj) {
                x6 = androidx.compose.runtime.k.b("");
                M.R(x6);
            }
            final wh50 wh50Var = (wh50) x6;
            Boolean valueOf = Boolean.valueOf(i());
            boolean z4 = i4 == 2048;
            Object x7 = M.x();
            if (z4 || x7 == obj) {
                x7 = new axa0(this, wh50Var, null);
                M.R(x7);
            }
            bap.g(valueOf, (wzs) x7, M, 0);
            d(snapshotStateList, h().c(), xvyVar, yzf0.a(q630Var, r), null, kai.c(-1379289606, new a0t() { // from class: xsna.vwa0
                @Override // xsna.a0t
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    int i5;
                    ksy ksyVar = (ksy) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    dz40.o oVar = (dz40.o) obj4;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj5;
                    int intValue2 = ((Integer) obj6).intValue();
                    if ((intValue2 & 6) == 0) {
                        i5 = (aVar2.J(ksyVar) ? 4 : 2) | intValue2;
                    } else {
                        i5 = intValue2;
                    }
                    if ((intValue2 & 48) == 0) {
                        i5 |= aVar2.o(intValue) ? 32 : 16;
                    }
                    if ((intValue2 & 384) == 0) {
                        i5 |= aVar2.J(oVar) ? 256 : 128;
                    }
                    if (aVar2.t(i5 & 1, (i5 & 1171) != 1170)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1379289606, i5, -1, "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue.MutableQueueItems.<anonymous> (PlaybackQueue.kt:191)");
                        }
                        gxa0.this.f(ksyVar, oVar, intValue, r, wh50Var, izsVar, aVar2, (i5 & 14) | 24576 | ((i5 >> 3) & 112) | ((i5 << 3) & 896));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 << 6) & 896) | 196614 | ((i3 << 9) & 3670016));
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wwa0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(i | 1);
                    this.c(I, (androidx.compose.runtime.a) obj2, izsVar, xvyVar, q630Var);
                    return s3q0.a;
                }
            };
        }
    }

    public final void d(final List list, final List list2, final xvy xvyVar, final q630 q630Var, zzs zzsVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        xvy xvyVar2;
        androidx.compose.runtime.a aVar2;
        final zzs zzsVar2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-36342362);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            xvyVar2 = xvyVar;
            i2 |= M.J(xvyVar2) ? 256 : 128;
        } else {
            xvyVar2 = xvyVar;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= M.y(jaiVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.J(this) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            jai c = kai.c(1058789649, new zzs() { // from class: xsna.rwa0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    ((Integer) obj2).getClass();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 129) != 128)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1058789649, intValue, -1, "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue.QueueItems.<anonymous> (PlaybackQueue.kt:286)");
                        }
                        gxa0.this.a(0, aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-36342362, i3, -1, "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue.QueueItems (PlaybackQueue.kt:288)");
            }
            q630 g = ahn.E(q630.a.a, "trackList").g(q630Var);
            boolean z = ((i3 & 14) == 4) | ((458752 & i3) == 131072) | ((i3 & 112) == 32) | ((57344 & i3) == 16384);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                ysq ysqVar = new ysq(list, jaiVar, list2, c, 2);
                jaiVar2 = c;
                M.R(ysqVar);
                x = ysqVar;
            } else {
                jaiVar2 = c;
            }
            aVar2 = M;
            lqy.a(g, xvyVar2, null, null, null, null, false, null, (izs) x, aVar2, (i3 >> 3) & 112, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            zzsVar2 = jaiVar2;
        } else {
            aVar2 = M;
            aVar2.h();
            zzsVar2 = zzsVar;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.swa0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gxa0.this.d(list, list2, xvyVar, q630Var, zzsVar2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.runtime.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5, types: [xsna.spj] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, xsna.jai] */
    public final void e(final dz40.n nVar, final String str, final boolean z, final izs izsVar, final q630 q630Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Integer num;
        boolean z2;
        ?? M = aVar.M(-1933186399);
        if ((i & 6) == 0) {
            i2 = (M.J(nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(jaiVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1933186399, i2, -1, "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue.QueueScaffold (PlaybackQueue.kt:93)");
            }
            boolean z3 = (i2 & 112) == 32;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z3 || x == obj) {
                Iterator it = nVar.a().iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        num = null;
                        i3 = -1;
                        break;
                    }
                    Object next = it.next();
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    num = null;
                    if (epx.f(str, ((dz40.o) next).m())) {
                        break;
                    } else {
                        i3++;
                    }
                }
                Integer valueOf = i3 == -1 ? num : Integer.valueOf(i3);
                x = androidx.compose.runtime.i.a(valueOf != null ? valueOf.intValue() : 0);
                M.R(x);
            } else {
                num = null;
            }
            rg50 rg50Var = (rg50) x;
            xvy a = zvy.a(rg50Var.getIntValue(), 2, M);
            boolean J = M.J(kci.i(a));
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = bbk0.b(new ho0(nVar, z, a));
                M.R(x2);
            }
            mtk0 mtk0Var = (mtk0) x2;
            Boolean bool = (Boolean) mtk0Var.getValue();
            bool.getClass();
            int i4 = i2 & 7168;
            boolean J2 = M.J(mtk0Var) | (i4 == 2048);
            Object x3 = M.x();
            if (J2 || x3 == obj) {
                x3 = new exa0(num, izsVar, mtk0Var);
                M.R(x3);
            }
            bap.g(bool, (wzs) x3, M, 0);
            Boolean valueOf2 = Boolean.valueOf(z);
            boolean J3 = ((i2 & 896) == 256) | M.J(a) | M.J(rg50Var);
            Object x4 = M.x();
            if (J3 || x4 == obj) {
                x4 = new fxa0(z, a, rg50Var, null);
                M.R(x4);
            }
            bap.g(valueOf2, (wzs) x4, M, (i2 >> 6) & 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean z4 = nVar instanceof dz40.n.f;
            q630.a aVar3 = q630.a.a;
            if (z4) {
                M.K(-2040181397);
                dz40.n.f fVar = (dz40.n.f) nVar;
                boolean z5 = fVar.b().b;
                boolean z6 = fVar.b().a;
                boolean z7 = i4 == 2048;
                Object x5 = M.x();
                if (z7 || x5 == obj) {
                    x5 = new lv7(izsVar, 7);
                    M.R(x5);
                }
                z2 = true;
                v0h0.a(3072, M, (gzs) x5, ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 1, aVar3), "playlistCreateButton"), z5, z6);
            } else {
                z2 = true;
                M.K(-2045452265);
            }
            M.j();
            q630 f = txj0.f(aVar3, 1.0f);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            jaiVar.invoke(a, defpackage.j0.d(1.0f, f, z2), M, Integer.valueOf((i2 >> 9) & 896));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.uwa0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    gxa0.this.e(nVar, str, z, izsVar, q630Var, jaiVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void f(final ksy ksyVar, final dz40.o oVar, final int i, final zzf0 zzf0Var, final wh50<String> wh50Var, final izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        gxa0 gxa0Var;
        androidx.compose.runtime.a M = aVar.M(-1802831212);
        if ((i2 & 6) == 0) {
            i3 = (M.J(ksyVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(oVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(zzf0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(wh50Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= M.y(izsVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            gxa0Var = this;
            i3 |= M.J(gxa0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            gxa0Var = this;
        }
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1802831212, i3, -1, "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue.ReorderableItemContent (PlaybackQueue.kt:203)");
            }
            final vtu vtuVar = (vtu) M.r(uvi.l);
            final boolean f = epx.f(oVar.m(), gxa0Var.g());
            final gxa0 gxa0Var2 = gxa0Var;
            vzf0.a(ksyVar, zzf0Var, i, null, false, kai.c(1031199542, new zzs() { // from class: xsna.xwa0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    ((Boolean) obj2).getClass();
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1031199542, intValue, -1, "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue.ReorderableItemContent.<anonymous> (PlaybackQueue.kt:211)");
                        }
                        q630.a aVar3 = q630.a.a;
                        boolean z = f;
                        final gxa0 gxa0Var3 = gxa0Var2;
                        final dz40.o oVar2 = oVar;
                        final izs izsVar2 = izsVar;
                        final zzf0 zzf0Var2 = zzf0Var;
                        final vtu vtuVar2 = vtuVar;
                        Object obj5 = a.C0011a.a;
                        if (z || !((Boolean) ((zak0) gxa0Var3.g).getValue()).booleanValue()) {
                            aVar2.K(-1435447712);
                            wh50 wh50Var2 = gxa0Var3.e;
                            wh50 wh50Var3 = gxa0Var3.g;
                            boolean booleanValue = ((Boolean) ((zak0) wh50Var2).getValue()).booleanValue();
                            boolean booleanValue2 = ((Boolean) ((zak0) wh50Var3).getValue()).booleanValue();
                            aVar2.K(-1154671488);
                            q630 E = ahn.E(aVar3, "track");
                            if (((Boolean) ((zak0) wh50Var3).getValue()).booleanValue()) {
                                boolean y = aVar2.y(vtuVar2) | aVar2.J(izsVar2);
                                Object x = aVar2.x();
                                if (y || x == obj5) {
                                    x = new xq1(vtuVar2, izsVar2);
                                    aVar2.R(x);
                                }
                                E = E.g(e5m.a(aVar3, zzf0Var2, (gzs) x));
                            }
                            aVar2.j();
                            gya0.a(oVar2, z, booleanValue, booleanValue2, izsVar2, E, aVar2, 0);
                            aVar2.j();
                        } else {
                            aVar2.K(-1434681392);
                            q630 f2 = txj0.f(ahn.E(aVar3, "track"), 1.0f);
                            wh50 wh50Var4 = wh50Var;
                            boolean f3 = true ^ epx.f(wh50Var4.getValue(), oVar2.m());
                            boolean J = aVar2.J(izsVar2) | aVar2.J(oVar2);
                            Object x2 = aVar2.x();
                            if (J || x2 == obj5) {
                                x2 = new n0(23, izsVar2, oVar2);
                                aVar2.R(x2);
                            }
                            gzs gzsVar = (gzs) x2;
                            boolean J2 = aVar2.J(wh50Var4) | aVar2.J(oVar2);
                            Object x3 = aVar2.x();
                            if (J2 || x3 == obj5) {
                                x3 = new yq1(15, wh50Var4, oVar2);
                                aVar2.R(x3);
                            }
                            kmn0.b(gzsVar, (gzs) x3, f3, f2, kai.c(-549757518, new zzs() { // from class: xsna.twa0
                                @Override // xsna.zzs
                                public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                                    q630 q630Var = (q630) obj7;
                                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj8;
                                    int intValue2 = ((Integer) obj9).intValue();
                                    if ((intValue2 & 48) == 0) {
                                        intValue2 |= aVar4.J(q630Var) ? 32 : 16;
                                    }
                                    if (aVar4.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-549757518, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue.ReorderableItemContent.<anonymous>.<anonymous> (PlaybackQueue.kt:236)");
                                        }
                                        gxa0 gxa0Var4 = gxa0.this;
                                        boolean booleanValue3 = ((Boolean) ((zak0) gxa0Var4.e).getValue()).booleanValue();
                                        vtu vtuVar3 = vtuVar2;
                                        boolean y2 = aVar4.y(vtuVar3);
                                        izs izsVar3 = izsVar2;
                                        boolean J3 = y2 | aVar4.J(izsVar3);
                                        Object x4 = aVar4.x();
                                        a.C0011a.C0012a c0012a = a.C0011a.a;
                                        if (J3 || x4 == c0012a) {
                                            x4 = new eg1(12, vtuVar3, izsVar3);
                                            aVar4.R(x4);
                                        }
                                        q630 a = e5m.a(q630Var, zzf0Var2, (gzs) x4);
                                        boolean J4 = aVar4.J(gxa0Var4);
                                        Object x5 = aVar4.x();
                                        if (J4 || x5 == c0012a) {
                                            x5 = new f410(gxa0Var4, 21);
                                            aVar4.R(x5);
                                        }
                                        gya0.a(oVar2, false, booleanValue3, true, izsVar3, bu00.c(a, (izs) x5), aVar4, 3120);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar4.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar2), aVar2, 27648);
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, (i3 & 14) | 196608 | ((i3 >> 6) & 112) | (i3 & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qwa0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gxa0.this.f(ksyVar, oVar, i, zzf0Var, wh50Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final String g() {
        return (String) ((zak0) this.d).getValue();
    }

    public final dz40.n h() {
        return (dz40.n) ((zak0) this.c).getValue();
    }

    public final boolean i() {
        return ((Boolean) ((zak0) this.f).getValue()).booleanValue();
    }
}
