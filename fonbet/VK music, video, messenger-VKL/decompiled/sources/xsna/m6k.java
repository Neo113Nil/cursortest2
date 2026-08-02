package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumEntryPoint;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import java.util.List;

/* compiled from: CreateAlbumFragmentBuilder.kt */
/* loaded from: classes3.dex */
public final class m6k extends oz50 {
    public m6k() {
        super(CreateAlbumFragment.class, null, null);
    }

    public final void A(List list) {
        this.j.putParcelableArrayList("photos", list != null ? p4g.q(list) : null);
    }

    public final void B() {
        this.j.putBoolean("RESTORE", true);
    }

    public final void C(UserId userId) {
        this.j.putParcelable("uid", userId);
    }

    public final void y(PhotoAlbum photoAlbum) {
        this.j.putParcelable("album", photoAlbum);
    }

    public final void z(CreateAlbumEntryPoint createAlbumEntryPoint) {
        this.j.putParcelable("entry_point", createAlbumEntryPoint);
    }
}
