package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class nsu0 {
    public final String a;
    public final ArrayList b;

    public nsu0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsu0)) {
            return false;
        }
        nsu0 nsu0Var = (nsu0) obj;
        return this.a.equals(nsu0Var.a) && this.b.equals(nsu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnServiceSpecificCrossAction(type=");
        sb.append(this.a);
        sb.append(", params=");
        return smw0.m(sb, this.b, ')');
    }
}
