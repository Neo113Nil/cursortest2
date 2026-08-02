package xsna;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.legacy.EditAlbumFragment;

/* compiled from: EditAlbumFragment.java */
/* loaded from: classes16.dex */
public final class azo extends rpj0<PhotoAlbum> {
    public final /* synthetic */ EditAlbumFragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azo(EditAlbumFragment editAlbumFragment, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.d = editAlbumFragment;
    }

    @Override // xsna.hx2
    public final void b(Object obj) {
        PhotoAlbum photoAlbum = (PhotoAlbum) obj;
        EditAlbumFragment editAlbumFragment = this.d;
        if (editAlbumFragment.getActivity() != null) {
            ysg0.b.a(new cl1(photoAlbum));
        }
        editAlbumFragment.Mf(-1, new Intent().putExtra("album", photoAlbum));
    }
}
