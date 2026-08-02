package xsna;

import android.content.Context;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.ShutterButton;
import kotlin.NoWhenBranchMatchedException;
import xsna.kqo;

/* compiled from: DynamicLivesPublisherViewDelegate.kt */
/* loaded from: classes16.dex */
public final class lqo extends vdl<kqo> {
    public final CameraUIView.i k;

    public lqo(Context context, ShutterButton shutterButton, CameraUIView.i iVar) {
        super(context, shutterButton, null, 60);
        this.k = iVar;
    }

    @Override // xsna.vdl, xsna.jqo
    public final void b(boolean z) {
        an9 state;
        an9 state2;
        an9 state3;
        CameraUIView cameraUIView = CameraUIView.this;
        bm9 presenter = cameraUIView.getPresenter();
        if (presenter == null || (state3 = presenter.getState()) == null || !state3.u) {
            bm9 presenter2 = cameraUIView.getPresenter();
            if (presenter2 != null && (state2 = presenter2.getState()) != null) {
                state2.u = true;
            }
            bm9 presenter3 = cameraUIView.getPresenter();
            cameraUIView.x((presenter3 == null || (state = presenter3.getState()) == null || !state.n) ? false : true);
        }
    }

    @Override // xsna.vdl, xsna.jqo
    public final void e() {
        an9 state;
        an9 state2;
        an9 state3;
        CameraUIView cameraUIView = CameraUIView.this;
        bm9 presenter = cameraUIView.getPresenter();
        if (presenter == null || (state3 = presenter.getState()) == null || state3.u) {
            bm9 presenter2 = cameraUIView.getPresenter();
            boolean z = false;
            if (presenter2 != null && (state2 = presenter2.getState()) != null) {
                state2.u = false;
            }
            bm9 presenter3 = cameraUIView.getPresenter();
            if (presenter3 != null && (state = presenter3.getState()) != null && state.n) {
                z = true;
            }
            cameraUIView.x(z);
        }
    }

    @Override // xsna.vdl, xsna.jqo
    public final void f(hqo hqoVar, com.vk.movika.sdk.base.ui.r rVar) {
        kqo kqoVar = (kqo) hqoVar;
        if (kqoVar.equals(kqo.a.b)) {
            super.f(kqoVar, rVar);
        } else if (!kqoVar.equals(kqo.b.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
