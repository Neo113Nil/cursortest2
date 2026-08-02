package xsna;

import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;

/* compiled from: QueryParamsDto.kt */
/* loaded from: classes18.dex */
public final class jpe0 {
    public final String a;
    public final Coordinates b;

    public jpe0(String str, Coordinates coordinates) {
        this.a = str;
        this.b = coordinates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpe0)) {
            return false;
        }
        jpe0 jpe0Var = (jpe0) obj;
        return epx.f(this.a, jpe0Var.a) && epx.f(this.b, jpe0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Coordinates coordinates = this.b;
        return hashCode + (coordinates == null ? 0 : coordinates.hashCode());
    }

    public final String toString() {
        return "QueryParamsDto(query=" + this.a + ", coordinates=" + this.b + ')';
    }
}
