package xsna;

import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* compiled from: CallZoomHelper.kt */
/* loaded from: classes7.dex */
public final class jb9 implements TextureViewRenderer.SizeChangeListener {
    public final /* synthetic */ gb9 a;

    public jb9(gb9 gb9Var) {
        this.a = gb9Var;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.TextureViewRenderer.SizeChangeListener
    public final void onFrameSizeChanged(int i, int i2) {
        gb9 gb9Var = this.a;
        if (gb9Var.e == i && gb9Var.f == i2) {
            return;
        }
        gb9Var.e = i;
        gb9Var.f = i2;
        gb9Var.c(true);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.TextureViewRenderer.SizeChangeListener
    public final void onTextureSizeChanged(int i, int i2) {
        gb9 gb9Var = this.a;
        if ((gb9Var.c == i && gb9Var.d == i2) || i == 0 || i2 == 0) {
            return;
        }
        gb9Var.c = i;
        gb9Var.d = i2;
        float[] fArr = gb9Var.r;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = i;
        fArr[3] = i2;
        gb9Var.c(!gb9Var.g);
        gb9Var.g = false;
    }
}
