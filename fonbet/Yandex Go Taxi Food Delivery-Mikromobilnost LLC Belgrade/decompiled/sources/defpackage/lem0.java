package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lem0 implements qem0 {
    public final rr51 a;

    public lem0(rr51 rr51Var) {
        this.a = rr51Var;
    }

    public final rr51 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lem0) && jl40.l(this.a, ((lem0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccountInfoContent(divData=" + this.a + Extension.C_BRAKE;
    }
}
