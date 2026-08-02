package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vk.core.ui.image.VKImageController;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class s9q0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ com.vk.clips.design.view.component.video.preview.b b;
    public final /* synthetic */ w9q0 c;

    public s9q0(com.vk.clips.design.view.component.video.preview.b bVar, w9q0 w9q0Var) {
        this.b = bVar;
        this.c = w9q0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        cno<ImageView> cnoVar = this.b.d;
        if (cnoVar != null) {
            VKImageController.a.a(cnoVar, this.c.a);
        }
    }
}
