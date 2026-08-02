package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cj60 implements pre {
    public final String a;
    public final xts0 b;
    public final String c;
    public final String d;

    public cj60(String str, xts0 xts0Var, String str2, String str3) {
        this.a = str;
        this.b = xts0Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj60)) {
            return false;
        }
        cj60 cj60Var = (cj60) obj;
        return jl40.l(this.a, cj60Var.a) && this.b.equals(cj60Var.b) && jl40.l(this.c, cj60Var.c) && jl40.l(this.d, cj60Var.d);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "notification";
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationRemoteCoreWidget(id=");
        sb.append(this.a);
        sb.append(", slot=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return g8e.r(sb, this.c, ", metricaLabel=", this.d, Extension.C_BRAKE);
    }
}
