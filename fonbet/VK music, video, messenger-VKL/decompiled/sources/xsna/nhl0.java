package xsna;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* compiled from: StorageReferenceUri.java */
/* loaded from: classes13.dex */
public final class nhl0 {
    public final Uri a;
    public final Uri b;

    public nhl0(@NonNull Uri uri) {
        this.b = uri;
        Uri uri2 = a560.j;
        this.a = uri2;
        Uri.Builder appendEncodedPath = uri2.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String w = d02.w(uri.getPath());
        if (w.length() > 0 && !DomExceptionUtils.SEPARATOR.equals(w)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(w);
        }
        appendEncodedPath.build();
    }
}
