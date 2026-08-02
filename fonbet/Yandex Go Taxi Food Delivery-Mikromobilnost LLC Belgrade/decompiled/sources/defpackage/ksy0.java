package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.TextAlignment;

/* loaded from: classes5.dex */
public final class ksy0 implements pre, pru, h0s0 {
    public final String a;
    public final jsy0 b;
    public final Integer c;
    public final o690 d;
    public final TextAlignment e;
    public final r9x0 f;
    public final yg g;
    public final String h;

    public ksy0(String str, jsy0 jsy0Var, Integer num, o690 o690Var, TextAlignment textAlignment, r9x0 r9x0Var, yg ygVar, String str2) {
        this.a = str;
        this.b = jsy0Var;
        this.c = num;
        this.d = o690Var;
        this.e = textAlignment;
        this.f = r9x0Var;
        this.g = ygVar;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksy0)) {
            return false;
        }
        ksy0 ksy0Var = (ksy0) obj;
        return jl40.l(this.a, ksy0Var.a) && this.b.equals(ksy0Var.b) && jl40.l(this.c, ksy0Var.c) && this.d.equals(ksy0Var.d) && this.e == ksy0Var.e && jl40.l(this.f, ksy0Var.f) && jl40.l(this.g, ksy0Var.g) && jl40.l(this.h, ksy0Var.h);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "text";
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
        r9x0 r9x0Var = this.f;
        int hashCode3 = (hashCode2 + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        yg ygVar = this.g;
        int hashCode4 = (hashCode3 + (ygVar == null ? 0 : ygVar.hashCode())) * 31;
        String str = this.h;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TextRemoteCoreWidget(id=" + this.a + ", text=" + this.b + ", height=" + this.c + ", paddings=" + this.d + ", alignment=" + this.e + ", action=" + this.f + ", accessibilityInfo=" + this.g + ", metricaLabel=" + this.h + Extension.C_BRAKE;
    }
}
