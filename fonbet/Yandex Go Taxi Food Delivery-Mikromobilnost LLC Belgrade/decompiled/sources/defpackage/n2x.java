package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.favorites.list.ViewType;

/* loaded from: classes5.dex */
public final class n2x extends w2x {
    public final String b;

    public n2x(int i) {
        super(ViewType.DIVIDER);
        this.b = "Divider";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2x) && jl40.l(this.b, ((n2x) obj).b);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("Divider(id=", this.b, Extension.C_BRAKE);
    }

    public n2x() {
        this(0);
    }
}
