package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jam0 {
    public final Text a;
    public final rbv b;
    public final MoneyEntity c;
    public final ColorModel d;
    public final String e;
    public final rr51 f;

    public jam0(Text text, rbv rbvVar, MoneyEntity moneyEntity, ColorModel colorModel, String str, rr51 rr51Var) {
        this.a = text;
        this.b = rbvVar;
        this.c = moneyEntity;
        this.d = colorModel;
        this.e = str;
        this.f = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jam0)) {
            return false;
        }
        jam0 jam0Var = (jam0) obj;
        return jl40.l(this.a, jam0Var.a) && jl40.l(this.b, jam0Var.b) && jl40.l(this.c, jam0Var.c) && jl40.l(this.d, jam0Var.d) && jl40.l(this.e, jam0Var.e) && this.f.equals(jam0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(vfc.d(this.d, ly3.d(this.c, ly3.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        return "Header(title=" + this.a + ", titleIcon=" + this.b + ", totalBalance=" + this.c + ", backgroundGradient=" + this.d + ", supportAction=" + jr.a(this.e) + ", bottomDivData=" + this.f + Extension.C_BRAKE;
    }
}
