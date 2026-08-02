package defpackage;

import androidx.work.WorkInfo$State;

/* loaded from: classes10.dex */
public final class da51 {
    public String a;
    public WorkInfo$State b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da51)) {
            return false;
        }
        da51 da51Var = (da51) obj;
        return jl40.l(this.a, da51Var.a) && this.b == da51Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
