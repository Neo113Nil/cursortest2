package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hjf0 implements pre, h0s0 {
    public final String a;
    public final bif0 b;
    public final x2s c;

    public hjf0(String str, bif0 bif0Var, x2s x2sVar) {
        this.a = str;
        this.b = bif0Var;
        this.c = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjf0)) {
            return false;
        }
        hjf0 hjf0Var = (hjf0) obj;
        return jl40.l(this.a, hjf0Var.a) && jl40.l(this.b, hjf0Var.b) && this.c.equals(hjf0Var.c);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "progress";
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bif0 bif0Var = this.b;
        return this.c.hashCode() + ((hashCode + (bif0Var == null ? 0 : bif0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "ProgressRemoteCoreWidget(id=" + this.a + ", bar=" + this.b + ", analyticsData=" + this.c + Extension.C_BRAKE;
    }
}
