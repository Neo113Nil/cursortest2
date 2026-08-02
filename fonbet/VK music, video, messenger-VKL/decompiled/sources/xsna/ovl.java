package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;

/* compiled from: DeletedByUserCommentHolderV2.kt */
/* loaded from: classes4.dex */
public final class ovl implements VkCell.e {
    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new a(context);
    }

    /* compiled from: DeletedByUserCommentHolderV2.kt */
    public static final class a implements VkCell.d {
        public final VkImage a;

        public a(Context context) {
            VkImage vkImage = new VkImage(context, null, 6, 0);
            vkImage.setPlaceholderImage(R.drawable.vk_icon_avatar_placeholder_anonim_150);
            vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.a = vkImage;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
        }
    }
}
