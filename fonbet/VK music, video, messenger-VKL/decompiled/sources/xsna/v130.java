package xsna;

import com.vk.dto.reactions.ReactionMeta;

/* compiled from: ModalPostReactionsTabItem.kt */
/* loaded from: classes4.dex */
public final class v130 {
    public final String a;
    public final Integer b;
    public final ReactionMeta c;

    public v130(String str, Integer num, ReactionMeta reactionMeta) {
        this.a = str;
        this.b = num;
        this.c = reactionMeta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v130)) {
            return false;
        }
        v130 v130Var = (v130) obj;
        return epx.f(this.a, v130Var.a) && epx.f(this.b, v130Var.b) && epx.f(this.c, v130Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        ReactionMeta reactionMeta = this.c;
        return hashCode2 + (reactionMeta != null ? reactionMeta.hashCode() : 0);
    }

    public final String toString() {
        return "ModalPostReactionsTabItem(id=" + this.a + ", countInfo=" + this.b + ", reaction=" + this.c + ')';
    }
}
