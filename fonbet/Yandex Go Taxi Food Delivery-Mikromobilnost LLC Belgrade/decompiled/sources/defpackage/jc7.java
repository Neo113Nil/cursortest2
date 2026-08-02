package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class jc7 {
    public final Long a;

    public jc7(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return jc7.class.equals(obj != null ? obj.getClass() : null) && jl40.l(this.a, ((jc7) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Lifetime(freshUntilTimestamp=" + this.a + Extension.C_BRAKE;
    }
}
