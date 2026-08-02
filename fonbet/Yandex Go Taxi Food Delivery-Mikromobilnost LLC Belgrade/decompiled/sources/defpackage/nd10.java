package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.v;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class nd10 {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final ImmutableMap i;
    public final md10 j;

    public nd10(ld10 ld10Var, ImmutableMap immutableMap, md10 md10Var) {
        this.a = ld10Var.a;
        this.b = ld10Var.b;
        this.c = ld10Var.c;
        this.d = ld10Var.d;
        this.f = ld10Var.g;
        this.g = ld10Var.h;
        this.e = ld10Var.f;
        this.h = ld10Var.i;
        this.i = immutableMap;
        this.j = md10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nd10.class != obj.getClass()) {
            return false;
        }
        nd10 nd10Var = (nd10) obj;
        if (this.a.equals(nd10Var.a) && this.b == nd10Var.b && this.c.equals(nd10Var.c) && this.d == nd10Var.d && this.e == nd10Var.e) {
            return v.b(nd10Var.i, this.i) && this.j.equals(nd10Var.j) && Objects.equals(this.f, nd10Var.f) && Objects.equals(this.g, nd10Var.g) && Objects.equals(this.h, nd10Var.h);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + ((this.i.hashCode() + ((((unr0.b((unr0.b(217, 31, this.a) + this.b) * 31, 31, this.c) + this.d) * 31) + this.e) * 31)) * 31)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
