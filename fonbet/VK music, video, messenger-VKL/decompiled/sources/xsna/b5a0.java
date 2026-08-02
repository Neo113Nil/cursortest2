package xsna;

import android.content.Context;
import com.vk.dto.photo.PhotoAlbum;

/* compiled from: PhotoAlbumListFragment.java */
/* loaded from: classes16.dex */
public final class b5a0 extends beg0 {
    public final /* synthetic */ PhotoAlbum d;
    public final /* synthetic */ izs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5a0(Context context, PhotoAlbum photoAlbum, izs izsVar) {
        super(context);
        this.d = photoAlbum;
        this.e = izsVar;
    }

    @Override // xsna.beg0
    public final void r() {
        ysg0<Object> ysg0Var = ysg0.b;
        ysg0<Object> ysg0Var2 = ysg0.b;
        PhotoAlbum photoAlbum = this.d;
        ysg0Var2.a(new ok1(photoAlbum.b, photoAlbum.c));
        izs izsVar = this.e;
        if (izsVar != null) {
            izsVar.invoke(photoAlbum);
        }
    }
}
