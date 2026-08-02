package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class etc {
    public final v5z0 a;
    public final v5z0 b;

    public etc(v5z0 v5z0Var, v5z0 v5z0Var2) {
        this.a = v5z0Var;
        this.b = v5z0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etc)) {
            return false;
        }
        etc etcVar = (etc) obj;
        return this.a.equals(etcVar.a) && this.b.equals(etcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommunicationWindow(startTime=" + this.a + ", endTime=" + this.b + Extension.C_BRAKE;
    }
}
