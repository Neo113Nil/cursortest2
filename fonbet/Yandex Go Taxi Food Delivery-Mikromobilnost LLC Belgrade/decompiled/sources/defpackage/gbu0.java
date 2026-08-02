package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gbu0 implements ibu0 {
    public final qos0 a;

    public gbu0(qos0 qos0Var) {
        this.a = qos0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbu0) && jl40.l(this.a, ((gbu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SliderButton(slider=" + this.a + Extension.C_BRAKE;
    }
}
