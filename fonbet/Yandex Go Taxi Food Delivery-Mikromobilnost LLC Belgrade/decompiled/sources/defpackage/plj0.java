package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class plj0 implements xlj0 {
    public final String a;
    public final pkj0 b;
    public final HapticEffect c;

    public plj0(String str, pkj0 pkj0Var, HapticEffect hapticEffect) {
        this.a = str;
        this.b = pkj0Var;
        this.c = hapticEffect;
    }

    @Override // defpackage.xlj0
    public final HapticEffect a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plj0)) {
            return false;
        }
        plj0 plj0Var = (plj0) obj;
        return jl40.l(this.a, plj0Var.a) && this.b.equals(plj0Var.b) && this.c == plj0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SwitchRequirementClicked(name=" + this.a + ", switchUiState=" + this.b + ", hapticEffect=" + this.c + Extension.C_BRAKE;
    }
}
