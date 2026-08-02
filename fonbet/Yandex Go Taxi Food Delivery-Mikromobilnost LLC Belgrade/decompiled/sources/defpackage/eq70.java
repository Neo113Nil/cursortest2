package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class eq70 implements fq70 {
    public final o2y0 a;

    public eq70(o2y0 o2y0Var) {
        this.a = o2y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq70) && jl40.l(this.a, ((eq70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowOrderChatOrCallDriver(orderHolder=" + this.a + Extension.C_BRAKE;
    }
}
