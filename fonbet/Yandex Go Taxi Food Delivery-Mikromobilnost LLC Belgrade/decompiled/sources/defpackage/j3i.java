package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j3i {
    public static final j3i c = new j3i(0);
    public final String a;
    public final ysi b;

    public j3i(String str, ysi ysiVar) {
        this.a = str;
        this.b = ysiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3i)) {
            return false;
        }
        j3i j3iVar = (j3i) obj;
        return jl40.l(this.a, j3iVar.a) && jl40.l(this.b, j3iVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ysi ysiVar = this.b;
        return hashCode + (ysiVar == null ? 0 : ysiVar.hashCode());
    }

    public final String toString() {
        return "DeliveryD2dParams(tariffClass=" + this.a + ", doorToDoorRequirement=" + this.b + Extension.C_BRAKE;
    }

    public j3i() {
        this(0);
    }

    public /* synthetic */ j3i(int i) {
        this("", null);
    }
}
