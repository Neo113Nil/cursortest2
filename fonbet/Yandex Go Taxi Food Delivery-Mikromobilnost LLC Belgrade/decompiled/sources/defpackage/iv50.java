package defpackage;

import java.net.URI;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class iv50 implements h260 {
    public static final hv50 Companion = new hv50();
    public static final i3y[] h = {null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(28)), null};
    public final yr50 a;
    public final pq50 b;
    public final String c;
    public final String d;
    public final URI e;
    public final List f;
    public final co50 g;

    public /* synthetic */ iv50(int i, yr50 yr50Var, pq50 pq50Var, String str, String str2, URI uri, List list, co50 co50Var) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, gv50.a.getDescriptor());
            throw null;
        }
        this.a = yr50Var;
        this.b = pq50Var;
        this.c = str;
        this.d = str2;
        this.e = uri;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = co50Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv50)) {
            return false;
        }
        iv50 iv50Var = (iv50) obj;
        return jl40.l(this.a, iv50Var.a) && jl40.l(this.b, iv50Var.b) && jl40.l(this.c, iv50Var.c) && jl40.l(this.d, iv50Var.d) && jl40.l(this.e, iv50Var.e) && jl40.l(this.f, iv50Var.f) && jl40.l(this.g, iv50Var.g);
    }

    @Override // defpackage.h260
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31;
        List list = this.f;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        co50 co50Var = this.g;
        return hashCode2 + (co50Var != null ? co50Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkImageWidgetModel(displayRules=" + this.a + ", contentDescription=" + this.b + ", id=" + this.c + ", type=" + this.d + ", imageUrl=" + this.e + ", templates=" + this.f + ", action=" + this.g + ')';
    }
}
