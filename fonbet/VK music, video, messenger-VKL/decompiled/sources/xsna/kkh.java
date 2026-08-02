package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import xsna.q630;

/* compiled from: CommunityProfileContentPhotosShimmer.kt */
/* loaded from: classes5.dex */
public final class kkh {

    /* compiled from: CommunityProfileContentPhotosShimmer.kt */
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

    public static final void a(final int i, final int i2, final int i3, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1044550318);
        if ((i3 & 6) == 0) {
            i4 = (M.o(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.o(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.p(j) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1044550318, i4, -1, "com.vk.profile.core.tabs.ui.photos.CommunityProfileContentPhotosMixedShimmer (CommunityProfileContentPhotosShimmer.kt:67)");
            }
            ugh.b(q630Var, 142, 1.32f, false, j, kai.c(-1192158798, new wzs() { // from class: xsna.hkh
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1192158798, intValue, -1, "com.vk.profile.core.tabs.ui.photos.CommunityProfileContentPhotosMixedShimmer.<anonymous> (CommunityProfileContentPhotosShimmer.kt:74)");
                        }
                        ygh.a(null, i, i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, aVar2, 0, 41);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i4 >> 9) & 14) | 197040 | ((i4 << 6) & 57344), 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ikh
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i3 | 1);
                    kkh.a(i, i2, I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final CommunityProfileContentItem.ContentType contentType, q630 q630Var, int i, int i2, int i3, long j, androidx.compose.runtime.a aVar, final int i4) {
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
        int i13;
        long j4;
        int i14;
        androidx.compose.runtime.a M = aVar.M(76904415);
        int i15 = i4 | (M.o(contentType.ordinal()) ? 4 : 2) | 93616;
        if (M.t(i15 & 1, (74899 & i15) != 74898)) {
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
                i8 = i15 & (-458753);
                i9 = 2;
                q630Var3 = q630.a.a;
                i10 = 7;
                i11 = 3;
            } else {
                M.h();
                i10 = i;
                i11 = i2;
                i9 = i3;
                j3 = j;
                i8 = i15 & (-458753);
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(76904415, i8, -1, "com.vk.profile.core.tabs.ui.photos.CommunityProfileContentPhotosShimmer (CommunityProfileContentPhotosShimmer.kt:35)");
            }
            int i16 = a.$EnumSwitchMapping$0[contentType.ordinal()];
            if (i16 == 1) {
                i12 = i10;
                i13 = i11;
                j4 = j3;
                i14 = i9;
                M.K(890715664);
                ygh.a(q630Var3, i12, i13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j4, false, M, 438, 40);
                M = M;
                M.j();
            } else if (i16 == 2) {
                int i17 = i10;
                i13 = i11;
                j4 = j3;
                M.K(890725349);
                int i18 = i9;
                rgh.a(q630Var3, 1.32f, i17, i18, j4, M, 3510, 0);
                i12 = i17;
                i14 = i18;
                M.j();
            } else {
                if (i16 != 3) {
                    throw alb0.c(890713911, M);
                }
                M.K(890736597);
                int i19 = i10;
                int i20 = i11;
                long j5 = j3;
                a(i19, i20, 3126, j5, M, q630Var3);
                i12 = i19;
                i13 = i20;
                j4 = j5;
                M.j();
                i14 = i9;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            i6 = i13;
            q630Var2 = q630Var3;
            i5 = i12;
            j2 = j4;
            i7 = i14;
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
            s.d = new wzs(q630Var2, i5, i6, i7, j2, i4) { // from class: xsna.jkh
                public final /* synthetic */ q630 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ long g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    kkh.b(CommunityProfileContentItem.ContentType.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
