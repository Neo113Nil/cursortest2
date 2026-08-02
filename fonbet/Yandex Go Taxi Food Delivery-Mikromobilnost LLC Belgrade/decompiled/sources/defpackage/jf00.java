package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jf00 {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final Double e;
    public final Integer f;
    public final if00 g;
    public final MapBuilder h;

    public jf00(String str, Integer num, Integer num2, String str2, Double d, Integer num3, if00 if00Var) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = d;
        this.f = num3;
        this.g = if00Var;
        MapBuilder mapBuilder = new MapBuilder();
        if (str != null) {
            mapBuilder.put("type", str);
        }
        if (num != null) {
            mapBuilder.put("accuracy", num);
        }
        if (num2 != null) {
            mapBuilder.put("speed", num2);
        }
        if (str2 != null) {
            mapBuilder.put("location_update_time", str2);
        }
        if (d != null) {
            mapBuilder.put("altitude", d);
        }
        if (num3 != null) {
            mapBuilder.put("altitude_accuracy", num3);
        }
        if (if00Var != null) {
            mapBuilder.put("position", if00Var.c);
        }
        this.h = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf00)) {
            return false;
        }
        jf00 jf00Var = (jf00) obj;
        return jl40.l(this.a, jf00Var.a) && jl40.l(this.b, jf00Var.b) && jl40.l(this.c, jf00Var.c) && jl40.l(this.d, jf00Var.d) && jl40.l(this.e, jf00Var.e) && jl40.l(this.f, jf00Var.f) && jl40.l(this.g, jf00Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.e;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.f;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        if00 if00Var = this.g;
        return hashCode6 + (if00Var != null ? if00Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = n.q("CoordProviders(type=", this.b, this.a, ", accuracy=", ", speed=");
        tse0.w(this.c, ", locationUpdateTime=", this.d, ", altitude=", q);
        q.append(this.e);
        q.append(", altitudeAccuracy=");
        q.append(this.f);
        q.append(", position=");
        q.append(this.g);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public jf00() {
        this(null, null, null, null, null, null, null);
    }
}
