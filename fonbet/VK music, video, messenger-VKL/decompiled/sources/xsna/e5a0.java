package xsna;

import com.vk.api.photos.PhotosGetAlbums;
import com.vk.dto.photo.PhotoAlbum;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PhotoAlbumPresenter.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class e5a0 extends FunctionReferenceImpl implements izs<PhotosGetAlbums.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(PhotosGetAlbums.a aVar) {
        PhotoAlbum photoAlbum;
        g5a0 g5a0Var = (g5a0) this.receiver;
        g5a0Var.getClass();
        Iterator<PhotoAlbum> it = aVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                photoAlbum = null;
                break;
            }
            photoAlbum = it.next();
            PhotoAlbum photoAlbum2 = photoAlbum;
            PhotoAlbum photoAlbum3 = g5a0Var.h;
            if (photoAlbum3 != null && photoAlbum2.b == photoAlbum3.b) {
                break;
            }
        }
        PhotoAlbum photoAlbum4 = photoAlbum;
        if (photoAlbum4 != null) {
            g5a0Var.h = photoAlbum4;
            ((v4a0) g5a0Var.c).C1(photoAlbum4);
        }
        return s3q0.a;
    }
}
