package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class io6 implements b151 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final x2s e;

    public io6(String str, String str2, boolean z, boolean z2, x2s x2sVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io6)) {
            return false;
        }
        io6 io6Var = (io6) obj;
        return jl40.l(this.a, io6Var.a) && jl40.l(this.b, io6Var.b) && this.c == io6Var.c && this.d == io6Var.d && this.e.equals(io6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("BubbleToggleWidgetAction(id=", this.a, ", formStateKey=", this.b, ", isSelected=");
        nnm.v(", isMultichoice=", ", analyticsData=", v, this.c, this.d);
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
