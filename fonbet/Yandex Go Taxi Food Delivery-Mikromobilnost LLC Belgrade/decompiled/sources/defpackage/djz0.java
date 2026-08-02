package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes5.dex */
public final class djz0 {
    public final nry0 a;
    public final List b;

    public djz0(List list, nry0 nry0Var) {
        List J0;
        this.a = nry0Var;
        if (list.isEmpty()) {
            J0 = EmptyList.a;
        } else if (list.size() == 1) {
            J0 = Collections.singletonList(list.get(0));
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                CharSequence charSequence = (CharSequence) obj;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    arrayList.add(obj);
                }
            }
            J0 = a.J0(a.x0(arrayList, new cjz0()));
        }
        this.b = J0;
    }
}
