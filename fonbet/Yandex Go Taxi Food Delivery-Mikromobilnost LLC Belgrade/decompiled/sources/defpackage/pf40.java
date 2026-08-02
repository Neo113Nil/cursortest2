package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpf40;", "", "Companion", "of40", "nf40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class pf40 {
    public static final of40 Companion = new of40();
    public static final i3y[] c;
    public static final pf40 d;
    public final Map a;
    public final List b;

    static {
        df40 df40Var = ef40.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new e540(16)), a.b(lazyThreadSafetyMode, new e540(18))};
        d = new pf40(0);
    }

    public /* synthetic */ pf40(int i, List list, Map map) {
        this.a = (i & 1) == 0 ? b.f() : map;
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
        if (!(obj instanceof pf40)) {
            return false;
        }
        pf40 pf40Var = (pf40) obj;
        return jl40.l(this.a, pf40Var.a) && jl40.l(this.b, pf40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MtTrainFilters(selectedIds=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }

    public pf40() {
        this(0);
    }

    public pf40(int i) {
        this.a = b.f();
        this.b = EmptyList.a;
    }
}
