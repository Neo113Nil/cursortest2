package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.shimmer.ThemableShimmer;

/* compiled from: Utils.kt */
/* loaded from: classes17.dex */
public final class w3r0 {
    public static void a(VkSkeleton vkSkeleton, float f, ThemableShimmer themableShimmer, int i) {
        if ((i & 1) != 0) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        vkSkeleton.setType(new VkSkeleton.a.C0862a(f));
        vkSkeleton.setShimmerManagedExternally(true);
        vkSkeleton.setShimmer(themableShimmer);
    }

    public static void b(VkSkeleton vkSkeleton, ThemableShimmer themableShimmer) {
        vkSkeleton.setType(VkSkeleton.a.b.a);
        vkSkeleton.setShimmerManagedExternally(true);
        vkSkeleton.setShimmer(themableShimmer);
    }
}
