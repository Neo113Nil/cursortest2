package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bz80 extends on70 {
    public final lv90 a;

    public bz80(lv90 lv90Var) {
        this.a = lv90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz80) && jl40.l(this.a, ((bz80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OrderPaymentChanged(payment=" + this.a + Extension.C_BRAKE;
    }
}
