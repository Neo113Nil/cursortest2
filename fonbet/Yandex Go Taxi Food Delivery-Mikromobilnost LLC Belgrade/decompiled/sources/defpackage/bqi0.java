package defpackage;

import com.ybsdk.api.entities.YBProduct;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class bqi0 extends cqi0 {
    public final String a;
    public final YBProduct b;
    public final String c;

    public bqi0(String str, YBProduct yBProduct, String str2) {
        this.a = str;
        this.b = yBProduct;
        this.c = str2;
    }

    @Override // defpackage.eqi0
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqi0)) {
            return false;
        }
        bqi0 bqi0Var = (bqi0) obj;
        return jl40.l(this.a, bqi0Var.a) && this.b == bqi0Var.b && jl40.l(this.c, bqi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timeout(applicationId=");
        sb.append(this.a);
        sb.append(", product=");
        sb.append(this.b);
        sb.append(", supportUrl=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
