package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class f0m {
    public static final f0m b = new f0m(null);
    public final Long a;

    public f0m(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return f0m.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((f0m) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DocumentLifetime(freshUntilTimestamp=" + this.a + Extension.C_BRAKE;
    }
}
