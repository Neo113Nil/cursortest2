package defpackage;

import com.yandex.delivery.mapper.model.CancelType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hxh extends dxh {
    public final gxh a;
    public final CancelType b;
    public final CharSequence c;
    public final CharSequence d;
    public final List e;
    public final exh f;
    public final exh g;

    public hxh(gxh gxhVar, CancelType cancelType, CharSequence charSequence, CharSequence charSequence2, List list, exh exhVar, exh exhVar2) {
        this.a = gxhVar;
        this.b = cancelType;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = list;
        this.f = exhVar;
        this.g = exhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxh)) {
            return false;
        }
        hxh hxhVar = (hxh) obj;
        return jl40.l(this.a, hxhVar.a) && this.b == hxhVar.b && jl40.l(this.c, hxhVar.c) && jl40.l(this.d, hxhVar.d) && jl40.l(this.e, hxhVar.e) && jl40.l(this.f, hxhVar.f) && this.g.equals(hxhVar.g);
    }

    public final int hashCode() {
        gxh gxhVar = this.a;
        int hashCode = (this.b.hashCode() + ((gxhVar == null ? 0 : gxhVar.hashCode()) * 31)) * 31;
        CharSequence charSequence = this.c;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + unr0.c((hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryCancelInfoStateData(performer=");
        sb.append(this.a);
        sb.append(", cancelType=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", contentActions=");
        sb.append(this.e);
        sb.append(", cancelButton=");
        sb.append(this.f);
        sb.append(", dismissButton=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
