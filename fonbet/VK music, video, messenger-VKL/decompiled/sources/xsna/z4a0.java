package xsna;

import android.view.ViewTreeObserver;
import com.vk.photos.legacy.PhotoAlbumListFragment;

/* compiled from: PhotoAlbumListFragment.java */
/* loaded from: classes16.dex */
public final class z4a0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ PhotoAlbumListFragment b;

    public z4a0(PhotoAlbumListFragment photoAlbumListFragment) {
        this.b = photoAlbumListFragment;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = PhotoAlbumListFragment.O0;
        PhotoAlbumListFragment photoAlbumListFragment = this.b;
        photoAlbumListFragment.n0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoAlbumListFragment.n0.requestLayout();
        return false;
    }
}
