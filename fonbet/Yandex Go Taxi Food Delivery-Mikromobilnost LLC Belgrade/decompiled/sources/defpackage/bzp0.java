package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class bzp0 {
    public final Float a;

    public bzp0(Float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return bzp0.class.equals(obj != null ? obj.getClass() : null) && jl40.k(this.a, ((bzp0) obj).a);
    }

    public final int hashCode() {
        Float f = this.a;
        if (f != null) {
            return f.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Paging(reserve=" + this.a + Extension.C_BRAKE;
    }
}
