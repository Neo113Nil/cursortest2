package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.NotificationImage;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.f5h0;

/* compiled from: BadgesModalImageViewController.kt */
/* loaded from: classes17.dex */
public final class lz5 implements VkCell.d {
    public final Drawable a;
    public final VKImageView b;

    public lz5(Context context, hny hnyVar) {
        this.a = hnyVar;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        bwt0.d(vKImageView, e3m.a(R.dimen.clips_additions_bottomsheet_preview_corner_radius, context), (r4 & 2) != 0, (r4 & 4) != 0);
        vKImageView.setPlaceholderImage(hnyVar);
        this.b = vKImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        String str;
        a aVar = fVar instanceof a ? (a) fVar : null;
        if (aVar == null || (str = aVar.a) == null) {
            return;
        }
        VKImageView vKImageView = this.b;
        vKImageView.o0(str, null);
        vKImageView.getHierarchy().o(f5h0.f.a);
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.b;
    }

    /* compiled from: BadgesModalImageViewController.kt */
    public static final class a implements VkCell.f {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public a(NotificationImage notificationImage) {
            this(notificationImage != null ? notificationImage.Cb(72) : null);
        }
    }
}
