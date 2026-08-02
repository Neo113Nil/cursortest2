package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: EpisodeAdapter.kt */
/* loaded from: classes2.dex */
public final class jsp implements d.b<hfz> {
    public final /* synthetic */ isp a;

    public jsp(isp ispVar) {
        this.a = ispVar;
    }

    @Override // androidx.recyclerview.widget.d.b
    public final void a(List<hfz> list, List<hfz> list2) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof atp) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((atp) obj).e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        atp atpVar = (atp) obj;
        if (atpVar != null) {
            int i = atpVar.c;
            isp ispVar = this.a;
            if (i != -1) {
                ispVar.k = i;
                RecyclerView recyclerView = ispVar.f;
                if (recyclerView != null) {
                    ispVar.k = -1;
                    recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new lsp(recyclerView, i, ispVar));
                }
            }
            ispVar.h.d.remove(this);
        }
    }
}
