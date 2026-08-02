package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cej0 implements iej0 {
    public final String a;
    public final String b;
    public final HapticEffect c;

    public cej0(String str, String str2, HapticEffect hapticEffect) {
        this.a = str;
        this.b = str2;
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
        if (!(obj instanceof cej0)) {
            return false;
        }
        cej0 cej0Var = (cej0) obj;
        return jl40.l(this.a, cej0Var.a) && jl40.l(this.b, cej0Var.b) && this.c == cej0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("CounterMinusClicked(requirementName=", this.a, ", optionName=", this.b, ", hapticEffect=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
