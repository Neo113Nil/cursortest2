package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.movika.api.InteractiveData;
import com.vk.movika.api.MovikaComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.tcx;

/* compiled from: InteractiveVideoHolder.kt */
/* loaded from: classes4.dex */
public final class gcx extends fi<hcx, VideoAttachment> implements ent0, w8i {
    public final rcx K;
    public final RatioFrameLayout L;

    public gcx(ViewGroup viewGroup) {
        super(new RatioFrameLayout(viewGroup.getContext()), viewGroup);
        rcx a = ((MovikaComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MovikaComponent.class))).U4().a(this.itemView.getContext(), new tcx.b(3));
        this.K = a;
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) this.itemView;
        ratioFrameLayout.setId(R.id.video_wrap);
        ratioFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ratioFrameLayout.setContentDescription(ratioFrameLayout.getContext().getString(R.string.accessibility_video));
        ratioFrameLayout.setOrientation(0);
        ratioFrameLayout.addView(a.getView(), new FrameLayout.LayoutParams(-1, -1, 17));
        this.L = ratioFrameLayout;
    }

    @Override // xsna.io2
    public final boolean M() {
        return true;
    }

    @Override // xsna.eq6
    public final void c7(Attachment attachment) {
        VideoAttachment videoAttachment = (VideoAttachment) attachment;
        VideoFile videoFile = videoAttachment.k;
        this.K.y0(new InteractiveData(videoFile, videoAttachment.l, videoFile.r(), InteractiveData.From.FEED, (SearchStatsLoggingInfo) null, (ebs0) null, false, false, 496));
    }

    @Override // xsna.fi
    public final View f7() {
        return this.K.getView();
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.K;
    }
}
