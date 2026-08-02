package defpackage;

import android.util.Range;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class i94 {
    public static final Range e = new Range(0, Integer.MAX_VALUE);
    public static final qgg0 f;
    public final qgg0 a;
    public final int b;
    public final Range c;
    public final int d;

    static {
        a84 a84Var = kgg0.c;
        f = qgg0.a(Arrays.asList(a84Var, kgg0.b, kgg0.a), new q64(a84Var, 1));
    }

    public i94(qgg0 qgg0Var, int i, Range range, int i2) {
        this.a = qgg0Var;
        this.b = i;
        this.c = range;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i94) {
            i94 i94Var = (i94) obj;
            if (this.a.equals(i94Var.a) && this.b == i94Var.b && this.c.equals(i94Var.c) && this.d == i94Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.a);
        sb.append(", encodeFrameRate=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", aspectRatio=");
        return oyr.m(this.d, "}", sb);
    }
}
