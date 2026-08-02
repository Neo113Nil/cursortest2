package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class mjb {
    public final String a;
    public final List b;
    public final List c;
    public final gjb d;
    public final List e;
    public final String f;
    public final String g;
    public final ljb h;
    public final String i;
    public final ArrayList j;
    public final ijb k;

    public mjb(String str, List list, List list2, gjb gjbVar, List list3, String str2, String str3, ljb ljbVar, String str4, ArrayList arrayList, ijb ijbVar) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = gjbVar;
        this.e = list3;
        this.f = str2;
        this.g = str3;
        this.h = ljbVar;
        this.i = str4;
        this.j = arrayList;
        this.k = ijbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjb)) {
            return false;
        }
        mjb mjbVar = (mjb) obj;
        return jl40.l(this.a, mjbVar.a) && jl40.l(this.b, mjbVar.b) && jl40.l(this.c, mjbVar.c) && jl40.l(this.d, mjbVar.d) && jl40.l(this.e, mjbVar.e) && jl40.l(this.f, mjbVar.f) && jl40.l(this.g, mjbVar.g) && jl40.l(this.h, mjbVar.h) && this.i.equals(mjbVar.i) && this.j.equals(mjbVar.j) && jl40.l(this.k, mjbVar.k);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        gjb gjbVar = this.d;
        int b = unr0.b(unr0.b(unr0.c((c + (gjbVar == null ? 0 : gjbVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        ljb ljbVar = this.h;
        int b2 = ly3.b(unr0.b((b + (ljbVar == null ? 0 : ljbVar.hashCode())) * 31, 31, this.i), 31, this.j);
        ijb ijbVar = this.k;
        return b2 + (ijbVar != null ? ijbVar.hashCode() : 0);
    }

    public final String toString() {
        return "CheckoutContent(title=" + this.a + ", products=" + this.b + ", paymentMethodsGroups=" + this.c + ", agreement=" + this.d + ", legalTexts=" + this.e + ", paymentText=" + this.f + ", paymentDescription=" + this.g + ", paymentVia=" + this.h + ", buttonText=" + this.i + ", onsales=" + this.j + ", offerSwitch=" + this.k + ')';
    }
}
