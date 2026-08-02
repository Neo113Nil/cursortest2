package xsna;

import java.util.ArrayList;

/* compiled from: BookingRecordsPage.kt */
/* loaded from: classes18.dex */
public final class cv7 {
    public final int a;
    public final ArrayList b;

    public cv7(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv7)) {
            return false;
        }
        cv7 cv7Var = (cv7) obj;
        return this.a == cv7Var.a && this.b.equals(cv7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingRecordsPage(count=");
        sb.append(this.a);
        sb.append(", records=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
