package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.ui.preview.VideoSeekPreviewImage;
import com.vkontakte.android.R;
import java.util.List;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.ye0;

/* compiled from: EpisodeViewHolder.kt */
/* loaded from: classes2.dex */
public final class htp extends vfz<atp> {
    public boolean A;
    public final ViewGroup l;
    public final bzs0 m;
    public final boolean n;
    public final SearchStatsLoggingInfo o;
    public final View p;
    public final View q;
    public final VideoSeekPreviewImage r;
    public final TextView s;
    public final TextView t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final wz4 x;
    public final boolean y;
    public atp z;

    public htp(ViewGroup viewGroup, int i, gzs gzsVar, bzs0 bzs0Var, boolean z, izs izsVar, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        super(bwt0.I(i, viewGroup, false));
        this.l = viewGroup;
        this.m = bzs0Var;
        this.n = z;
        this.o = searchStatsLoggingInfo;
        View findViewById = this.itemView.findViewById(R.id.episode_container);
        this.p = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.preview_container);
        this.q = findViewById2;
        VideoSeekPreviewImage videoSeekPreviewImage = (VideoSeekPreviewImage) this.itemView.findViewById(R.id.preview);
        this.r = videoSeekPreviewImage;
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        this.s = textView;
        this.t = (TextView) this.itemView.findViewById(R.id.duration);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.open);
        this.u = imageView;
        ImageView imageView2 = (ImageView) this.itemView.findViewById(R.id.progress_playing);
        this.v = imageView2;
        this.w = (ImageView) this.itemView.findViewById(R.id.offline_placeholder);
        wz4 wz4Var = new wz4(this.itemView.getContext());
        wz4Var.b.setColor(-1);
        this.x = wz4Var;
        this.y = i == R.layout.video_episode_full || i == R.layout.video_episode_full_tablet;
        bwt0.i0(findViewById, new du0(11, this, izsVar));
        if (imageView != null) {
            bwt0.i0(imageView, new o43(20, this, gzsVar));
        }
        videoSeekPreviewImage.setForeground(null);
        videoSeekPreviewImage.setOutlineProvider(null);
        videoSeekPreviewImage.setClipToOutline(false);
        videoSeekPreviewImage.setExactlyHeight(e3m.a(R.dimen.episode_height, this.itemView.getContext()));
        findViewById2.setClipToOutline(true);
        findViewById2.setOutlineProvider(new s0w0(b6().getDimension(R.dimen.video_collage_view_corners), 6));
        imageView2.setImageDrawable(wz4Var);
        imageView2.setSelected(true);
        textView.setMinLines(1);
        textView.setMaxLines(2);
        if (imageView != null) {
            awt0.v(imageView, true);
        }
    }

    @Override // xsna.vfz
    public final void W5(atp atpVar) {
        atp atpVar2 = atpVar;
        VideoFile videoFile = atpVar2.b;
        this.z = atpVar2;
        hc1 hc1Var = new hc1(11, this, atpVar2);
        VideoSeekPreviewImage videoSeekPreviewImage = this.r;
        videoSeekPreviewImage.setLostConnectionCallback(hc1Var);
        this.A = false;
        bwt0.p0(this.w, false);
        if (fxc0.B().J().M1()) {
            videoSeekPreviewImage.setTimelineThumbProvider(new sf4(9, this, atpVar2));
        }
        videoSeekPreviewImage.setTimelineThumbs(videoFile.B0());
        int i = atpVar2.g;
        int duration = videoFile.getDuration();
        videoSeekPreviewImage.w = i;
        videoSeekPreviewImage.x = duration;
        videoSeekPreviewImage.W();
        h6(atpVar2);
        this.s.setText(atpVar2.i);
        String str = atpVar2.h;
        TextView textView = this.t;
        textView.setText(str);
        boolean z = this.n;
        if (!z) {
            textView.setBackgroundResource(R.drawable.episode_duration_background);
        } else if (dhr0.C().b) {
            textView.setBackgroundResource(R.drawable.episode_duration_background_light);
        } else {
            textView.setBackgroundResource(R.drawable.episode_duration_background);
        }
        ImageView imageView = this.u;
        if (imageView != null) {
            bwt0.p0(imageView, !z);
        }
    }

    public final void h6(atp atpVar) {
        ColorDrawable colorDrawable = this.n ? dhr0.C().b ? new ColorDrawable(this.itemView.getContext().getColor(R.color.vk_black_alpha8)) : new ColorDrawable(this.itemView.getContext().getColor(R.color.vk_white_alpha8)) : new ColorDrawable(this.itemView.getContext().getColor(R.color.vk_white_alpha8));
        if (this.A) {
            bwt0.p0(this.w, !atpVar.e);
        }
        if (this.y) {
            if (!atpVar.e) {
                colorDrawable = null;
            }
            this.p.setForeground(colorDrawable);
        }
        this.q.setForeground(m33.a(atpVar.e ? R.drawable.episode_play_foreground : R.drawable.episode_foreground, this.itemView.getContext()));
        bwt0.p0(this.v, atpVar.e);
        boolean z = atpVar.d;
        wz4 wz4Var = this.x;
        if (z) {
            wz4Var.j = false;
        } else {
            wz4Var.j = true;
        }
    }

    /* compiled from: EpisodeViewHolder.kt */
    public static final class a implements hnt0 {
        public final long b;

        public a(long j) {
            this.b = j;
        }

        @Override // xsna.hnt0
        public final void p2(VideoAutoPlay videoAutoPlay) {
            videoAutoPlay.f();
            if (videoAutoPlay.P0()) {
                return;
            }
            if (videoAutoPlay.J() || videoAutoPlay.p0 == null) {
                videoAutoPlay.S(true);
            }
            videoAutoPlay.seek(this.b);
            videoAutoPlay.T(this);
        }

        @Override // xsna.hnt0
        public final void E() {
        }

        @Override // xsna.hnt0
        public final void c2() {
        }

        @Override // xsna.hnt0
        public final void h() {
        }

        @Override // xsna.hnt0
        public final void j() {
        }

        @Override // xsna.hnt0
        public final void t2() {
        }

        @Override // xsna.hnt0
        public final void u() {
        }

        @Override // xsna.hnt0
        public final void K2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void O(one.video.player.tracks.c cVar) {
        }

        @Override // xsna.hnt0
        public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        }

        @Override // xsna.hnt0
        public final void S2(long j) {
        }

        @Override // xsna.hnt0
        public final void T0(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U0(one.video.player.tracks.b bVar) {
        }

        @Override // xsna.hnt0
        public final void U3(DownloadInfo downloadInfo) {
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void a(boolean z) {
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void l(x2s0 x2s0Var) {
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p0(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void q(List<? extends SubtitleRenderItem> list) {
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void x0(boolean z) {
        }

        @Override // xsna.hnt0
        public final void H(long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void N3(VideoAutoPlay videoAutoPlay, long j) {
        }

        @Override // xsna.hnt0
        public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
        }

        @Override // xsna.hnt0
        public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        }

        @Override // xsna.hnt0
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        }
    }
}
