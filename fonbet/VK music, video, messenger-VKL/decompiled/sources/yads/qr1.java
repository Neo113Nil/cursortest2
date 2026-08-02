package yads;

import java.util.List;
import xsna.epx;
import xsna.vp;

/* loaded from: classes10.dex */
public final class qr1 {
    public static final String d = "com.yandex.mobile.ads.mediation";
    public final String a;
    public final is1 b;
    public final List c;

    public qr1(String str, is1 is1Var, List list) {
        this.a = str;
        this.b = is1Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr1)) {
            return false;
        }
        qr1 qr1Var = (qr1) obj;
        return epx.f(this.a, qr1Var.a) && this.b == qr1Var.b && epx.f(this.c, qr1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.a;
        is1 is1Var = this.b;
        List list = this.c;
        StringBuilder sb = new StringBuilder("MediationNetwork(name=");
        sb.append(str);
        sb.append(", id=");
        sb.append(is1Var);
        sb.append(", adapters=");
        return vp.b(")", sb, list);
    }
}
