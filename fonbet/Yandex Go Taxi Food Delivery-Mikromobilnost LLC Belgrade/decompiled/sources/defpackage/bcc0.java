package defpackage;

import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bcc0 {
    public final dm80 a;
    public final PlacesNavigationEntry$Source b;

    public bcc0(dm80 dm80Var, PlacesNavigationEntry$Source placesNavigationEntry$Source) {
        this.a = dm80Var;
        this.b = placesNavigationEntry$Source;
    }

    public static bcc0 a(bcc0 bcc0Var, PlacesNavigationEntry$Source placesNavigationEntry$Source) {
        dm80 dm80Var = bcc0Var.a;
        bcc0Var.getClass();
        return new bcc0(dm80Var, placesNavigationEntry$Source);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcc0)) {
            return false;
        }
        bcc0 bcc0Var = (bcc0) obj;
        return jl40.l(this.a, bcc0Var.a) && this.b == bcc0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlacesNavigationEntry(payload=" + this.a + ", source=" + this.b + Extension.C_BRAKE;
    }
}
