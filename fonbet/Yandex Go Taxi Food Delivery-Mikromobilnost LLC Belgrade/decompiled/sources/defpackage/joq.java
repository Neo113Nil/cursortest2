package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class joq extends loq {
    public final ywl a;

    public joq(ywl ywlVar) {
        this.a = ywlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof joq) && jl40.l(this.a, ((joq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Preview(document=" + this.a + Extension.C_BRAKE;
    }
}
