package xsna;

import java.util.ArrayList;

/* compiled from: PlannedExerciseBlock.kt */
/* loaded from: classes12.dex */
public final class bta0 {
    public final int a;
    public final ArrayList b;
    public final String c;

    public bta0(String str, ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bta0)) {
            return false;
        }
        bta0 bta0Var = (bta0) obj;
        return this.a == bta0Var.a && epx.f(this.c, bta0Var.c) && this.b.equals(bta0Var.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.c;
        return this.b.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlannedExerciseBlock(repetitions=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", steps=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
