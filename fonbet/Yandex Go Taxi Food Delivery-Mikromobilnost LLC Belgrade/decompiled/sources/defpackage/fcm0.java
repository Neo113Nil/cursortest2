package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fcm0 {
    public final Text a;
    public final rbv b;
    public final String c;
    public final ColorModel d;
    public final rr51 e;

    public fcm0(Text text, rbv rbvVar, String str, ColorModel colorModel, rr51 rr51Var) {
        this.a = text;
        this.b = rbvVar;
        this.c = str;
        this.d = colorModel;
        this.e = rr51Var;
    }

    public final ColorModel a() {
        return this.d;
    }

    public final rr51 b() {
        return this.e;
    }

    public final Text c() {
        return this.a;
    }

    public final rbv d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcm0)) {
            return false;
        }
        fcm0 fcm0Var = (fcm0) obj;
        return jl40.l(this.a, fcm0Var.a) && jl40.l(this.b, fcm0Var.b) && jl40.l(this.c, fcm0Var.c) && jl40.l(this.d, fcm0Var.d) && this.e.equals(fcm0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + vfc.d(this.d, unr0.b(ly3.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        return "Header(title=" + this.a + ", titleIcon=" + this.b + ", totalBalance=" + this.c + ", backgroundGradient=" + this.d + ", bottomDivData=" + this.e + Extension.C_BRAKE;
    }
}
