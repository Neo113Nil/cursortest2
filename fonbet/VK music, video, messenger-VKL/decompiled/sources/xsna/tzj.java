package xsna;

import com.vk.ecomm.cart.impl.common.models.geo.Address;
import com.vk.ecomm.cart.impl.common.models.geo.City;

/* compiled from: CourierMapState.kt */
/* loaded from: classes18.dex */
public final class tzj implements km50 {
    public final tj00 b;
    public final jt0 c;
    public final City d;
    public final Address e;
    public final Throwable f;
    public final boolean g;
    public final boolean h;

    public tzj() {
        this(0);
    }

    public static tzj a(tzj tzjVar, tj00 tj00Var, jt0 jt0Var, City city, Address address, Throwable th, boolean z, int i) {
        if ((i & 1) != 0) {
            tj00Var = tzjVar.b;
        }
        tj00 tj00Var2 = tj00Var;
        if ((i & 2) != 0) {
            jt0Var = tzjVar.c;
        }
        jt0 jt0Var2 = jt0Var;
        if ((i & 4) != 0) {
            city = tzjVar.d;
        }
        City city2 = city;
        if ((i & 8) != 0) {
            address = tzjVar.e;
        }
        Address address2 = address;
        if ((i & 16) != 0) {
            th = tzjVar.f;
        }
        Throwable th2 = th;
        boolean z2 = (i & 32) != 0 ? tzjVar.g : true;
        if ((i & 64) != 0) {
            z = tzjVar.h;
        }
        tzjVar.getClass();
        return new tzj(tj00Var2, jt0Var2, city2, address2, th2, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzj)) {
            return false;
        }
        tzj tzjVar = (tzj) obj;
        return epx.f(this.b, tzjVar.b) && epx.f(this.c, tzjVar.c) && epx.f(this.d, tzjVar.d) && epx.f(this.e, tzjVar.e) && epx.f(this.f, tzjVar.f) && this.g == tzjVar.g && this.h == tzjVar.h;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        jt0 jt0Var = this.c;
        int hashCode2 = (hashCode + (jt0Var == null ? 0 : jt0Var.hashCode())) * 31;
        City city = this.d;
        int hashCode3 = (hashCode2 + (city == null ? 0 : city.hashCode())) * 31;
        Address address = this.e;
        int hashCode4 = (hashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        Throwable th = this.f;
        return Boolean.hashCode(this.h) + qoy.b((hashCode4 + (th != null ? th.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CourierMapState(mapBaseState=");
        sb.append(this.b);
        sb.append(", addressState=");
        sb.append(this.c);
        sb.append(", selectedCity=");
        sb.append(this.d);
        sb.append(", lastOrderAddress=");
        sb.append(this.e);
        sb.append(", error=");
        sb.append(this.f);
        sb.append(", isMapCreated=");
        sb.append(this.g);
        sb.append(", isLoading=");
        return defpackage.q0.a(sb, this.h, ')');
    }

    public tzj(tj00 tj00Var, jt0 jt0Var, City city, Address address, Throwable th, boolean z, boolean z2) {
        this.b = tj00Var;
        this.c = jt0Var;
        this.d = city;
        this.e = address;
        this.f = th;
        this.g = z;
        this.h = z2;
    }

    public /* synthetic */ tzj(int i) {
        this(new tj00(0), null, null, null, null, false, false);
    }
}
