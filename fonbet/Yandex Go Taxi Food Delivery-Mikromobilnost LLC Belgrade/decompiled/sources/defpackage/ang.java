package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ang implements qas0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public ang(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ang)) {
            return false;
        }
        ang angVar = (ang) obj;
        return this.a == angVar.a && this.b == angVar.b && this.c == angVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(qv10.u("ShowAutoTopupTooltip(profileButtonEnabled=", ", userAvatarButtonEnabled=", ", hasProfileTopButton=", this.a, this.b), this.c, Extension.C_BRAKE);
    }
}
