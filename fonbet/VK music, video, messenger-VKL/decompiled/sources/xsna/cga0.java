package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.photos.root.presentation.PhotosRootFragment;
import com.vk.photos.root.tabs.PhotosRootTab;

/* compiled from: PhotosRootFragmentBuilder.kt */
/* loaded from: classes4.dex */
public final class cga0 extends oz50 {
    public cga0() {
        super(PhotosRootFragment.class, null, null);
    }

    public final void A(int i) {
        this.j.putInt("RECOGNITION_TAGS_COUNT", i);
    }

    public final void B(UserId userId) {
        this.j.putParcelable("uid", userId);
    }

    public final void C() {
        this.j.putInt("tab", PhotosRootTab.ALBUMS.h());
    }

    public final void D() {
        this.j.putInt("tab", PhotosRootTab.PHOTO_FLOW.h());
    }

    public final void y(String str) {
        this.j.putString("USER_NAME_GEN", str);
    }

    public final void z(int i) {
        this.j.putInt("PHOTO_TAGS_COUNT", i);
    }
}
