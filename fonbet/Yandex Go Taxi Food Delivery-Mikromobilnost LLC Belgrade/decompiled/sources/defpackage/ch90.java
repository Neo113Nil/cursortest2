package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ch90 implements dh90 {
    public final yg90 a;

    public ch90(yg90 yg90Var) {
        this.a = yg90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch90) && this.a.equals(((ch90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(partner=" + this.a + Extension.C_BRAKE;
    }
}
