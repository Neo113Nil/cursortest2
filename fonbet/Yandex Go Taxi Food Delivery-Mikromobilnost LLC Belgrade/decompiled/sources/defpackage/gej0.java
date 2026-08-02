package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gej0 implements iej0 {
    public final String a;
    public final String b;
    public final HapticEffect c;

    public gej0(String str, String str2, HapticEffect hapticEffect) {
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
        if (!(obj instanceof gej0)) {
            return false;
        }
        gej0 gej0Var = (gej0) obj;
        return jl40.l(this.a, gej0Var.a) && jl40.l(this.b, gej0Var.b) && this.c == gej0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("RemoveAlChoiceClicked(requirementName=", this.a, ", optionName=", this.b, ", hapticEffect=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
