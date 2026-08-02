package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ey41 {
    public final String a;
    public final Object b;

    public ey41(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey41)) {
            return false;
        }
        ey41 ey41Var = (ey41) obj;
        return jl40.l(this.a, ey41Var.a) && jl40.l(this.b, ey41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WheelPickerOptionStateDependencyModel(formStateKey=" + this.a + ", formStateValue=" + this.b + Extension.C_BRAKE;
    }
}
