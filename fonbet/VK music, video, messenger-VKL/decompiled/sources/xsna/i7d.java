package xsna;

import com.vk.dto.common.VideoFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.wih0;

/* compiled from: ClipListResponseAdapter.kt */
/* loaded from: classes17.dex */
public final class i7d {
    public static final qih0 a(h7d h7dVar) {
        List<VideoFile> list = h7dVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((VideoFile) obj).o0() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new wih0.a(k15.B((VideoFile) it.next()), null));
        }
        return new qih0(arrayList2, list.size(), list.size() - arrayList2.size(), h7dVar.b, h7dVar.c, h7dVar.e, h7dVar.f, null);
    }
}
