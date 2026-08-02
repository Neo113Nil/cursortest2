package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nji {
    public final f4c0 a;
    public final f4c0 b;

    public nji(f4c0 f4c0Var, f4c0 f4c0Var2) {
        this.a = f4c0Var;
        this.b = f4c0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nji)) {
            return false;
        }
        nji njiVar = (nji) obj;
        return jl40.l(this.a, njiVar.a) && jl40.l(this.b, njiVar.b);
    }

    public final int hashCode() {
        f4c0 f4c0Var = this.a;
        int hashCode = (f4c0Var == null ? 0 : f4c0Var.hashCode()) * 31;
        f4c0 f4c0Var2 = this.b;
        return hashCode + (f4c0Var2 != null ? f4c0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "DeliveryPinPlacemarkData(pinPlacemark=" + this.a + ", smallPointPlacemark=" + this.b + Extension.C_BRAKE;
    }

    public nji() {
        this(null, null);
    }
}
