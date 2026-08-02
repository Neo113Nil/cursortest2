package xsna;

import android.view.View;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.design.view.video.VideoView;
import java.util.ArrayList;
import one.video.controls.views.SkipBackButton;
import one.video.controls.views.SkipForwardButton;
import xsna.xnt0;

/* compiled from: VideoUnderModalBottomSheetBehavior.kt */
/* loaded from: classes14.dex */
public final class vnt0 extends xnt0.a {
    public bot0 a;
    public final /* synthetic */ VideoView b;
    public final /* synthetic */ xnt0.a c;

    public vnt0(VideoView videoView, xnt0.a aVar) {
        this.b = videoView;
        this.c = aVar;
    }

    @Override // xsna.xnt0.a, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        this.b.setUnderBottomSheet(i != 5);
    }

    @Override // xsna.xnt0.a
    public final void d(View view, float f) {
        VideoView videoView = this.b;
        ArrayList<View> v0 = j5g.v0(videoView.getTopBar(), j5g.u0(videoView.getViewBinding().q.getFadeViews(), e43.l(videoView.getViewBinding().G, videoView.getViewBinding().w, videoView.getViewBinding().r.W3(videoView.getContext()), videoView.getViewBinding().u, videoView.getViewBinding().h, videoView.getViewBinding().f, videoView.getViewBinding().i)));
        VideoToolbarView videoToolbarView = videoView.getViewBinding().H;
        if (fxc0.B().J().K1()) {
            v0 = j5g.v0(videoToolbarView, v0);
        }
        SkipBackButton skipBackButton = videoView.getViewBinding().x;
        if (videoView.getViewBinding().z.getSkipBackListener() != null) {
            v0 = j5g.v0(skipBackButton, v0);
        }
        SkipForwardButton skipForwardButton = videoView.getViewBinding().y;
        if (videoView.getViewBinding().z.getSkipForwardListener() != null) {
            v0 = j5g.v0(skipForwardButton, v0);
        }
        for (View view2 : v0) {
            if (view2 != null) {
                view2.setAlpha(f);
            }
        }
        xnt0.a aVar = this.c;
        if (aVar != null) {
            aVar.d(view, f);
        }
        if (this.a == null) {
            this.a = new bot0(videoView, view, e43.l(videoView.getViewBinding().c, videoView.getViewBinding().d, videoView.getViewBinding().l, videoView.getViewBinding().q));
        }
        bot0 bot0Var = this.a;
        if (bot0Var != null) {
            bot0Var.d(view, f);
        }
    }
}
