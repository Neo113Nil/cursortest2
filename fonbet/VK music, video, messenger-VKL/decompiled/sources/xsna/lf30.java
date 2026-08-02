package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.hcp0;

/* compiled from: MovieSecondaryButton.kt */
/* loaded from: classes16.dex */
public final class lf30 implements vbp0 {
    public final Context a;
    public final UIBlockTopshelf.TopshelfItem b;
    public final hcp0.a c;
    public final VkButton d;

    public lf30(Context context, UIBlockTopshelf.TopshelfItem topshelfItem, hcp0.a aVar, hcp0.c cVar) {
        this.a = context;
        this.b = topshelfItem;
        this.c = aVar;
        VkButton vkButton = new VkButton(context, null, 6, 0);
        vkButton.setId(R.id.topshelf_button_secondary);
        vkButton.setAppearance(VkButton.Appearance.Overlay);
        vkButton.setMode(VkButton.Mode.Secondary);
        vkButton.setSize(VkButton.Size.Medium);
        vkButton.setBackgroundTintList(ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_background_contrast_secondary_alpha)));
        int a = e3m.a(R.dimen.video_topshelf_button_height, vkButton.getContext());
        vkButton.setLayoutParams(new ConstraintLayout.b(a, a));
        vkButton.setOnClickListener(new jsk(cVar, 3));
        this.d = vkButton;
        a();
    }

    public final void a() {
        hcp0 hcp0Var = hcp0.this;
        UIBlockTopshelf.TopshelfItem topshelfItem = this.b;
        if (topshelfItem instanceof UIBlockTopshelf.TopshelfVideo) {
            VideoFile videoFile = hcp0Var.d.c;
            b(videoFile != null ? videoFile.X() : false);
        } else if (topshelfItem instanceof UIBlockTopshelf.TopshelfPlaylist) {
            b(hcp0Var.w);
        }
    }

    public final void b(boolean z) {
        String string;
        String string2;
        UIBlockTopshelf.TopshelfItem topshelfItem = this.b;
        Integer valueOf = Integer.valueOf(z ? R.drawable.vk_icon_done_28 : topshelfItem instanceof UIBlockTopshelf.TopshelfPlaylist ? R.drawable.vk_icon_add_square_outline_24 : R.drawable.vk_icon_clock_outline_24);
        int[] iArr = VkButton.W;
        VkButton vkButton = this.d;
        vkButton.a5(true, valueOf);
        boolean z2 = topshelfItem instanceof UIBlockTopshelf.TopshelfVideo;
        Context context = this.a;
        if (z2) {
            if (z) {
                string2 = context.getString(R.string.topshelf_talkback_remove_from_watch_later);
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                string2 = context.getString(R.string.topshelf_talkback_add_to_watch_later);
            }
            vkButton.setContentDescription(string2);
            return;
        }
        if (topshelfItem instanceof UIBlockTopshelf.TopshelfPlaylist) {
            if (z) {
                string = context.getString(R.string.topshelf_talkback_unsubscribe_of_playlist);
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                string = context.getString(R.string.topshelf_talkback_subscribe_to_playlist);
            }
            vkButton.setContentDescription(string);
        }
    }

    @Override // xsna.vbp0
    public final View getView() {
        return this.d;
    }

    @Override // xsna.vbp0
    public final void destroy() {
    }
}
