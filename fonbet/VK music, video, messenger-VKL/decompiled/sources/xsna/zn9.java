package xsna;

import com.vk.content.design.view.camera.CameraUIView;
import xsna.kk9;

/* compiled from: CameraUIView.kt */
/* loaded from: classes17.dex */
public final class zn9 implements kk9.a {
    public final /* synthetic */ CameraUIView a;

    public zn9(CameraUIView cameraUIView) {
        this.a = cameraUIView;
    }

    @Override // xsna.kk9.a
    public final boolean a() {
        an9 state;
        bm9 presenter = this.a.getPresenter();
        return (presenter == null || (state = presenter.getState()) == null || state.p) ? false : true;
    }
}
