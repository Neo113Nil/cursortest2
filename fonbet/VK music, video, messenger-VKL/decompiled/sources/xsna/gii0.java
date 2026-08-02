package xsna;

import com.vk.dto.reactions.ReactionMeta;

/* compiled from: EntriesListFieldsProviderDelegate.kt */
/* loaded from: classes4.dex */
public final class gii0 {
    public final u5f0 a;
    public final ReactionMeta b;
    public final a2f0 c;
    public final p2f0 d;

    public gii0(u5f0 u5f0Var, ReactionMeta reactionMeta, a2f0 a2f0Var, p2f0 p2f0Var) {
        this.a = u5f0Var;
        this.b = reactionMeta;
        this.c = a2f0Var;
        this.d = p2f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gii0)) {
            return false;
        }
        gii0 gii0Var = (gii0) obj;
        return epx.f(this.a, gii0Var.a) && epx.f(this.b, gii0Var.b) && epx.f(this.c, gii0Var.c) && epx.f(this.d, gii0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ReactionMeta reactionMeta = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (reactionMeta == null ? 0 : reactionMeta.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "SendReactionsParams(model=" + this.a + ", reaction=" + this.b + ", state=" + this.c + ", reactionableViewHolder=" + this.d + ')';
    }
}
