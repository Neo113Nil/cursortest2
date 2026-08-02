package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mn extends nr {
    public final String a;
    public final kw7 b;
    public final String c;

    public mn(String str, kw7 kw7Var, String str2) {
        this.a = str;
        this.b = kw7Var;
        this.c = str2;
    }

    @Override // defpackage.nr
    public final String b() {
        return this.c;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        return jl40.l(this.a, mnVar.a) && this.b.equals(mnVar.b) && jl40.l(this.c, mnVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionCancelV2(title=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
