package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.photo.PhotoAlbum;
import java.util.ArrayList;

/* compiled from: AlbumDiffUtilCallback.kt */
/* loaded from: classes4.dex */
public final class ci1 extends m.e<PhotoAlbum> {
    public static boolean a(PhotoAlbum photoAlbum, PhotoAlbum photoAlbum2) {
        return epx.f(photoAlbum.g, photoAlbum2.g) && photoAlbum.f == photoAlbum2.f && epx.f(photoAlbum.k, photoAlbum2.k) && epx.f(photoAlbum.s, photoAlbum2.s) && epx.f(photoAlbum.u, photoAlbum2.u) && epx.f(photoAlbum.i, photoAlbum2.i);
    }

    public static ArrayList b(PhotoAlbum photoAlbum, PhotoAlbum photoAlbum2) {
        ArrayList arrayList = new ArrayList();
        if (!epx.f(photoAlbum.g, photoAlbum2.g)) {
            arrayList.add(w65.f);
        }
        if (photoAlbum.f != photoAlbum2.f) {
            arrayList.add(kq01.g);
        }
        int i = photoAlbum.f;
        int i2 = photoAlbum2.f;
        boolean z = i != i2 && (i == 0 || i2 == 0);
        if (!epx.f(photoAlbum.k, photoAlbum2.k) || !epx.f(photoAlbum.s, photoAlbum2.s) || !epx.f(photoAlbum.u, photoAlbum2.u) || z) {
            arrayList.add(p490.e);
        }
        if (!epx.f(photoAlbum.i, photoAlbum2.i)) {
            arrayList.add(up2.e);
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(PhotoAlbum photoAlbum, PhotoAlbum photoAlbum2) {
        return a(photoAlbum, photoAlbum2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(PhotoAlbum photoAlbum, PhotoAlbum photoAlbum2) {
        return photoAlbum.b == photoAlbum2.b;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ Object getChangePayload(PhotoAlbum photoAlbum, PhotoAlbum photoAlbum2) {
        return b(photoAlbum, photoAlbum2);
    }
}
