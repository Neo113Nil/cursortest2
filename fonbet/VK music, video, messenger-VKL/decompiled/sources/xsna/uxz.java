package xsna;

import com.vk.dto.geo.GeoLocation;

/* compiled from: LocationStateItems.kt */
/* loaded from: classes2.dex */
public final class uxz implements bia0 {
    public final GeoLocation b;
    public final String c;

    public uxz(GeoLocation geoLocation, String str) {
        this.b = geoLocation;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (uxz.class.equals(obj != null ? obj.getClass() : null)) {
            return epx.f(this.b, ((uxz) obj).b);
        }
        return false;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(Integer.hashCode(this.b.b) + 12);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
