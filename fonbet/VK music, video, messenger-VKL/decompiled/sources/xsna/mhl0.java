package xsna;

import android.net.Uri;
import androidx.annotation.NonNull;

/* compiled from: StorageReference.java */
/* loaded from: classes13.dex */
public final class mhl0 implements Comparable<mhl0> {
    public final Uri b;
    public final skr c;

    public mhl0(@NonNull Uri uri, @NonNull skr skrVar) {
        exc0.a("storageUri cannot be null", uri != null);
        exc0.a("FirebaseApp cannot be null", skrVar != null);
        this.b = uri;
        this.c = skrVar;
    }

    @NonNull
    public final nhl0 a() {
        this.c.getClass();
        return new nhl0(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull mhl0 mhl0Var) {
        return this.b.compareTo(mhl0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mhl0) {
            return ((mhl0) obj).toString().equals(toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("gs://");
        Uri uri = this.b;
        sb.append(uri.getAuthority());
        sb.append(uri.getEncodedPath());
        return sb.toString();
    }
}
