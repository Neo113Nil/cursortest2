package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhmp0;", "", "Companion", "fmp0", "gmp0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class hmp0 {
    public static final gmp0 Companion = new gmp0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new c6p0(24))};
    public final String a;
    public final List b;

    public /* synthetic */ hmp0(int i, String str, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmp0)) {
            return false;
        }
        hmp0 hmp0Var = (hmp0) obj;
        return jl40.l(this.a, hmp0Var.a) && jl40.l(this.b, hmp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("SdcRoutePathItem(color=", this.a, ", polyline=", Extension.C_BRAKE, this.b);
    }

    public hmp0() {
        this.a = "";
        this.b = EmptyList.a;
    }
}
