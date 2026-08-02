package xsna;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import xsna.c7i;
import xsna.npl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class ipl implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return c7i.a.g(npl.i.c((npl.i) Collections.max(list, new wpl(0)), (npl.i) Collections.max(list2, new wpl(0)))).a(list.size(), list2.size()).c((npl.i) Collections.max(list, new xpl()), (npl.i) Collections.max(list2, new xpl()), new xpl()).f();
    }
}
