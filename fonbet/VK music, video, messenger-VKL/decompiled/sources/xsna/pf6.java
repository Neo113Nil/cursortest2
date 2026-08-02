package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.hfz;

/* compiled from: BaseKeyboardAdapter.kt */
/* loaded from: classes6.dex */
public abstract class pf6<I extends hfz> extends sxm {
    public final void J0(int i, List<? extends I> list) {
        ArrayList arrayList = new ArrayList(this.h);
        arrayList.addAll(i, list);
        setItems(arrayList);
    }

    public final void K0(int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(this.h);
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            arrayList2.set(i2 + i, (hfz) it.next());
            i2 = i3;
        }
        setItems(arrayList2);
    }
}
