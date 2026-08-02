package xsna;

import android.view.View;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vkontakte.android.R;

/* compiled from: VideoFullscreenBottomBarView.kt */
/* loaded from: classes2.dex */
public final class wms0 implements k8o {
    public final /* synthetic */ VideoFullscreenBottomBarView a;

    public wms0(VideoFullscreenBottomBarView videoFullscreenBottomBarView) {
        this.a = videoFullscreenBottomBarView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.k8o
    public final xms0 a() {
        int i = VideoFullscreenBottomBarView.l;
        uys0 b = fxc0.B().u0().b(this.a.getContext());
        View view = b instanceof View ? (View) b : null;
        if (view != null) {
            view.setBackgroundResource(R.drawable.vk_ripple_circle_highlight);
        }
        b.setDarkContextMenus(true);
        return new xms0(b);
    }
}
