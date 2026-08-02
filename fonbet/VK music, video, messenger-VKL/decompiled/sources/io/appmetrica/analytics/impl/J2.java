package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class J2 {
    public final I2 a;
    public final Boolean b;

    public J2(I2 i2, Boolean bool) {
        this.a = i2;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J2.class == obj.getClass()) {
            J2 j2 = (J2) obj;
            if (this.a != j2.a) {
                return false;
            }
            Boolean bool = this.b;
            if (bool != null) {
                return bool.equals(j2.b);
            }
            if (j2.b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        I2 i2 = this.a;
        int hashCode = (i2 != null ? i2.hashCode() : 0) * 31;
        Boolean bool = this.b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundRestrictionsState{mAppStandByBucket=");
        sb.append(this.a);
        sb.append(", mBackgroundRestricted=");
        return xsna.tn.a(sb, this.b, '}');
    }
}
