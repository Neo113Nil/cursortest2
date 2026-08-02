package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class bnx0 {
    public static final bnx0 c = new bnx0("", EmptyList.a);
    public final String a;
    public final List b;

    public bnx0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnx0)) {
            return false;
        }
        bnx0 bnx0Var = (bnx0) obj;
        return jl40.l(this.a, bnx0Var.a) && jl40.l(this.b, bnx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
