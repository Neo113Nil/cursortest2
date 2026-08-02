package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.hints.HintId;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.tooltips.VideoTooltip;
import com.vk.libvideo.tooltips.WatchLaterTooltip;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class v8z implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ HintId c;
    public final /* synthetic */ LinkBaseVh d;

    public v8z(View view, HintId hintId, LinkBaseVh linkBaseVh) {
        this.b = view;
        this.c = hintId;
        this.d = linkBaseVh;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        int[] iArr = LinkBaseVh.b.$EnumSwitchMapping$0;
        HintId hintId = this.c;
        int i = iArr[hintId.ordinal()];
        LinkBaseVh linkBaseVh = this.d;
        if (i == 1) {
            LinkBaseVh.e(linkBaseVh, hintId.getId(), VideoTooltip.Type.NOT_SCROLLABLE, new j6b(linkBaseVh, 3), 2);
        } else {
            if (i != 2) {
                LinkBaseVh.e(linkBaseVh, hintId.getId(), null, null, 28);
                return;
            }
            VKImageView vKImageView = linkBaseVh.j;
            if (vKImageView != null) {
                new WatchLaterTooltip(vKImageView).a(WatchLaterTooltip.Hint.MENU);
            }
            VkImage vkImage = linkBaseVh.k;
            if (vkImage != null) {
                new WatchLaterTooltip(vkImage).a(WatchLaterTooltip.Hint.MENU);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
