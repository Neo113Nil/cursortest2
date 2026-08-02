package xsna;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;

/* compiled from: EncoderBase.java */
/* loaded from: classes3.dex */
public abstract class ajp {
    public MediaCodec a;
    public MediaFormat b;
    public MediaCodecInfo.CodecCapabilities c;
    public a d = a.Uninitialized;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EncoderBase.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a Configured;
        public static final a Executing;
        public static final a Released;
        public static final a Uninitialized;

        static {
            a aVar = new a("Uninitialized", 0);
            Uninitialized = aVar;
            a aVar2 = new a("Configured", 1);
            Configured = aVar2;
            a aVar3 = new a("Executing", 2);
            Executing = aVar3;
            a aVar4 = new a("Released", 3);
            Released = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public final synchronized void a() {
        try {
            MediaCodec mediaCodec = this.a;
            if (mediaCodec != null) {
                try {
                    if (this.d == a.Executing) {
                        mediaCodec.stop();
                        this.d = a.Uninitialized;
                    }
                } catch (IllegalStateException unused) {
                }
                this.a.release();
                this.d = a.Released;
                this.a = null;
            }
            this.b = null;
            this.c = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
