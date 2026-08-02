package defpackage;

import java.security.InvalidKeyException;

/* loaded from: classes4.dex */
public final class hfz extends glp0 {
    public final InvalidKeyException a;

    public hfz(InvalidKeyException invalidKeyException) {
        this.a = invalidKeyException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfz) && jl40.l(this.a, ((hfz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Log's public key cannot be used with ".concat(kca1.g(this.a));
    }
}
