package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hu70 {
    public final String a;

    public /* synthetic */ hu70(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hu70) {
            return jl40.l(this.a, ((hu70) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OrderDraftParams(json=", this.a, Extension.C_BRAKE);
    }
}
