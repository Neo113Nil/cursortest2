package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class o451 implements q451 {
    public final r451 a;

    public o451(r451 r451Var) {
        this.a = r451Var;
    }

    public final r451 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o451) && this.a.equals(((o451) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Button(state=" + this.a + Extension.C_BRAKE;
    }
}
