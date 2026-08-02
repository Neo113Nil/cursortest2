package xsna;

import android.view.View;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.interop.components.image.InteropPicture;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.profile.CatchUpBanner;
import com.vkontakte.android.R;
import xsna.snx;
import xsna.tlo0;

/* compiled from: CommunityAdminBookingBannerHolder.kt */
/* loaded from: classes5.dex */
public final class urg extends vif0<cch> {
    @Override // xsna.vif0
    public final void i6(cch cchVar) {
        String str;
        ImageSize Cb;
        cch cchVar2 = cchVar;
        ech echVar = cchVar2.g;
        View view = this.itemView;
        VkBanner vkBanner = view instanceof VkBanner ? (VkBanner) view : null;
        if (vkBanner != null) {
            tlo0.a aVar = tlo0.Companion;
            CatchUpBanner catchUpBanner = echVar.b;
            vkBanner.setMiddle(new VkBanner.e(oq.d(aVar, catchUpBanner.d), new tlo0.h(catchUpBanner.e), null, new VkBanner.c(new tlo0.f(R.string.accessibility_add), new wm1(cchVar2, 23), VkButton.Mode.Secondary, VkButton.Appearance.Accent, VkButton.Size.Small, null, null, 992), null, null, 116));
            int b = cn70.b(72);
            Image image = catchUpBanner.g;
            if (image == null || (Cb = image.Cb(cn70.b(72), true, false)) == null || (str = Cb.d.d) == null) {
                str = "";
            }
            vkBanner.setBefore(new VkBanner.b.c(b, new InteropPicture(new snx.b.c(new vlw(str, null), null, null, 14), null, InteropPicture.Radius.Large, 6), null));
            vkBanner.setAfter(new VkBanner.a.b(new xm1(cchVar2, 26), null, com.vk.core.compose.component.semantics.b.a(null, new am0(23), 3), new VkBanner.a.b.C0805a(new gko(R.drawable.vk_icon_cancel_24), null), 2));
            kpd kpdVar = cchVar2.i;
            if (kpdVar != null) {
                kpdVar.invoke(catchUpBanner);
            }
        }
    }
}
