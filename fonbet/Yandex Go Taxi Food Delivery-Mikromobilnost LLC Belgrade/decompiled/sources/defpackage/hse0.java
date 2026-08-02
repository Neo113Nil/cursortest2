package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hse0 extends qse0 {
    public final t7z a;

    public hse0(t7z t7zVar) {
        this.a = t7zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hse0) && jl40.l(this.a, ((hse0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RouteDeeplink(model=" + this.a + Extension.C_BRAKE;
    }
}
