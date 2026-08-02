package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.interop.components.image.InteropPicture;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.profile.CatchUpBanner;
import com.vkontakte.android.R;
import xsna.snx;
import xsna.tlo0;

/* compiled from: CommunityProductManagementBannerHolder.kt */
/* loaded from: classes5.dex */
public final class zdh extends vif0<cch> {
    public final VkBanner n;

    public zdh(ViewGroup viewGroup) {
        super(new FrameLayout(viewGroup.getContext()));
        FrameLayout frameLayout = (FrameLayout) this.itemView;
        VkBanner vkBanner = new VkBanner(viewGroup.getContext(), null, 6);
        this.n = vkBanner;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setPadding(cn70.b(4), cn70.b(4), cn70.b(4), cn70.b(4));
        frameLayout.removeAllViews();
        frameLayout.addView(vkBanner);
    }

    @Override // xsna.vif0
    public final void i6(cch cchVar) {
        String str;
        ImageSize imageSize;
        cch cchVar2 = cchVar;
        slw slwVar = new slw(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_content)));
        VkBanner vkBanner = this.n;
        vkBanner.setBackgroundImage(slwVar);
        tlo0.a aVar = tlo0.Companion;
        ech echVar = cchVar2.g;
        tlo0.h d = oq.d(aVar, echVar.b.d);
        CatchUpBanner catchUpBanner = echVar.b;
        vkBanner.setMiddle(new VkBanner.e(d, new tlo0.h(catchUpBanner.e), null, new VkBanner.c(new tlo0.f(R.string.community_open_market), new tbg(cchVar2, 4), VkButton.Mode.Primary, VkButton.Appearance.Accent, VkButton.Size.Small, null, null, 992), null, null, 116));
        vkBanner.setAfter(new VkBanner.a.b(new m3g(cchVar2, 3), null, null, new VkBanner.a.b.C0805a(new gko(R.drawable.vk_icon_cancel_24), null), 6));
        int b = cn70.b(32);
        Image image = catchUpBanner.g;
        if (image == null || (imageSize = (ImageSize) image.b.get(0)) == null || (str = imageSize.d.d) == null) {
            str = "";
        }
        vkBanner.setBefore(new VkBanner.b.c(b, new InteropPicture(new snx.b.c(new vlw(str, null), null, null, 14), null, InteropPicture.Radius.Large, 6), null));
    }
}
