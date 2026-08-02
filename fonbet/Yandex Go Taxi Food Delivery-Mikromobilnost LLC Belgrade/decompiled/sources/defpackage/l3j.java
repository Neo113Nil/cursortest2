package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class l3j implements m3j {
    public final List a;
    public final String b;

    public l3j(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3j)) {
            return false;
        }
        l3j l3jVar = (l3j) obj;
        return this.a.equals(l3jVar.a) && jl40.l(this.b, l3jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.i("Success(items=", ", buttonTitle=", this.b, Extension.C_BRAKE, this.a);
    }
}
