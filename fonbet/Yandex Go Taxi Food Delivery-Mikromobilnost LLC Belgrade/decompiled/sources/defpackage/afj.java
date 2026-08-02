package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class afj implements cfj {
    public final List a;

    public afj(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afj) && jl40.l(this.a, ((afj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("FieldFilter(items="), this.a, ')');
    }
}
