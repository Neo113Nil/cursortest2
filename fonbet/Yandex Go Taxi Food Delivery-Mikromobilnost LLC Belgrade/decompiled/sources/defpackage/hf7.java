package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class hf7 implements if7 {
    public final ze7 a;

    public hf7(ze7 ze7Var) {
        this.a = ze7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf7) && this.a.equals(((hf7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Regular(day=" + this.a + Extension.C_BRAKE;
    }
}
