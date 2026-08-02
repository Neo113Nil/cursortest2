package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoScreenSource;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import com.vk.newsfeed.common.views.video.VideoAutoPlayHolderView;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.video.ui.slider.impl.VideoSliderAutoPlayHolder;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.a5o;
import xsna.e3m;
import xsna.fqs0;
import xsna.tps0;

/* compiled from: SuggestedVideoAutoPlayHolder.kt */
/* loaded from: classes4.dex */
public class x5n0 extends BaseVideoAutoPlayHolder<z1c0, VideoAttachment> {
    public static final /* synthetic */ int K0 = 0;
    public final VideoAutoPlayHolderView A0;
    public final ProgressBar B0;
    public final cqs0 C0;
    public final Object D0;
    public final Object E0;
    public final Object F0;
    public final Object G0;
    public final b630 H0;
    public yok0 I0;
    public final Object J0;
    public final Object s0;
    public final Object t0;
    public final String u0;
    public final VKCircleImageView v0;
    public final TextView w0;
    public final TextView x0;
    public final ImageView y0;
    public final Group z0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x5n0(ViewGroup viewGroup, VideoSliderAutoPlayHolder videoSliderAutoPlayHolder, String str, Lazy lazy, Lazy lazy2, tps0.a aVar) {
        super(r0, viewGroup, aVar, videoSliderAutoPlayHolder);
        Context context = viewGroup.getContext();
        y5n0 y5n0Var = new y5n0(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.news_video_item, y5n0Var);
        this.s0 = lazy;
        this.t0 = lazy2;
        this.u0 = str;
        this.v0 = (VKCircleImageView) this.itemView.findViewById(R.id.avatar);
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        this.w0 = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.x0 = textView2;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.more);
        this.y0 = imageView;
        this.z0 = (Group) this.itemView.findViewById(R.id.bottom_info_group);
        VideoAutoPlayHolderView videoAutoPlayHolderView = (VideoAutoPlayHolderView) this.itemView.findViewById(R.id.video_wrap);
        this.A0 = videoAutoPlayHolderView;
        ProgressBar progressBar = (ProgressBar) videoAutoPlayHolderView.findViewById(R.id.video_progress);
        this.B0 = progressBar;
        this.C0 = new cqs0(null, 3);
        qkd0 qkd0Var = new qkd0(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.D0 = msy.a(lazyThreadSafetyMode, qkd0Var);
        this.E0 = msy.a(lazyThreadSafetyMode, new hbj0(this, 7));
        this.F0 = msy.a(lazyThreadSafetyMode, new pwh0(this, 11));
        this.G0 = msy.a(lazyThreadSafetyMode, new v5n0(this, 0));
        this.H0 = new b630(this, 13);
        this.J0 = msy.a(lazyThreadSafetyMode, new tj2(25));
        bwt0.d(videoAutoPlayHolderView, iah0.a(12), (r4 & 2) != 0, (r4 & 4) != 0);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(-1, iah0.a(6.0f), 80));
        Context context2 = progressBar.getContext();
        e3m.a aVar2 = e3m.a;
        progressBar.setProgressDrawable(m33.a(R.drawable.video_progress_redesign, context2));
        float f = -1;
        f4m.u(progressBar, iah0.a(f), 0, iah0.a(f), iah0.a(f));
        textView.setLines(1);
        textView2.setLines(2);
        VideoInfoTextView videoInfoTextView = textView2 instanceof VideoInfoTextView ? (VideoInfoTextView) textView2 : null;
        if (videoInfoTextView != null) {
            videoInfoTextView.setPreferOwnerTextEllipsize(false);
        }
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public final zps0 J7(VideoFile videoFile) {
        azn a;
        DonutVideoUiModel a2 = ((l5o) this.D0.getValue()).a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
        CharSequence a3 = (a2 == null || (a = k5o.a(a2)) == null) ? null : ((zyn) this.F0.getValue()).a(a, this.itemView.getContext(), this.H0);
        return this.C0.c(videoFile, this.itemView.getContext(), a3 != null ? new fqs0(null, null, new fqs0.a(a3), 3) : null);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void K7(DonutVideoAction donutVideoAction, DonutVideoClickSource donutVideoClickSource) {
        Activity b = enj.b(this.itemView);
        if (donutVideoAction == null || b == null) {
            return;
        }
        ((x4o) this.E0.getValue()).a(donutVideoAction, b, new a5o(new a5o.a(DonutVideoScreenSource.VK_VIDEO.h(), donutVideoClickSource.h()), 1));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, android.view.View.OnClickListener
    public final void onClick(View view) {
        VideoAttachment videoAttachment;
        VideoFile videoFile;
        ImageView imageView = this.y0;
        if (imageView == null || imageView.getId() != view.getId()) {
            super.onClick(view);
            return;
        }
        Activity b = enj.b(view);
        if (b == null || (videoAttachment = (VideoAttachment) this.E) == null || (videoFile = videoAttachment.k) == null) {
            return;
        }
        s6s0 s6s0Var = new s6s0(videoFile, this.u0, null, null, false, this.v, false, false, false, null, null, null, null, false, null, false, VideoScreenMode.PREVIEW, false, null, ((VideoShareComponent) this.s0.getValue()).S(), null, false, 461372924);
        if (((Boolean) this.J0.getValue()).booleanValue()) {
            new w6s0(s6s0Var, null).e(b);
        } else {
            new e6s0(b, s6s0Var, null).c();
        }
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.ent0
    public final dnt0 q3() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
    /* renamed from: z7 */
    public void c7(VideoAttachment videoAttachment) {
        super.c7(videoAttachment);
        if (videoAttachment == null) {
            return;
        }
        VideoFile videoFile = videoAttachment.k;
        boolean c = fxc0.B().c(videoFile);
        DonutVideoUiModel a = ((l5o) this.D0.getValue()).a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
        boolean O = fxc0.B().J().O();
        TextView textView = this.x0;
        if (O) {
            textView.setText("");
            yok0 yok0Var = this.I0;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            this.I0 = myc0.h(zvj.a(hqu0.a()), null, null, new w5n0(this, videoFile, null), 3);
        } else {
            zps0 J7 = J7(videoFile);
            VideoInfoTextView videoInfoTextView = textView instanceof VideoInfoTextView ? (VideoInfoTextView) textView : null;
            if (videoInfoTextView != null) {
                videoInfoTextView.setText(J7);
            }
        }
        VKCircleImageView vKCircleImageView = this.v0;
        if (vKCircleImageView != null) {
            vKCircleImageView.o0(videoFile.M0(), null);
        }
        this.w0.setText(videoFile.getTitle());
        this.z0.setVisibility(c ? 4 : 0);
        if (((Boolean) this.G0.getValue()).booleanValue()) {
            DonutVideoUiModel.PreviewBadge previewBadge = a != null ? a.b : null;
            VideoAutoPlayHolderView videoAutoPlayHolderView = this.A0;
            DonutBadge donutBadge = videoAutoPlayHolderView.getDonutBadge();
            DurationView videoDuration = videoAutoPlayHolderView.getVideoDuration();
            ProgressBar progressBar = this.B0;
            if (previewBadge == null) {
                f4m.j(donutBadge);
                videoDuration.setSimpleView(false);
                progressBar.setVisibility(0);
                return;
            }
            donutBadge.setVisibility(0);
            DonutPriceTemplate donutPriceTemplate = previewBadge.c;
            donutBadge.setText(donutPriceTemplate != null ? y1o.b(donutPriceTemplate, this.itemView.getContext()) : previewBadge.b);
            donutBadge.setOnClickListener(new com.vk.movika.sdk.android.defaultplayer.control.d(3, this, previewBadge));
            videoDuration.b();
            videoDuration.setSimpleView(true);
            f4m.j(progressBar);
        }
    }
}
