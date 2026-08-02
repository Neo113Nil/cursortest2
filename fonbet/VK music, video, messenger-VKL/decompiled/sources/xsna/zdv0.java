package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.design.compose.user.ViewType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkProfileFriendsInfo.kt */
/* loaded from: classes5.dex */
public final class zdv0 {

    /* compiled from: VkProfileFriendsInfo.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.ONE_LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.MULTILINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.FIND_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final us2 us2Var, final us2 us2Var2, final boolean z, final ViewType viewType, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        u890 u890Var;
        q630.a aVar2;
        int i3;
        float f;
        float f2;
        androidx.compose.runtime.a M = aVar.M(-1112826345);
        int i4 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i4 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(us2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(us2Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.o(viewType.ordinal()) ? 16384 : 8192;
        }
        int i5 = i2 | 196608;
        if (M.t(i5 & 1, (74899 & i5) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1112826345, i5, -1, "com.vk.profile.design.compose.user.BlockText (VkProfileFriendsInfo.kt:121)");
            }
            q630.a aVar3 = q630.a.a;
            q630 b = tpg0Var.b(1.0f, aVar3, true);
            boolean z2 = us2Var2 != null;
            int i6 = i5 >> 6;
            int i7 = i6 & 112;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1872179924, i7, -1, "com.vk.profile.design.compose.user.textPadding (VkProfileFriendsInfo.kt:161)");
            }
            if (z2) {
                u890Var = new u890(16, z ? 11 : 12, (float) 5.5d, z ? 10 : 14);
            } else {
                float f3 = 18;
                u890Var = new u890(16, f3, (float) 5.5d, f3);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 C = s200.C(b, u890Var);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, C);
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
            yqv0.d(us2Var, null, 0L, 0, null, 0, false, 0, null, null, null, M, (i5 >> 3) & 14, 0, 16382);
            M = M;
            if (us2Var2 != null) {
                M.K(-1157132434);
                int i8 = a.$EnumSwitchMapping$0[viewType.ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        f2 = 2;
                    } else {
                        if (i8 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f2 = 3;
                    }
                    f = f2;
                    i3 = 0;
                } else {
                    i3 = 0;
                    f = 0;
                }
                f9t.e(txj0.h(aVar3, f), M, i3);
                aVar2 = aVar3;
                yqv0.d(us2Var2, null, 0L, 0, null, 0, false, 0, null, null, null, M, i6 & 14, 0, 16382);
            } else {
                aVar2 = aVar3;
                M.K(-1161105611);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wdv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zdv0.a(us2.this, us2Var2, z, viewType, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final us2 us2Var, final us2 us2Var2, final Integer num, final ViewType viewType, final List list, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        int i2;
        int i3;
        int i4;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-692216933);
        int i5 = i | (M.J(us2Var) ? 4 : 2) | (M.J(us2Var2) ? 32 : 16) | (M.J(num) ? 256 : 128) | (M.o(viewType.ordinal()) ? 2048 : 1024) | (M.J(list) ? 16384 : 8192) | 196608;
        if (M.t(i5 & 1, (74899 & i5) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-692216933, i5, -1, "com.vk.profile.design.compose.user.UserFriendsContent (VkProfileFriendsInfo.kt:79)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
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
            if (num != null) {
                M.K(-53056945);
                float f = 16;
                aVar2 = aVar3;
                q630 q = txj0.q(s200.H(aVar3, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 4), 28);
                lg90 a3 = pg90.a(num.intValue(), (i5 >> 6) & 14, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i4 = 0;
                i2 = -1;
                i3 = 1;
                pzu0.b(a3, null, q, ylu0Var.getIcon().a, M, 440, 0);
            } else {
                i2 = -1;
                i3 = 1;
                i4 = 0;
                aVar2 = aVar3;
                M.K(-55742909);
            }
            M.j();
            int i6 = i5 << 3;
            int i7 = i4;
            int i8 = i3;
            int i9 = i2;
            q630.a aVar5 = aVar2;
            a(us2Var, us2Var2, num != null ? i3 : i4, viewType, null, M, (i6 & 57344) | (i6 & 112) | 6 | (i6 & 896));
            int i10 = us2Var2 != null ? i8 : i7;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2129421220, i7, i9, "com.vk.profile.design.compose.user.userStackPadding (VkProfileFriendsInfo.kt:144)");
            }
            u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i10 != 0 ? 17 : 16, i10 != 0 ? 16 : (float) 16.18d, i10 != 0 ? 19 : 16, i8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 C = s200.C(aVar5, n);
            int i11 = us2Var2 != null ? i8 : i7;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1055653802, i7, i9, "com.vk.profile.design.compose.user.stackSize (VkProfileFriendsInfo.kt:153)");
            }
            float f2 = i11 != 0 ? 28 : 24;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i12 = (i5 & 57344) == 16384 ? i8 : i7;
            Object x = M.x();
            if (i12 != 0 || x == a.C0011a.a) {
                x = new mom(list, 3);
                M.R(x);
            }
            q630Var2 = aVar5;
            hyv0.f(C, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, (izs) x, M, 0, 30);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(us2Var2, num, viewType, list, q630Var2, i) { // from class: xsna.xdv0
                public final /* synthetic */ us2 c;
                public final /* synthetic */ Integer d;
                public final /* synthetic */ ViewType e;
                public final /* synthetic */ List f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    zdv0.b(us2.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(us2 us2Var, us2 us2Var2, Integer num, uog0 uog0Var, List list, q630 q630Var, ViewType viewType, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1953189278);
        int i2 = i | (M.J(us2Var) ? 4 : 2) | (M.J(us2Var2) ? 32 : 16) | (M.J(num) ? 256 : 128) | (M.J(uog0Var) ? 2048 : 1024) | (M.J(list) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536) | (M.o(viewType == null ? -1 : viewType.ordinal()) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(gzsVar) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1953189278, i2, -1, "com.vk.profile.design.compose.user.VkProfileFriendsInfo (VkProfileFriendsInfo.kt:39)");
            }
            jai c = kai.c(1845890659, new qbh(us2Var, us2Var2, num, viewType, list), M);
            if (gzsVar != null) {
                M.K(755821143);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                phu0.b(gzsVar, q630Var, uog0Var, ylu0Var.getBackground().g, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(851737400, new v44(1, c), M), M, ((i2 >> 21) & 14) | 805306368 | ((i2 >> 12) & 112) | ((i2 >> 3) & 896), 496);
                M = M;
                M.j();
            } else {
                M.K(756057270);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                phu0.a(q630Var, uog0Var, ylu0Var2.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-127559170, new vp4(c, 10), M), M, ((i2 >> 15) & 14) | 1572864 | ((i2 >> 6) & 112), 56);
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
            s.d = new n8n(us2Var, us2Var2, num, uog0Var, list, q630Var, viewType, gzsVar, i);
        }
    }
}
