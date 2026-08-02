package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.DraggableVh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: CatalogItemTouchHelperCallback.kt */
/* loaded from: classes16.dex */
public class y7a extends r.d {
    public final lca e;
    public final int f;
    public boolean g;
    public UIBlock h;
    public final LinkedHashMap i = new LinkedHashMap();

    public y7a(lca lcaVar, int i) {
        this.e = lcaVar;
        this.f = i;
    }

    @Override // androidx.recyclerview.widget.r.d
    public void b(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        super.b(recyclerView, e0Var);
        UIBlock uIBlock = this.h;
        lca lcaVar = this.e;
        if (lcaVar.k || uIBlock == null) {
            return;
        }
        lcaVar.g.b.e.b(new qd3(uIBlock.b, uIBlock), true);
    }

    @Override // androidx.recyclerview.widget.r.d
    public int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        int adapterPosition = e0Var.getAdapterPosition();
        ArrayList arrayList = (ArrayList) this.e.y0();
        int size = arrayList.size();
        if (adapterPosition < 0 || adapterPosition >= size) {
            return r.d.l(0, 0);
        }
        UIBlock uIBlock = (UIBlock) arrayList.get(adapterPosition);
        boolean Nb = uIBlock != null ? uIBlock.Nb() : false;
        boolean Ob = uIBlock != null ? uIBlock.Ob() : false;
        tca tcaVar = e0Var instanceof tca ? (tca) e0Var : null;
        Object obj = tcaVar != null ? tcaVar.l : null;
        DraggableVh draggableVh = obj instanceof DraggableVh ? (DraggableVh) obj : null;
        return r.d.l(((this.g && Nb && !(draggableVh != null ? draggableVh.o : false)) || Ob) ? this.f : 0, 0);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean j() {
        return false;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        String str;
        int adapterPosition = e0Var.getAdapterPosition();
        int adapterPosition2 = e0Var2.getAdapterPosition();
        lca lcaVar = this.e;
        List<UIBlock> y0 = lcaVar.y0();
        ArrayList arrayList = (ArrayList) y0;
        int size = arrayList.size();
        if (adapterPosition >= 0 && adapterPosition < size) {
            int size2 = arrayList.size();
            if (adapterPosition2 >= 0 && adapterPosition2 < size2) {
                UIBlock uIBlock = (UIBlock) arrayList.get(adapterPosition);
                UIBlock uIBlock2 = (UIBlock) arrayList.get(adapterPosition2);
                boolean z = uIBlock.e == uIBlock2.e;
                boolean z2 = uIBlock.d == uIBlock2.d;
                boolean f = epx.f(uIBlock.b, uIBlock2.b);
                boolean z3 = uIBlock.Nb() && uIBlock.Nb();
                boolean z4 = uIBlock.Ob() && uIBlock.Ob();
                if (f && z && z2 && (z3 || z4)) {
                    int i = adapterPosition > adapterPosition2 ? -1 : 1;
                    i9x q = adapterPosition < adapterPosition2 ? swe0.q(adapterPosition, adapterPosition2) : swe0.m(adapterPosition, adapterPosition2 + 1);
                    int i2 = adapterPosition < adapterPosition2 ? 1 : -1;
                    int i3 = q.b;
                    int i4 = q.c;
                    int i5 = q.d;
                    if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                        while (true) {
                            Collections.swap(y0, i3, i3 + i2);
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        }
                    }
                    String Fb = uIBlock.Fb();
                    String Fb2 = uIBlock2.Fb();
                    String Gb = uIBlock.Gb();
                    String Gb2 = uIBlock2.Gb();
                    LinkedHashMap linkedHashMap = this.i;
                    if (linkedHashMap.containsKey(Fb)) {
                        str = Fb;
                    } else {
                        str = Fb;
                        linkedHashMap.put(str, new ozf0(Fb, Fb2, Gb, Gb2, i));
                    }
                    ozf0 ozf0Var = (ozf0) linkedHashMap.get(str);
                    linkedHashMap.put(str, new ozf0(ozf0Var.a, Fb2, ozf0Var.c, Gb2, i));
                    lcaVar.notifyItemMoved(adapterPosition, adapterPosition2);
                    this.h = uIBlock;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.r.d
    public void o(RecyclerView.e0 e0Var, int i) {
        View view;
        if (i != 2 || e0Var == null || (view = e0Var.itemView) == null) {
            return;
        }
        view.performHapticFeedback(0);
    }

    public final ArrayList q() {
        LinkedHashMap linkedHashMap = this.i;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((ozf0) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void p(RecyclerView.e0 e0Var) {
    }
}
