package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;

/* loaded from: classes10.dex */
public abstract class cac {
    public static final LruCache a = new LruCache(10);

    public static MediaCodecInfo a(String str) {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodec;
        LruCache lruCache = a;
        synchronized (lruCache) {
            mediaCodecInfo = (MediaCodecInfo) lruCache.get(str);
        }
        try {
            if (mediaCodecInfo != null) {
                return mediaCodecInfo;
            }
            try {
                mediaCodec = MediaCodec.createEncoderByType(str);
                try {
                    MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                    synchronized (lruCache) {
                        lruCache.put(str, codecInfo);
                    }
                    mediaCodec.release();
                    return codecInfo;
                } catch (Throwable th) {
                    th = th;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw th;
                }
            } catch (IOException | IllegalArgumentException e) {
                throw new InvalidConfigException(e);
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCodec = null;
        }
    }
}
