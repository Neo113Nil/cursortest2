package defpackage;

import com.ybsdk.core.utils.text.Text;

/* loaded from: classes3.dex */
public final class idg0 {
    public final rbv a;
    public final Text b;
    public final Text c;
    public final Text d;

    public idg0(rbv rbvVar, Text text, Text.Constant constant, Text text2) {
        this.a = rbvVar;
        this.b = text;
        this.c = constant;
        this.d = text2;
    }

    public final Text a() {
        return this.d;
    }

    public final Text b() {
        return this.c;
    }

    public final rbv c() {
        return this.a;
    }

    public final Text d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idg0)) {
            return false;
        }
        idg0 idg0Var = (idg0) obj;
        return this.a.equals(idg0Var.a) && this.b.equals(idg0Var.b) && jl40.l(this.c, idg0Var.c) && this.d.equals(idg0Var.d);
    }

    public final int hashCode() {
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        Text text = this.c;
        return n.c(this.d, (c + (text == null ? 0 : text.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "QrRulesErrorContentEntity(image=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttonText=" + this.d + ", buttonAction=null)";
    }
}
