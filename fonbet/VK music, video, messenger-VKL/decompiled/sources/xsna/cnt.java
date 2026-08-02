package xsna;

/* compiled from: GeoSideEffect.kt */
@vby
/* loaded from: classes2.dex */
public final class cnt implements com.vk.geo.impl.presentation.h {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof cnt) {
            return this.a == ((cnt) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "LocationPermission(granted=" + this.a + ')';
    }
}
