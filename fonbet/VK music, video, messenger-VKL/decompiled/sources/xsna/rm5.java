package xsna;

import io.opentelemetry.sdk.trace.samplers.SamplingDecision;

/* compiled from: AutoValue_ImmutableSamplingResult.java */
/* loaded from: classes11.dex */
public final class rm5 extends hpw {
    public final SamplingDecision d;
    public final q94 e;

    public rm5(SamplingDecision samplingDecision, q94 q94Var) {
        if (samplingDecision == null) {
            throw new NullPointerException("Null decision");
        }
        this.d = samplingDecision;
        if (q94Var == null) {
            throw new NullPointerException("Null attributes");
        }
        this.e = q94Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hpw) {
            hpw hpwVar = (hpw) obj;
            if (this.d.equals(((rm5) hpwVar).d)) {
                if (this.e.equals(((rm5) hpwVar).e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "ImmutableSamplingResult{decision=" + this.d + ", attributes=" + this.e + "}";
    }
}
