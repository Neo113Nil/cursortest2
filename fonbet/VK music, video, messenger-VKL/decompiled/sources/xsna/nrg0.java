package xsna;

import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;

/* compiled from: PostingRule.kt */
/* loaded from: classes4.dex */
public final class nrg0 {
    public final RuleAttachment a;
    public final int b;

    public nrg0(RuleAttachment ruleAttachment, int i) {
        this.a = ruleAttachment;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrg0)) {
            return false;
        }
        nrg0 nrg0Var = (nrg0) obj;
        return this.a == nrg0Var.a && this.b == nrg0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleAvailableAttachments(rule=");
        sb.append(this.a);
        sb.append(", availableCount=");
        return vu5.b(sb, this.b, ')');
    }
}
