package defpackage;

import com.ybsdk.feature.educations.api.domain.EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gpn {
    public final String a;
    public final EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType b;
    public final Integer c;
    public final lw00 d;

    public gpn(String str, EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType educationsShadowDrawRuleEntity$EducationsShadowDrawRuleType, Integer num, lw00 lw00Var) {
        this.a = str;
        this.b = educationsShadowDrawRuleEntity$EducationsShadowDrawRuleType;
        this.c = num;
        this.d = lw00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpn)) {
            return false;
        }
        gpn gpnVar = (gpn) obj;
        return jl40.l(this.a, gpnVar.a) && this.b == gpnVar.b && jl40.l(this.c, gpnVar.c) && jl40.l(this.d, gpnVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        lw00 lw00Var = this.d;
        return hashCode2 + (lw00Var != null ? lw00Var.hashCode() : 0);
    }

    public final String toString() {
        return "EducationsShadowDrawRuleEntity(viewId=" + this.a + ", drawType=" + this.b + ", cornersRadius=" + this.c + ", margins=" + this.d + Extension.C_BRAKE;
    }
}
