package xsna;

import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsEditorStateShortCuts.kt */
/* loaded from: classes16.dex */
public final class vzd {
    public static void a(szd szdVar, String str, List list) {
        com.vk.clips.editor.state.model.a aVar = szdVar.o.a;
        List<List<ClipsEditorAudioItem>> list2 = aVar.e;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            List list3 = (List) it.next();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list3) {
                if (!epx.f(((kyd) obj).m(), str)) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                arrayList.add(arrayList2);
            }
        }
        szdVar.c(com.vk.clips.editor.state.model.a.c(aVar, null, null, null, arrayList, null, null, 111), list);
    }

    public static void b(rzd rzdVar, nov novVar, List list) {
        List<List<com.vk.clips.editor.state.model.b>> list2 = rzdVar.getState().f;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            List list3 = (List) it.next();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list3) {
                if (((com.vk.clips.editor.state.model.b) obj).b != novVar) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                arrayList.add(arrayList2);
            }
        }
        rzdVar.c(com.vk.clips.editor.state.model.a.c(rzdVar.getState(), null, null, null, null, arrayList, null, 95), list);
    }

    public static void c(szd szdVar, yzd yzdVar) {
        szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, yzdVar, null, null, null, null, null, 125), EmptyList.b);
    }
}
