package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.libvideo.ui.VideoBottomBarView;
import com.vk.movika.api.InteractiveData;
import com.vk.toggle.Features;
import one.video.controls.views.VideoShortActions;
import xsna.acx;

/* compiled from: FullInteractiveVideoViewWithBars.kt */
/* loaded from: classes3.dex */
public final class fvs extends evs {
    public final Context Z;
    public final com.vk.libvideo.autoplay.a a0;
    public final boolean b0;
    public final VKImageView c0;
    public final VideoToolbarView d0;
    public final VideoShortActions e0;
    public final VideoBottomPanelView f0;

    public fvs(Context context, boolean z, boolean z2, boolean z3) {
        super(context);
        this.Z = context;
        this.a0 = com.vk.libvideo.autoplay.a.a(com.vk.libvideo.autoplay.a.t, null, null, null, null, PlayerType.FULLSCREEN, ScreenType.PORTRAIT, 425982);
        boolean z4 = true;
        this.b0 = true;
        this.c0 = z3 ? new VKImageView(context, null, 6, 0) : this.G;
        Features.Type type = Features.Type.FEATURE_VIDEO_SHORT_ACTIONS;
        type.getClass();
        if (!com.vk.toggle.b.A.a(type) && !fxc0.B().J().J1()) {
            z4 = false;
        }
        VideoToolbarView videoToolbarView = (z3 || (z && !z4)) ? new VideoToolbarView(context, null) : null;
        this.d0 = videoToolbarView;
        this.e0 = null;
        VideoBottomPanelView videoBottomPanelView = z2 ? new VideoBottomPanelView(context, null, 6, 0) : null;
        this.f0 = videoBottomPanelView;
        BuildInfo.q();
        if (videoToolbarView == null && videoBottomPanelView == null) {
            return;
        }
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(this.E.p);
        if (videoToolbarView != null) {
            videoToolbarView.setId(View.generateViewId());
            this.E.p.addView(videoToolbarView, -1, -2);
            N().r.a.add(videoToolbarView);
            bVar.k(videoToolbarView.getId(), 3, 0, 3);
            bVar.k(videoToolbarView.getId(), 6, 0, 6);
            bVar.k(videoToolbarView.getId(), 7, 0, 7);
            bVar.n(videoToolbarView.getId(), -2);
            videoToolbarView.setVideoActionsCallback(y());
        }
        if (videoBottomPanelView != null) {
            videoBottomPanelView.setId(View.generateViewId());
            this.E.p.addView(videoBottomPanelView, -1, -2);
            bVar.h(this.E.f.getId(), 4);
            bVar.k(videoBottomPanelView.getId(), 4, 0, 4);
            bVar.k(this.E.f.getId(), 4, videoBottomPanelView.getId(), 3);
            bVar.k(videoBottomPanelView.getId(), 6, 0, 6);
            bVar.k(videoBottomPanelView.getId(), 7, 0, 7);
            bVar.n(videoBottomPanelView.getId(), -2);
        }
        bVar.b(this.E.p);
    }

    @Override // xsna.evs, xsna.ef6, xsna.mnt0
    public final void G2(View view) {
        a(new acx.o(this.Z));
    }

    @Override // xsna.evs
    public final boolean O() {
        return this.b0;
    }

    @Override // xsna.evs, xsna.ef6, xsna.rcx
    public final void P(boolean z, boolean z2) {
        Configuration configuration;
        super.P(z, z2);
        VideoBottomPanelView videoBottomPanelView = this.f0;
        if (videoBottomPanelView != null) {
            bwt0.p0(videoBottomPanelView, !z);
        }
        if (videoBottomPanelView != null) {
            videoBottomPanelView.setShowPlaylist(this.Q);
        }
        VideoToolbarView videoToolbarView = this.d0;
        if (videoToolbarView != null) {
            InteractiveData interactiveData = this.j;
            VideoFile videoFile = interactiveData != null ? interactiveData.a : null;
            if (videoFile == null) {
                return;
            }
            Resources resources = videoToolbarView.getResources();
            videoToolbarView.d(null, videoFile, true, (resources == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true, this.Q);
        }
        if (!this.l.u.a || videoToolbarView == null) {
            return;
        }
        f4m.j(videoToolbarView);
    }

    @Override // xsna.evs, xsna.mnt0
    public final com.vk.libvideo.autoplay.a getVideoConfig() {
        return this.a0;
    }

    @Override // xsna.evs, xsna.ef6
    public final VKImageView r() {
        return this.c0;
    }

    @Override // xsna.evs, xsna.ef6, xsna.rcx
    public final void t1(VideoFile videoFile) {
        VideoFile videoFile2;
        Configuration configuration;
        super.t1(videoFile);
        VideoToolbarView videoToolbarView = this.d0;
        if (videoToolbarView != null) {
            Resources resources = videoToolbarView.getResources();
            videoFile2 = videoFile;
            videoToolbarView.d(null, videoFile2, true, (resources == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true, this.Q);
        } else {
            videoFile2 = videoFile;
        }
        VideoBottomPanelView videoBottomPanelView = this.f0;
        if (videoBottomPanelView != null) {
            videoBottomPanelView.setShowPlaylist(this.Q);
        }
        if (videoBottomPanelView != null) {
            videoBottomPanelView.P4(videoFile2, true);
        }
        this.E.y.c(new djs0(videoFile2).c(), false);
    }

    @Override // xsna.evs, xsna.ef6, xsna.rcx
    public final void y0(InteractiveData interactiveData) {
        super.y0(interactiveData);
        this.Q = interactiveData.i;
        VideoToolbarView videoToolbarView = this.d0;
        if (videoToolbarView != null) {
            videoToolbarView.d(null, interactiveData.a, true, videoToolbarView.getResources().getConfiguration().orientation == 2, this.Q);
        }
        VideoShortActions videoShortActions = this.e0;
        if (videoShortActions != null) {
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            videoShortActions.setAutoplayEnabled(com.vk.libvideo.autoplay.e.a());
        }
        VideoBottomPanelView videoBottomPanelView = this.f0;
        if (videoBottomPanelView != null) {
            fbs0 fbs0Var = this.z;
            if (fbs0Var != null) {
                videoBottomPanelView.setButtonsOnClickListener(fbs0Var);
            }
            videoBottomPanelView.setShowPlaylist(this.Q);
            videoBottomPanelView.P4(interactiveData.a, true);
            VideoBottomBarView videoBottomBarView = videoBottomPanelView.v;
            videoBottomBarView.getClass();
            if (fxc0.B().s().isEnabled()) {
                videoBottomBarView.i.c(gpt0.F(null), null);
            }
        }
    }
}
