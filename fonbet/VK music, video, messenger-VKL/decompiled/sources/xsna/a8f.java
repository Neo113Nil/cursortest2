package xsna;

import com.vk.mediastore.system.MediaStoreEntry;

/* compiled from: ClipsTemplateEditorPreviewItem.kt */
/* loaded from: classes5.dex */
public final class a8f {
    public final int a;
    public final MediaStoreEntry b;
    public final int c;

    public a8f(int i, MediaStoreEntry mediaStoreEntry, int i2) {
        this.a = i;
        this.b = mediaStoreEntry;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8f)) {
            return false;
        }
        a8f a8fVar = (a8f) obj;
        return this.a == a8fVar.a && epx.f(this.b, a8fVar.b) && this.c == a8fVar.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        MediaStoreEntry mediaStoreEntry = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (mediaStoreEntry == null ? 0 : mediaStoreEntry.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsTemplateEditorPreviewItem(index=");
        sb.append(this.a);
        sb.append(", entry=");
        sb.append(this.b);
        sb.append(", duration=");
        return vu5.b(sb, this.c, ')');
    }
}
