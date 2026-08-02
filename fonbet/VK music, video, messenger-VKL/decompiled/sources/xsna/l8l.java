package xsna;

import android.media.MediaFormat;

/* compiled from: DecoderOutputFormat.kt */
/* loaded from: classes3.dex */
public final class l8l {
    public final int a;
    public final int b;
    public final MediaFormat c;

    public l8l(int i, int i2, MediaFormat mediaFormat) {
        this.a = i;
        this.b = i2;
        this.c = mediaFormat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8l)) {
            return false;
        }
        l8l l8lVar = (l8l) obj;
        return this.a == l8lVar.a && this.b == l8lVar.b && epx.f(this.c, l8lVar.c);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        MediaFormat mediaFormat = this.c;
        return a + (mediaFormat == null ? 0 : mediaFormat.hashCode());
    }

    public final String toString() {
        return "DecoderOutputFormat(decoderSurfaceWidth=" + this.a + ", decoderSurfaceHeight=" + this.b + ", decoderMediaFormat=" + this.c + ')';
    }
}
