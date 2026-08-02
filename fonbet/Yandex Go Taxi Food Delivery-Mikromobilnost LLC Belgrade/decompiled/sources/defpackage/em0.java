package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class em0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final List d;
    public final ht60 e;

    public em0(String str, String str2, ArrayList arrayList, List list, ht60 ht60Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = list;
        this.e = ht60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em0)) {
            return false;
        }
        em0 em0Var = (em0) obj;
        return this.a.equals(em0Var.a) && this.b.equals(em0Var.b) && this.c.equals(em0Var.c) && this.d.equals(em0Var.d) && jl40.l(this.e, em0Var.e);
    }

    public final int hashCode() {
        int c = unr0.c(ly3.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        ht60 ht60Var = this.e;
        return c + (ht60Var == null ? 0 : ht60Var.hashCode());
    }

    public final String toString() {
        return "AdditionalOffers(eventSessionId=" + this.a + ", title=" + this.b + ", offers=" + this.c + ", passedUpsaleSteps=" + this.d + ", offerSwitchToggle=" + this.e + ')';
    }
}
