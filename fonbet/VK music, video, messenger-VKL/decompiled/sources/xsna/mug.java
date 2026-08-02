package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.compose.components.channel.MediaType;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;

/* compiled from: CommunityChannelMediaPlaceholder.kt */
/* loaded from: classes17.dex */
public final class mug {

    /* compiled from: CommunityChannelMediaPlaceholder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(MediaType mediaType, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        lg90 b;
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(518203452);
        int i2 = (M.o(mediaType.ordinal()) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(518203452, i2, -1, "com.vk.community.design.compose.components.channel.CommunityChannelMediaPlaceholder (CommunityChannelMediaPlaceholder.kt:24)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = a.$EnumSwitchMapping$0[mediaType.ordinal()];
            if (i3 == 1) {
                M.K(97327842);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-166278846, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-VideoOutline24> (VkIcons.kt:11556)");
                }
                b = or.b(M, -1515636381, R.drawable.vk_icon_video_outline_24, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else if (i3 == 2) {
                M.K(97426112);
                qzu0.a.getClass();
                b = qzu0.Z0(M);
                M.j();
            } else {
                if (i3 != 3) {
                    throw alb0.c(280232838, M);
                }
                M.K(97528970);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                b = new y6g(ylu0Var.getIcon().n);
                M.j();
            }
            lg90 lg90Var = b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var2.getIcon().n;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
            }
            vjw.a(lg90Var, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), M, 56, 60);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lug(mediaType, q630Var, i, 0);
        }
    }
}
