package xsna;

import android.media.MediaFormat;
import android.util.Log;
import androidx.annotation.NonNull;

/* compiled from: VideoFramePtsFilter.java */
/* loaded from: classes3.dex */
public final class lms0 {
    public final long a;
    public long b;

    public lms0(@NonNull MediaFormat mediaFormat) {
        int integer = mediaFormat.containsKey("frame-rate") ? mediaFormat.getInteger("frame-rate") : -1;
        if (integer > 0) {
            this.a = (long) (1.0E9f / integer);
        } else {
            Log.e("VideoFramePtsFilter", lhg.a(integer, "Video frame rate is invalid="), new RuntimeException());
            this.a = Long.MIN_VALUE;
        }
    }
}
