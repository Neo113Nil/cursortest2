package defpackage;

import android.util.Range;

/* loaded from: classes10.dex */
public final class n34 {
    public static final Range f = new Range(0, Integer.MAX_VALUE);
    public static final Range g = new Range(0, Integer.MAX_VALUE);
    public final Range a;
    public final int b;
    public final int c;
    public final Range d;
    public final int e;

    static {
        bc a = a();
        a.x = 0;
        a.c();
    }

    public n34(Range range, int i, int i2, Range range2, int i3) {
        this.a = range;
        this.b = i;
        this.c = i2;
        this.d = range2;
        this.e = i3;
    }

    public static bc a() {
        bc bcVar = new bc();
        bcVar.b = -1;
        bcVar.c = -1;
        bcVar.x = -1;
        Range range = f;
        if (range == null) {
            ny61.t("Null bitrate");
            return null;
        }
        bcVar.a = range;
        Range range2 = g;
        if (range2 != null) {
            bcVar.w = range2;
            return bcVar;
        }
        ny61.t("Null sampleRate");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n34) {
            n34 n34Var = (n34) obj;
            if (this.a.equals(n34Var.a) && this.b == n34Var.b && this.c == n34Var.c && this.d.equals(n34Var.d) && this.e == n34Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.a);
        sb.append(", sourceFormat=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channelCount=");
        return oyr.m(this.e, "}", sb);
    }
}
