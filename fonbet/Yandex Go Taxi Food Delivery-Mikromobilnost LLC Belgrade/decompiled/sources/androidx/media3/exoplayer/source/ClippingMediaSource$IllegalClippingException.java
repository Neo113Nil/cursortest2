package androidx.media3.exoplayer.source;

import defpackage.d6z;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class ClippingMediaSource$IllegalClippingException extends IOException {
    public final int reason;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClippingMediaSource$IllegalClippingException(int i, long j, long j2) {
        super("Illegal clipping: ".concat(r6));
        String str;
        if (i != 0) {
            if (i == 1) {
                str = "not seekable to start";
            } else if (i != 2) {
                str = "unknown";
            } else {
                d6z.x((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j + ", End time: " + j2;
            }
        } else {
            str = "invalid period count";
        }
        this.reason = i;
    }

    public ClippingMediaSource$IllegalClippingException(int i) {
        this(i, -9223372036854775807L, -9223372036854775807L);
    }
}
