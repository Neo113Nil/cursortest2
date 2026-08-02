package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.a;
import yads.wd;

/* loaded from: classes7.dex */
public abstract class gs81 {
    public static final i3y a = a.a(wd.w);

    public static String a(long j) {
        if (j < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return j + "B";
        }
        if (j < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return (j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) + "KB";
        }
        if (j >= 1073741824) {
            return (j / 1073741824) + "GB";
        }
        return (j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) + "MB";
    }
}
