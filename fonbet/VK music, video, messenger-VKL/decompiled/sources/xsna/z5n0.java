package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import com.vk.newsfeed.common.views.video.VideoAutoPlayHolderView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.e3m;
import xsna.tps0;

/* compiled from: SuggestedVideoSingleAutoPlayHolder.kt */
/* loaded from: classes4.dex */
public final class z5n0 extends BaseVideoAutoPlayHolder<a6n0, VideoAttachment> {
    public final TextView s0;
    public final VideoInfoTextView t0;
    public final Group u0;
    public final cqs0 v0;

    public z5n0(ViewGroup viewGroup) {
        super(R.layout.holder_suggested_video_single_autoplay, viewGroup, new tps0.b(0));
        this.s0 = (TextView) this.itemView.findViewById(R.id.title);
        VideoInfoTextView videoInfoTextView = (VideoInfoTextView) this.itemView.findViewById(R.id.subtitle);
        this.t0 = videoInfoTextView;
        this.u0 = (Group) this.itemView.findViewById(R.id.bottom_info_group);
        this.v0 = new cqs0(null, 3);
        ProgressBar progressBar = (ProgressBar) ((VideoAutoPlayHolderView) this.itemView.findViewById(R.id.video_wrap)).findViewById(R.id.video_progress);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(-1, iah0.a(6.0f), 80));
        Context context = progressBar.getContext();
        e3m.a aVar = e3m.a;
        progressBar.setProgressDrawable(m33.a(R.drawable.video_progress_redesign, context));
        float f = -1;
        f4m.u(progressBar, iah0.a(f), 0, iah0.a(f), iah0.a(f));
        videoInfoTextView.setPreferOwnerTextEllipsize(true);
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.eq6
    /* renamed from: z7 */
    public final void c7(VideoAttachment videoAttachment) {
        super.c7(videoAttachment);
        if (videoAttachment == null) {
            return;
        }
        VideoFile videoFile = videoAttachment.k;
        boolean c = fxc0.B().c(videoFile);
        zps0 f = cqs0.f(this.v0, videoFile, this.itemView.getContext(), this.itemView.getContext().getString(R.string.interpunct_separator), null, 8);
        this.s0.setText(videoFile.getTitle());
        this.t0.setText(f);
        this.u0.setVisibility(c ? 4 : 0);
    }
}
