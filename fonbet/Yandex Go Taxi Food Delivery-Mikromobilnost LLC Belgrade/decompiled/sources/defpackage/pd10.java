package defpackage;

import android.media.MediaDescription;
import android.net.Uri;

/* loaded from: classes10.dex */
public abstract class pd10 {
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
