package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jar0 implements kar0 {
    public final String a;

    public jar0(int i) {
        this.a = "LineSlot";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jar0) && jl40.l(this.a, ((jar0) obj).a);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("LineSlot(id=", this.a, Extension.C_BRAKE);
    }

    public jar0() {
        this(0);
    }
}
