package defpackage;

import com.yandex.go.address.models.Address;

/* loaded from: classes5.dex */
public final class jl0 extends ll0 {
    public final Address a;
    public final String b;
    public final x9v0 c;

    public jl0(Address address, String str, x9v0 x9v0Var) {
        this.a = address;
        this.b = str;
        this.c = x9v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jl0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jl0 jl0Var = (jl0) obj;
        return jl40.l(this.a, jl0Var.a) && this.b.equals(jl0Var.b) && this.c.a == jl0Var.c.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }
}
