package defpackage;

import ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition;

/* loaded from: classes5.dex */
public final class gz60 {
    public final fz60 a;
    public final OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition b;

    public gz60(fz60 fz60Var, OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition onJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition) {
        this.a = fz60Var;
        this.b = onJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz60)) {
            return false;
        }
        gz60 gz60Var = (gz60) obj;
        return this.a.equals(gz60Var.a) && this.b == gz60Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + unr0.e(this.a.hashCode() * 31, 31, false)) * 31);
    }

    public final String toString() {
        return "ReferenceMatching(reachability=" + this.a + ", requireMatchAllReferences=false, condition=" + this.b + ", requireCheckBeforeReferencesTimedOut=false)";
    }
}
