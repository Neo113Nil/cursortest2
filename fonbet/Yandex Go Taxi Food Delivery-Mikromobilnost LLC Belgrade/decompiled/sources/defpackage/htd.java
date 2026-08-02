package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class htd {
    public final String a;
    public final String b;
    public final ArrayList c;

    public htd(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htd)) {
            return false;
        }
        htd htdVar = (htd) obj;
        return this.a.equals(htdVar.a) && this.b.equals(htdVar.b) && this.c.equals(htdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpsaleComposites(offersBatchIdUpsale=");
        sb.append(this.a);
        sb.append(", eventSessionId=");
        sb.append(this.b);
        sb.append(", upsales=");
        return smw0.m(sb, this.c, ')');
    }
}
