package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.road_events.EventTag;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nsk0 {
    public final String a;
    public final Point b;
    public final EventTag c;

    public nsk0(String str, Point point, EventTag eventTag) {
        this.a = str;
        this.b = point;
        this.c = eventTag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsk0)) {
            return false;
        }
        nsk0 nsk0Var = (nsk0) obj;
        return jl40.l(this.a, nsk0Var.a) && jl40.l(this.b, nsk0Var.b) && this.c == nsk0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RoadEventData(id=" + this.a + ", position=" + this.b + ", eventTag=" + this.c + Extension.C_BRAKE;
    }
}
