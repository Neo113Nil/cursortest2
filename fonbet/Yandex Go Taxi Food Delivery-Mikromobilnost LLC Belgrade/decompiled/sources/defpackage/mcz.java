package defpackage;

import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public final class mcz {
    public final int a;
    public final long b;
    public final long c;
    public final float d;

    public mcz(long j, int i, long j2, float f) {
        this.b = j;
        this.a = i;
        this.c = j2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcz)) {
            return false;
        }
        mcz mczVar = (mcz) obj;
        return this.a == mczVar.a && this.b == mczVar.b && this.c == mczVar.c && Float.compare(mczVar.d, this.d) == 0;
    }

    public final int hashCode() {
        int i = this.a * 31;
        long j = this.b;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder t = qv10.t("Request[");
        long j = this.b;
        if (j != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            t.append("@");
            k5a1.c(j, t);
            int i = this.a;
            if (i == 100) {
                t.append(" HIGH_ACCURACY");
            } else if (i == 102) {
                t.append(" BALANCED");
            } else if (i == 104) {
                t.append(" LOW_POWER");
            }
        } else {
            t.append("PASSIVE");
        }
        long j2 = this.c;
        if (j2 != -1 && j2 < j) {
            t.append(", minUpdateInterval=");
            k5a1.c(j2, t);
        }
        float f = this.d;
        if (f > 0.0d) {
            t.append(", minUpdateDistance=");
            t.append(f);
        }
        if (0 > j) {
            t.append(", maxUpdateDelay=");
            k5a1.c(0L, t);
        }
        t.append(']');
        return t.toString();
    }
}
