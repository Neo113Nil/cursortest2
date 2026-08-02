package xsna;

import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.editor.state.model.a;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipsEditorDraftMapper.kt */
/* loaded from: classes16.dex */
public final class sxd {
    public static final pdo a(com.vk.clips.editor.state.model.a aVar) {
        List<List<com.vk.clips.editor.state.model.b>> list = aVar.f;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((com.vk.clips.editor.state.model.b) it2.next()).b);
            }
            arrayList.add(arrayList2);
        }
        ClipsEditorAudioItem clipsEditorAudioItem = aVar.d;
        yco ycoVar = null;
        if (clipsEditorAudioItem != null && !clipsEditorAudioItem.e) {
            ycoVar = new yco(clipsEditorAudioItem.a, clipsEditorAudioItem.b, clipsEditorAudioItem.d, clipsEditorAudioItem.c);
        }
        com.vk.clips.editor.state.model.a aVar2 = com.vk.clips.editor.state.model.a.h;
        ArrayList a = a.C0580a.a(aVar.e);
        ArrayList arrayList3 = new ArrayList(c5g.u(a, 10));
        Iterator it3 = a.iterator();
        while (it3.hasNext()) {
            List<ClipsEditorAudioItem> list3 = (List) it3.next();
            ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
            for (ClipsEditorAudioItem clipsEditorAudioItem2 : list3) {
                arrayList4.add(new yco(clipsEditorAudioItem2.a, clipsEditorAudioItem2.b, clipsEditorAudioItem2.d, clipsEditorAudioItem2.c));
            }
            arrayList3.add(arrayList4);
        }
        List<com.vk.clips.editor.state.model.c> list4 = aVar.c;
        ArrayList arrayList5 = new ArrayList(c5g.u(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            com.vk.clips.editor.state.model.c cVar = (com.vk.clips.editor.state.model.c) it4.next();
            File file = cVar.a;
            long j = cVar.b;
            long j2 = cVar.c;
            ClipsEditorMusicInfo clipsEditorMusicInfo = cVar.e;
            Iterator it5 = it4;
            arrayList5.add(new ClipsEditorInputVideoItem(file, j, j2, cVar.d, clipsEditorMusicInfo, cVar.f, cVar.g, cVar.h, cVar.i, cVar.s, cVar.k, cVar.l, cVar.m, cVar.n, cVar.o, cVar.p, cVar.r));
            it4 = it5;
        }
        nzd nzdVar = aVar.a;
        return new pdo(arrayList, ycoVar, arrayList3, arrayList5, nzdVar.a, nzdVar.b, aVar.g.b, nzdVar.c);
    }
}
