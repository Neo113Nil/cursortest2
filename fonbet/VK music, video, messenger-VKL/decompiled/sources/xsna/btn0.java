package xsna;

import com.vk.attachpicker.impl.TabOrderUtils$Tab;
import java.util.ArrayList;
import java.util.Comparator;
import xsna.cyn0;

/* compiled from: Comparisons.kt */
/* loaded from: classes15.dex */
public final class btn0<T> implements Comparator {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;

    public btn0(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        zrp<TabOrderUtils$Tab> h = TabOrderUtils$Tab.h();
        ArrayList arrayList = this.c;
        int indexOf = arrayList.indexOf((cyn0.b) t);
        ArrayList arrayList2 = this.b;
        Integer j = p4g.j(j5g.b0(indexOf, arrayList2), h);
        Integer valueOf = Integer.valueOf(j != null ? j.intValue() : Integer.MAX_VALUE);
        Integer j2 = p4g.j(j5g.b0(arrayList.indexOf((cyn0.b) t2), arrayList2), TabOrderUtils$Tab.h());
        return jw5.b(valueOf, Integer.valueOf(j2 != null ? j2.intValue() : Integer.MAX_VALUE));
    }
}
