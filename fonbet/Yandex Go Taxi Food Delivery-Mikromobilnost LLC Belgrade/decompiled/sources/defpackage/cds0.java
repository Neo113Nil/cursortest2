package defpackage;

import com.yandex.go.taxi.order.bubble.model.Bubble$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cds0 extends tl6 {
    public final zzs a;
    public final Bubble$Type b;
    public final String c;

    public cds0(zzs zzsVar, Bubble$Type bubble$Type, String str) {
        this.a = zzsVar;
        this.b = bubble$Type;
        this.c = str;
        toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cds0)) {
            return false;
        }
        cds0 cds0Var = (cds0) obj;
        return jl40.l(this.a, cds0Var.a) && this.b == cds0Var.b && jl40.l(this.c, cds0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleBubble(geoPoint=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", text=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
