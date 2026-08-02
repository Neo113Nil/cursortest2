package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vkontakte.android.R;
import xsna.cq5;
import xsna.cut0;
import xsna.p9r0;

/* compiled from: VkAvatarColorBorder.kt */
/* loaded from: classes17.dex */
public final class idu0 extends hdu0 {
    public final cut0 a;
    public final boolean b;

    public idu0(int i, int i2) {
        boolean z = (i2 & 2) == 0;
        this.a = new b8g(i);
        this.b = z;
    }

    @Override // xsna.hdu0
    public final void a(VkAvatar vkAvatar) {
        float f;
        float b = an10.b(hbh0.c(vkAvatar.getContext(), vkAvatar.getMeasuredWidth()));
        float f2 = 3.0f;
        float a = hbh0.a(vkAvatar.getContext(), b < 36.0f ? 1.0f : b < 80.0f ? 2.0f : 3.0f);
        if (this.b) {
            Context context = vkAvatar.getContext();
            if (b < 36.0f) {
                f2 = 1.0f;
            } else if (b < 80.0f) {
                f2 = 2.0f;
            }
            f = hbh0.a(context, f2);
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        vkAvatar.getContext();
        x7g x7gVar = new x7g(R.attr.vk_ui_transparent);
        cq5.a aVar = new cq5.a(new p9r0.c(this.a.b(vkAvatar.getContext())));
        ear0 delegate$foundation_release = vkAvatar.getDelegate$foundation_release();
        delegate$foundation_release.b(o9r0.a(delegate$foundation_release.a(), true, Integer.valueOf(cut0.a.a(x7gVar, vkAvatar.getContext())), Float.valueOf(a), Float.valueOf(a + f), Float.valueOf(a), Float.valueOf(f), null, null, false, 1840));
        vkAvatar.getContext();
        ear0.d(delegate$foundation_release, AvatarBorderType.CIRCLE, aVar, 4);
    }
}
