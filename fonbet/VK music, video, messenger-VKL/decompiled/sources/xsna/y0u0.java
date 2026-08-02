package xsna;

import java.util.ArrayList;

/* compiled from: ActualPoll.kt */
/* loaded from: classes16.dex */
public final class y0u0 {
    public final String a;
    public final ArrayList b;

    public y0u0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0u0)) {
            return false;
        }
        y0u0 y0u0Var = (y0u0) obj;
        return this.a.equals(y0u0Var.a) && this.b.equals(y0u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewState(title=");
        sb.append(this.a);
        sb.append(", variants=");
        return bo.c(')', sb, this.b);
    }
}
