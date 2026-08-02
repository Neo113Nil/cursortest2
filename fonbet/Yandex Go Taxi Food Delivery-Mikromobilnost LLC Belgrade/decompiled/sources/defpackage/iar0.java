package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class iar0 implements kar0 {
    public final String a;

    public iar0(int i) {
        this.a = "Line";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iar0) && jl40.l(this.a, ((iar0) obj).a);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Line(id=", this.a, Extension.C_BRAKE);
    }

    public iar0() {
        this(0);
    }
}
