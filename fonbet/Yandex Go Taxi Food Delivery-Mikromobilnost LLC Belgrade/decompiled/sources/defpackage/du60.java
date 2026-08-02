package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class du60 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public du60(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du60)) {
            return false;
        }
        du60 du60Var = (du60) obj;
        return this.a.equals(du60Var.a) && this.b.equals(du60Var.b) && this.c.equals(du60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalCompositeOffers(batchPositionId=");
        sb.append(this.a);
        sb.append(", eventSessionId=");
        sb.append(this.b);
        sb.append(", offers=");
        return smw0.m(sb, this.c, ')');
    }
}
