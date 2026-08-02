package xsna;

import java.util.ArrayList;
import xsna.i0p;
import xsna.tq70;

/* compiled from: EditPlaylistModelImpl.java */
/* loaded from: classes3.dex */
public final class p0p implements tq70.b<i0p.a> {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ com.vk.music.fragment.impl.model.b c;

    public p0p(com.vk.music.fragment.impl.model.b bVar, ArrayList arrayList) {
        this.c = bVar;
        this.b = arrayList;
    }

    @Override // xsna.tq70.b
    public final void accept(i0p.a aVar) {
        i0p.a aVar2 = aVar;
        com.vk.music.fragment.impl.model.b bVar = this.c;
        int i = bVar.b;
        com.vk.music.fragment.impl.model.a aVar3 = bVar.c;
        if (i == 0) {
            aVar2.d(null);
        } else {
            aVar2.b(aVar3, this.b);
        }
    }
}
