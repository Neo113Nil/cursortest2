package xsna;

import android.graphics.Matrix;
import android.net.Uri;
import com.vk.media.MediaUtils;

/* compiled from: Stickers.kt */
/* loaded from: classes15.dex */
public interface oit0 extends nov, vps0 {
    long getDuration();

    default Uri getUri() {
        wds0 videoData = getVideoData();
        if (videoData != null) {
            return videoData.a;
        }
        return null;
    }

    wds0 getVideoData();

    default int getVideoRadius() {
        return 0;
    }

    Matrix l(int i, int i2, MediaUtils.d dVar);

    default boolean n() {
        return false;
    }
}
