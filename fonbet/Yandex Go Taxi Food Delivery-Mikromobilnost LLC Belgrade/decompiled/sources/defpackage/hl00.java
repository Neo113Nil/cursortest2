package defpackage;

import com.yandex.go.layers.api.presentation.mapkit.MapKitObjectType;
import com.yandex.mapkit.geometry.Point;

/* loaded from: classes14.dex */
public final class hl00 {
    public final String a;
    public final String b;
    public final Point c;
    public final String d;
    public final MapKitObjectType e;

    public hl00(String str, String str2, Point point, String str3) {
        this.a = str;
        this.b = str2;
        this.c = point;
        this.d = str3;
        this.e = jl40.l(str2, "transit") ? MapKitObjectType.MASS_TRANSIT_STOP : jl40.l(str2, "org") ? MapKitObjectType.ORGANISATION : MapKitObjectType.UNKNOWN;
    }

    public final Point a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final MapKitObjectType c() {
        return this.e;
    }
}
