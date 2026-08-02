package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.FieldPosition;

/* loaded from: classes5.dex */
public final class nxq implements pre {
    public final String a;
    public final FieldPosition b;
    public final String c;
    public final hty0 d;
    public final FormattedText e;
    public final lts0 f;
    public final FormattedText g;
    public final lts0 h;
    public final fws0 i;
    public final r9x0 j;
    public final String k;
    public final qus0 l;

    public nxq(String str, FieldPosition fieldPosition, String str2, hty0 hty0Var, FormattedText formattedText, lts0 lts0Var, FormattedText formattedText2, lts0 lts0Var2, fws0 fws0Var, r9x0 r9x0Var, String str3, qus0 qus0Var) {
        this.a = str;
        this.b = fieldPosition;
        this.c = str2;
        this.d = hty0Var;
        this.e = formattedText;
        this.f = lts0Var;
        this.g = formattedText2;
        this.h = lts0Var2;
        this.i = fws0Var;
        this.j = r9x0Var;
        this.k = str3;
        this.l = qus0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxq)) {
            return false;
        }
        nxq nxqVar = (nxq) obj;
        return jl40.l(this.a, nxqVar.a) && this.b == nxqVar.b && jl40.l(this.c, nxqVar.c) && this.d.equals(nxqVar.d) && jl40.l(this.e, nxqVar.e) && jl40.l(this.f, nxqVar.f) && this.g.equals(nxqVar.g) && jl40.l(this.h, nxqVar.h) && jl40.l(this.i, nxqVar.i) && jl40.l(this.j, nxqVar.j) && jl40.l(this.k, nxqVar.k) && this.l.equals(nxqVar.l);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "field-display";
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        FormattedText formattedText = this.e;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        lts0 lts0Var = this.f;
        int c = unr0.c((hashCode2 + (lts0Var == null ? 0 : lts0Var.hashCode())) * 31, 31, this.g.a);
        lts0 lts0Var2 = this.h;
        int hashCode3 = (c + (lts0Var2 == null ? 0 : lts0Var2.hashCode())) * 31;
        fws0 fws0Var = this.i;
        int hashCode4 = (hashCode3 + (fws0Var == null ? 0 : fws0Var.hashCode())) * 31;
        r9x0 r9x0Var = this.j;
        int hashCode5 = (hashCode4 + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        String str = this.k;
        return this.l.hashCode() + ((hashCode5 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FieldDisplayRemoteCoreWidget(id=" + this.a + ", fieldPosition=" + this.b + ", formStateKey=" + this.c + ", fieldStyle=" + this.d + ", filledDescription=" + this.e + ", filledLead=" + this.f + ", emptyDescription=" + this.g + ", emptyLead=" + this.h + ", trail=" + this.i + ", action=" + this.j + ", metricaLabel=" + this.k + ", style=" + this.l + Extension.C_BRAKE;
    }
}
