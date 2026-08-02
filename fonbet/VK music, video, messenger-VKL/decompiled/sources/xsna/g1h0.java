package xsna;

import android.net.Uri;
import com.vk.mediastore.system.MediaStoreEntry;
import java.io.File;

/* compiled from: SaveToGalleryResult.kt */
/* loaded from: classes15.dex */
public final class g1h0 {
    public final File a;
    public final MediaStoreEntry b;
    public final Uri c;

    public g1h0(File file, MediaStoreEntry mediaStoreEntry, Uri uri) {
        this.a = file;
        this.b = mediaStoreEntry;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1h0)) {
            return false;
        }
        g1h0 g1h0Var = (g1h0) obj;
        return epx.f(this.a, g1h0Var.a) && epx.f(this.b, g1h0Var.b) && epx.f(this.c, g1h0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MediaStoreEntry mediaStoreEntry = this.b;
        int hashCode2 = (hashCode + (mediaStoreEntry == null ? 0 : mediaStoreEntry.hashCode())) * 31;
        Uri uri = this.c;
        return hashCode2 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveToGalleryResult(file=");
        sb.append(this.a);
        sb.append(", entry=");
        sb.append(this.b);
        sb.append(", editedFileUri=");
        return alb0.b(sb, this.c, ')');
    }
}
