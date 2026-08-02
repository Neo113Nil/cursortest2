package xsna;

import android.net.Uri;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import java.io.File;

/* compiled from: QrSystemGalleryInteractor.kt */
/* loaded from: classes15.dex */
public final class eoe0 extends dqn0 {
    public final xne0 j;

    public eoe0(GalleryFragmentImpl galleryFragmentImpl, t4t t4tVar, r3t r3tVar, io.reactivex.rxjava3.disposables.b bVar, xne0 xne0Var) {
        super(galleryFragmentImpl, bVar, t4tVar, r3tVar, cqn0.b);
        this.j = xne0Var;
    }

    @Override // xsna.wqn0
    public final String d() {
        return "system_gallery";
    }

    @Override // xsna.wqn0
    public final String e() {
        return "QrSystemGalleryInteractor";
    }

    @Override // xsna.dqn0
    public final void f(int i, File file) {
        xne0 xne0Var = this.j;
        io.reactivex.rxjava3.disposables.c cVar = xne0Var.f;
        if (cVar != null) {
            cVar.dispose();
        }
        xne0Var.b(Uri.fromFile(file), null, -1);
    }
}
