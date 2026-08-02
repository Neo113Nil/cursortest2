package xsna;

import android.util.Size;
import kotlin.collections.EmptyList;

/* compiled from: CommunityCategorySuggestionsAdapter.kt */
/* loaded from: classes5.dex */
public final class ytg extends sxm implements vic {
    public final com.vk.movika.tools.controls.seekbar.j i;
    public final omf j;
    public final gyn k;

    public ytg(com.vk.movika.tools.controls.seekbar.j jVar, omf omfVar, gyn gynVar, Size size) {
        this.i = jVar;
        this.j = omfVar;
        this.k = gynVar;
        x0(j3i.class, new ri0(8, this, size));
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        setItems(EmptyList.b);
    }
}
