package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hd40 implements td40 {
    public final db40 a;
    public final gb40 b;
    public final String c;

    static {
        gb40 gb40Var = gb40.f;
    }

    public hd40(db40 db40Var, gb40 gb40Var, String str) {
        this.a = db40Var;
        this.b = gb40Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd40)) {
            return false;
        }
        hd40 hd40Var = (hd40) obj;
        return jl40.l(this.a, hd40Var.a) && jl40.l(this.b, hd40Var.b) && jl40.l(this.c, hd40Var.c);
    }

    public final int hashCode() {
        db40 db40Var = this.a;
        int hashCode = (this.b.hashCode() + ((db40Var == null ? 0 : db40Var.hashCode()) * 31)) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadScreenData(orderInfo=");
        sb.append(this.a);
        sb.append(", mtTrainCheckoutPayload=");
        sb.append(this.b);
        sb.append(", token=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
