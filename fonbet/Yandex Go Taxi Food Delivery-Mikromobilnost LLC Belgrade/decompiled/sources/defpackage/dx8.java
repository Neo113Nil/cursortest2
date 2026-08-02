package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dx8 implements fx8 {
    public final String a;
    public final List b;
    public final int c;
    public final HapticEffect d;

    public dx8(String str, List list, int i, HapticEffect hapticEffect) {
        this.a = str;
        this.b = list;
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
        if (!(obj instanceof dx8)) {
            return false;
        }
        dx8 dx8Var = (dx8) obj;
        return jl40.l(this.a, dx8Var.a) && this.b.equals(dx8Var.b) && this.c == dx8Var.c && this.d == dx8Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, unr0.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder r = xvz.r("UnsupportedRequirementClicked(requirementName=", this.a, ", optionNames=", this.b, ", cellIndex=");
        r.append(this.c);
        r.append(", hapticEffect=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
