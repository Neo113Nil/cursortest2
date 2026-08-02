package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cy41 {
    public final String a;
    public final x9x0 b;

    public cy41(String str, x9x0 x9x0Var) {
        this.a = str;
        this.b = x9x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy41)) {
            return false;
        }
        cy41 cy41Var = (cy41) obj;
        return jl40.l(this.a, cy41Var.a) && this.b.equals(cy41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WheelPickerOption(label=" + this.a + ", widgetAction=" + this.b + Extension.C_BRAKE;
    }
}
