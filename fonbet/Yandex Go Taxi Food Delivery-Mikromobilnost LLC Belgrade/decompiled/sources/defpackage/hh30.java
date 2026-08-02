package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hh30 implements wh30 {
    public final ee01 a;

    public hh30(ee01 ee01Var) {
        this.a = ee01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hh30) && jl40.l(this.a, ((hh30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenSchedule(button=" + this.a + Extension.C_BRAKE;
    }
}
