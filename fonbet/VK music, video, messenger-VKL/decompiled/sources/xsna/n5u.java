package xsna;

import com.vk.lists.c;
import kotlin.collections.EmptyList;

/* compiled from: GoodPreviewAdapter.kt */
/* loaded from: classes18.dex */
public final class n5u extends sxm implements c.i, vic, mf7 {
    public r41 i;

    public n5u() {
        throw null;
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return this.h.isEmpty();
    }

    @Override // com.vk.lists.c.i
    public final void clear() {
        setItems(EmptyList.b);
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        Object b0 = j5g.b0(i, this.h);
        n4d0 n4d0Var = b0 instanceof n4d0 ? (n4d0) b0 : null;
        if (n4d0Var != null) {
            return n4d0Var.N9();
        }
        return 0;
    }
}
