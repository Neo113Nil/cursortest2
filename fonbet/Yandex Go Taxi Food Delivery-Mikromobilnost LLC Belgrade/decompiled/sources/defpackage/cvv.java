package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class cvv {
    public final String a;
    public final String b;
    public final List c;

    public cvv(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvv)) {
            return false;
        }
        cvv cvvVar = (cvv) obj;
        return this.a.equals(cvvVar.a) && this.b.equals(cvvVar.b) && this.c.equals(cvvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("InitDataForShowModalView(subtitleForInitPoint=", this.a, ", subtitleForMovePin=", this.b, ", categories="), this.c, Extension.C_BRAKE);
    }
}
