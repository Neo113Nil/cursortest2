package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.reactions.ReactionMeta;

/* compiled from: NewReaction.kt */
/* loaded from: classes18.dex */
public final class t860 {
    public final String a;
    public final Image b;
    public final ReactionMeta c;

    public t860(String str, Image image, ReactionMeta reactionMeta) {
        this.a = str;
        this.b = image;
        this.c = reactionMeta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t860)) {
            return false;
        }
        t860 t860Var = (t860) obj;
        return epx.f(this.a, t860Var.a) && epx.f(this.b, t860Var.b) && epx.f(this.c, t860Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int b = fq.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        ReactionMeta reactionMeta = this.c;
        return b + (reactionMeta != null ? reactionMeta.hashCode() : 0);
    }

    public final String toString() {
        return "NewReaction(senderTitle=" + this.a + ", avatar=" + this.b + ", reactionMeta=" + this.c + ')';
    }
}
