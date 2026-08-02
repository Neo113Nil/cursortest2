package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class d300 {
    public final String a;
    public final ArrayList b;

    public d300(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d300)) {
            return false;
        }
        d300 d300Var = (d300) obj;
        return this.a.equals(d300Var.a) && this.b.equals(d300Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(text=");
        sb.append(this.a);
        sb.append(", parts=");
        return smw0.m(sb, this.b, ')');
    }
}
