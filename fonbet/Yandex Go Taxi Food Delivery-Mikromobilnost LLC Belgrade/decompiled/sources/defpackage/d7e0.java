package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class d7e0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public d7e0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7e0)) {
            return false;
        }
        d7e0 d7e0Var = (d7e0) obj;
        return this.a.equals(d7e0Var.a) && this.b.equals(d7e0Var.b) && this.c.equals(d7e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopupConfigurationFragment(name=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", popups=");
        return smw0.m(sb, this.c, ')');
    }
}
