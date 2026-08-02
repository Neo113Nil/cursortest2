package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class q051 implements x051 {
    public final uzg a;

    public q051(uzg uzgVar) {
        this.a = uzgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q051) && jl40.l(this.a, ((q051) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeeplinkArrowButton(deeplink=" + this.a + Extension.C_BRAKE;
    }
}
