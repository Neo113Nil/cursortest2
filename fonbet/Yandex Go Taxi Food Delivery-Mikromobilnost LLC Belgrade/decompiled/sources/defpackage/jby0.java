package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jby0 extends kl3 {
    public final Long b;
    public final Integer c;
    public final boolean d;

    public jby0(Long l, Integer num, boolean z) {
        super(z);
        this.b = l;
        this.c = num;
        this.d = z;
    }

    @Override // defpackage.kl3
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jby0)) {
            return false;
        }
        jby0 jby0Var = (jby0) obj;
        return jl40.l(this.b, jby0Var.b) && jl40.l(this.c, jby0Var.c) && this.d == jby0Var.d;
    }

    public final int hashCode() {
        Long l = this.b;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Enabled(timeDiffToJumpInMillis=");
        sb.append(this.b);
        sb.append(", distanceDiffToJump=");
        sb.append(this.c);
        sb.append(", shouldReport=");
        return x4e.i(sb, this.d, Extension.C_BRAKE);
    }
}
