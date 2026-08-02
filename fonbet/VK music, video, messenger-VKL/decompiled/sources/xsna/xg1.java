package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;

/* compiled from: AlbumDetailsFragmentBuilder.kt */
/* loaded from: classes4.dex */
public final class xg1 extends oz50 {
    public xg1() {
        super(AlbumDetailsFragment.class, null, null);
    }

    public final void A() {
        this.j.putBoolean("EDIT_MODE_KEY", true);
    }

    public final void B(UserId userId) {
        this.j.putParcelable("uid", userId);
    }

    public final void y(PhotoAlbum photoAlbum) {
        this.j.putParcelable("album", photoAlbum);
    }

    public final void z(int i) {
        this.j.putInt("album_id", i);
    }
}
