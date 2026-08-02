package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lt00 {
    public static final lt00 d;
    public final List a;
    public final List b;
    public final List c;

    static {
        EmptyList emptyList = EmptyList.a;
        d = new lt00(emptyList, emptyList, emptyList);
    }

    public lt00(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt00)) {
            return false;
        }
        lt00 lt00Var = (lt00) obj;
        return jl40.l(this.a, lt00Var.a) && this.b.equals(lt00Var.b) && jl40.l(this.c, lt00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(qv10.v("MapUiState(foregroundRoutes=", this.a, ", backgroundRoutes=", this.b, ", cars="), this.c, Extension.C_BRAKE);
    }
}
