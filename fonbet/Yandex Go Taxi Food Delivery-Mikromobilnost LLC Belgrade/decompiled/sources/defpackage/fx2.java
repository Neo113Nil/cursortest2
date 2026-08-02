package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fx2 implements jx2 {
    public final v8r0 a;

    public fx2(v8r0 v8r0Var) {
        this.a = v8r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx2) && jl40.l(this.a, ((fx2) obj).a);
    }

    @Override // defpackage.jx2
    public final v8r0 getItem() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Click(item=" + this.a + Extension.C_BRAKE;
    }
}
