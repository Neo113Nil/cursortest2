package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fdw0 {
    public final String a;
    public final Integer b;
    public final boolean c;

    public fdw0(Integer num, String str, boolean z) {
        this.a = str;
        this.b = num;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdw0)) {
            return false;
        }
        fdw0 fdw0Var = (fdw0) obj;
        return jl40.l(this.a, fdw0Var.a) && jl40.l(this.b, fdw0Var.b) && this.c == fdw0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return x4e.i(n.q("LottieAnimation(url=", this.b, this.a, ", repeatCount=", ", removeAfterPlaying="), this.c, Extension.C_BRAKE);
    }
}
