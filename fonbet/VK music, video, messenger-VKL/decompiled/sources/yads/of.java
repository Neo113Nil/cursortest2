package yads;

import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.Lazy;
import xsna.bpn0;

/* loaded from: classes10.dex */
public abstract class of {
    public static final Lazy a = new bpn0(nf.b);

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
