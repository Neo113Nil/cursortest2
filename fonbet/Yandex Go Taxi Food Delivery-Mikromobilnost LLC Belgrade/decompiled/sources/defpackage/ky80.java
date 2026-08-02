package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ky80 implements n6z {
    public final String a;
    public final String b;

    public ky80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.n6z
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky80)) {
            return false;
        }
        ky80 ky80Var = (ky80) obj;
        return jl40.l(this.a, ky80Var.a) && jl40.l(this.b, ky80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OutputLocationMeta(source=", q6z.a(this.a), ", inputSource=", q6z.a(this.b), Extension.C_BRAKE);
    }
}
