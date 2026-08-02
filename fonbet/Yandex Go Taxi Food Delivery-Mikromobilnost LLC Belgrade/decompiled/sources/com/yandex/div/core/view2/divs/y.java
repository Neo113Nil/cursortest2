package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div2.DivVisibility;
import defpackage.cxk;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tls;
import defpackage.uvo;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class y extends RecyclerView.Adapter implements uvo {
    public final ArrayList a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c;
    public boolean w;
    public final ArrayList x;

    public y(List list) {
        this.a = new ArrayList(list);
        List<cxk> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (cxk cxkVar : list2) {
            arrayList.add(Boolean.valueOf(((DivVisibility) cxkVar.a.d().getVisibility().a(cxkVar.b)) != DivVisibility.GONE));
        }
        this.c = new ArrayList(arrayList);
        this.x = new ArrayList();
        i();
    }

    public final void f(int i, Collection collection) {
        int i2;
        this.a.addAll(i, collection);
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(tcc.n(collection2, 10));
        Iterator it = collection2.iterator();
        while (true) {
            i2 = 0;
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            cxk cxkVar = (cxk) it.next();
            if (((DivVisibility) cxkVar.a.d().getVisibility().a(cxkVar.b)) != DivVisibility.GONE) {
                z = true;
            }
            arrayList.add(Boolean.valueOf(z));
        }
        this.c.addAll(i, arrayList);
        this.w = false;
        for (Object obj : collection2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            cxk cxkVar2 = (cxk) obj;
            if (((DivVisibility) cxkVar2.a.d().getVisibility().a(cxkVar2.b)) != DivVisibility.GONE) {
                d(j(i2 + i));
            }
            i2 = i3;
        }
    }

    public final ArrayList g() {
        boolean z = this.w;
        ArrayList arrayList = this.b;
        if (!z) {
            arrayList.clear();
            Iterator it = this.a.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                cxk cxkVar = ((Boolean) this.c.get(i)).booleanValue() ? (cxk) next : null;
                if (cxkVar != null) {
                    arrayList.add(cxkVar);
                }
                i = i2;
            }
            this.w = true;
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return g().size();
    }

    @Override // defpackage.uvo
    public final List getSubscriptions() {
        return this.x;
    }

    public final void h(int i) {
        this.a.remove(i);
        boolean booleanValue = ((Boolean) this.c.remove(i)).booleanValue();
        this.w = false;
        if (booleanValue) {
            e(j(i));
        }
    }

    public final void i() {
        closeAllSubscription();
        final int i = 0;
        for (Object obj : this.a) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            cxk cxkVar = (cxk) obj;
            addSubscription(cxkVar.a.d().getVisibility().c(cxkVar.b, new tls() { // from class: com.yandex.div.core.view2.divs.VisibilityAwareAdapter$subscribeOnElements$1$subscription$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    DivVisibility divVisibility = (DivVisibility) obj2;
                    y yVar = y.this;
                    int i3 = i;
                    ArrayList arrayList = yVar.c;
                    boolean z = divVisibility != DivVisibility.GONE;
                    boolean booleanValue = ((Boolean) arrayList.get(i3)).booleanValue();
                    if (z != booleanValue) {
                        arrayList.set(i3, Boolean.valueOf(z));
                        yVar.w = false;
                        if (booleanValue) {
                            yVar.e(yVar.j(i3));
                        } else {
                            yVar.d(yVar.j(i3));
                        }
                    }
                    return zy11.a;
                }
            }));
            i = i2;
        }
    }

    public final int j(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (((Boolean) this.c.get(i3)).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }
}
