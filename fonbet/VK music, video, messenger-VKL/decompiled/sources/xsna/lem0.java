package xsna;

import java.util.ArrayList;

/* compiled from: StoryStatisticsInfoDbModel.kt */
/* loaded from: classes6.dex */
public final class lem0 {
    public final String a;
    public final ArrayList b;

    public lem0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lem0)) {
            return false;
        }
        lem0 lem0Var = (lem0) obj;
        return epx.f(this.a, lem0Var.a) && this.b.equals(lem0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsCategory(header=");
        sb.append(this.a);
        sb.append(", elements=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
