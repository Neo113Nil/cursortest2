package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class pkt {
    public final ViewGroup a;
    public final c4p b;
    public final ArrayList c = new ArrayList();

    public pkt(ViewGroup viewGroup, c4p c4pVar) {
        this.a = viewGroup;
        this.b = c4pVar;
    }

    public final void a(List list) {
        ArrayList arrayList;
        ViewGroup viewGroup;
        while (true) {
            arrayList = this.c;
            int size = arrayList.size();
            int size2 = list.size();
            viewGroup = this.a;
            if (size >= size2) {
                break;
            }
            mkt mktVar = (mkt) this.b.get();
            arrayList.add(mktVar);
            viewGroup.addView(mktVar.a);
        }
        while (arrayList.size() > list.size()) {
            int size3 = arrayList.size() - 1;
            mkt mktVar2 = (mkt) arrayList.get(size3);
            arrayList.remove(size3);
            viewGroup.removeView(mktVar2.a);
        }
        int size4 = list.size();
        for (int i = 0; i < size4; i++) {
            ((mkt) arrayList.get(i)).a.update((jmw0) list.get(i));
        }
    }
}
