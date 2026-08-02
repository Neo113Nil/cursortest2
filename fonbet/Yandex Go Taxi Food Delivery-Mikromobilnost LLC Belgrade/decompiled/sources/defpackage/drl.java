package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.DividerStyle;

/* loaded from: classes5.dex */
public final class drl extends n351 {
    public final DividerStyle c;
    public final String d;
    public final y7m e;
    public final List f;
    public final l690 g;
    public final boolean h;
    public final String i;

    public drl(DividerStyle dividerStyle, String str, y7m y7mVar, List list, l690 l690Var, boolean z, String str2) {
        super("divider", false, 14);
        this.c = dividerStyle;
        this.d = str;
        this.e = y7mVar;
        this.f = list;
        this.g = l690Var;
        this.h = z;
        this.i = str2;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.i;
    }

    @Override // defpackage.n351
    public final boolean b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drl)) {
            return false;
        }
        drl drlVar = (drl) obj;
        return this.c == drlVar.c && jl40.l(this.d, drlVar.d) && jl40.l(this.e, drlVar.e) && jl40.l(this.f, drlVar.f) && this.g.equals(drlVar.g) && this.h == drlVar.h && jl40.l(this.i, drlVar.i);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        y7m y7mVar = this.e;
        int hashCode3 = (hashCode2 + (y7mVar == null ? 0 : Float.hashCode(y7mVar.a))) * 31;
        List list = this.f;
        int e = unr0.e((this.g.hashCode() + ((hashCode3 + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.h);
        String str2 = this.i;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DividerModel(style=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.e);
        sb.append(", separateTitles=");
        sb.append(this.f);
        sb.append(", paddings=");
        sb.append(this.g);
        sb.append(", isFlexible=");
        sb.append(this.h);
        sb.append(", id=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
