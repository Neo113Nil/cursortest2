package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class bmv0 implements cmv0 {
    public final qos0 a;
    public final j37 b;

    public bmv0(qos0 qos0Var, j37 j37Var) {
        this.a = qos0Var;
        this.b = j37Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmv0)) {
            return false;
        }
        bmv0 bmv0Var = (bmv0) obj;
        return this.a.equals(bmv0Var.a) && this.b.equals(bmv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SliderButton(slider=" + this.a + ", style=" + this.b + Extension.C_BRAKE;
    }
}
