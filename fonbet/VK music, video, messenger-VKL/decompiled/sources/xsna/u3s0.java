package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import com.vk.newsfeed.common.views.video.VideoAutoPlayHolderView;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vk.newsfeed.presentation.model.ClickArea;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import kotlin.NoWhenBranchMatchedException;
import xsna.tps0;

/* compiled from: VideoAutoPlayHolder.kt */
/* loaded from: classes4.dex */
public final class u3s0 extends BaseVideoAutoPlayHolder<g4s0, VideoAttachment> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u3s0(ViewGroup viewGroup, tps0.a aVar, sps0 sps0Var, int i) {
        super(r3, viewGroup, r5, r6, null);
        View view;
        tps0 bVar = (i & 2) != 0 ? new tps0.b(0) : aVar;
        sps0 sps0Var2 = (i & 4) != 0 ? new sps0(null, new jcr(), false, 239) : sps0Var;
        View videoAutoPlayHolderView = new VideoAutoPlayHolderView(viewGroup.getContext(), null, 6, 0);
        if (bVar instanceof tps0.a) {
            view = videoAutoPlayHolderView;
        } else {
            if (!(bVar instanceof tps0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewGroup frameLayout = new FrameLayout(videoAutoPlayHolderView.getContext());
            frameLayout.setId(View.generateViewId());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            frameLayout.addView(videoAutoPlayHolderView);
            view = frameLayout;
        }
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        VideoAttachment videoAttachment = (VideoAttachment) this.E;
        ClickArea clickArea = null;
        ShitAttachment shitAttachment = videoAttachment != null ? videoAttachment.h : null;
        if (shitAttachment != null && (num = shitAttachment.h0) != null) {
            clickArea = new ClickArea(num.intValue());
        }
        if (clickArea != null) {
            AdClickContext adClickContext = AdClickContext.VIDEO;
            if (clickArea.a(adClickContext)) {
                u1c0 J0 = J0();
                hd60.a().r0(this.itemView.getContext(), shitAttachment, J0 != null ? J0.k : -1, adClickContext);
                return;
            }
        }
        super.onClick(view);
    }
}
