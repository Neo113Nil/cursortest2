package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hqd0 extends jqd0 {
    public final List a;

    public hqd0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqd0) && jl40.l(this.a, ((hqd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("Error(attempts="), this.a, ')');
    }
}
