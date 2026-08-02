package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hcf0 implements icf0 {
    public final ye0 a;

    public hcf0(ye0 ye0Var) {
        this.a = ye0Var;
    }

    public final ye0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcf0) && this.a.equals(((hcf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Divkit(skeletonId=" + this.a + Extension.C_BRAKE;
    }
}
