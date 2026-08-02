package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class bfj implements cfj {
    public final List a;

    public bfj(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfj) && jl40.l(this.a, ((bfj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("LevelFilter(items="), this.a, ')');
    }
}
