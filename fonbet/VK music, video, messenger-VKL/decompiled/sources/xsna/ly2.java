package xsna;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import androidx.annotation.NonNull;

/* compiled from: ApiHelperForLollipop.java */
/* loaded from: classes12.dex */
public final class ly2 {
    @NonNull
    public static Uri a(@NonNull WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl();
    }

    public static boolean b(@NonNull WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }
}
