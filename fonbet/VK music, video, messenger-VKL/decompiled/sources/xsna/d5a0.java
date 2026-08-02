package xsna;

import com.vk.api.photos.PhotosGetAlbums;
import com.vk.dto.photo.PhotoAlbum;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PhotoAlbumPresenter.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class d5a0 extends FunctionReferenceImpl implements izs<PhotosGetAlbums.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(PhotosGetAlbums.a aVar) {
        PhotoAlbum photoAlbum;
        f5a0 f5a0Var = (f5a0) this.receiver;
        f5a0Var.getClass();
        Iterator<PhotoAlbum> it = aVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                photoAlbum = null;
                break;
            }
            photoAlbum = it.next();
            PhotoAlbum photoAlbum2 = photoAlbum;
            PhotoAlbum photoAlbum3 = f5a0Var.g;
            if (photoAlbum3 != null && photoAlbum2.b == photoAlbum3.b) {
                break;
            }
        }
        PhotoAlbum photoAlbum4 = photoAlbum;
        if (photoAlbum4 != null) {
            f5a0Var.g = photoAlbum4;
            ((u4a0) f5a0Var.c).C1(photoAlbum4);
        }
        return s3q0.a;
    }
}
