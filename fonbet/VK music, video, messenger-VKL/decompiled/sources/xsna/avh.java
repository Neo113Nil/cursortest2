package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.picture.VkImage;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.OfferVkVideo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;
import com.vkontakte.android.data.DonutAnalytics;
import kotlin.LazyThreadSafetyMode;
import xsna.dai;
import xsna.mno0;
import xsna.mut0;
import xsna.rmw;
import xsna.sst0;
import xsna.tlh;

/* compiled from: CommunityProfileVideoItemViewHolderRedesigned.kt */
/* loaded from: classes5.dex */
public final class avh extends vif0<sst0.b> {
    public final qwe n;
    public final suh o;
    public final VkImage p;
    public final VideoOverlayView q;
    public final Object r;
    public final Object s;
    public final wh50 t;
    public sst0.b u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public avh(ViewGroup viewGroup, qwe qweVar, tlh.k kVar) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        vq.b(-1, -2, composeView);
        composeView.setViewCompositionStrategy(mut0.c.a);
        this.n = qweVar;
        this.o = kVar;
        ComposeView composeView2 = (ComposeView) this.itemView;
        VkImage vkImage = new VkImage(viewGroup.getContext(), null, 6, 0);
        vkImage.setVisibility(8);
        this.p = vkImage;
        VideoOverlayView videoOverlayView = new VideoOverlayView(viewGroup.getContext(), null, null, 14);
        videoOverlayView.setVisibility(8);
        this.q = videoOverlayView;
        com.vk.movika.sdk.android.defaultplayer.interactive.a aVar = new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r = msy.a(lazyThreadSafetyMode, aVar);
        this.s = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.android.defaultplayer.interactive.b(10));
        this.t = androidx.compose.runtime.k.b(null);
        composeView2.setContent(new jai(-1140034628, new bo3(this, 6), true));
    }

    public static s6s0 s6(sst0.b bVar) {
        UserId userId;
        VideoFile videoFile = bVar.a;
        Owner s = videoFile.s();
        if (s == null || (userId = s.b) == null) {
            userId = UserId.d;
        }
        UserId userId2 = userId;
        UiTracker uiTracker = UiTracker.a;
        return new s6s0(videoFile, "videos_group", userId2, null, false, null, false, false, false, null, null, null, UiTracker.c().name(), false, null, false, null, false, null, null, null, false, 536608752);
    }

    @Override // xsna.vif0
    public final void i6(sst0.b bVar) {
        rmw.g gVar;
        PreviewViewState.w wVar;
        VideoCardViewState videoCardViewState;
        String str;
        DonutPriceTemplate donutPriceTemplate;
        sst0.b bVar2 = bVar;
        this.u = bVar2;
        sst0.b.c cVar = bVar2.b;
        VideoFile videoFile = bVar2.a;
        int i = 4;
        if (cVar != null) {
            String str2 = cVar.a;
            sst0.b.a aVar = cVar.c;
            PreviewViewState b = PreviewViewState.a0.b(new rmw.g(videoFile.getImage().b), false, new PreviewViewState.DurationBadge(new mno0.i(gpt0.m(this.itemView.getContext(), videoFile, true, false)), false, null, 6), new PreviewViewState.l((aVar == null || (donutPriceTemplate = aVar.b) == null) ? (aVar == null || (str = aVar.a) == null) ? new mno0.i(str2) : new mno0.i(str) : new mno0.a(new xa2(donutPriceTemplate, 3)), new mno0.i(str2)), null, null, null, null, null, null, null, 2032);
            ucp ucpVar = ucp.a;
            VideoMetaViewState.i iVar = new VideoMetaViewState.i(nno0.d(ucp.i(videoFile.getTitle())), 2);
            gpt0 gpt0Var = gpt0.a;
            mno0.i d = nno0.d(gpt0.k(this.itemView.getContext(), videoFile));
            Context context = this.itemView.getContext();
            videoCardViewState = new VideoCardViewState(b, new VideoCardViewState.c(null, new VideoMetaViewState(iVar, new VideoMetaViewState.a(null, null, null, false, nno0.d(uqm0.g(videoFile.L8()) ? context.getResources().getString(R.string.views_count_raw, uqm0.f(videoFile.L8())) : context.getResources().getQuantityString(R.plurals.views_count, videoFile.L8(), Integer.valueOf(videoFile.L8()))), d, null, 1, 79), i), null, null));
        } else {
            VideoMetaViewState.c cVar2 = bVar2.c != null ? new VideoMetaViewState.c(new mno0.g(R.string.donut_video_chip), this.itemView.getContext().getString(R.string.donut_video_icon_hint_accessibility)) : null;
            rmw.g gVar2 = new rmw.g(videoFile.getImage().b);
            PreviewViewState.DurationBadge durationBadge = new PreviewViewState.DurationBadge(new mno0.i(gpt0.m(this.itemView.getContext(), videoFile, true, false)), false, null, 6);
            PreviewViewState.n nVar = this.n.m(videoFile) ? new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_lock_16), null, null, VkColorToken.TextContrast, 4) : null;
            Long v4 = videoFile.v4();
            if (v4 != null) {
                long longValue = v4.longValue();
                gVar = gVar2;
                wVar = new PreviewViewState.w(TimelineViewState.a.a(longValue, longValue, videoFile.getDuration()));
            } else {
                gVar = gVar2;
                wVar = null;
            }
            PreviewViewState b2 = PreviewViewState.a0.b(gVar, false, durationBadge, nVar, null, null, null, null, null, wVar, null, 1520);
            ucp ucpVar2 = ucp.a;
            VideoMetaViewState.i iVar2 = new VideoMetaViewState.i(nno0.d(ucp.i(videoFile.getTitle())), 2);
            mno0.i d2 = nno0.d(gpt0.k(this.itemView.getContext(), videoFile));
            Context context2 = this.itemView.getContext();
            VideoMetaViewState videoMetaViewState = new VideoMetaViewState(iVar2, new VideoMetaViewState.a(null, null, null, false, nno0.d(uqm0.g(videoFile.L8()) ? context2.getResources().getString(R.string.views_count_raw, uqm0.f(videoFile.L8())) : context2.getResources().getQuantityString(R.plurals.views_count, videoFile.L8(), Integer.valueOf(videoFile.L8()))), d2, cVar2, 1, 15), i);
            boolean z = !fxc0.B().c(videoFile) && fxc0.B().f0(s6(bVar2));
            videoCardViewState = new VideoCardViewState(b2, new VideoCardViewState.c(null, videoMetaViewState, z ? new rmw.d(R.drawable.vk_icon_more_vertical_24) : null, z ? new mno0.g(R.string.accessibility_actions) : null));
        }
        ((zak0) this.t).setValue(videoCardViewState);
    }

    public final void q6(VideoCardViewState videoCardViewState, final sst0.b bVar, androidx.compose.runtime.a aVar, int i) {
        VideoMetaViewState.a aVar2;
        VideoMetaViewState.c cVar;
        VideoMetaViewState.a aVar3;
        PreviewViewState previewViewState = videoCardViewState.a;
        androidx.compose.runtime.a M = aVar.M(943574539);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(943574539, i, -1, "com.vk.profile.core.tabs.ui.videos.CommunityProfileVideoItemViewHolderRedesigned.SetupClickHandlers (CommunityProfileVideoItemViewHolderRedesigned.kt:112)");
        }
        final boolean z = bVar.b != null;
        dai.c b = previewViewState.a.b();
        boolean l = M.l(z) | M.y(this) | M.y(bVar);
        Object x = M.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (l || x == c0012a) {
            x = new gzs() { // from class: xsna.xuh
                @Override // xsna.gzs
                public final Object invoke() {
                    boolean z2 = z;
                    avh avhVar = this;
                    sst0.b bVar2 = bVar;
                    if (z2) {
                        avhVar.t6(bVar2);
                    } else {
                        avhVar.v6(bVar2);
                    }
                    return s3q0.a;
                }
            };
            M.R(x);
        }
        b.c((gzs) x, M, 0);
        VideoCardViewState.c c = videoCardViewState.c();
        dai.c cVar2 = null;
        dai.c d = c != null ? c.d() : null;
        if (d == null) {
            M.K(-531310131);
        } else {
            M.K(537050292);
            boolean l2 = M.l(z) | M.y(this) | M.y(bVar);
            Object x2 = M.x();
            if (l2 || x2 == c0012a) {
                x2 = new yuh(z, this, bVar, 0);
                M.R(x2);
            }
            d.c((gzs) x2, M, 0);
        }
        M.j();
        VideoCardViewState.c c2 = videoCardViewState.c();
        dai.c b2 = c2 != null ? c2.b() : null;
        if (b2 == null) {
            M.K(-531037889);
        } else {
            M.K(537059074);
            boolean y = M.y(this) | M.y(bVar);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new eg1(4, this, bVar);
                M.R(x3);
            }
            b2.c((gzs) x3, M, 0);
        }
        M.j();
        VideoCardViewState.c c3 = videoCardViewState.c();
        dai.c b3 = (c3 == null || (aVar3 = c3.b.d) == null) ? null : aVar3.b();
        if (b3 == null) {
            M.K(-530844883);
        } else {
            M.K(537065300);
            boolean l3 = M.l(z) | M.y(this) | M.y(bVar);
            Object x4 = M.x();
            if (l3 || x4 == c0012a) {
                x4 = new zuh(z, this, bVar);
                M.R(x4);
            }
            b3.c((gzs) x4, M, 0);
        }
        M.j();
        PreviewViewState.l c4 = previewViewState.c();
        dai.c a = c4 != null ? c4.a() : null;
        if (a == null) {
            M.K(-530555560);
        } else {
            M.K(537074633);
            boolean y2 = M.y(this) | M.y(bVar);
            Object x5 = M.x();
            if (y2 || x5 == c0012a) {
                x5 = new nh3(9, this, bVar);
                M.R(x5);
            }
            a.c((gzs) x5, M, 0);
        }
        M.j();
        VideoCardViewState.c c5 = videoCardViewState.c();
        if (c5 != null && (aVar2 = c5.b.d) != null && (cVar = aVar2.h) != null) {
            cVar2 = cVar.a();
        }
        if (cVar2 == null) {
            M.K(-530352138);
        } else {
            M.K(537081195);
            boolean y3 = M.y(bVar) | M.y(this);
            Object x6 = M.x();
            if (y3 || x6 == c0012a) {
                x6 = new cg1(9, bVar, this);
                M.R(x6);
            }
            cVar2.c((gzs) x6, M, 0);
        }
        M.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wuh(i, 0, this, videoCardViewState, bVar);
        }
    }

    public final void t6(sst0.b bVar) {
        sst0.b.a aVar;
        String str;
        UserId userId;
        sst0.b.c cVar = bVar.b;
        VideoFile videoFile = bVar.a;
        if (cVar == null || (aVar = cVar.c) == null || (str = aVar.c) == null) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        String b = DonutAnalytics.b(str, UiTracker.d());
        Owner s = videoFile.s();
        if (s == null || (userId = s.b) == null) {
            userId = UserId.d;
        }
        DonutAnalytics.d(userId, UiTracker.c(), videoFile.o0());
        this.o.a(b);
    }

    public final void v6(sst0.b bVar) {
        VideoFile videoFile = bVar.a;
        d5 d5Var = new d5(5, this, bVar);
        Activity c = g2u0.c(this.itemView);
        if (!fxc0.B().J().v() || videoFile.ab() != OfferVkVideo.LISTING || c == null) {
            d5Var.invoke();
            return;
        }
        g7s0 B = fxc0.B();
        String a1 = videoFile.a1();
        oos0 x = com.vk.toggle.d.x();
        B.K(c, a1, x != null ? x.b : true, com.vk.libvideo.autoplay.j.b(videoFile), d5Var);
    }
}
