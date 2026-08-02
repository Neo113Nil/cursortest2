package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bx8 implements fx8 {
    public final String a;
    public final String b;
    public final int c;
    public final HapticEffect d;

    public bx8(String str, String str2, int i, HapticEffect hapticEffect) {
        this.a = str;
        this.b = str2;
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
        if (!(obj instanceof bx8)) {
            return false;
        }
        bx8 bx8Var = (bx8) obj;
        return jl40.l(this.a, bx8Var.a) && jl40.l(this.b, bx8Var.b) && this.c == bx8Var.c && this.d == bx8Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RedirectClicked(requirementName=", this.a, ", redirectTariffClass=", this.b, ", cellIndex=");
        v.append(this.c);
        v.append(", hapticEffect=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
