package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fkj0 implements ikj0 {
    public final String a;

    public fkj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fkj0) && jl40.l(this.a, ((fkj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("BadgeCounterUiState(text=", this.a, Extension.C_BRAKE);
    }
}
