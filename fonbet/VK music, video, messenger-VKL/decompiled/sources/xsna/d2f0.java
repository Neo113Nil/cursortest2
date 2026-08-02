package xsna;

import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;
import java.util.Iterator;

/* compiled from: ReactionStateTransducer.kt */
/* loaded from: classes5.dex */
public final class d2f0 {
    public static void a(c6z c6zVar, boolean z, ReactionMeta reactionMeta) {
        o2f0 o2f0Var = c6zVar instanceof o2f0 ? (o2f0) c6zVar : null;
        if (o2f0Var == null || !o2f0Var.T8()) {
            if (z) {
                c6zVar.f(c6zVar.T9() + 1);
                c6zVar.f0(true);
                return;
            } else {
                c6zVar.f(c6zVar.T9() - 1);
                c6zVar.f0(false);
                return;
            }
        }
        ItemReactions K = o2f0Var.K();
        Integer num = K != null ? K.e : null;
        Integer valueOf = reactionMeta != null ? Integer.valueOf(reactionMeta.getId()) : null;
        if (num != null) {
            o2f0Var.S7(num.intValue());
        }
        if (reactionMeta != null) {
            o2f0Var.h6(reactionMeta);
        }
        if (num == null && valueOf != null) {
            c6zVar.f(c6zVar.T9() + 1);
            c6zVar.f0(true);
        } else if (num != null && valueOf == null) {
            c6zVar.f(c6zVar.T9() - 1);
            c6zVar.f0(false);
        }
        o2f0Var.G2();
    }

    public static a2f0 b(Object obj, ReactionMeta reactionMeta, boolean z) {
        grj0 grj0Var = obj instanceof grj0 ? (grj0) obj : null;
        o2f0 o2f0Var = obj instanceof o2f0 ? (o2f0) obj : null;
        if (!z || o2f0Var == null || !o2f0Var.T8()) {
            return grj0Var != null ? new a2f0(!grj0Var.J(), true) : new a2f0(false, false);
        }
        return new a2f0(reactionMeta != null, !epx.f(o2f0Var.K() != null ? r4.e : null, reactionMeta != null ? Integer.valueOf(reactionMeta.getId()) : null));
    }

    public static void c(o2f0 o2f0Var, ItemReactions itemReactions) {
        Iterator<ItemReaction> it = itemReactions.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            ItemReaction next = it.next();
            i += o2f0Var.c4(next.b) * next.c;
        }
        itemReactions.d = i;
        o2f0Var.b4(itemReactions);
    }

    public static void d(c6z c6zVar, c6z c6zVar2) {
        c6zVar.M2(c6zVar2);
        if ((c6zVar instanceof o2f0) && (c6zVar2 instanceof o2f0)) {
            ((o2f0) c6zVar).S9((o2f0) c6zVar2);
        }
    }

    public static void e(o2f0 o2f0Var, ReactionMeta reactionMeta, t9x0 t9x0Var) {
        if (o2f0Var != null) {
            o2f0Var.b4(t9x0Var.c);
        }
        if (o2f0Var != null) {
            o2f0Var.j9(reactionMeta != null ? Integer.valueOf(reactionMeta.getId()) : null);
        }
    }
}
