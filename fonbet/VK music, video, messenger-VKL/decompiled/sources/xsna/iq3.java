package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkPicture;
import com.vkontakte.android.R;

/* compiled from: ArticlesPreviewController.kt */
/* loaded from: classes5.dex */
public final class iq3 implements VkCell.d {
    public final VkPicture a;

    /* compiled from: ArticlesPreviewController.kt */
    public static final class a implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new iq3(context);
        }
    }

    /* compiled from: ArticlesPreviewController.kt */
    public static final class b implements VkCell.f {
        public final String a;

        public b(String str) {
            this.a = str;
        }
    }

    static {
        int i = VkPicture.y;
    }

    public iq3(Context context) {
        VkPicture vkPicture = new VkPicture(context, null, 6, 0);
        vkPicture.setScaleType(ImageView.ScaleType.CENTER_CROP);
        vkPicture.setBackgroundImage(new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, context)));
        vkPicture.J0(krv0.f(R.drawable.vk_icon_article_36, R.attr.vk_ui_icon_tertiary, context), ImageView.ScaleType.CENTER_INSIDE);
        this.a = vkPicture;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        b bVar = fVar instanceof b ? (b) fVar : null;
        if (bVar != null) {
            this.a.o0(bVar.a, null);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
