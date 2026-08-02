package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ax8 implements fx8 {
    public final String a;
    public final boolean b;
    public final int c;
    public final int d;
    public final HapticEffect e;

    public ax8(String str, boolean z, int i, int i2, HapticEffect hapticEffect) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = hapticEffect;
    }

    @Override // defpackage.fx8
    public final HapticEffect a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax8)) {
            return false;
        }
        ax8 ax8Var = (ax8) obj;
        return jl40.l(this.a, ax8Var.a) && this.b == ax8Var.b && this.c == ax8Var.c && this.d == ax8Var.d && this.e == ax8Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + oyr.b(this.d, oyr.b(this.c, unr0.e(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("CompoundRequirementClicked(requirementName=", this.a, ", isSelected=", ", optionIndex=", this.b);
        vfc.u(this.c, this.d, ", cellIndex=", ", hapticEffect=", l);
        l.append(this.e);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
