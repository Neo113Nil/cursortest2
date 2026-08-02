package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;

/* compiled from: AudioBookOfflineVh.kt */
/* loaded from: classes16.dex */
public final class ama implements VkCell.d {
    public final ThumbsImageView a;

    public ama(Context context) {
        ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
        thumbsImageView.setId(R.id.image_thumb);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        thumbsImageView.setLayoutParams(layoutParams);
        bwt0.m0(e3m.a(R.dimen.music_playlist_image, context), e3m.a(R.dimen.music_playlist_image, context), thumbsImageView);
        thumbsImageView.setRadiusCorner(iah0.b(8.0f));
        thumbsImageView.setBorderLineWidth(iah0.a(0.5f));
        thumbsImageView.setBorderLineColor(dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        this.a = thumbsImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        if (fVar instanceof cma) {
            this.a.setThumb(((cma) fVar).a);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
