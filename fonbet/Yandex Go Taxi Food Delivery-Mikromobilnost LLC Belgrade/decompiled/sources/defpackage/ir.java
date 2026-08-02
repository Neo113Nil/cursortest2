package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ir {
    public final String a;

    public ir(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir) && jl40.l(this.a, ((ir) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1100064758;
    }

    public final String toString() {
        return oyr.p("Action(log_id=payment_sdk_select_method_screen_select_method, url=", this.a, Extension.C_BRAKE);
    }
}
