package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class gm0 {
    public final ArrayList a;
    public final ArrayList b;

    public gm0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm0)) {
            return false;
        }
        gm0 gm0Var = (gm0) obj;
        return this.a.equals(gm0Var.a) && this.b.equals(gm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalOffersInput(passedUpsaleSteps=");
        sb.append(this.a);
        sb.append(", offers=");
        return smw0.m(sb, this.b, ')');
    }
}
