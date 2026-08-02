package defpackage;

import ru.yandex.taxi.summary.requirements.list.models.RequirementsDueViewPosition;

/* loaded from: classes6.dex */
public final class ioj0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final RequirementsDueViewPosition g;
    public final String h;

    public ioj0(String str, String str2, boolean z, boolean z2, boolean z3, String str3, RequirementsDueViewPosition requirementsDueViewPosition, String str4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str3;
        this.g = requirementsDueViewPosition;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioj0)) {
            return false;
        }
        ioj0 ioj0Var = (ioj0) obj;
        return jl40.l(this.a, ioj0Var.a) && jl40.l(this.b, ioj0Var.b) && this.c == ioj0Var.c && this.d == ioj0Var.d && this.e == ioj0Var.e && jl40.l(this.f, ioj0Var.f) && this.g == ioj0Var.g && jl40.l(this.h, ioj0Var.h);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
