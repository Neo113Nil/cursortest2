package xsna;

import android.content.Context;
import android.media.MediaExtractor;
import android.net.Uri;
import com.vk.media.pipeline.utils.exception.MediaTrackException;
import java.util.Map;

/* compiled from: MediaExtractorUtils.kt */
/* loaded from: classes3.dex */
public final class br10 {
    public static MediaExtractor a(Context context, Uri uri) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(context, uri, (Map<String, String>) null);
        return mediaExtractor;
    }

    public static int b(MediaExtractor mediaExtractor, String str) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                String string = mediaExtractor.getTrackFormat(i).getString("mime");
                if (string != null && brm0.B(string, str, true) && !string.equals("video/dolby-vision") && !string.equals("video/scrambled")) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            throw new MediaTrackException("Failed to get first media track of type: ".concat(str), th);
        }
    }

    public static long c(Context context, Uri uri) {
        MediaExtractor a = a(context, uri);
        try {
            int trackCount = a.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                a.selectTrack(i);
            }
            long j = 0;
            do {
                long sampleSize = a.getSampleSize();
                if (sampleSize > 0) {
                    j += sampleSize;
                }
            } while (a.advance());
            return j;
        } finally {
            a.release();
        }
    }
}
