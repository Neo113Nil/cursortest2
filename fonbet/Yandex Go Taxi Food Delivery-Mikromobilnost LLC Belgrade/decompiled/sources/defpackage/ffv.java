package defpackage;

import java.util.concurrent.FutureTask;

/* loaded from: classes15.dex */
public final class ffv extends FutureTask implements Comparable {
    public final v06 a;

    public ffv(v06 v06Var) {
        super(v06Var, null);
        this.a = v06Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v06 v06Var = this.a;
        int i = v06Var.D;
        v06 v06Var2 = ((ffv) obj).a;
        int i2 = v06Var2.D;
        return i == i2 ? v06Var.C - v06Var2.C : i2 - i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ffv)) {
            return false;
        }
        v06 v06Var = this.a;
        int i = v06Var.D;
        v06 v06Var2 = ((ffv) obj).a;
        int i2 = v06Var2.D;
        return (i == i2 ? v06Var.C - v06Var2.C : i2 - i) == 0;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
