package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class bif implements dif {
    public final Long a;

    public bif(Long l) {
        this.a = l;
    }

    public final Long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bif) && jl40.l(this.a, ((bif) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "Loaded(uid=" + this.a + Extension.C_BRAKE;
    }
}
