package xsna;

import com.vk.content.design.view.camera.CameraUIView;
import com.vk.stories.analytics.StoryPublishEvent;
import xsna.zd9;

/* compiled from: CameraUIView.kt */
/* loaded from: classes17.dex */
public final class yn9 implements zd9.c {
    public final /* synthetic */ CameraUIView a;

    public yn9(CameraUIView cameraUIView) {
        this.a = cameraUIView;
    }

    @Override // xsna.zd9.c
    public final void a() {
        am9 K3;
        bm9 presenter = this.a.getPresenter();
        if (presenter == null || (K3 = presenter.K3()) == null) {
            return;
        }
        K3.c(StoryPublishEvent.CLOSE_CAMERA, null);
    }

    @Override // xsna.zd9.c
    public final void b() {
        am9 K3;
        bm9 presenter = this.a.getPresenter();
        if (presenter == null || (K3 = presenter.K3()) == null) {
            return;
        }
        K3.b("open_camera", null);
        nf9.j(StoryPublishEvent.OPEN_CAMERA, K3.a, null, null, new com.vk.movika.sdk.base.observable.w(K3, 14), 28);
    }

    @Override // xsna.zd9.c
    public final void c() {
        am9 K3;
        bm9 presenter = this.a.getPresenter();
        if (presenter == null || (K3 = presenter.K3()) == null) {
            return;
        }
        K3.b("focus", null);
        K3.c(StoryPublishEvent.FOCUS, new pz(K3, 9));
    }

    @Override // xsna.zd9.c
    public final void d(boolean z) {
        am9 K3;
        bm9 presenter = this.a.getPresenter();
        if (presenter == null || (K3 = presenter.K3()) == null) {
            return;
        }
        K3.c(z ? StoryPublishEvent.LIGHT_ON : StoryPublishEvent.LIGHT_OFF, null);
    }
}
