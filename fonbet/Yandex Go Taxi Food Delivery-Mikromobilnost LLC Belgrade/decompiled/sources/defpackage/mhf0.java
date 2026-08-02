package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mhf0 {
    public final qfc a;
    public final qfc b;
    public final String c;

    public mhf0(qfc qfcVar, qfc qfcVar2, String str) {
        this.a = qfcVar;
        this.b = qfcVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhf0)) {
            return false;
        }
        mhf0 mhf0Var = (mhf0) obj;
        return this.a.equals(mhf0Var.a) && this.b.equals(mhf0Var.b) && jl40.l(this.c, mhf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBadgeModel(backgroundColor=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", text=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
