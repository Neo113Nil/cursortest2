package xsna;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import kotlin.Pair;
import xsna.eg7;

/* compiled from: BloodGlucoseRecord.kt */
/* loaded from: classes12.dex */
public final class fg7 implements w7x {
    public static final eg7 h = new eg7(50.0d, eg7.a.MILLIMOLES_PER_LITER);
    public static final Object i;
    public static final Object j;
    public final Instant a;
    public final ZoneOffset b;
    public final hi20 c;
    public final eg7 d;
    public final int e;
    public final int f;
    public final int g;

    static {
        Map k = pn00.k(new Pair("general", 1), new Pair("after_meal", 4), new Pair("fasting", 2), new Pair("before_meal", 3));
        i = k;
        v3r0.g(k);
        Map k2 = pn00.k(new Pair("interstitial_fluid", 1), new Pair("capillary_blood", 2), new Pair("plasma", 3), new Pair("tears", 5), new Pair("whole_blood", 6), new Pair("serum", 4));
        j = k2;
        v3r0.g(k2);
    }

    public fg7(Instant instant, ZoneOffset zoneOffset, hi20 hi20Var, eg7 eg7Var, int i2, int i3, int i4) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = hi20Var;
        this.d = eg7Var;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        v3r0.e(eg7Var, (eg7) pn00.h(eg7Var.c, eg7.d), "level");
        v3r0.f(eg7Var, h, "level");
    }

    @Override // xsna.w7x
    public final Instant C() {
        return this.a;
    }

    @Override // xsna.w7x
    public final ZoneOffset e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fg7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        fg7 fg7Var = (fg7) obj;
        return epx.f(this.a, fg7Var.a) && epx.f(this.b, fg7Var.b) && epx.f(this.d, fg7Var.d) && this.e == fg7Var.e && this.f == fg7Var.f && this.g == fg7Var.g && epx.f(this.c, fg7Var.c);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((((((((this.d.hashCode() + ((hashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BloodGlucoseRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", level=");
        sb.append(this.d);
        sb.append(", specimenSource=");
        sb.append(this.e);
        sb.append(", mealType=");
        sb.append(this.f);
        sb.append(", relationToMeal=");
        sb.append(this.g);
        sb.append(", metadata=");
        return defpackage.j0.c(sb, this.c, ')');
    }
}
