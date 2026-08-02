package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.f5h0;

/* compiled from: CategoryLinkVh.kt */
/* loaded from: classes16.dex */
public final class ila implements VkCell.d {
    public final int a;
    public final VKImageView b;

    public ila(Context context, int i) {
        this.a = i;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        vKImageView.setLayoutParams(layoutParams);
        f4m.z(e3m.a(R.dimen.catalog_link_music_category_icon_size, context), e3m.a(R.dimen.catalog_link_music_category_icon_size, context), vKImageView);
        vKImageView.setActualScaleType(f5h0.f.a);
        vKImageView.setPlaceholderImage(R.drawable.user_placeholder);
        this.b = vKImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        if ((fVar instanceof kla ? (kla) fVar : null) != null) {
            Image image = ((kla) fVar).a.f;
            VKImageView vKImageView = this.b;
            ImageSize Cb = image.Cb(vKImageView.getContext().getResources().getDimensionPixelSize(this.a), true, false);
            vKImageView.s0(Cb != null ? Cb.d.d : null);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.b;
    }
}
