package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class p051 implements z051 {
    public final uzg a;

    public p051(uzg uzgVar) {
        this.a = uzgVar;
    }

    public final uzg a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p051) && jl40.l(this.a, ((p051) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeeplinkArrowButton(deeplink=" + this.a + Extension.C_BRAKE;
    }
}
