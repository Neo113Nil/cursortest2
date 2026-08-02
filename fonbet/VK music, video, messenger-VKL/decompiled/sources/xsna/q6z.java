package xsna;

import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;

/* compiled from: LikeState.kt */
/* loaded from: classes5.dex */
public final class q6z {
    public final int a;
    public final o2f0 b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final boolean h;
    public boolean i;

    public q6z(c6z c6zVar, ReactionMeta reactionMeta) {
        this.a = c6zVar.T9();
        Integer num = null;
        o2f0 o2f0Var = c6zVar instanceof o2f0 ? (o2f0) c6zVar : null;
        this.b = o2f0Var;
        ItemReactions K = o2f0Var != null ? o2f0Var.K() : null;
        Integer num2 = K != null ? K.e : null;
        this.c = num2;
        this.d = (num2 == null || o2f0Var == null) ? null : Integer.valueOf(o2f0Var.e(num2.intValue()));
        this.e = K != null ? Integer.valueOf(K.d) : null;
        Integer valueOf = reactionMeta != null ? Integer.valueOf(reactionMeta.getId()) : null;
        this.f = valueOf;
        if (valueOf != null && o2f0Var != null) {
            num = Integer.valueOf(o2f0Var.e(valueOf.intValue()));
        }
        this.g = num;
        this.h = c6zVar.J();
    }
}
