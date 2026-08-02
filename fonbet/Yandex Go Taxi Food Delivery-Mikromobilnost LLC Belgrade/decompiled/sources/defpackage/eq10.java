package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eq10 implements fq10 {
    public final ye0 a;

    public eq10(ye0 ye0Var) {
        this.a = ye0Var;
    }

    public final ye0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq10) && this.a.equals(((eq10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(skeletonId=" + this.a + Extension.C_BRAKE;
    }
}
