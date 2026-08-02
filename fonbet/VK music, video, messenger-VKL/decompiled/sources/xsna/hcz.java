package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.ui.holders.LinkVh;
import com.vk.dto.hints.HintId;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.tooltips.VideoTooltip;
import com.vk.libvideo.tooltips.WatchLaterTooltip;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class hcz implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ HintId c;
    public final /* synthetic */ LinkVh d;

    public hcz(View view, HintId hintId, LinkVh linkVh) {
        this.b = view;
        this.c = hintId;
        this.d = linkVh;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        int[] iArr = LinkVh.b.$EnumSwitchMapping$0;
        HintId hintId = this.c;
        int i = iArr[hintId.ordinal()];
        LinkVh linkVh = this.d;
        if (i == 1) {
            TextView textView = linkVh.o;
            if (textView != null) {
                LinkVh.c(linkVh, textView, hintId.getId(), VideoTooltip.Type.NOT_SCROLLABLE, new icz(linkVh, 0), 4);
                return;
            }
            return;
        }
        if (i != 2) {
            View view2 = linkVh.l;
            LinkVh.c(linkVh, view2 != null ? view2 : null, hintId.getId(), null, null, 56);
        } else {
            VKImageView vKImageView = linkVh.q;
            new WatchLaterTooltip(vKImageView != null ? vKImageView : null).a(WatchLaterTooltip.Hint.MENU);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
