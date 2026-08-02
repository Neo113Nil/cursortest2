package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class clz0 extends ome {
    public final String b;
    public final ky c;
    public final ldc d;
    public final ldc e;
    public final ldc f;
    public final boolean g;
    public final String h;
    public final Object i;

    public clz0(String str, ky kyVar, ldc ldcVar, ldc ldcVar2, ldc ldcVar3, boolean z, String str2, Object obj) {
        super(obj);
        this.b = str;
        this.c = kyVar;
        this.d = ldcVar;
        this.e = ldcVar2;
        this.f = ldcVar3;
        this.g = z;
        this.h = str2;
        this.i = obj;
    }

    @Override // defpackage.ome
    public final Object a() {
        return this.i;
    }

    @Override // defpackage.ome
    public final String b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clz0)) {
            return false;
        }
        clz0 clz0Var = (clz0) obj;
        return jl40.l(this.b, clz0Var.b) && this.c.equals(clz0Var.c) && jl40.l(this.d, clz0Var.d) && jl40.l(this.e, clz0Var.e) && jl40.l(this.f, clz0Var.f) && this.g == clz0Var.g && jl40.l(this.h, clz0Var.h) && jl40.l(this.i, clz0Var.i);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        ldc ldcVar = this.d;
        int hashCode2 = (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        ldc ldcVar2 = this.e;
        int hashCode3 = (hashCode2 + (ldcVar2 == null ? 0 : Long.hashCode(ldcVar2.a))) * 31;
        ldc ldcVar3 = this.f;
        int e = unr0.e((hashCode3 + (ldcVar3 == null ? 0 : Long.hashCode(ldcVar3.a))) * 31, 31, this.g);
        String str2 = this.h;
        int hashCode4 = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.i;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToggleState(leadText=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", checkedTrackColor=");
        sb.append(this.d);
        sb.append(", uncheckedTrackColor=");
        sb.append(this.e);
        sb.append(", thumbColor=");
        sb.append(this.f);
        sb.append(", isChecked=");
        sb.append(this.g);
        sb.append(", metricaLabel=");
        return tse0.l(sb, this.h, ", meta=", this.i, Extension.C_BRAKE);
    }
}
