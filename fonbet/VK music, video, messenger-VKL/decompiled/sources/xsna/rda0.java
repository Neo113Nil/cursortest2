package xsna;

import androidx.annotation.NonNull;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.core.fragments.FragmentImpl;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;

/* compiled from: PhotoVideoAttachActivity.java */
/* loaded from: classes15.dex */
public final class rda0 implements u6a0 {
    public final /* synthetic */ PhotoVideoAttachActivity b;

    public rda0(PhotoVideoAttachActivity photoVideoAttachActivity) {
        this.b = photoVideoAttachActivity;
    }

    @Override // xsna.t4d0
    public final void a(@NonNull MediaStoreEntry mediaStoreEntry) {
        PhotoVideoAttachActivity photoVideoAttachActivity = this.b;
        if (!photoVideoAttachActivity.c0.f) {
            photoVideoAttachActivity.v.c(mediaStoreEntry);
            return;
        }
        FragmentImpl f = photoVideoAttachActivity.n().f(R.id.fl_container);
        if (f instanceof GalleryFragmentImpl) {
            ((GalleryFragmentImpl) f).jo(mediaStoreEntry, null);
        }
    }

    @Override // xsna.u6a0
    public final void f(@NonNull MediaStoreEntry mediaStoreEntry) {
        this.b.v.c(mediaStoreEntry);
    }
}
