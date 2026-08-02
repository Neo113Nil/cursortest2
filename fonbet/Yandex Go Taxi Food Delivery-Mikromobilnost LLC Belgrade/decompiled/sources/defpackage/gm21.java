package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gm21 {
    public final List a;
    public final int b;
    public final long c;

    public gm21(int i, long j, List list) {
        this.a = list;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm21)) {
            return false;
        }
        gm21 gm21Var = (gm21) obj;
        return this.a.equals(gm21Var.a) && this.b == gm21Var.b && this.c == gm21Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivitySegment(valueCodes=");
        sb.append(this.a);
        sb.append(", confidenceCode=");
        sb.append(this.b);
        sb.append(", segmentStartElapsedRealtimeMs=");
        return oyr.n(this.c, Extension.C_BRAKE, sb);
    }
}
