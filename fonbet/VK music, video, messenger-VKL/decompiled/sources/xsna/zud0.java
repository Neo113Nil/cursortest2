package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import xsna.q630;

/* compiled from: ProfileContentAudiosShimmer.kt */
/* loaded from: classes5.dex */
public final class zud0 {

    /* compiled from: ProfileContentAudiosShimmer.kt */
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

    public static final void a(final int i, final int i2, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1992651032);
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
                androidx.compose.runtime.b.f(-1992651032, i3, -1, "com.vk.profile.core.tabs.ui.music.CommunityProfileContentAudiosMixedShimmer (ProfileContentAudiosShimmer.kt:65)");
            }
            ugh.b(q630Var, 128, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, j, kai.c(849961800, new wzs() { // from class: xsna.wud0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(849961800, intValue, -1, "com.vk.profile.core.tabs.ui.music.CommunityProfileContentAudiosMixedShimmer.<anonymous> (ProfileContentAudiosShimmer.kt:71)");
                        }
                        ahh.a(null, i, j, 0, false, aVar2, 0, 25);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 >> 6) & 14) | 196656 | ((i3 << 9) & 57344), 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xud0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    zud0.a(i, I, j, (androidx.compose.runtime.a) obj, q630Var);
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
        int i14;
        long j4;
        androidx.compose.runtime.a M = aVar.M(930848173);
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
                i8 = 20;
                i9 = i15 & (-458753);
                q630Var3 = q630.a.a;
                i10 = 7;
                i11 = 2;
            } else {
                M.h();
                i8 = i;
                i10 = i2;
                i11 = i3;
                j3 = j;
                i9 = i15 & (-458753);
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(930848173, i9, -1, "com.vk.profile.core.tabs.ui.music.ProfileContentAudiosShimmer (ProfileContentAudiosShimmer.kt:37)");
            }
            int i16 = a.$EnumSwitchMapping$0[contentType.ordinal()];
            if (i16 == 1) {
                i12 = i8;
                i13 = i11;
                long j5 = j3;
                i14 = i10;
                M.K(1191911950);
                ahh.a(q630Var3, i12, j5, 0, false, M, 54, 24);
                j4 = j5;
                M.j();
            } else if (i16 == 2) {
                i12 = i8;
                j4 = j3;
                M.K(1191918823);
                int i17 = i11;
                rgh.a(q630Var3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i10, i17, j4, M, 3462, 2);
                i14 = i10;
                i13 = i17;
                M.j();
            } else {
                if (i16 != 3) {
                    throw alb0.c(1191911255, M);
                }
                M.K(1191927369);
                int i18 = i8;
                long j6 = j3;
                a(i18, 390, j6, M, q630Var3);
                i12 = i18;
                j4 = j6;
                M.j();
                i14 = i10;
                i13 = i11;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            i5 = i12;
            q630Var2 = q630Var3;
            j2 = j4;
            i6 = i14;
            i7 = i13;
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
            s.d = new wzs(q630Var2, i5, i6, i7, j2, i4) { // from class: xsna.yud0
                public final /* synthetic */ q630 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ long g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    zud0.b(CommunityProfileContentItem.ContentType.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
