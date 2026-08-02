package defpackage;

import com.yandex.go.summary.model.LastVisibleTariffCardItemOrigin;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jhp0 {
    public final hhp0 a;
    public final kb5 b;
    public final boolean c;
    public final LastVisibleTariffCardItemOrigin d;

    public jhp0(hhp0 hhp0Var, kb5 kb5Var, boolean z, LastVisibleTariffCardItemOrigin lastVisibleTariffCardItemOrigin) {
        this.a = hhp0Var;
        this.b = kb5Var;
        this.c = z;
        this.d = lastVisibleTariffCardItemOrigin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhp0)) {
            return false;
        }
        jhp0 jhp0Var = (jhp0) obj;
        return jl40.l(this.a, jhp0Var.a) && jl40.l(this.b, jhp0Var.b) && this.c == jhp0Var.c && this.d == jhp0Var.d;
    }

    public final int hashCode() {
        hhp0 hhp0Var = this.a;
        return this.d.hashCode() + unr0.e((this.b.hashCode() + ((hhp0Var == null ? 0 : hhp0Var.hashCode()) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "ScrollButtonWithTariffUiState(scrollButtonUiState=" + this.a + ", baseTariffInfo=" + this.b + ", wasExpandedAtLeastOnce=" + this.c + ", origin=" + this.d + Extension.C_BRAKE;
    }
}
