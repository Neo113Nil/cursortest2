package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.screen.a;
import com.vk.attachpicker.screen.p;
import com.vk.attachpicker.widget.GalleryRecyclerView;
import com.vk.attachpicker.widget.MediaStoreItemSmallView;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;

/* compiled from: PhotoViewerProvider.kt */
/* loaded from: classes15.dex */
public final class gea0 implements p.c {
    public final GalleryRecyclerView b;
    public final PhotoSmallAdapter c;

    public gea0(GalleryRecyclerView galleryRecyclerView, PhotoSmallAdapter photoSmallAdapter) {
        this.b = galleryRecyclerView;
        this.c = photoSmallAdapter;
    }

    @Override // com.vk.attachpicker.screen.a.b
    public final void Bi(com.vk.attachpicker.screen.p pVar, MediaStoreEntry mediaStoreEntry) {
        pVar.S(mediaStoreEntry);
    }

    @Override // com.vk.attachpicker.screen.a.b
    public final void ig(com.vk.attachpicker.screen.a aVar, MediaStoreEntry mediaStoreEntry) {
        aVar.J(mediaStoreEntry);
    }

    @Override // com.vk.attachpicker.screen.a.b
    public final a.c k9(int i) {
        PhotoSmallAdapter photoSmallAdapter = this.c;
        int K0 = photoSmallAdapter.K0() + i;
        if (K0 < 0 || K0 >= photoSmallAdapter.E0()) {
            StringBuilder b = ji.b(i, "index=", ", offset=");
            b.append(photoSmallAdapter.K0());
            b.append(",count=");
            b.append(photoSmallAdapter.E0());
            L.e("GalleryFragment", b.toString());
            return null;
        }
        GalleryRecyclerView galleryRecyclerView = this.b;
        RecyclerView.e0 findViewHolderForAdapterPosition = galleryRecyclerView.getRecyclerView().findViewHolderForAdapterPosition(K0);
        View view = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView : null;
        if (!(findViewHolderForAdapterPosition instanceof gz10)) {
            L.e("GalleryFragment", "Unable to get imageView for desired position, because it's not being displayed on screen.");
            return null;
        }
        MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) photoSmallAdapter.c.c(K0);
        MediaStoreItemSmallView mediaStoreItemSmallView = ((gz10) findViewHolderForAdapterPosition).o;
        a.c cVar = new a.c();
        cVar.a = mediaStoreItemSmallView;
        cVar.b = view;
        cVar.c = galleryRecyclerView;
        cVar.d = mediaStoreEntry;
        cVar.e = mediaStoreEntry.getWidth();
        cVar.f = mediaStoreEntry.getHeight();
        return cVar;
    }

    @Override // com.vk.attachpicker.screen.p.c
    public final void zc(int i, int i2) {
        View view;
        View view2;
        if (i == -1) {
            return;
        }
        a.c k9 = k9(i);
        if (k9 != null && (view2 = k9.b) != null) {
            view2.setVisibility(0);
        }
        a.c k92 = k9(i2);
        if (k92 == null || (view = k92.b) == null) {
            return;
        }
        view.setVisibility(4);
    }

    @Override // com.vk.attachpicker.screen.a.b
    public final void N7(MediaStoreEntry mediaStoreEntry) {
    }
}
