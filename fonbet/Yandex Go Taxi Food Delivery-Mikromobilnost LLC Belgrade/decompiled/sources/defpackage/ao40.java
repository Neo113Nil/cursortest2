package defpackage;

import kotlin.collections.builders.MapBuilder;

/* loaded from: classes5.dex */
public final class ao40 {
    public final String a;
    public final String b;
    public final MapBuilder c;

    public ao40(String str, String str2) {
        this.a = str;
        this.b = str2;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("station_name", str);
        mapBuilder.put("time_to_station", str2);
        mapBuilder.put("is_available", Boolean.TRUE);
        this.c = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao40)) {
            return false;
        }
        ao40 ao40Var = (ao40) obj;
        return jl40.l(this.a, ao40Var.a) && jl40.l(this.b, ao40Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return unr0.p("StationV2(stationName=", this.a, ", timeToStation=", this.b, ", isAvailable=true)");
    }
}
