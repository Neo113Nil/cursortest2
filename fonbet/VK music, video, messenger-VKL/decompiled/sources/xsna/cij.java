package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;

/* compiled from: ContentMetadata.java */
/* loaded from: classes12.dex */
public interface cij {
    @Nullable
    static Uri a(cij cijVar) {
        String str = cijVar.get();
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    static long b(cij cijVar) {
        return cijVar.get("exo_len");
    }

    long get(String str);

    @Nullable
    String get();
}
