package xsna;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.TrendingHashtag;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.feed.design.view.newsfeed.clips.TrendBadge;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.tps0;
import xsna.ye0;

/* compiled from: ClipsRetentionBlockItemHolder.kt */
/* loaded from: classes4.dex */
public final class u1f extends yjd {
    public static final int D0 = iah0.a(18);
    public TrendBadge A0;
    public sej0 B0;
    public final Object C0;
    public final s0t0 s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final pkd w0;
    public final xod x0;
    public View y0;
    public View z0;

    public u1f(ViewGroup viewGroup, tps0.a aVar, ClipsHolderViewImpl clipsHolderViewImpl, boolean z, boolean z2, boolean z3, pkd pkdVar, xod xodVar) {
        super(viewGroup, aVar, new sps0(null, null, false, 255), clipsHolderViewImpl, z, z2, z3);
        this.s0 = clipsHolderViewImpl;
        this.t0 = z;
        this.u0 = z2;
        this.v0 = z3;
        this.w0 = pkdVar;
        this.x0 = xodVar;
        this.C0 = msy.a(LazyThreadSafetyMode.NONE, new ah(this, 29));
    }

    public final TrendBadge J7() {
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.clip_trend_badge_stub);
        View inflate = viewStub != null ? viewStub.inflate() : null;
        TrendBadge trendBadge = inflate instanceof TrendBadge ? (TrendBadge) inflate : null;
        if (trendBadge == null) {
            return null;
        }
        trendBadge.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        f4m.m(8388691, trendBadge);
        int a2 = iah0.a(8);
        f4m.s(a2, trendBadge);
        f4m.r(a2, trendBadge);
        f4m.q(a2, trendBadge);
        this.A0 = trendBadge;
        return trendBadge;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.EmptyList] */
    @Override // xsna.eq6
    public final void b7(Attachment attachment) {
        ?? r2;
        List<ClickableSticker> list;
        String P;
        View view;
        TrendBadge trendBadge;
        VideoAttachment videoAttachment = (VideoAttachment) attachment;
        super.b7(videoAttachment);
        View view2 = this.y0;
        if (view2 == null) {
            view2 = this.itemView.findViewById(R.id.video_wrap);
        }
        this.y0 = view2;
        View view3 = this.z0;
        if (view3 == null) {
            view3 = this.itemView.findViewById(R.id.clip_ozon_badge);
        }
        this.z0 = view3;
        if (view3 != null) {
            bwt0.p0(view3, this.t0);
        }
        if (this.u0) {
            VideoFile videoFile = videoAttachment.k;
            final ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
            if (clipVideoFile != null) {
                List<TrendingHashtag> list2 = clipVideoFile.Q1;
                Object a0 = j5g.a0(list2);
                TrendBadge.a aVar = TrendBadge.a.b.b;
                if (a0 != null) {
                    TrendingHashtag trendingHashtag = (TrendingHashtag) j5g.a0(list2);
                    if (trendingHashtag != null && ((trendBadge = this.A0) != null || (trendBadge = J7()) != null)) {
                        bwt0.p0(trendBadge, true);
                        trendBadge.setImage(null);
                        trendBadge.setTitle(trendingHashtag.b);
                        TrendBadge trendBadge2 = this.A0;
                        if (trendBadge2 != null || (trendBadge2 = J7()) != null) {
                            Iterable iterable = trendingHashtag.c;
                            if (iterable == null) {
                                iterable = EmptyList.b;
                            }
                            List A = rli0.A(rli0.t(new i5g(iterable), new com.vk.movika.sdk.base.observable.i(16)));
                            if (!A.isEmpty()) {
                                if (A.size() == 1) {
                                    aVar = new TrendBadge.a.b((cut0) A.get(0));
                                } else {
                                    GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                                    aVar = new TrendBadge.a.C1044a(A);
                                }
                            }
                            trendBadge2.setAlphaMode(A.isEmpty() ? TrendBadge.AlphaMode.TRANSLUCENT : TrendBadge.AlphaMode.FULL);
                            trendBadge2.setAppearance(aVar);
                        }
                        trendBadge.setOnClickListener(new nt9(1, this, trendingHashtag));
                    }
                } else {
                    final MusicTrack musicTrack = clipVideoFile.D1;
                    if (musicTrack == null || !musicTrack.X) {
                        TrendBadge trendBadge3 = this.A0;
                        if (trendBadge3 != null) {
                            bwt0.p0(trendBadge3, false);
                        }
                    } else {
                        TrendBadge trendBadge4 = this.A0;
                        if (trendBadge4 != null || (trendBadge4 = J7()) != null) {
                            CharSequence charSequence = clipVideoFile.V1;
                            if (charSequence == null) {
                                charSequence = this.x0.b(musicTrack.d);
                                clipVideoFile.V1 = charSequence;
                            }
                            CharSequence charSequence2 = clipVideoFile.W1;
                            if (charSequence2 == null) {
                                charSequence2 = s490.d(this.itemView.getContext(), s490.i(musicTrack.t), s490.c(musicTrack.u), R.attr.vk_ui_text_contrast);
                                clipVideoFile.W1 = charSequence2;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append((Object) charSequence);
                            sb.append(' ');
                            String str = musicTrack.e;
                            if (str == null) {
                                str = "";
                            }
                            sb.append(str);
                            String obj = drm0.p0(sb.toString()).toString();
                            if (drm0.N(obj)) {
                                obj = null;
                            }
                            if (drm0.N(charSequence2)) {
                                charSequence2 = null;
                            }
                            String g0 = j5g.g0(rl3.I(new CharSequence[]{obj, charSequence2}), " - ", null, null, 0, null, 62);
                            bwt0.p0(trendBadge4, true);
                            trendBadge4.setImage(musicTrack.Kb(D0));
                            trendBadge4.setTitle(g0);
                            trendBadge4.setAlphaMode(TrendBadge.AlphaMode.TRANSLUCENT);
                            trendBadge4.setAppearance(aVar);
                            trendBadge4.setOnClickListener(new View.OnClickListener() { // from class: xsna.t1f
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    u1f u1fVar = u1f.this;
                                    ClipsRouter.j(u1fVar.w0.a(), u1fVar.itemView.getContext(), new ClipGridParams.Data.Music(musicTrack, 0L, null, false, null, clipVideoFile.L1, null, false, false, 476, null), false, null, null, 60);
                                }
                            });
                        }
                    }
                }
            }
        } else {
            TrendBadge trendBadge5 = this.A0;
            if (trendBadge5 != null) {
                bwt0.p0(trendBadge5, false);
            }
        }
        VideoFile videoFile2 = videoAttachment.k;
        if (videoFile2 != null && (P = videoFile2.P()) != null && (view = this.y0) != null) {
            view.setContentDescription(x6(R.string.accessibility_clip_author, P));
        }
        if (!this.v0) {
            sej0 sej0Var = this.B0;
            if (sej0Var != null) {
                bwt0.p0(sej0Var, false);
                return;
            }
            return;
        }
        VideoFile videoFile3 = videoAttachment.k;
        ClipVideoFile clipVideoFile2 = videoFile3 instanceof ClipVideoFile ? (ClipVideoFile) videoFile3 : null;
        if (clipVideoFile2 == null) {
            return;
        }
        ClickableStickers clickableStickers = clipVideoFile2.C1;
        if (clickableStickers == null || (list = clickableStickers.d) == null) {
            r2 = EmptyList.b;
        } else {
            r2 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof ClickableMarketItem) {
                    r2.add(obj2);
                }
            }
        }
        ClickableMarketItem clickableMarketItem = (ClickableMarketItem) j5g.a0(r2);
        Good good = clickableMarketItem != null ? clickableMarketItem.j : null;
        if (good == null) {
            sej0 sej0Var2 = this.B0;
            if (sej0Var2 != null) {
                bwt0.p0(sej0Var2, false);
                return;
            }
            return;
        }
        sej0 sej0Var3 = this.B0;
        if (sej0Var3 == null) {
            sej0Var3 = (sej0) this.itemView.findViewById(R.id.clip_shops_badge);
            this.B0 = sej0Var3;
        }
        if (sej0Var3 != null) {
            bwt0.p0(sej0Var3, true);
        }
        if (sej0Var3 != null) {
            sej0Var3.setProductName(good.d);
        }
        if (sej0Var3 != null) {
            sej0Var3.setHasProduct(true);
        }
        if (sej0Var3 != null) {
            sej0Var3.setOnClickListener(new r4(this, 3));
        }
    }

    @Override // xsna.yjd, com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
    public final com.vk.libvideo.autoplay.a k7() {
        return com.vk.libvideo.autoplay.a.a(super.k7(), null, null, null, null, null, null, 523263);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fi, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        yg5 yg5Var = this.h0;
        if (yg5Var != null) {
            yg5Var.f0((a) this.C0.getValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fi, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        yg5 yg5Var = this.h0;
        if (yg5Var != null) {
            yg5Var.T((a) this.C0.getValue());
        }
    }

    /* compiled from: ClipsRetentionBlockItemHolder.kt */
    public static final class a implements hnt0 {
        public final fh5 b;

        public a(fh5 fh5Var) {
            this.b = fh5Var;
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
            if (j < 3000 || !videoAutoPlay.j0(this.b.v)) {
                return;
            }
            videoAutoPlay.S(false);
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
        public final void p2(VideoAutoPlay videoAutoPlay) {
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
        public final void h3(yg5 yg5Var, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        }
    }
}
