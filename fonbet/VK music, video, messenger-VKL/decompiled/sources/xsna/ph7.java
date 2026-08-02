package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.ImageViewMeasurer;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeFrescoImageViewLegacy;
import com.vk.feed.tool.view.newsfeed.photo.BlurredImageWrapper;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.Collections;
import java.util.List;

/* compiled from: BlurredImagePostingHolderStrategyOld.kt */
/* loaded from: classes4.dex */
public final class ph7 implements nh7 {
    public final BlurredImageWrapper a;
    public final FixedSizeFrescoImageViewLegacy b;

    static {
        int i = FixedSizeFrescoImageViewLegacy.c0;
        int i2 = BlurredImageWrapper.m;
    }

    public ph7(View view) {
        this.a = (BlurredImageWrapper) view.findViewById(R.id.attach);
        this.b = (FixedSizeFrescoImageViewLegacy) view.findViewById(R.id.image);
    }

    @Override // xsna.nh7
    public final void b(ImageSize imageSize) {
        Image image = imageSize.d;
        int i = image.b;
        int i2 = image.c;
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = this.b;
        fixedSizeFrescoImageViewLegacy.r(i, i2);
        fixedSizeFrescoImageViewLegacy.setLocalImage(Collections.singletonList(imageSize.zb()));
        fixedSizeFrescoImageViewLegacy.setRemoteImage((fxj0) null);
        String str = image.d;
        BlurredImageWrapper blurredImageWrapper = this.a;
        blurredImageWrapper.a(str);
        blurredImageWrapper.setBlurResizeOptions(new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100, 100, 12));
    }

    @Override // xsna.nh7
    public final void c(List<ImageSize> list) {
        List<ImageSize> list2 = list;
        ImageSize imageSize = (ImageSize) ixj0.b(list2);
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = this.b;
        if (imageSize != null) {
            Image image = imageSize.d;
            fixedSizeFrescoImageViewLegacy.r(image.b, image.c);
        } else {
            fixedSizeFrescoImageViewLegacy.r(135, 100);
        }
        fixedSizeFrescoImageViewLegacy.setLocalImage((fxj0) null);
        fixedSizeFrescoImageViewLegacy.setRemoteImage(imageSize);
        this.a.a(ixj0.n(list2));
    }

    @Override // xsna.nh7
    public final void init() {
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_background_content);
        BlurredImageWrapper blurredImageWrapper = this.a;
        blurredImageWrapper.b(c);
        blurredImageWrapper.setBlurPostprocessor(edg0.a);
        blurredImageWrapper.setBlurPlaceholderColor(abg0Var.c(R.attr.vk_ui_background_secondary));
        this.b.setHeightMode(ImageViewMeasurer.HeightMode.MIN_RATIO);
    }

    @Override // xsna.nh7
    public final void a(PhotoAttachment photoAttachment) {
    }
}
