package xsna;

import com.vk.content.design.view.camera.CameraUIView;
import com.vk.log.L;
import com.vk.masks.dynamic.DynamicMasksUseCase;
import com.vk.medianative.MediaNative;
import kotlin.NoWhenBranchMatchedException;
import xsna.eqo;

/* compiled from: MasksLibDynamicLoader.kt */
/* loaded from: classes16.dex */
public final class zh10 implements eqo.a<DynamicMasksUseCase> {
    public final /* synthetic */ CameraUIView.j a;
    public final /* synthetic */ hg b;

    public zh10(CameraUIView.j jVar, hg hgVar) {
        this.a = jVar;
        this.b = hgVar;
    }

    @Override // xsna.eqo.a
    public final void a(boolean z) {
        bm9 presenter = CameraUIView.this.getPresenter();
        if (presenter != null) {
            presenter.z4(z);
        }
        L.e("MasksLibDynamicLoader", zhy0.a("GLEffects dynamic library loading state changed, loading=", z));
    }

    @Override // xsna.eqo.a
    public final void b(DynamicMasksUseCase dynamicMasksUseCase) {
        DynamicMasksUseCase dynamicMasksUseCase2 = dynamicMasksUseCase;
        L.e("MasksLibDynamicLoader", "Success loading for useCase: " + dynamicMasksUseCase2);
        CameraUIView cameraUIView = CameraUIView.this;
        int i = CameraUIView.j.a.$EnumSwitchMapping$0[dynamicMasksUseCase2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                CameraUIView.C(cameraUIView);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                CameraUIView.C(cameraUIView);
            }
        }
        try {
            if (MediaNative.checkOrLoadGLEffects()) {
                L.e("MasksLibDynamicLoader", "GLEffects dynamic library was successfully downloaded and attached");
            } else {
                L.l("MasksLibDynamicLoader", "GLEffects dynamic library was downloaded but attaching failed");
            }
        } catch (Throwable th) {
            L.l("MasksLibDynamicLoader", ms9.b("GLEffects dynamic library was downloaded but attaching failed. error: ", th));
        }
        if (MediaNative.isGLEffectsLibSupported()) {
            this.b.invoke();
        } else {
            L.l("MasksLibDynamicLoader", "GLEffects dynamic library attaching failed");
        }
    }

    @Override // xsna.eqo.a
    public final void c(DynamicMasksUseCase dynamicMasksUseCase) {
        L.l("MasksLibDynamicLoader", "Cancelled loading for useCase: " + dynamicMasksUseCase);
    }

    @Override // xsna.eqo.a
    public final void d(DynamicMasksUseCase dynamicMasksUseCase, Throwable th) {
        L.l("MasksLibDynamicLoader", "Error loading for useCase: " + dynamicMasksUseCase + " and error: " + th);
    }
}
