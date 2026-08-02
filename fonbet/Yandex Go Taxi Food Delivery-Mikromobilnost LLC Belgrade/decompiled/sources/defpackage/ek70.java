package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ek70 implements uni {
    public final kw7 a;

    public ek70(kw7 kw7Var) {
        this.a = kw7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ek70) && this.a.equals(((ek70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeliveryOrderCancelClarificationArgs(cancelMessageV2=" + this.a + Extension.C_BRAKE;
    }
}
