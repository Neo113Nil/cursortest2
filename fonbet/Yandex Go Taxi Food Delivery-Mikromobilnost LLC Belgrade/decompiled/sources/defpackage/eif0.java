package defpackage;

import com.yandex.delivery.mapper.model.PartialProgressBarStyleSidesModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class eif0 extends g8a1 {
    public final String b;
    public final String c;
    public final int d;
    public final PartialProgressBarStyleSidesModel e;
    public final int f;

    public eif0(String str, String str2, int i, PartialProgressBarStyleSidesModel partialProgressBarStyleSidesModel, int i2) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = partialProgressBarStyleSidesModel;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eif0)) {
            return false;
        }
        eif0 eif0Var = (eif0) obj;
        return jl40.l(this.b, eif0Var.b) && jl40.l(this.c, eif0Var.c) && this.d == eif0Var.d && this.e == eif0Var.e && this.f == eif0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((this.e.hashCode() + oyr.b(this.d, unr0.b(this.b.hashCode() * 31, 31, this.c), 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Partial(color=", this.b, ", fillColor=", this.c, ", count=");
        v.append(this.d);
        v.append(", sides=");
        v.append(this.e);
        v.append(", spaceBetween=");
        return oyr.m(this.f, Extension.C_BRAKE, v);
    }
}
