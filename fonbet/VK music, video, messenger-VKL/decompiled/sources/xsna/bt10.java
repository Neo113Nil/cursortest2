package xsna;

import com.vk.photoviewer.PhotoViewer;
import java.util.List;

/* compiled from: PhotoViewerModels.kt */
/* loaded from: classes4.dex */
public abstract class bt10 implements PhotoViewer.g {
    public final q4t a;

    public bt10(q4t q4tVar) {
        this.a = q4tVar;
    }

    @Override // com.vk.photoviewer.PhotoViewer.g
    public final String a() {
        return this.a.d();
    }

    @Override // com.vk.photoviewer.PhotoViewer.g
    public final String d() {
        return this.a.a();
    }

    @Override // com.vk.photoviewer.PhotoViewer.g
    public final String e() {
        return this.a.a();
    }

    @Override // com.vk.photoviewer.PhotoViewer.g
    public final List<String> f() {
        q4t q4tVar = this.a;
        return e43.l(q4tVar.d(), q4tVar.a());
    }

    @Override // com.vk.photoviewer.PhotoViewer.g
    public final int getHeight() {
        return this.a.b();
    }

    @Override // com.vk.photoviewer.PhotoViewer.g
    public final int getWidth() {
        return this.a.e();
    }
}
