package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: CommunityProfileContentVideosShimmer.kt */
/* loaded from: classes17.dex */
public final class ylh {

    /* compiled from: CommunityProfileContentVideosShimmer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityProfileContentItem.ContentType.values().length];
            try {
                iArr[CommunityProfileContentItem.ContentType.ITEMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityProfileContentItem.ContentType.ALBUMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityProfileContentItem.ContentType.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i, final int i2, final int i3, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i4;
        q630 q630Var2;
        long j2;
        q630 q630Var3;
        androidx.compose.runtime.f s;
        int i5 = i;
        long j3 = j;
        androidx.compose.runtime.a M = aVar.M(-1799060746);
        if ((i2 & 6) == 0) {
            i4 = (M.o(i5) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.p(j3) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            int i7 = 0;
            if (M.t(i4 & 1, (i4 & 147) == 146)) {
                j2 = j3;
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630.a aVar2 = q630.a.a;
                if (i6 != 0) {
                    q630Var2 = aVar2;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1799060746, i4, -1, "com.vk.community.design.compose.CommunityProfileContentVideosItemsShimmer (CommunityProfileContentVideosShimmer.kt:80)");
                }
                int i8 = 0;
                while (i8 < i5) {
                    q630 f = txj0.f(q630Var2, 1.0f);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    ty6.a aVar3 = dt1.a.n;
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, i7);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, f);
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
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(M, a2, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(M, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(M, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(M, c2678a);
                    int i9 = i8;
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(M, c, dVar);
                    float f2 = 8;
                    q630 d = rte0.d(sua.d(1.78f, txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), false), vog0.b(f2));
                    e.a aVar5 = androidx.compose.ui.graphics.e.a;
                    q630 q630Var4 = q630Var2;
                    f9t.e(hr80.m(d, j3, aVar5), M, 0);
                    q630 E = s200.E(txj0.f(aVar2, 1.0f), 16, 12);
                    androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, E);
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
                    k9q0.w(M, a3, cVar);
                    k9q0.w(M, D2, eVar);
                    ur.d(hashCode2, M, bVar, M, c2678a);
                    k9q0.w(M, c2, dVar);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    float f3 = 24;
                    q630 H = s200.H(new xpy(1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                    androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
                    int hashCode3 = Long.hashCode(n34.n(M));
                    sy90 D3 = M.D();
                    q630 c3 = qri.c(M, H);
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
                    k9q0.w(M, a4, cVar);
                    k9q0.w(M, D3, eVar);
                    ur.d(hashCode3, M, bVar, M, c2678a);
                    k9q0.w(M, c3, dVar);
                    float f4 = 3;
                    f9t.e(hr80.m(rte0.d(txj0.h(txj0.f(aVar2, 1.0f), f2), vog0.b(f4)), j, aVar5), M, 0);
                    f9t.e(hr80.m(rte0.d(txj0.h(txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0.33f), f2), vog0.b(f4)), j, aVar5), M, 0);
                    M.G();
                    f9t.e(hr80.m(rte0.d(txj0.q(aVar2, f3), vog0.a), j, aVar5), M, 0);
                    M.G();
                    M.G();
                    i8 = i9 + 1;
                    i5 = i;
                    j3 = j;
                    i7 = 0;
                    q630Var2 = q630Var4;
                }
                j2 = j3;
                q630Var3 = q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = M.s();
            if (s == null) {
                final long j4 = j2;
                final q630 q630Var5 = q630Var3;
                s.d = new wzs() { // from class: xsna.wlh
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i2 | 1);
                        ylh.a(i, I, i3, j4, (androidx.compose.runtime.a) obj, q630Var5);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        int i72 = 0;
        if (M.t(i4 & 1, (i4 & 147) == 146)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void b(final int i, final int i2, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(392645937);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.p(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(392645937, i3, -1, "com.vk.community.design.compose.CommunityProfileContentVideosMixedShimmer (CommunityProfileContentVideosShimmer.kt:129)");
            }
            ugh.b(q630Var, 142, 1.61f, false, j, kai.c(64146641, new wzs() { // from class: xsna.ulh
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(64146641, intValue, -1, "com.vk.community.design.compose.CommunityProfileContentVideosMixedShimmer.<anonymous> (CommunityProfileContentVideosShimmer.kt:136)");
                        }
                        ylh.a(i, 0, 4, j, aVar2, null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 >> 6) & 14) | 197040 | ((i3 << 9) & 57344), 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vlh
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    ylh.b(i, I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final CommunityProfileContentItem.ContentType contentType, q630 q630Var, int i, int i2, int i3, long j, androidx.compose.runtime.a aVar, final int i4) {
        final q630 q630Var2;
        final int i5;
        final int i6;
        final int i7;
        final long j2;
        long j3;
        int i8;
        int i9;
        q630 q630Var3;
        int i10;
        int i11;
        int i12;
        long j4;
        androidx.compose.runtime.a M = aVar.M(129416655);
        int i13 = 4;
        int i14 = i4 | (M.o(contentType.ordinal()) ? 4 : 2) | 93616;
        if (M.t(i14 & 1, (74899 & i14) != 74898)) {
            M.V();
            if ((i4 & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j3 = ylu0Var.c().a;
                i8 = 7;
                i9 = i14 & (-458753);
                q630Var3 = q630.a.a;
                i10 = 2;
            } else {
                M.h();
                i13 = i;
                i8 = i2;
                i10 = i3;
                j3 = j;
                i9 = i14 & (-458753);
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(129416655, i9, -1, "com.vk.community.design.compose.CommunityProfileContentVideosShimmer (CommunityProfileContentVideosShimmer.kt:51)");
            }
            int i15 = a.$EnumSwitchMapping$0[contentType.ordinal()];
            if (i15 == 1) {
                i11 = i13;
                i12 = i8;
                j4 = j3;
                M.K(-184629621);
                a(i11, 390, 0, j4, M, q630Var3);
                M.j();
            } else if (i15 == 2) {
                i11 = i13;
                i12 = i8;
                j4 = j3;
                M.K(-184622853);
                rgh.a(q630Var3, 1.8f, i12, i10, j4, M, 3510, 0);
                M.j();
            } else {
                if (i15 != 3) {
                    throw alb0.c(-184630266, M);
                }
                M.K(-184612757);
                int i16 = i13;
                long j5 = j3;
                b(i16, 390, j5, M, q630Var3);
                i11 = i16;
                i12 = i8;
                j4 = j5;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            i5 = i11;
            q630Var2 = q630Var3;
            i6 = i12;
            i7 = i10;
            j2 = j4;
        } else {
            M.h();
            q630Var2 = q630Var;
            i5 = i;
            i6 = i2;
            i7 = i3;
            j2 = j;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var2, i5, i6, i7, j2, i4) { // from class: xsna.xlh
                public final /* synthetic */ q630 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ long g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ylh.c(CommunityProfileContentItem.ContentType.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
