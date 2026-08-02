package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.api.model.OpenReason;

/* loaded from: classes6.dex */
public final class igu0 {
    public final String a;
    public final zzs b;
    public final String c;
    public final OpenReason d;

    public igu0(String str, zzs zzsVar, String str2, OpenReason openReason) {
        this.a = str;
        this.b = zzsVar;
        this.c = str2;
        this.d = openReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igu0)) {
            return false;
        }
        igu0 igu0Var = (igu0) obj;
        return jl40.l(this.a, igu0Var.a) && jl40.l(this.b, igu0Var.b) && jl40.l(this.c, igu0Var.c) && this.d == igu0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(nnm.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "StopModel(id=" + this.a + ", point=" + this.b + ", name=" + this.c + ", openReason=" + this.d + Extension.C_BRAKE;
    }
}
