package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class eoc0 {
    public final List a;

    public eoc0(List list) {
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eoc0) && jl40.l(this.a, ((eoc0) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("PlaqueMetric(metrics="), this.a, ')');
    }
}
