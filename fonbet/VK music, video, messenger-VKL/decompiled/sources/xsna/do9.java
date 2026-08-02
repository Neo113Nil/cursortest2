package xsna;

import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.spinner.VkSpinnerContent;

/* compiled from: CameraUIView.kt */
/* loaded from: classes17.dex */
public final class do9 implements VkSpinnerContent.b {
    public final /* synthetic */ f1 a;
    public final /* synthetic */ CameraUIView b;

    public do9(f1 f1Var, CameraUIView cameraUIView) {
        this.a = f1Var;
        this.b = cameraUIView;
    }

    @Override // com.vk.core.view.components.spinner.VkSpinnerContent.b
    public final void onCancel() {
        this.a.invoke();
        float f = CameraUIView.w1;
        this.b.N();
    }
}
