package defpackage;

import com.yandex.go.tariffcard.ui.HeaderType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k3x {
    public final List a;
    public final String b;
    public final HeaderType c;

    public k3x(List list, String str, HeaderType headerType) {
        this.a = list;
        this.b = str;
        this.c = headerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3x)) {
            return false;
        }
        k3x k3xVar = (k3x) obj;
        return jl40.l(this.a, k3xVar.a) && jl40.l(this.b, k3xVar.b) && this.c == k3xVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder s = xvz.s("ItemsData(items=", this.a, ", headerTariffClass=", this.b, ", headerType=");
        s.append(this.c);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
