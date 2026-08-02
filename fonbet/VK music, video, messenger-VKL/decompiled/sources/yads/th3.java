package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes10.dex */
public final class th3 {
    public static sh3 a(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((ye3) obj).a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return new sh3((List) pair.g(), (List) pair.d());
    }
}
