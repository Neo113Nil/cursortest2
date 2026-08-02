package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bsl {
    public final rr51 a;
    public final Text b;
    public final Text c;
    public final rr51 d;
    public final fxy0 e;
    public final List f;
    public final List g;

    public bsl(rr51 rr51Var, Text text, Text text2, rr51 rr51Var2, fxy0 fxy0Var, List list, List list2) {
        this.a = rr51Var;
        this.b = text;
        this.c = text2;
        this.d = rr51Var2;
        this.e = fxy0Var;
        this.f = list;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsl)) {
            return false;
        }
        bsl bslVar = (bsl) obj;
        return jl40.l(this.a, bslVar.a) && jl40.l(this.b, bslVar.b) && jl40.l(this.c, bslVar.c) && jl40.l(this.d, bslVar.d) && jl40.l(this.e, bslVar.e) && jl40.l(this.f, bslVar.f) && jl40.l(this.g, bslVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.c;
        int hashCode3 = (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31;
        rr51 rr51Var = this.d;
        int hashCode4 = (hashCode3 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        fxy0 fxy0Var = this.e;
        int hashCode5 = (hashCode4 + (fxy0Var == null ? 0 : fxy0Var.hashCode())) * 31;
        List list = this.f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.g;
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivkitCommonScreenEntity(divData=");
        sb.append(this.a);
        sb.append(", toolbarTitle=");
        sb.append(this.b);
        sb.append(", toolbarSubtitle=");
        sb.append(this.c);
        sb.append(", toolbarDivData=");
        sb.append(this.d);
        sb.append(", toolbarBackgroundColor=");
        sb.append(this.e);
        sb.append(", fullscreens=");
        sb.append(this.f);
        sb.append(", educationsV2=");
        return ly3.s(sb, this.g, Extension.C_BRAKE);
    }
}
