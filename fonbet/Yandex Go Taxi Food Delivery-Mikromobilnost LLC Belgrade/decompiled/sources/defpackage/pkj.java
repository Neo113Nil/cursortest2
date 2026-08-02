package defpackage;

import flex.utils.android.DimensionUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class pkj implements Comparable {
    public static final pkj x = new pkj(0.0f, DimensionUnit.DP);
    public final float a;
    public final DimensionUnit b;
    public final float c;
    public final int w;

    public pkj(float f, DimensionUnit dimensionUnit) {
        this.a = f;
        this.b = dimensionUnit;
        this.c = dimensionUnit.b(f);
        dimensionUnit.a(f);
        dimensionUnit.c(f);
        this.w = (int) dimensionUnit.b(f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return jl40.q(this.w, ((pkj) obj).w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pkj.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        pkj pkjVar = (pkj) obj;
        return this.a == pkjVar.a && this.b == pkjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Dimension(value=" + this.a + ", unit=" + this.b + Extension.C_BRAKE;
    }
}
