package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.VkPictureOverlay;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;

/* compiled from: MarketEditAlbumGoodVh.kt */
/* loaded from: classes18.dex */
public final class ww00 implements VkCell.d {
    public final VkPicture a;

    public ww00(Context context) {
        VkPicture vkPicture = new VkPicture(context, null, 6, 0);
        vkPicture.setLayoutParams(new ViewGroup.LayoutParams(cn70.b(72), cn70.b(72)));
        vkPicture.setPlaceholderColor(dhr0.Y(R.attr.vk_ui_image_placeholder, context));
        vkPicture.setCornerRadius(VkPicture.CornerRadius.Large);
        this.a = vkPicture;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        yw00 yw00Var = (yw00) fVar;
        c.d dVar = new c.d(yw00Var.a, null);
        VkPicture vkPicture = this.a;
        vkPicture.setContent(dVar);
        vkPicture.setOverlay(yw00Var.b ? new VkPictureOverlay(R.drawable.vk_icon_check_circle_on_20, Integer.valueOf(R.attr.vk_ui_icon_contrast), VkPictureOverlay.Tint.Dark) : null);
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
