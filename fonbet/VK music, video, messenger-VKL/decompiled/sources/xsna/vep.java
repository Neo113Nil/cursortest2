package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.view.components.avatar.VkAvatar;
import xsna.cq5;

/* compiled from: EmptyBorder.kt */
/* loaded from: classes17.dex */
public final class vep extends hdu0 {
    public static final vep a = new vep();

    @Override // xsna.hdu0
    public final void a(VkAvatar vkAvatar) {
        ear0 delegate$foundation_release = vkAvatar.getDelegate$foundation_release();
        delegate$foundation_release.b(o9r0.a(delegate$foundation_release.a(), false, null, null, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, null, null, null, false, 1782));
        vkAvatar.getContext();
        ear0.d(delegate$foundation_release, AvatarBorderType.CIRCLE, cq5.b.a, 4);
    }
}
