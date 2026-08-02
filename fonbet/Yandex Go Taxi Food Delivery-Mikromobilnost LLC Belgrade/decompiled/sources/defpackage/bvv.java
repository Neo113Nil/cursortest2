package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.add.BackNavigationStrategy;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bvv {
    public final zzs a;
    public final Address b;
    public final ye0 c;
    public final String d;
    public final List e;
    public final boolean f;
    public final BackNavigationStrategy g;

    public bvv(zzs zzsVar, Address address, ye0 ye0Var, String str, List list, boolean z, BackNavigationStrategy backNavigationStrategy, int i) {
        address = (i & 2) != 0 ? null : address;
        str = (i & 8) != 0 ? "" : str;
        list = (i & 16) != 0 ? EmptyList.a : list;
        z = (i & 32) != 0 ? false : z;
        backNavigationStrategy = (i & 128) != 0 ? BackNavigationStrategy.NONE : backNavigationStrategy;
        this.a = zzsVar;
        this.b = address;
        this.c = ye0Var;
        this.d = str;
        this.e = list;
        this.f = z;
        this.g = backNavigationStrategy;
    }

    public final Address a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvv)) {
            return false;
        }
        bvv bvvVar = (bvv) obj;
        return jl40.l(this.a, bvvVar.a) && jl40.l(this.b, bvvVar.b) && jl40.l(this.c, bvvVar.c) && jl40.l(this.d, bvvVar.d) && jl40.l(this.e, bvvVar.e) && this.f == bvvVar.f && this.g == bvvVar.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Address address = this.b;
        return this.g.hashCode() + unr0.e(unr0.c(unr0.b((this.c.hashCode() + ((hashCode + (address == null ? 0 : address.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 961, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitDataForAddFavoritesScreen(geoPoint=");
        sb.append(this.a);
        sb.append(", address=");
        sb.append(this.b);
        sb.append(", addFavoritesScreenAnalyticsData=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", categories=");
        nzs.p(sb, this.e, ", isCurrentLocation=", this.f, ", keySet=null, backNavigationStrategy=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
