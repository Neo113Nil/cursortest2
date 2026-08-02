package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes13.dex */
public final class gx6 extends hx6 {
    public final Promotion a;

    public gx6(Promotion promotion) {
        this.a = promotion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx6) && jl40.l(this.a, ((gx6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(banner=" + this.a + Extension.C_BRAKE;
    }
}
