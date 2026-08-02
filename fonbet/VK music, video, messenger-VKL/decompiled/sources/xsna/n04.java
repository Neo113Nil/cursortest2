package xsna;

import java.nio.charset.StandardCharsets;

/* compiled from: AtomSizeTooSmallSniffFailure.java */
/* loaded from: classes12.dex */
public final class n04 implements lbk0 {
    public final int b;
    public final long c;
    public final int d;

    public n04(int i, long j, int i2) {
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
        String str = y2r0.a;
        sb.append(new String(ipx.y(this.b), StandardCharsets.US_ASCII));
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", minHeaderSize=");
        return h5s.c(this.d, "}", sb);
    }
}
