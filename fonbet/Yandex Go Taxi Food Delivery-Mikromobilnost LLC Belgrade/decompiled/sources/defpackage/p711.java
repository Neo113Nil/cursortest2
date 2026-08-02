package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class p711 implements s711 {
    public final ee01 a;

    public p711(ee01 ee01Var) {
        this.a = ee01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p711) && jl40.l(this.a, ((p711) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenSchedule(scheduleButton=" + this.a + Extension.C_BRAKE;
    }
}
