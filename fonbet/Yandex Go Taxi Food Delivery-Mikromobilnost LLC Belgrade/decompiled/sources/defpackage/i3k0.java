package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class i3k0 {
    public final String a;
    public final ArrayList b;

    public i3k0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3k0)) {
            return false;
        }
        i3k0 i3k0Var = (i3k0) obj;
        return this.a.equals(i3k0Var.a) && this.b.equals(i3k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RichText(text=");
        sb.append(this.a);
        sb.append(", items=");
        return smw0.m(sb, this.b, ')');
    }
}
