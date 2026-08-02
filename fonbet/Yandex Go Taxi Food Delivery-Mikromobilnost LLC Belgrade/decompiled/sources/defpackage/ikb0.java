package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ikb0 implements mkb0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public ikb0(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikb0)) {
            return false;
        }
        ikb0 ikb0Var = (ikb0) obj;
        return jl40.l(this.a, ikb0Var.a) && jl40.l(this.b, ikb0Var.b) && this.c == ikb0Var.c && this.d == ikb0Var.d;
    }

    @Override // defpackage.mkb0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", total=", Extension.C_BRAKE, b64.v("Loading(id=", this.a, ", imageLocalPath=", this.b, ", progress="));
    }
}
