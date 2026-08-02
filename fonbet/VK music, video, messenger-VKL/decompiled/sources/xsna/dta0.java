package xsna;

import java.util.ArrayList;

/* compiled from: PlannedExerciseStep.kt */
/* loaded from: classes12.dex */
public final class dta0 {
    public final int a;
    public final int b;
    public final f4q c;
    public final ArrayList d;
    public final String e;

    public dta0(int i, int i2, f4q f4qVar, ArrayList arrayList, String str) {
        this.a = i;
        this.b = i2;
        this.c = f4qVar;
        this.d = arrayList;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dta0)) {
            return false;
        }
        dta0 dta0Var = (dta0) obj;
        return this.a == dta0Var.a && this.b == dta0Var.b && epx.f(this.e, dta0Var.e) && epx.f(this.c, dta0Var.c) && this.d.equals(dta0Var.d);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.e;
        return this.d.hashCode() + ((this.c.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlannedExerciseStep(exerciseType=");
        sb.append(this.a);
        sb.append(", exerciseCategory=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", completionGoal=");
        sb.append(this.c);
        sb.append(", performanceTargets=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
    }
}
