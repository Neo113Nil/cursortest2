package xsna;

import com.vk.dto.common.im.codec.AudioMessageCodecBitrate;
import com.vk.dto.common.im.codec.AudioMessageCodecSampleRate;

/* compiled from: AudioMessageCodecParams.kt */
/* loaded from: classes18.dex */
public final class mq4 {
    public static final mq4 c = new mq4(AudioMessageCodecBitrate.BITRATE_16000, AudioMessageCodecSampleRate.SAMPLE_RATE_16000);
    public final AudioMessageCodecBitrate a;
    public final AudioMessageCodecSampleRate b;

    /* compiled from: AudioMessageCodecParams.kt */
    public static final class a {
        public static mq4 a() {
            return mq4.c;
        }
    }

    public mq4(AudioMessageCodecBitrate audioMessageCodecBitrate, AudioMessageCodecSampleRate audioMessageCodecSampleRate) {
        this.a = audioMessageCodecBitrate;
        this.b = audioMessageCodecSampleRate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq4)) {
            return false;
        }
        mq4 mq4Var = (mq4) obj;
        return this.a == mq4Var.a && this.b == mq4Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AudioMessageCodecParams(bitrate=" + this.a + ", sampleRate=" + this.b + ')';
    }
}
