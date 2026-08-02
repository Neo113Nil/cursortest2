package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes8.dex */
public final class dp20 {
    public static final cp20 Companion = new cp20();
    public final String a;
    public final String b;

    public /* synthetic */ dp20(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, bp20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp20)) {
            return false;
        }
        dp20 dp20Var = (dp20) obj;
        return jl40.l(this.a, dp20Var.a) && jl40.l(this.b, dp20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("MobMetricaData(deviceId=", this.a, ", metricaUuid=", this.b, Extension.C_BRAKE);
    }

    public dp20(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
