package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class i480 {
    public final qos0 a;

    public i480(qos0 qos0Var) {
        this.a = qos0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i480) && jl40.l(this.a, ((i480) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SliderButton(slider=" + this.a + Extension.C_BRAKE;
    }
}
