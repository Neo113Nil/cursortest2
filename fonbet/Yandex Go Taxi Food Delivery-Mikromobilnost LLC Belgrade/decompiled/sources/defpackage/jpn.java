package defpackage;

import com.ybsdk.feature.educations.api.domain.EducationsTooltipEntity$EducationsTooltipAlignment;
import com.ybsdk.feature.educations.api.domain.EducationsTooltipEntity$EducationsTooltipBehaviour;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jpn {
    public final ipn a;
    public final EducationsTooltipEntity$EducationsTooltipBehaviour b;
    public final EducationsTooltipEntity$EducationsTooltipAlignment c;
    public final rr51 d;
    public final int e;

    public jpn(ipn ipnVar, EducationsTooltipEntity$EducationsTooltipBehaviour educationsTooltipEntity$EducationsTooltipBehaviour, EducationsTooltipEntity$EducationsTooltipAlignment educationsTooltipEntity$EducationsTooltipAlignment, rr51 rr51Var, int i) {
        this.a = ipnVar;
        this.b = educationsTooltipEntity$EducationsTooltipBehaviour;
        this.c = educationsTooltipEntity$EducationsTooltipAlignment;
        this.d = rr51Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpn)) {
            return false;
        }
        jpn jpnVar = (jpn) obj;
        return jl40.l(this.a, jpnVar.a) && this.b == jpnVar.b && this.c == jpnVar.c && jl40.l(this.d, jpnVar.d) && this.e == jpnVar.e;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31;
        rr51 rr51Var = this.d;
        return Integer.hashCode(this.e) + ((hashCode + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationsTooltipEntity(anchor=");
        sb.append(this.a);
        sb.append(", behaviour=");
        sb.append(this.b);
        sb.append(", alignment=");
        sb.append(this.c);
        sb.append(", divkitData=");
        sb.append(this.d);
        sb.append(", margin=");
        return oyr.m(this.e, Extension.C_BRAKE, sb);
    }
}
