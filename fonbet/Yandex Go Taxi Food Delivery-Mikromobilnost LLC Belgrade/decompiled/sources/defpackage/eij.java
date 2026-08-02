package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eij {
    public final u8j0 a;

    public eij(u8j0 u8j0Var) {
        this.a = u8j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eij) && this.a.equals(((eij) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DiffRateCalendarState(requestStatus=" + this.a + Extension.C_BRAKE;
    }
}
