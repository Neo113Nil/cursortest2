package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cx8 implements fx8 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final HapticEffect e;

    public cx8(String str, String str2, String str3, int i, HapticEffect hapticEffect) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
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
        if (!(obj instanceof cx8)) {
            return false;
        }
        cx8 cx8Var = (cx8) obj;
        return jl40.l(this.a, cx8Var.a) && jl40.l(this.b, cx8Var.b) && jl40.l(this.c, cx8Var.c) && this.d == cx8Var.d && this.e == cx8Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + oyr.b(this.d, unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("UnsupportedRedirectClicked(requirementName=", this.a, ", redirectTariffClass=", this.b, ", redirectRequirementName=");
        b64.A(this.d, this.c, ", cellIndex=", ", hapticEffect=", v);
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
