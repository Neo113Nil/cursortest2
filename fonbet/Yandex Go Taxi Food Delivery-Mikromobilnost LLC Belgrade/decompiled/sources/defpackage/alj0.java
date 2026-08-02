package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class alj0 implements xlj0 {
    public final String a;
    public final String b;
    public final HapticEffect c;

    public alj0(String str, String str2, HapticEffect hapticEffect) {
        this.a = str;
        this.b = str2;
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
        if (!(obj instanceof alj0)) {
            return false;
        }
        alj0 alj0Var = (alj0) obj;
        return jl40.l(this.a, alj0Var.a) && jl40.l(this.b, alj0Var.b) && this.c == alj0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryIntervalsClicked(tariffClass=", this.a, ", verticalId=", this.b, ", hapticEffect=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
