package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes15.dex */
public final class a2z {
    public final Bitmap a;
    public final Uri b;

    public a2z(Bitmap bitmap, Uri uri) {
        this.a = bitmap;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2z)) {
            return false;
        }
        a2z a2zVar = (a2z) obj;
        return this.a.equals(a2zVar.a) && jl40.l(this.b, a2zVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return hashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "Item(bitmap=" + this.a + ", uri=" + this.b + ')';
    }
}
