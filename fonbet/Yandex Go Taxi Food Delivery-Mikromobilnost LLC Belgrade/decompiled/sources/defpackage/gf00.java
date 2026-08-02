package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui.ErrorType;

/* loaded from: classes5.dex */
public final class gf00 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ErrorType f;

    public gf00(int i, String str, String str2, String str3, String str4, ErrorType errorType) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = errorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf00)) {
            return false;
        }
        gf00 gf00Var = (gf00) obj;
        return this.a == gf00Var.a && this.b.equals(gf00Var.b) && this.c.equals(gf00Var.c) && this.d.equals(gf00Var.d) && jl40.l(this.e, gf00Var.e) && this.f == gf00Var.f;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        ErrorType errorType = this.f;
        return b + (errorType == null ? 0 : errorType.hashCode());
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "ManualTipUiModel(titleRes=", ", minTipValue=", this.b, ", maxTipValue=");
        g8e.D(v, this.c, ", inputTitle=", this.d, ", tipValue=");
        v.append(this.e);
        v.append(", errorType=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
