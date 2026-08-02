package com.yandex.go.shortcuts.impl.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.b6w;
import defpackage.ekh0;
import defpackage.ga5;
import defpackage.kx31;
import defpackage.lgp;
import defpackage.ml4;
import defpackage.rp31;
import defpackage.scc;
import defpackage.t4s0;
import defpackage.u7h0;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.BadgeView;

/* loaded from: classes13.dex */
public abstract class d extends kx31 {
    public static final List W;
    public final ru.yandex.taxi.widget.c T;
    public final ConstraintLayout U;
    public final ArrayList V;

    static {
        int i = 3;
        W = scc.g(new lgp(BaseViewHolder$Companion$BASE_PAYLOAD_TYPES$1.b, BaseViewHolder$Companion$BASE_PAYLOAD_TYPES$2.b, i), new lgp(BaseViewHolder$Companion$BASE_PAYLOAD_TYPES$3.b, BaseViewHolder$Companion$BASE_PAYLOAD_TYPES$4.b, i));
    }

    public d(ru.yandex.taxi.widget.c cVar, t4s0 t4s0Var, View view) {
        super(view, t4s0Var);
        this.T = cVar;
        int i = u7h0.shortcut_labels_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.U = (ConstraintLayout) ((View) rp31.d(view, i));
        this.V = new ArrayList();
    }

    @Override // defpackage.kx31, defpackage.wys
    public void Y() {
        super.Y();
        f0(EmptyList.a, this.V, ekh0.shortcut_label, 0, this.U);
    }

    @Override // defpackage.wys
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void c(ga5 ga5Var) {
        c0(ga5Var);
        g0(ga5Var);
    }

    public void e0(ga5 ga5Var, boolean z) {
        this.a.setEnabled(!z);
    }

    public final void f0(List list, ArrayList arrayList, int i, int i2, ConstraintLayout constraintLayout) {
        List<Pair> list2;
        if (list.size() == arrayList.size()) {
            return;
        }
        b6w l = y6i0.l(y6i0.n(list.size(), arrayList.size()));
        int i3 = l.a;
        int i4 = l.b;
        int i5 = l.c;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (true) {
                BadgeView badgeView = (BadgeView) arrayList.remove(i3);
                W(Integer.valueOf(badgeView.getId()));
                constraintLayout.removeView(badgeView);
                if (i3 == i4) {
                    break;
                } else {
                    i3 += i5;
                }
            }
        }
        int size = list.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            BadgeView badgeView2 = (BadgeView) LayoutInflater.from(constraintLayout.getContext()).inflate(i, (ViewGroup) constraintLayout, false);
            badgeView2.setId(View.generateViewId());
            arrayList.add(badgeView2);
            constraintLayout.addView(badgeView2);
        }
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.g(constraintLayout);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ArrayList arrayList2 = new ArrayList();
            Object next = it.next();
            while (it.hasNext()) {
                Object next2 = it.next();
                arrayList2.add(new Pair(next, next2));
                next = next2;
            }
            list2 = arrayList2;
        } else {
            list2 = EmptyList.a;
        }
        for (Pair pair : list2) {
            eVar.i(((BadgeView) pair.f()).getId(), 6, ((BadgeView) pair.c()).getId(), 7);
            eVar.i(((BadgeView) pair.c()).getId(), 7, ((BadgeView) pair.f()).getId(), 6);
        }
        BadgeView badgeView3 = (BadgeView) kotlin.collections.a.R(arrayList);
        if (badgeView3 != null) {
            eVar.i(badgeView3.getId(), 6, i2, 6);
        }
        BadgeView badgeView4 = (BadgeView) kotlin.collections.a.b0(arrayList);
        if (badgeView4 != null) {
            eVar.i(badgeView4.getId(), 7, 0, 7);
        }
        eVar.b(constraintLayout);
    }

    public void g0(ga5 ga5Var) {
        List list = ga5Var.getBase().l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ml4) {
                arrayList.add(obj);
            }
        }
        int i = ekh0.shortcut_label;
        ConstraintLayout constraintLayout = this.U;
        ArrayList arrayList2 = this.V;
        f0(arrayList, arrayList2, i, 0, constraintLayout);
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            com.yandex.go.shortcuts.impl.utils.a.d(this, (BadgeView) arrayList2.get(i2), (ml4) next, this.T, 0, null, 24);
            i2 = i3;
        }
    }
}
