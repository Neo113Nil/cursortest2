package xsna;

import com.vk.mediastore.system.MediaStoreEntry;
import java.util.ArrayList;

/* compiled from: MediaAlbumsResult.kt */
/* loaded from: classes3.dex */
public final class up10 {
    public final ArrayList a;
    public final int b;
    public final MediaStoreEntry c;

    public up10(ArrayList arrayList, int i, MediaStoreEntry mediaStoreEntry) {
        this.a = arrayList;
        this.b = i;
        this.c = mediaStoreEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up10)) {
            return false;
        }
        up10 up10Var = (up10) obj;
        return this.a.equals(up10Var.a) && this.b == up10Var.b && epx.f(this.c, up10Var.c);
    }

    public final int hashCode() {
        int a = shy.a(this.b, this.a.hashCode() * 31, 31);
        MediaStoreEntry mediaStoreEntry = this.c;
        return a + (mediaStoreEntry == null ? 0 : mediaStoreEntry.hashCode());
    }

    public final String toString() {
        return "MediaAlbumsResult(mediaAlbums=" + this.a + ", allEntriesCount=" + this.b + ", allPhotosPreview=" + this.c + ')';
    }
}
