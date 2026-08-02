package xsna;

import android.view.View;

/* compiled from: PhotoEditorLargePreviewHolder.kt */
/* loaded from: classes5.dex */
public final class r6a0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ s6a0 b;

    public r6a0(s6a0 s6a0Var) {
        this.b = s6a0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        s6a0 s6a0Var = this.b;
        sly slyVar = s6a0Var.o;
        ((com.vk.attachpicker.a) slyVar).j.add(s6a0Var.u);
        s6a0Var.q6(((com.vk.attachpicker.a) slyVar).k);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        s6a0 s6a0Var = this.b;
        sly slyVar = s6a0Var.o;
        ((com.vk.attachpicker.a) slyVar).j.remove(s6a0Var.u);
    }
}
