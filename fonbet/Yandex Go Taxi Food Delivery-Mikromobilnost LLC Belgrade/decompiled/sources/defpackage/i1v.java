package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.FilterType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class i1v {
    public final String a;
    public final ovi0 b;
    public final List c;
    public final FilterType d;

    public i1v(String str, ovi0 ovi0Var, List list, FilterType filterType) {
        this.a = str;
        this.b = ovi0Var;
        this.c = list;
        this.d = filterType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1v)) {
            return false;
        }
        i1v i1vVar = (i1v) obj;
        return jl40.l(this.a, i1vVar.a) && this.b.equals(i1vVar.b) && jl40.l(this.c, i1vVar.c) && this.d == i1vVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "HubResetFilterAction(filterId=" + this.a + ", image=" + this.b + ", availableFilters=" + this.c + ", filterType=" + this.d + Extension.C_BRAKE;
    }
}
