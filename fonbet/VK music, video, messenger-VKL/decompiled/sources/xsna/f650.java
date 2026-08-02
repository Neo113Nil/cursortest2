package xsna;

import com.vk.lists.c;
import kotlin.collections.EmptyList;

/* compiled from: MusicSnippetTrackAdapter.kt */
/* loaded from: classes3.dex */
public final class f650 extends sxm implements c.i, vic, mf7 {
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
