package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class hxd0 {
    public final String a;
    public final boolean b;
    public final int c;
    public boolean d;

    public hxd0(String str, int i, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxd0)) {
            return false;
        }
        hxd0 hxd0Var = (hxd0) obj;
        return jl40.l(this.a, hxd0Var.a) && this.b == hxd0Var.b && this.c == hxd0Var.c && this.d == hxd0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + oyr.b(this.c, unr0.e(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder l = oo31.l("PollMessageAnswerOption(answer=", this.a, ", isVoted=", ", optionVotesCount=", this.b);
        l.append(this.c);
        l.append(", isSelected=");
        l.append(z);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
