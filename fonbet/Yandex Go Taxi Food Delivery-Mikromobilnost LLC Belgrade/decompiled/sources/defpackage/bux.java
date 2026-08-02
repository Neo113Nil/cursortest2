package defpackage;

import com.yandex.go.summary.model.LastVisibleTariffCardItemOrigin;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bux {
    public static final bux d = new bux(ob5.f, -1, LastVisibleTariffCardItemOrigin.SYSTEM);
    public final ob5 a;
    public final int b;
    public final LastVisibleTariffCardItemOrigin c;

    public bux(ob5 ob5Var, int i, LastVisibleTariffCardItemOrigin lastVisibleTariffCardItemOrigin) {
        this.a = ob5Var;
        this.b = i;
        this.c = lastVisibleTariffCardItemOrigin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bux)) {
            return false;
        }
        bux buxVar = (bux) obj;
        return jl40.l(this.a, buxVar.a) && this.b == buxVar.b && this.c == buxVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LastVisibleTariffCardItem(baseTariffInfoUiState=" + this.a + ", index=" + this.b + ", origin=" + this.c + Extension.C_BRAKE;
    }
}
