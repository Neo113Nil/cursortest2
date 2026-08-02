package xsna;

import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MediaPickerPaginationDelegate.kt */
/* loaded from: classes4.dex */
public final class gu10 {
    public final nlc0 a;

    public gu10(wj50<fmc0> wj50Var) {
        this.a = new nlc0(wj50Var);
    }

    public static ArrayList a(ArrayList arrayList, List list) {
        Object obj;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + list.size());
        arrayList2.addAll(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LocalMediaEntry localMediaEntry = (LocalMediaEntry) it.next();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((LocalMediaEntry) obj).ba().getId() == localMediaEntry.ba().getId()) {
                    break;
                }
            }
            if (obj == null) {
                arrayList2.add(localMediaEntry);
            }
        }
        return arrayList2;
    }
}
