package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.vk.content.design.view.camera.CameraUIView;

/* compiled from: CameraUIView.kt */
/* loaded from: classes17.dex */
public final class co9 extends ViewOutlineProvider {
    public final /* synthetic */ View a;

    public co9(View view) {
        this.a = view;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        View view2 = this.a;
        outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), CameraUIView.w1);
    }
}
