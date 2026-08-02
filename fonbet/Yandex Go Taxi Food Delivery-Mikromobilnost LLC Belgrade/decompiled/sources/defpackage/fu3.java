package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fu3 {
    public final Text a;
    public final String b;
    public final String c;
    public final eu3 d;
    public final boolean e;

    public fu3(Text text, String str, String str2, eu3 eu3Var, boolean z) {
        this.a = text;
        this.b = str;
        this.c = str2;
        this.d = eu3Var;
        this.e = z;
    }

    public final String a() {
        return this.c;
    }

    public final boolean b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final Text d() {
        return this.a;
    }

    public final eu3 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu3)) {
            return false;
        }
        fu3 fu3Var = (fu3) obj;
        return jl40.l(this.a, fu3Var.a) && jl40.l(this.b, fu3Var.b) && jl40.l(this.c, fu3Var.c) && jl40.l(this.d, fu3Var.d) && this.e == fu3Var.e;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        eu3 eu3Var = this.d;
        return Boolean.hashCode(this.e) + ((b + (eu3Var == null ? 0 : eu3Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoTopupAmountInput(title=");
        sb.append(this.a);
        sb.append(", inputText=");
        sb.append(this.b);
        sb.append(", currency=");
        sb.append(this.c);
        sb.append(", tooltip=");
        sb.append(this.d);
        sb.append(", focused=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
