package defpackage;

import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes9.dex */
public final class oqv implements lb61, fpe {
    public Integer a;
    public Integer b;

    public oqv(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    @Override // defpackage.lb61
    public final void C(Integer num) {
        this.a = num;
    }

    @Override // defpackage.fpe
    public final Object copy() {
        return new oqv(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oqv)) {
            return false;
        }
        oqv oqvVar = (oqv) obj;
        return jl40.l(this.a, oqvVar.a) && jl40.l(this.b, oqvVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // defpackage.lb61
    public final Integer l() {
        return this.a;
    }

    @Override // defpackage.lb61
    public final Integer n() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(LicenseUtility.SEPARATOR);
        Integer num = this.b;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }

    @Override // defpackage.lb61
    public final void w(Integer num) {
        this.b = num;
    }

    public oqv() {
        this(null, null);
    }
}
