package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dem0 implements fem0 {
    public final cx11 a;

    public dem0(cx11 cx11Var) {
        this.a = cx11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dem0) && this.a.equals(((dem0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccountUnbindLoading(unbindAccountSheet=" + this.a + Extension.C_BRAKE;
    }
}
