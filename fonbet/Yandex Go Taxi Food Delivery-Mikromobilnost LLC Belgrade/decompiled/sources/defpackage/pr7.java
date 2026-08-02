package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.camera.CameraPreview;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ToolbarComponent;

/* loaded from: classes14.dex */
public final class pr7 implements zo31 {
    public final ConstraintLayout a;
    public final CameraPreview b;
    public final AppCompatImageButton c;
    public final AppCompatImageButton d;
    public final ButtonComponent e;
    public final ButtonComponent f;
    public final ToolbarComponent g;

    public pr7(ConstraintLayout constraintLayout, CameraPreview cameraPreview, AppCompatImageButton appCompatImageButton, AppCompatImageButton appCompatImageButton2, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, ToolbarComponent toolbarComponent) {
        this.a = constraintLayout;
        this.b = cameraPreview;
        this.c = appCompatImageButton;
        this.d = appCompatImageButton2;
        this.e = buttonComponent;
        this.f = buttonComponent2;
        this.g = toolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
