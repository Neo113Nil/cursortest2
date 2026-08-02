package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class mtc0 extends u0x {
    public final hzx a;

    public mtc0(hzx hzxVar) {
        this.a = hzxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mtc0) && jl40.l(this.a, ((mtc0) obj).a);
    }

    public final int hashCode() {
        hzx hzxVar = this.a;
        if (hzxVar == null) {
            return 0;
        }
        return hzxVar.hashCode();
    }

    public final String toString() {
        return "PlaqueWidgetItem(layout=" + this.a + Extension.C_BRAKE;
    }

    public mtc0() {
        this(null);
    }
}
