package xsna;

import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import xsna.q630;

/* compiled from: CommunityProfileContentClipsShimmer.kt */
/* loaded from: classes5.dex */
public final class ngh {

    /* compiled from: CommunityProfileContentClipsShimmer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityProfileContentItem.ContentType.values().length];
            try {
                iArr[CommunityProfileContentItem.ContentType.MIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final int i, final int i2, final int i3, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i4;
        androidx.compose.runtime.a M = aVar.M(-764626794);
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
                androidx.compose.runtime.b.f(-764626794, i4, -1, "com.vk.profile.core.tabs.ui.clips.CommunityProfileContentClipsMixedShimmer (CommunityProfileContentClipsShimmer.kt:56)");
            }
            ugh.b(q630Var, 150, 2.68f, false, j, kai.c(-1748015050, new wzs() { // from class: xsna.lgh
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1748015050, intValue, -1, "com.vk.profile.core.tabs.ui.clips.CommunityProfileContentClipsMixedShimmer.<anonymous> (CommunityProfileContentClipsShimmer.kt:64)");
                        }
                        ygh.a(null, i, i2, 0.57f, j, false, aVar2, 3072, 33);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i4 >> 9) & 14) | 200112 | ((i4 << 6) & 57344), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mgh
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i3 | 1);
                    ngh.a(i, i2, I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final CommunityProfileContentItem.ContentType contentType, q630 q630Var, int i, int i2, long j, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        final q630 q630Var2;
        final int i5;
        final int i6;
        final long j2;
        long j3;
        int i7;
        int i8;
        q630 q630Var3;
        int i9;
        int i10;
        long j4;
        androidx.compose.runtime.a M = aVar.M(-1016313266);
        if ((i3 & 6) == 0) {
            i4 = i3 | (M.o(contentType.ordinal()) ? 4 : 2);
        } else {
            i4 = i3;
        }
        int i11 = i4 | 11696;
        if (M.t(i11 & 1, (i11 & 9363) != 9362)) {
            M.V();
            if ((i3 & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j3 = ylu0Var.c().a;
                i7 = 3;
                i8 = i11 & (-57345);
                q630Var3 = q630.a.a;
                i9 = 7;
            } else {
                M.h();
                i9 = i;
                i7 = i2;
                j3 = j;
                i8 = i11 & (-57345);
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1016313266, i8, -1, "com.vk.profile.core.tabs.ui.clips.CommunityProfileContentClipsShimmer (CommunityProfileContentClipsShimmer.kt:31)");
            }
            if (a.$EnumSwitchMapping$0[contentType.ordinal()] == 1) {
                M.K(-1719459517);
                q630 q630Var4 = q630Var3;
                int i12 = i9;
                int i13 = i7;
                j4 = j3;
                a(i12, i13, 3126, j4, M, q630Var4);
                i10 = i13;
                i9 = i12;
                q630Var3 = q630Var4;
                M.j();
            } else {
                i10 = i7;
                long j5 = j3;
                M.K(-1719451057);
                ygh.a(q630Var3, i9, i10, 0.57f, j5, false, M, 3510, 32);
                j4 = j5;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
            i5 = i9;
            i6 = i10;
            j2 = j4;
        } else {
            M.h();
            q630Var2 = q630Var;
            i5 = i;
            i6 = i2;
            j2 = j;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.kgh
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ngh.b(CommunityProfileContentItem.ContentType.this, q630Var2, i5, i6, j2, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
