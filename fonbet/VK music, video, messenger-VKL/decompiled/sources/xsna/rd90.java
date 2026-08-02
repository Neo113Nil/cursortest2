package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.view.components.pagination.VkPaginationDots;
import com.vk.superapp.api.dto.app.catalog.CustomItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.x7a;

/* compiled from: PaginatedViewHolder.kt */
/* loaded from: classes6.dex */
public final class rd90 extends e9r0<x7a.d.C3981d> implements zvx {
    public final View m;
    public final qd90 n;
    public int o;

    public rd90(ViewGroup viewGroup, u8r0 u8r0Var) {
        super(R.layout.vk_item_apps_catalog_paginated, viewGroup);
        ViewPager2 viewPager2 = (ViewPager2) this.itemView.findViewById(R.id.view_pager);
        this.m = this.itemView.findViewById(R.id.pager_indicator_container);
        VkPaginationDots vkPaginationDots = (VkPaginationDots) this.itemView.findViewById(R.id.pager_indicator);
        qd90 qd90Var = new qd90(this, u8r0Var);
        this.n = qd90Var;
        this.o = 16;
        viewPager2.setOrientation(0);
        viewPager2.setAdapter(qd90Var);
        viewPager2.setOffscreenPageLimit(1);
        new sav0(vkPaginationDots, viewPager2).a();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = viewPager2.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = viewPager2.getMeasuredHeight();
        f4m.a(viewPager2, new gzt0(viewPager2, ref$IntRef, ref$IntRef2, viewPager2));
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
    }

    @Override // xsna.v96
    public final void W5(Object obj) {
        x7a.d.C3981d c3981d = (x7a.d.C3981d) obj;
        this.o = Math.min(4, c3981d.f) * 4;
        List<CustomItem> list = c3981d.g;
        int i = 0;
        awt0.v(this.m, list.size() > this.o);
        int i2 = this.o;
        ArrayList U0 = j5g.U0(list, i2, i2, true);
        ArrayList arrayList = new ArrayList(c5g.u(U0, 10));
        Iterator it = U0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            arrayList.add(new y890(i, (List) next));
            i = i3;
        }
        qd90 qd90Var = this.n;
        ArrayList arrayList2 = qd90Var.e;
        m.d a = androidx.recyclerview.widget.m.a(new yc90(arrayList2, arrayList), true);
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        a.b(qd90Var);
    }

    @Override // xsna.zvx
    public final int x4() {
        return this.o;
    }
}
