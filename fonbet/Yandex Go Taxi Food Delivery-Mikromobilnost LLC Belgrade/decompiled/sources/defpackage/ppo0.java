package defpackage;

import com.yandex.go.scooters.qr.api.ScootersQrNumberResultSource;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ppo0 implements qpo0 {
    public final zzs a;
    public final Set b;
    public final ScootersQrNumberResultSource c;

    public ppo0(zzs zzsVar, Set set, ScootersQrNumberResultSource scootersQrNumberResultSource) {
        this.a = zzsVar;
        this.b = set;
        this.c = scootersQrNumberResultSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppo0)) {
            return false;
        }
        ppo0 ppo0Var = (ppo0) obj;
        return jl40.l(this.a, ppo0Var.a) && jl40.l(this.b, ppo0Var.b) && this.c == ppo0Var.c;
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        return this.c.hashCode() + g8e.e(this.b, (zzsVar == null ? 0 : zzsVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "Found(position=" + this.a + ", numbers=" + this.b + ", scootersQrNumberResultSource=" + this.c + Extension.C_BRAKE;
    }
}
