package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class co extends nr {
    public final String a;

    public co(String str) {
        this.a = str;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof co) && jl40.l(this.a, ((co) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ActionShareLocation(title=", this.a, Extension.C_BRAKE);
    }
}
