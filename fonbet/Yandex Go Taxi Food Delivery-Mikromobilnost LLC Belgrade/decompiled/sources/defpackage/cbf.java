package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.credit.deposit.internal.domain.entities.TooltipPosition;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cbf implements dbf {
    public final Text a;
    public final TooltipPosition b;
    public final Text c;
    public final rbv d;
    public final String e;

    public cbf(Text text, TooltipPosition tooltipPosition, Text text2, rbv rbvVar, String str) {
        this.a = text;
        this.b = tooltipPosition;
        this.c = text2;
        this.d = rbvVar;
        this.e = str;
    }

    public final rbv a() {
        return this.d;
    }

    public final Text b() {
        return this.c;
    }

    public final TooltipPosition c() {
        return this.b;
    }

    public final Text d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbf)) {
            return false;
        }
        cbf cbfVar = (cbf) obj;
        return jl40.l(this.a, cbfVar.a) && this.b == cbfVar.b && jl40.l(this.c, cbfVar.c) && jl40.l(this.d, cbfVar.d) && jl40.l(this.e, cbfVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Text text = this.c;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        rbv rbvVar = this.d;
        int hashCode3 = (hashCode2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        String str = this.e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowTooltip(subtitle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", actionText=");
        sb.append(this.c);
        sb.append(", actionImage=");
        sb.append(this.d);
        sb.append(", action=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
