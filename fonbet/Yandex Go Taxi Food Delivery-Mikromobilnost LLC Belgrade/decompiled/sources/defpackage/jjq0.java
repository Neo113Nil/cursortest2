package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jjq0 implements wjq0 {
    public final eh01 a;
    public final String b;
    public final phq0 c;

    public jjq0(eh01 eh01Var, String str, phq0 phq0Var) {
        this.a = eh01Var;
        this.b = str;
        this.c = phq0Var;
    }

    @Override // defpackage.wjq0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.wjq0
    public final eh01 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjq0)) {
            return false;
        }
        jjq0 jjq0Var = (jjq0) obj;
        return jl40.l(this.a, jjq0Var.a) && jl40.l(this.b, jjq0Var.b) && this.c.equals(jjq0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Me2MeTopup(fromCircleButton=" + this.a + ", sheetItemId=" + this.b + ", partner=" + this.c + Extension.C_BRAKE;
    }
}
