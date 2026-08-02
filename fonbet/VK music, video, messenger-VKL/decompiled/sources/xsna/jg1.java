package xsna;

import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vkontakte.android.R;
import xsna.gg1;
import xsna.tlo0;

/* compiled from: AlbumDetailsFeature.kt */
/* loaded from: classes4.dex */
public final class jg1 implements gg1.b {
    public final /* synthetic */ PhotoAlbumWrapper a;
    public final /* synthetic */ gg1 b;

    public jg1(PhotoAlbumWrapper photoAlbumWrapper, gg1 gg1Var) {
        this.a = photoAlbumWrapper;
        this.b = gg1Var;
    }

    @Override // xsna.gg1.b
    public final void a(int i) {
        PhotoAlbumWrapper photoAlbumWrapper = this.a;
        boolean z = photoAlbumWrapper instanceof PhotoAlbumWrapper.CommonPhotoAlbum;
        int i2 = z ? i == 1 ? R.string.photo_flow_photo_moved : R.string.photo_flow_photos_moved : i == 1 ? R.string.photo_moved_to_tab : R.string.photos_moved_to_photoflow;
        int i3 = z ? R.string.photo_flow_navigate_to_album_after_move : R.string.to_photo_flow_after_move;
        tlo0.a aVar = tlo0.Companion;
        Object[] objArr = {photoAlbumWrapper.getTitle()};
        aVar.getClass();
        tlo0.g c = tlo0.a.c(i2, objArr);
        tlo0.f fVar = new tlo0.f(i3);
        gg1 gg1Var = this.b;
        gg1Var.b0(new ig1(0, gg1Var, photoAlbumWrapper), fVar, c);
    }

    @Override // xsna.gg1.b
    public final void b() {
        tlo0.Companion.getClass();
        this.b.Z(null, null, new tlo0.f(R.string.album_details_move_partial_success));
    }

    @Override // xsna.gg1.b
    public final void c() {
        tlo0.Companion.getClass();
        this.b.Z(null, null, new tlo0.f(R.string.album_details_move_photo_error));
    }
}
