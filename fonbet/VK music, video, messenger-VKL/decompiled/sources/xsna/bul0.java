package xsna;

import com.vk.core.store.entity.models.StoriesEventsStack;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: StoriesPreviewEventsCache.kt */
/* loaded from: classes6.dex */
public final class bul0 implements izs {
    public final /* synthetic */ String b;

    public bul0(String str) {
        this.b = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list = (List) obj;
        String str = this.b;
        if (list.contains(str)) {
            return new Pair(new StoriesEventsStack((ArrayList) null, 3), Boolean.FALSE);
        }
        ArrayList arrayList = new ArrayList(list);
        if (list.size() >= 100) {
            arrayList.remove(e43.h(arrayList));
        }
        arrayList.add(0, str);
        return new Pair(new StoriesEventsStack(arrayList, 2), Boolean.TRUE);
    }
}
