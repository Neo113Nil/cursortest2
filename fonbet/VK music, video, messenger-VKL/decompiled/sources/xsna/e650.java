package xsna;

import com.vk.lists.c;
import kotlin.collections.EmptyList;

/* compiled from: MusicSnippetSectionAdapter.kt */
/* loaded from: classes3.dex */
public final class e650 extends sxm implements c.i, vic, mf7 {
    public final ug8 i;

    public e650(ug8 ug8Var, bgy bgyVar, kck0 kck0Var) {
        this.i = ug8Var;
        x0(pck0.class, new iea(bgyVar, kck0Var, this, 5));
        x0(rck0.class, new oey(10));
        x0(qck0.class, new yr00(bgyVar, 7));
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
        return 1;
    }
}
