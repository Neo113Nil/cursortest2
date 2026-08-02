package com.yandex.go.platform.lottie_splash.model;

import defpackage.gsq0;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/lottie_splash/model/Location;", "", "Companion", "$serializer", "com/yandex/go/platform/lottie_splash/model/a", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Location {
    public static final a Companion = new a();
    public final double a;
    public final double b;

    public /* synthetic */ Location(double d, double d2, int i) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, Location$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return Double.compare(this.a, location.a) == 0 && Double.compare(this.b, location.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Location(latitude=");
        sb.append(this.a);
        sb.append(", longitude=");
        return unr0.q(sb, this.b, ')');
    }
}
