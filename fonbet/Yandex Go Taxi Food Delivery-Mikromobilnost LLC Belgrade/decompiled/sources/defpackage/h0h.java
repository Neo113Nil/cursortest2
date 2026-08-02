package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public interface h0h {
    String a();

    default boolean b(Uri uri) {
        return a().equalsIgnoreCase(uri != null ? uri.getAuthority() : null);
    }

    default boolean c(String str) {
        return a().equalsIgnoreCase(str);
    }

    Object d(Uri uri);
}
