package xsna;

import java.util.ArrayList;

/* compiled from: VideoGrowthBombingFeatureConfig.kt */
/* loaded from: classes11.dex */
public final class cos0 {
    public static final a e = new a();
    public final ArrayList a;
    public final int b;
    public final int c;
    public final Boolean d;

    /* compiled from: VideoGrowthBombingFeatureConfig.kt */
    public static final class a {
    }

    public cos0(int i, int i2, Boolean bool, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cos0)) {
            return false;
        }
        cos0 cos0Var = (cos0) obj;
        return this.a.equals(cos0Var.a) && this.b == cos0Var.b && this.c == cos0Var.c && this.d.equals(cos0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGrowthBombingFeatureConfig(traps=");
        sb.append(this.a);
        sb.append(", timePeriodHours=");
        sb.append(this.b);
        sb.append(", resetTrapsPeriodDays=");
        sb.append(this.c);
        sb.append(", testingMode=");
        return tn.a(sb, this.d, ')');
    }
}
