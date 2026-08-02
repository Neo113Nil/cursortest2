package xsna;

import com.vk.mediastore.system.MediaStoreEntry;

/* compiled from: MediaStoreEntryWrapper.kt */
/* loaded from: classes3.dex */
public final class cz10 {
    public final MediaStoreEntry a;
    public final int b;
    public final String c;

    public cz10(MediaStoreEntry mediaStoreEntry, int i, String str) {
        this.a = mediaStoreEntry;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz10)) {
            return false;
        }
        cz10 cz10Var = (cz10) obj;
        return epx.f(this.a, cz10Var.a) && this.b == cz10Var.b && epx.f(this.c, cz10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaStoreEntryWrapper(mediaStoreEntry=");
        sb.append(this.a);
        sb.append(", bucketId=");
        sb.append(this.b);
        sb.append(", bucketName=");
        return ho8.a(sb, this.c, ')');
    }
}
