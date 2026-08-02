package xsna;

import com.vk.voip.ui.assessment.BadAssessmentReason;

/* compiled from: Assessment.kt */
/* loaded from: classes7.dex */
public final class xw3 {
    public final int a;
    public final BadAssessmentReason b;

    public xw3(int i, BadAssessmentReason badAssessmentReason) {
        this.a = i;
        this.b = badAssessmentReason;
    }

    public final BadAssessmentReason a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw3)) {
            return false;
        }
        xw3 xw3Var = (xw3) obj;
        return this.a == xw3Var.a && this.b == xw3Var.b;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        BadAssessmentReason badAssessmentReason = this.b;
        return hashCode + (badAssessmentReason == null ? 0 : badAssessmentReason.hashCode());
    }

    public final String toString() {
        return "Assessment(value=" + this.a + ", reason=" + this.b + ')';
    }
}
