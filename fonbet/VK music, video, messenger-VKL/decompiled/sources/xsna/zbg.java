package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;

/* compiled from: CommentLikeData.kt */
/* loaded from: classes17.dex */
public final class zbg {
    public final iag a;
    public final UserId b;
    public final ReactionMeta c;

    public zbg(iag iagVar, UserId userId, ReactionMeta reactionMeta) {
        this.a = iagVar;
        this.b = userId;
        this.c = reactionMeta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbg)) {
            return false;
        }
        zbg zbgVar = (zbg) obj;
        return epx.f(this.a, zbgVar.a) && epx.f(this.b, zbgVar.b) && epx.f(this.c, zbgVar.c);
    }

    public final int hashCode() {
        int a = bh10.a(this.a.hashCode() * 31, 31, this.b.b);
        ReactionMeta reactionMeta = this.c;
        return a + (reactionMeta == null ? 0 : reactionMeta.hashCode());
    }

    public final String toString() {
        return "CommentLikeData(comment=" + this.a + ", ownerId=" + this.b + ", reaction=" + this.c + ')';
    }
}
