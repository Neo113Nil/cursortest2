package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vkontakte.android.R;

/* compiled from: LinearPlayerViewHolderDelegate2.kt */
/* loaded from: classes7.dex */
public final class l8z implements g5b0 {
    public final ViewGroup a;
    public final rcg0 b;

    public l8z(ViewGroup viewGroup, rcg0 rcg0Var) {
        this.a = viewGroup;
        this.b = rcg0Var;
        viewGroup.findViewById(R.id.bottom_panel).setVisibility(8);
    }

    @Override // xsna.g5b0
    public final void init() {
        gky gkyVar = new gky(2);
        ViewGroup viewGroup = this.a;
        View l = awt0.l(viewGroup, gkyVar);
        VideoFullscreenBottomBarView videoFullscreenBottomBarView = l instanceof VideoFullscreenBottomBarView ? (VideoFullscreenBottomBarView) l : null;
        if (videoFullscreenBottomBarView != null) {
            videoFullscreenBottomBarView.setAreCommentsDisabled(false);
        }
        View l2 = awt0.l(viewGroup, new f6w(5));
        VideoToolbarView videoToolbarView = l2 instanceof VideoToolbarView ? (VideoToolbarView) l2 : null;
        if (videoToolbarView != null) {
            videoToolbarView.u = (VideoToolbarView.a) new zqh(this, 22).invoke(videoToolbarView.u);
        }
    }

    @Override // xsna.g5b0
    public final void clear() {
    }

    @Override // xsna.g5b0
    public final void Q(VideoMinimizableState videoMinimizableState) {
    }

    @Override // xsna.g5b0
    public final void a(l4x l4xVar) {
    }
}
