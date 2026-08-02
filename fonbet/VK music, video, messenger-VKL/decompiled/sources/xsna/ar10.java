package xsna;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import androidx.annotation.NonNull;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;

/* compiled from: MediaExtractorUtils.java */
@Deprecated
/* loaded from: classes3.dex */
public abstract class ar10 {

    /* compiled from: MediaExtractorUtils.java */
    public static class a {
        public int a;
        public int b;
        public int c;
        public long d;
        public int e;
        public String f;
        public MediaFormat g;
        public int h;
        public int i;
        public String j;
        public MediaFormat k;

        @NonNull
        public final String toString() {
            return "TrackMetadata{mWidth=" + this.a + ", mHeight=" + this.b + ", mFps='" + this.c + ", mDurationMs=" + this.d + ", mVideoTrackIndex=" + this.e + ", mVideoTrackMime=" + this.f + ", mVideoTrackFormat=" + this.g + ", mVideoBitrate=" + this.h + ", mAudioTrackIndex=" + this.i + ", mAudioTrackMime=" + this.j + ", mAudioTrackFormat=" + this.k + '}';
        }
    }

    public static a a(MediaExtractor mediaExtractor) {
        a aVar = new a();
        aVar.e = -1;
        aVar.i = -1;
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            if (aVar.e < 0 && string.startsWith("video/")) {
                aVar.e = i;
                aVar.f = string;
                aVar.g = trackFormat;
                aVar.a = trackFormat.getInteger("width");
                aVar.b = trackFormat.getInteger("height");
                if (trackFormat.containsKey("frame-rate")) {
                    aVar.c = trackFormat.getInteger("frame-rate");
                }
                if (trackFormat.containsKey(BadConnectionSignaling.KEY_BAD_NET_BITRATE)) {
                    aVar.h = trackFormat.getInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE);
                }
                if (trackFormat.containsKey("durationUs")) {
                    aVar.d = trackFormat.getLong("durationUs") / 1000;
                }
            } else if (aVar.i < 0 && string.startsWith("audio/")) {
                aVar.i = i;
                aVar.j = string;
                aVar.k = trackFormat;
                trackFormat.setInteger("sample-rate", trackFormat.getInteger("sample-rate"));
                trackFormat.setInteger("channel-count", trackFormat.getInteger("channel-count"));
            }
            if (aVar.e >= 0 && aVar.i >= 0) {
                break;
            }
        }
        if (aVar.e >= 0 || aVar.i >= 0) {
            return aVar;
        }
        throw new IllegalArgumentException("extractor does not contain video and/or audio tracks.");
    }
}
