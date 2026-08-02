package com.yandex.go.flex.common.api.actions;

import defpackage.gsq0;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/GeoPoint;", "", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/o", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GeoPoint {
    public static final o Companion = new o();
    public final double a;
    public final double b;
    public final int c;

    public /* synthetic */ GeoPoint(int i, double d, double d2, int i2) {
        if ((i & 1) == 0) {
            this.a = 0.0d;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = 0.0d;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoPoint)) {
            return false;
        }
        GeoPoint geoPoint = (GeoPoint) obj;
        return Double.compare(this.a, geoPoint.a) == 0 && Double.compare(this.b, geoPoint.b) == 0 && this.c == geoPoint.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "GeoPoint(lat=", ", lon=");
        u.append(this.b);
        u.append(", accuracy=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public GeoPoint(int i) {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0;
    }

    public GeoPoint() {
        this(0);
    }
}
