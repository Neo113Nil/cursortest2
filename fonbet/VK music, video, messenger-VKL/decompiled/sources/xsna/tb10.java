package xsna;

import android.widget.ImageView;
import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Image;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vkontakte.android.R;

/* compiled from: MarketProductImageMediaItemHolder.kt */
/* loaded from: classes18.dex */
public final class tb10 extends wa10 {
    @Override // xsna.wa10
    public final void a(MediaContentItem mediaContentItem) {
        Image image;
        super.a(mediaContentItem);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        VkImage vkImage = this.e;
        vkImage.setScaleType(scaleType);
        MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = mediaContentItem.b;
        PhotosPhotoDto e = marketProductLinkedContentItemDto.e();
        Photo a = e != null ? xfa0.a(e) : null;
        vkImage.o0(ixj0.h((a == null || (image = a.y) == null) ? null : image.b), null);
        PhotosPhotoDto e2 = marketProductLinkedContentItemDto.e();
        this.d.i(vkImage, e2 != null ? xfa0.a(e2) : null, true, new qmi(2));
        vkImage.setContentDescription(this.a.getContext().getResources().getString(marketProductLinkedContentItemDto.f() == null ? R.string.accessibility_media_content_photo : R.string.accessibility_media_content_post));
    }
}
