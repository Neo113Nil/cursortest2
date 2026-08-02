package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.f5h0;

/* compiled from: ContactAndLinksItem.kt */
/* loaded from: classes5.dex */
public final class kmw implements VkCell.d {
    public final VKImageView a;

    public kmw(Context context) {
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        vKImageView.setCornerRadius(cn70.a() * 24.0f);
        vKImageView.y0(cn70.a() * 0.5f, dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        this.a = vKImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        VKImageView vKImageView = this.a;
        vKImageView.clear();
        pmw pmwVar = fVar instanceof pmw ? (pmw) fVar : null;
        if (pmwVar != null) {
            String str = pmwVar.a;
            Drawable drawable = pmwVar.b;
            if (((pmw) fVar).b != null) {
                vKImageView.Q0(drawable, f5h0.e.a);
                vKImageView.F0(drawable, ImageView.ScaleType.CENTER);
                vKImageView.W();
            }
            if (str == null || drm0.N(str)) {
                return;
            }
            vKImageView.o0(str, null);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
