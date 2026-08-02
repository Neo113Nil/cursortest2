package xsna;

import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.view.components.avatar.VkAvatar;
import xsna.cq5;

/* compiled from: VkAvatarStoryLiveBorder.kt */
/* loaded from: classes17.dex */
public final class ndu0 extends hdu0 {
    @Override // xsna.hdu0
    public final void a(VkAvatar vkAvatar) {
        vkAvatar.getContext();
        ear0 delegate$foundation_release = vkAvatar.getDelegate$foundation_release();
        delegate$foundation_release.b(o9r0.a(delegate$foundation_release.a(), false, null, null, null, null, null, null, null, false, 1843));
        vkAvatar.getContext();
        ear0.d(delegate$foundation_release, AvatarBorderType.CIRCLE, cq5.g.a, 4);
    }
}
