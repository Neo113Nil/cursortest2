package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class few0 implements gew0 {
    public final dew0 a;
    public final String b;
    public final Integer c;

    public few0(dew0 dew0Var, String str, Integer num) {
        this.a = dew0Var;
        this.b = str;
        this.c = num;
    }

    @Override // defpackage.gew0
    public final Integer a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof few0)) {
            return false;
        }
        few0 few0Var = (few0) obj;
        return this.a.equals(few0Var.a) && jl40.l(this.b, few0Var.b) && jl40.l(this.c, few0Var.c);
    }

    @Override // defpackage.gew0
    public final String getUrl() {
        return this.b;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transient(key=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", repeatCount=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }
}
