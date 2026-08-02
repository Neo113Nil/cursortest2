package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.masks.dynamic.DynamicMasksUseCase;

/* compiled from: MasksLibDynamicLoader.kt */
/* loaded from: classes16.dex */
public final class ai10 {
    public final eqo<DynamicMasksUseCase> a;

    public ai10(Context context, boolean z, boolean z2, CameraUIView.j jVar, hg hgVar, View view, ProgressBar progressBar, ImageView imageView) {
        eqo<DynamicMasksUseCase> eqoVar = new eqo<>(context, DynamicTask.GL_EFFECTS, new mqo(context, view, progressBar, imageView, true, new com.vk.masks.dynamic.a()), z, z2);
        this.a = eqoVar;
        eqoVar.h(new zh10(jVar, hgVar));
    }

    public final eqo<DynamicMasksUseCase> a() {
        return this.a;
    }
}
