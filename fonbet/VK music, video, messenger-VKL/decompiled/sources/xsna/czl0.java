package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.image.border.StoryBorder$Color;
import xsna.er5;
import xsna.p5g;

/* compiled from: StoryBorder.kt */
/* loaded from: classes17.dex */
public final class czl0 {
    public static p5g a(androidx.compose.runtime.a aVar) {
        long j;
        StoryBorder$Color storyBorder$Color = StoryBorder$Color.Blue;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-197459240, 384, -1, "com.vk.core.compose.component.image.border.StoryBorder.Companion.invoke (StoryBorder.kt:14)");
        }
        f870.A().getClass();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-718019889, 0, -1, "com.vk.core.compose.component.defaults.AvatarDefault.storyBorderColor (VkAvatarDefault.kt:133)");
        }
        int i = er5.a.$EnumSwitchMapping$0[storyBorder$Color.ordinal()];
        if (i == 1) {
            aVar.K(1472626267);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.m().a;
            aVar.j();
        } else if (i == 2) {
            aVar.K(1472628411);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getIcon().n;
            aVar.j();
        } else if (i == 3) {
            aVar.K(1472630589);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var3.m().e;
            aVar.j();
        } else {
            if (i != 4) {
                throw alb0.c(1472624312, aVar);
            }
            aVar.K(1472632893);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var4.m().f;
            aVar.j();
        }
        long j2 = j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        p5g a = p5g.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 196656, 12, j2, aVar, true);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
