package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.ui.VideoBottomBarView;
import com.vk.libvideo.ui.VideoChevronMode;
import com.vk.movika.api.InteractiveData;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.views.VideoShortActions;
import xsna.dcx;

/* compiled from: MinimizableInteractiveView.kt */
/* loaded from: classes3.dex */
public final class yr20 extends evs implements scx {
    public final Context Z;
    public final VideoToolbarView a0;
    public final VideoShortActions b0;
    public final VideoBottomPanelView c0;
    public final List<View> d0;

    public yr20(Context context, rcg0 rcg0Var) {
        super(context);
        this.Z = context;
        VideoToolbarView videoToolbarView = new VideoToolbarView(context, null);
        videoToolbarView.setToolbarSettings(VideoToolbarView.a.a(videoToolbarView.getToolbarSettings(), VideoChevronMode.Minimize, rcg0Var, 8));
        this.a0 = videoToolbarView;
        VideoShortActions videoShortActions = new VideoShortActions(context, null, 0, 14, 0);
        this.b0 = videoShortActions;
        VideoBottomPanelView videoBottomPanelView = new VideoBottomPanelView(context, null, 6, 0);
        this.c0 = videoBottomPanelView;
        View view = this.y;
        c4u0 c4u0Var = this.E;
        this.d0 = e43.l(view, c4u0Var.o, c4u0Var.p, c4u0Var.C, c4u0Var.A, videoToolbarView, videoShortActions, videoBottomPanelView);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        c4u0 c4u0Var2 = this.E;
        bVar.i(c4u0Var2.p);
        N().r.b = true;
        videoToolbarView.setId(View.generateViewId());
        ConstraintLayout constraintLayout = c4u0Var2.p;
        constraintLayout.addView(videoToolbarView, -1, -2);
        N().r.a.add(videoToolbarView);
        bVar.k(videoToolbarView.getId(), 3, 0, 3);
        bVar.k(videoToolbarView.getId(), 6, 0, 6);
        bVar.k(videoToolbarView.getId(), 7, 0, 7);
        bVar.n(videoToolbarView.getId(), -2);
        videoToolbarView.setVideoActionsCallback(y());
        f4m.j(videoToolbarView);
        videoShortActions.setId(View.generateViewId());
        constraintLayout.addView(videoShortActions, -1, -2);
        N().r.a.add(videoShortActions);
        videoShortActions.setListener(new a());
        videoShortActions.setAutoplayVisibility(false);
        bVar.k(videoShortActions.getId(), 3, 0, 3);
        bVar.k(videoShortActions.getId(), 6, 0, 6);
        bVar.k(videoShortActions.getId(), 7, 0, 7);
        bVar.n(videoShortActions.getId(), -2);
        f4m.j(videoShortActions);
        videoBottomPanelView.setId(View.generateViewId());
        constraintLayout.addView(videoBottomPanelView, -1, -2);
        DefaultSeekBarView defaultSeekBarView = c4u0Var2.f;
        bVar.h(defaultSeekBarView.getId(), 4);
        bVar.k(videoBottomPanelView.getId(), 4, 0, 4);
        bVar.k(defaultSeekBarView.getId(), 4, videoBottomPanelView.getId(), 3);
        bVar.k(videoBottomPanelView.getId(), 6, 0, 6);
        bVar.k(videoBottomPanelView.getId(), 7, 0, 7);
        bVar.n(videoBottomPanelView.getId(), -2);
        f4m.j(videoBottomPanelView);
        bVar.b(constraintLayout);
    }

    @Override // xsna.evs, xsna.ef6
    public final boolean A() {
        return true;
    }

    @Override // xsna.evs, xsna.rcx
    public final void E2(boolean z) {
        this.Q = z;
    }

    @Override // xsna.ef6
    public final void K() {
        i0q0.d(50L, new rc4(this, 10));
    }

    @Override // xsna.evs, xsna.ef6, xsna.rcx
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        InteractiveData interactiveData = this.j;
        VideoFile videoFile = interactiveData != null ? interactiveData.a : null;
        if (videoFile == null) {
            return;
        }
        this.a0.d(null, videoFile, true, z, this.Q);
    }

    @Override // xsna.scx
    public final View e(dcx dcxVar) {
        if (dcxVar.equals(dcx.e.a)) {
            return this.b0;
        }
        if (dcxVar.equals(dcx.f.a)) {
            return this.a0;
        }
        if (dcxVar.equals(dcx.a.a)) {
            return this.c0;
        }
        boolean equals = dcxVar.equals(dcx.b.a);
        c4u0 c4u0Var = this.E;
        if (equals) {
            return c4u0Var.C;
        }
        if (dcxVar.equals(dcx.c.a)) {
            return (this.f && this.d) ? c4u0Var.g : c4u0Var.f;
        }
        if (dcxVar.equals(dcx.d.a)) {
            return c4u0Var.A;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.evs, xsna.ef6, xsna.rcx
    public final void t1(VideoFile videoFile) {
        Configuration configuration;
        super.t1(videoFile);
        Resources resources = this.Z.getResources();
        this.a0.d(null, videoFile, true, (resources == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true, this.Q);
        boolean z = this.Q;
        VideoBottomPanelView videoBottomPanelView = this.c0;
        videoBottomPanelView.setShowPlaylist(z);
        videoBottomPanelView.P4(videoFile, true);
        this.E.y.c(new djs0(videoFile).c(), false);
    }

    @Override // xsna.evs, xsna.ef6, xsna.rcx
    public final void y0(InteractiveData interactiveData) {
        Configuration configuration;
        super.y0(interactiveData);
        this.Q = interactiveData.i;
        VideoFile videoFile = interactiveData.a;
        Resources resources = this.Z.getResources();
        this.a0.d(null, videoFile, true, (resources == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true, interactiveData.i);
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        this.b0.setAutoplayEnabled(com.vk.libvideo.autoplay.e.a());
        fbs0 fbs0Var = this.z;
        VideoBottomPanelView videoBottomPanelView = this.c0;
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

    /* compiled from: MinimizableInteractiveView.kt */
    public final class a implements VideoShortActions.a {
        public a() {
        }

        @Override // one.video.controls.views.VideoShortActions.a
        public final void l() {
            yr20.this.y().bk(new qws0(15, null, false));
        }

        @Override // one.video.controls.views.VideoShortActions.a
        public final void o(boolean z) {
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            com.vk.libvideo.autoplay.e.d(z);
        }

        @Override // one.video.controls.views.VideoShortActions.a
        public final void p() {
            yr20.this.y().bk(pws0.a);
        }

        @Override // one.video.controls.views.VideoShortActions.a
        public final void n() {
        }
    }

    @Override // xsna.ef6
    public final void D() {
    }
}
