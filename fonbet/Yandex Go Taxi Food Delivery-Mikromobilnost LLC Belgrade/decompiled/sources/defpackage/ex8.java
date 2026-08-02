package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ex8 implements fx8 {
    public final String a;
    public final boolean b;
    public final int c;
    public final HapticEffect d;

    public ex8(String str, boolean z, int i, HapticEffect hapticEffect) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = hapticEffect;
    }

    @Override // defpackage.fx8
    public final HapticEffect a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex8)) {
            return false;
        }
        ex8 ex8Var = (ex8) obj;
        return jl40.l(this.a, ex8Var.a) && this.b == ex8Var.b && this.c == ex8Var.c && this.d == ex8Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, unr0.e(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("UsualRequirementClicked(requirementName=", this.a, ", isSelected=", ", cellIndex=", this.b);
        l.append(this.c);
        l.append(", hapticEffect=");
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
