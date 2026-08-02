package xsna;

import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Reactionable.kt */
/* loaded from: classes18.dex */
public interface o2f0 {
    default void E6(int i) {
        r9().d = i;
    }

    default void G2() {
        ItemReactions K = K();
        if (K != null) {
            K.f = null;
            K.g = null;
            K.h = null;
        }
    }

    default boolean G4() {
        ItemReactions K = K();
        return (K == null || K.e == null) ? false : true;
    }

    ItemReactions K();

    @ozl
    default ArrayList<ReactionMeta> O8(int i) {
        ItemReactions K = K();
        if (K != null) {
            return ItemReactions.e(K, i, s4());
        }
        return null;
    }

    default ReactionMeta R3() {
        ReactionSet s4 = s4();
        if (s4 != null) {
            return c2f0.d(s4, 0);
        }
        return null;
    }

    default void S7(int i) {
        int c4 = c4(i);
        ub(i, e(i) - 1);
        ItemReactions r9 = r9();
        r9.e = null;
        r9.d -= c4;
        r9.c--;
        r9.f = null;
        r9.g = null;
        r9.h = null;
    }

    default void S9(o2f0 o2f0Var) {
        b4(o2f0Var.K());
    }

    default boolean T8() {
        ReactionSet s4 = s4();
        ArrayList<ReactionMeta> arrayList = s4 != null ? s4.c : null;
        return !(arrayList == null || arrayList.isEmpty());
    }

    void b4(ItemReactions itemReactions);

    default int c4(int i) {
        ReactionMeta d;
        ReactionSet s4 = s4();
        if (s4 == null || (d = c2f0.d(s4, i)) == null) {
            return 1;
        }
        return d.f();
    }

    @ozl
    default ReactionMeta c8() {
        ItemReactions K = K();
        if (K != null) {
            return K.f(s4());
        }
        return null;
    }

    default int e(int i) {
        ItemReactions K = K();
        if (K != null) {
            Iterator<ItemReaction> it = K.b.iterator();
            while (it.hasNext()) {
                ItemReaction next = it.next();
                if (next.b == i) {
                    return next.c;
                }
            }
        }
        return 0;
    }

    default void g(int i, int i2, int i3) {
        ub(i, i2 + 1);
        ItemReactions r9 = r9();
        r9.e = Integer.valueOf(i);
        r9.d += i3;
        r9.c++;
        r9.f = null;
        r9.g = null;
        r9.h = null;
    }

    default void h6(ReactionMeta reactionMeta) {
        g(reactionMeta.getId(), e(reactionMeta.getId()), reactionMeta.f());
    }

    void hb(ReactionSet reactionSet);

    default void j9(Integer num) {
        r9().e = num;
    }

    default ReactionMeta p4() {
        ItemReactions K = K();
        if (K != null) {
            ReactionSet s4 = s4();
            if (K.e != null && s4 != null) {
                return c2f0.d(s4, 0);
            }
        }
        return null;
    }

    default ItemReactions r9() {
        ItemReactions K = K();
        if (K != null) {
            return K;
        }
        ItemReactions itemReactions = new ItemReactions(new ArrayList(), 0, 0, null);
        b4(itemReactions);
        return itemReactions;
    }

    ReactionSet s4();

    default void ub(int i, int i2) {
        r9().g(i, i2);
    }

    default ArrayList<ReactionMeta> v8() {
        ItemReactions K = K();
        if (K == null) {
            return null;
        }
        ReactionSet s4 = s4();
        if (s4 == null) {
            return K.h;
        }
        ArrayList<ReactionMeta> arrayList = K.h;
        if (arrayList != null) {
            return arrayList;
        }
        ReactionMeta d = c2f0.d(s4, 0);
        ArrayList<ReactionMeta> arrayList2 = new ArrayList<>(1);
        if (!K.b.isEmpty() && d != null) {
            arrayList2.add(d);
        }
        K.h = arrayList2;
        return arrayList2;
    }
}
