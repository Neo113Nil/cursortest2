package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.DividerStyle;

/* loaded from: classes5.dex */
public final class frl implements pre {
    public final String a;
    public final String b;
    public final Integer c;
    public final DividerStyle d;
    public final List e;
    public final boolean f;
    public final o690 g;

    public frl(String str, String str2, Integer num, DividerStyle dividerStyle, ArrayList arrayList, boolean z, o690 o690Var) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = dividerStyle;
        this.e = arrayList;
        this.f = z;
        this.g = o690Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frl)) {
            return false;
        }
        frl frlVar = (frl) obj;
        return jl40.l(this.a, frlVar.a) && jl40.l(this.b, frlVar.b) && jl40.l(this.c, frlVar.c) && this.d == frlVar.d && jl40.l(this.e, frlVar.e) && this.f == frlVar.f && jl40.l(this.g, frlVar.g);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "divider";
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        List list = this.e;
        int e = unr0.e((hashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f);
        o690 o690Var = this.g;
        return e + (o690Var != null ? o690Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DividerRemoteCoreWidget(id=", this.a, ", text=", this.b, ", height=");
        v.append(this.c);
        v.append(", style=");
        v.append(this.d);
        v.append(", separateTitles=");
        nzs.p(v, this.e, ", isFlexible=", this.f, ", horizontalPaddings=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
