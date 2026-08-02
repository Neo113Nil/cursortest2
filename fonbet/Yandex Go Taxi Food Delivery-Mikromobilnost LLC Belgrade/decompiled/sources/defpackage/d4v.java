package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class d4v implements u22 {
    public final String a;
    public final q0d0 b;

    public d4v(String str, q0d0 q0d0Var) {
        this.a = str;
        this.b = q0d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4v)) {
            return false;
        }
        d4v d4vVar = (d4v) obj;
        return jl40.l(this.a, d4vVar.a) && jl40.l(this.b, d4vVar.b);
    }

    @Override // defpackage.h22
    public final q0d0 getAction() {
        return this.b;
    }

    @Override // defpackage.h22
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q0d0 q0d0Var = this.b;
        return hashCode + (q0d0Var == null ? 0 : q0d0Var.hashCode());
    }

    public final String toString() {
        return "IconAnalyticWidget(id=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
