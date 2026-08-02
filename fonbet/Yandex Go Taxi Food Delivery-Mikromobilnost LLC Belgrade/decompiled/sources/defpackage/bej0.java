package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bej0 implements iej0 {
    public final String a;
    public final int b;
    public final HapticEffect c;

    public bej0(String str, int i, HapticEffect hapticEffect) {
        this.a = str;
        this.b = i;
        this.c = hapticEffect;
    }

    @Override // defpackage.iej0
    public final HapticEffect a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bej0)) {
            return false;
        }
        bej0 bej0Var = (bej0) obj;
        return jl40.l(this.a, bej0Var.a) && this.b == bej0Var.b && this.c == bej0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "CompoundOptionsClicked(requirementName=", this.a, ", optionIndex=", ", hapticEffect=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
