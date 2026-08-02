package xsna;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;

/* compiled from: TranscodeProperties.kt */
/* loaded from: classes3.dex */
public interface v6e0 {

    /* compiled from: TranscodeProperties.kt */
    public static final class a implements v6e0 {
        public final MediaCodecInfo a;
        public final MediaFormat b;

        public a(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat) {
            this.a = mediaCodecInfo;
            this.b = mediaFormat;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            MediaCodecInfo mediaCodecInfo = this.a;
            return this.b.hashCode() + ((mediaCodecInfo == null ? 0 : mediaCodecInfo.hashCode()) * 31);
        }

        public final String toString() {
            return "EncoderProperties(codec=" + this.a + ", format=" + this.b + ')';
        }
    }

    /* compiled from: TranscodeProperties.kt */
    public static final class b implements v6e0 {
        public final MediaFormat a;

        public b(MediaFormat mediaFormat) {
            this.a = mediaFormat;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RemuxProperties(sourceTrackFormat=" + this.a + ')';
        }
    }
}
