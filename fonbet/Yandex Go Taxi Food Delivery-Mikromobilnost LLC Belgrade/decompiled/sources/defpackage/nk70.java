package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.Orientation;

/* loaded from: classes14.dex */
public final class nk70 {
    public final Orientation a;
    public final ArrayList b;

    public nk70(Orientation orientation, ArrayList arrayList) {
        this.a = orientation;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk70)) {
            return false;
        }
        nk70 nk70Var = (nk70) obj;
        return this.a == nk70Var.a && this.b.equals(nk70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonsUpdate(orientation=" + this.a + ", buttons=" + this.b + Extension.C_BRAKE;
    }
}
