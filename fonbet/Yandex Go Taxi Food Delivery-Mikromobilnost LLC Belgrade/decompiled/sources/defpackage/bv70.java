package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class bv70 {
    public final DriveState a;
    public final zzs b;

    public bv70(zzs zzsVar, DriveState driveState) {
        this.a = driveState;
        this.b = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv70)) {
            return false;
        }
        bv70 bv70Var = (bv70) obj;
        return this.a == bv70Var.a && jl40.l(this.b, bv70Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zzs zzsVar = this.b;
        return hashCode + (zzsVar == null ? 0 : zzsVar.hashCode());
    }

    public final String toString() {
        return "OrderSnapshot(state=" + this.a + ", destPoint=" + this.b + Extension.C_BRAKE;
    }
}
