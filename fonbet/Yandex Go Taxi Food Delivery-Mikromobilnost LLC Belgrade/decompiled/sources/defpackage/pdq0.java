package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class pdq0 {
    public final ArrayList a;
    public final Text b;
    public final Text c;
    public final rbv d;
    public final Integer e;

    public pdq0(ArrayList arrayList, Text text, Text.Constant constant, nbv nbvVar, Integer num, int i) {
        nbvVar = (i & 16) != 0 ? null : nbvVar;
        num = (i & 32) != 0 ? null : num;
        this.a = arrayList;
        this.b = text;
        this.c = constant;
        this.d = nbvVar;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdq0)) {
            return false;
        }
        pdq0 pdq0Var = (pdq0) obj;
        return this.a.equals(pdq0Var.a) && jl40.l(this.b, pdq0Var.b) && jl40.l(this.c, pdq0Var.c) && jl40.l(this.d, pdq0Var.d) && jl40.l(this.e, pdq0Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, false);
        Text text = this.b;
        int hashCode = (e + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.c;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        rbv rbvVar = this.d;
        int hashCode3 = (hashCode2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        Integer num = this.e;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectPaymentMethodViewState(selectPaymentMethodItems=");
        sb.append(this.a);
        sb.append(", shouldShowSbpWidget=false, toolbarTitle=");
        sb.append(this.b);
        sb.append(", toolbarSubtitle=");
        sb.append(this.c);
        sb.append(", leftImage=");
        sb.append(this.d);
        sb.append(", toolbarTitleMaxLines=");
        return oo31.j(sb, this.e, Extension.C_BRAKE);
    }
}
