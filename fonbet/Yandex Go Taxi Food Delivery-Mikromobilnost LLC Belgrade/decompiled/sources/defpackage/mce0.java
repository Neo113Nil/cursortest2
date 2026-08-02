package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mce0 {
    public final ice0 a;

    public mce0(ice0 ice0Var) {
        this.a = ice0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mce0) && this.a.equals(((mce0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Position(position=" + this.a + Extension.C_BRAKE;
    }
}
