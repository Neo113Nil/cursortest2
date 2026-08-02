package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class eus0 implements pre {
    public final String a;
    public final xts0 b;
    public final String c;
    public final yg d;

    public eus0(String str, xts0 xts0Var, String str2, yg ygVar) {
        this.a = str;
        this.b = xts0Var;
        this.c = str2;
        this.d = ygVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eus0)) {
            return false;
        }
        eus0 eus0Var = (eus0) obj;
        return jl40.l(this.a, eus0Var.a) && this.b.equals(eus0Var.b) && jl40.l(this.c, eus0Var.c) && jl40.l(this.d, eus0Var.d);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "slot";
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        yg ygVar = this.d;
        return hashCode2 + (ygVar != null ? ygVar.hashCode() : 0);
    }

    public final String toString() {
        return "SlotRemoteCoreWidget(id=" + this.a + ", slot=" + this.b + ", metricaLabel=" + this.c + ", accessibilityInfo=" + this.d + Extension.C_BRAKE;
    }
}
