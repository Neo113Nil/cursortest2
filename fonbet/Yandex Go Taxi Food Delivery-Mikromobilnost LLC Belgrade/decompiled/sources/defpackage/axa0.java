package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class axa0 {
    public final doe a;

    public axa0(doe doeVar) {
        this.a = doeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axa0) && this.a.equals(((axa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PerformerPathPoint(coordinates=" + this.a + Extension.C_BRAKE;
    }
}
