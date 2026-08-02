package com.uber.h3core.util;

import java.util.Objects;

/* loaded from: classes11.dex */
public class LatLng {
    public final double a;
    public final double b;

    public LatLng(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LatLng latLng = (LatLng) obj;
            if (Double.compare(latLng.a, this.a) == 0 && Double.compare(latLng.b, this.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Double.valueOf(this.a), Double.valueOf(this.b));
    }

    public final String toString() {
        return String.format("LatLng{lat=%f, lng=%f}", Double.valueOf(this.a), Double.valueOf(this.b));
    }
}
