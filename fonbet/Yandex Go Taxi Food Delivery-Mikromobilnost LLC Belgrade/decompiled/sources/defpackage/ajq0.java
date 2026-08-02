package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ajq0 implements wjq0 {
    public final eh01 a;
    public final String b;
    public final tfq0 c;

    public ajq0(eh01 eh01Var, String str, tfq0 tfq0Var) {
        this.a = eh01Var;
        this.b = str;
        this.c = tfq0Var;
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
        if (!(obj instanceof ajq0)) {
            return false;
        }
        ajq0 ajq0Var = (ajq0) obj;
        return jl40.l(this.a, ajq0Var.a) && jl40.l(this.b, ajq0Var.b) && this.c.equals(ajq0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "AftTopup(fromCircleButton=" + this.a + ", sheetItemId=" + this.b + ", card=" + this.c + Extension.C_BRAKE;
    }
}
