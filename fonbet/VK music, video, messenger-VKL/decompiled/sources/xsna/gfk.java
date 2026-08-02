package xsna;

import com.vk.photo.editor.views.RotatingView;
import xsna.hfk;

/* compiled from: CropContentOverlayView.kt */
/* loaded from: classes4.dex */
public final class gfk implements RotatingView.a {
    public final /* synthetic */ hfk a;

    public gfk(hfk hfkVar) {
        this.a = hfkVar;
    }

    @Override // com.vk.photo.editor.views.RotatingView.a
    public final void c() {
        this.a.k(false);
    }

    @Override // com.vk.photo.editor.views.RotatingView.a
    public final void d(float f, boolean z) {
        hfk.a aVar = this.a.F;
        if (aVar != null) {
            aVar.d(f, z);
        }
    }

    @Override // com.vk.photo.editor.views.RotatingView.a
    public final void e() {
        this.a.u = 0;
    }

    @Override // com.vk.photo.editor.views.RotatingView.a
    public final void f() {
        this.a.k(true);
    }
}
