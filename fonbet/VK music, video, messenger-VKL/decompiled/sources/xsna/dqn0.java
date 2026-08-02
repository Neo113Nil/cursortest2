package xsna;

import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import java.io.File;

/* compiled from: SystemGalleryInteractor.kt */
/* loaded from: classes15.dex */
public abstract class dqn0 extends wqn0 {
    public final GalleryFragmentImpl h;
    public final io.reactivex.rxjava3.disposables.b i;

    public dqn0(GalleryFragmentImpl galleryFragmentImpl, io.reactivex.rxjava3.disposables.b bVar, t4t t4tVar, q3t q3tVar, gzs gzsVar) {
        super(galleryFragmentImpl, t4tVar, q3tVar, gzsVar);
        this.h = galleryFragmentImpl;
        this.i = bVar;
    }

    public abstract void f(int i, File file);
}
