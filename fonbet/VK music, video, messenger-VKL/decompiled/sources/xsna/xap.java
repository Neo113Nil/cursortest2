package xsna;

import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.d9y;

/* compiled from: ElementMarker.kt */
/* loaded from: classes8.dex */
public final class xap {
    public static final long[] e = new long[0];
    public final SerialDescriptor a;
    public final d9y.a b;
    public long c;
    public final long[] d;

    public xap(SerialDescriptor serialDescriptor, d9y.a aVar) {
        this.a = serialDescriptor;
        this.b = aVar;
        int c = serialDescriptor.c();
        if (c <= 64) {
            this.c = c != 64 ? (-1) << c : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (c - 1) >>> 6;
        long[] jArr = new long[i];
        if ((c & 63) != 0) {
            jArr[i - 1] = (-1) << c;
        }
        this.d = jArr;
    }
}
