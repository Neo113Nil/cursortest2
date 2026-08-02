package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bzv0 extends czv0 {
    public final qto a;

    public bzv0(qto qtoVar) {
        this.a = qtoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzv0) && jl40.l(this.a, ((bzv0) obj).a);
    }

    public final int hashCode() {
        qto qtoVar = this.a;
        if (qtoVar == null) {
            return 0;
        }
        return qtoVar.hashCode();
    }

    public final String toString() {
        return "MainScreenGamification(districtState=" + this.a + Extension.C_BRAKE;
    }
}
