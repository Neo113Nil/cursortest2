package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class iqd {
    public final String a;
    public final String b;
    public final ArrayList c;

    public iqd(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqd)) {
            return false;
        }
        iqd iqdVar = (iqd) obj;
        return this.a.equals(iqdVar.a) && this.b.equals(iqdVar.b) && this.c.equals(iqdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompositeOffersBatch(sessionId=");
        sb.append(this.a);
        sb.append(", batchId=");
        sb.append(this.b);
        sb.append(", compositeOffers=");
        return smw0.m(sb, this.c, ')');
    }
}
