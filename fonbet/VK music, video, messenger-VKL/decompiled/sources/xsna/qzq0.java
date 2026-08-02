package xsna;

import com.vk.external.miniapp.net.app.ProfileItem;
import com.vk.external.miniapp.net.app.WebImageSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: UserStackPhotoManager.kt */
/* loaded from: classes6.dex */
public final class qzq0 {
    public static final int a = iah0.a(16);

    public static List a(int i, List list) {
        if (list.isEmpty()) {
            return EmptyList.b;
        }
        List H0 = j5g.H0(list, 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            WebImageSize e = ((ProfileItem) it.next()).c.e(i);
            String str = e != null ? e.b : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            itj0.d((String) it2.next(), arrayList2);
        }
        return arrayList2;
    }
}
