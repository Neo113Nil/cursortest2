package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bhq0 {
    public final String a;
    public final chq0 b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final Double f;
    public final Integer g;
    public final MapBuilder h;

    public bhq0(String str, chq0 chq0Var, Integer num, Integer num2, String str2, Double d, Integer num3) {
        this.a = str;
        this.b = chq0Var;
        this.c = num;
        this.d = num2;
        this.e = str2;
        this.f = d;
        this.g = num3;
        MapBuilder mapBuilder = new MapBuilder();
        if (str != null) {
            mapBuilder.put("type", str);
        }
        if (chq0Var != null) {
            mapBuilder.put("position", chq0Var.c);
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
        this.h = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhq0)) {
            return false;
        }
        bhq0 bhq0Var = (bhq0) obj;
        return jl40.l(this.a, bhq0Var.a) && jl40.l(this.b, bhq0Var.b) && jl40.l(this.c, bhq0Var.c) && jl40.l(this.d, bhq0Var.d) && jl40.l(this.e, bhq0Var.e) && jl40.l(this.f, bhq0Var.f) && jl40.l(this.g, bhq0Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        chq0 chq0Var = this.b;
        int hashCode2 = (hashCode + (chq0Var == null ? 0 : chq0Var.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.g;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedLocationCoordProvider(type=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", accuracy=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.d);
        sb.append(", locationUpdateTime=");
        sb.append(this.e);
        sb.append(", altitude=");
        sb.append(this.f);
        sb.append(", altitudeAccuracy=");
        return oo31.j(sb, this.g, Extension.C_BRAKE);
    }

    public bhq0() {
        this(null, null, null, null, null, null, null);
    }
}
