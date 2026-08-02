package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes10.dex */
public final class fnx0 {
    public final mi31 a;
    public final SelectionOrigin b;
    public final pex0 c;
    public final String d;
    public final kb5 e;

    public fnx0(mi31 mi31Var, SelectionOrigin selectionOrigin) {
        this.a = mi31Var;
        this.b = selectionOrigin;
        this.c = mi31Var.a;
        this.d = mi31Var.b;
        this.e = mi31Var.b();
    }

    public final boolean a(fnx0 fnx0Var) {
        return this.e.a(fnx0Var.e);
    }

    public final boolean b(fnx0 fnx0Var) {
        return this.c.J0.a(fnx0Var.c) && jl40.l(this.d, fnx0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnx0)) {
            return false;
        }
        fnx0 fnx0Var = (fnx0) obj;
        return jl40.l(this.a, fnx0Var.a) && this.b == fnx0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffSelection(verticalTariff=" + this.a + ", origin=" + this.b + Extension.C_BRAKE;
    }

    public fnx0(pex0 pex0Var, String str, SelectionOrigin selectionOrigin) {
        this(new mi31(pex0Var, str), selectionOrigin);
    }
}
