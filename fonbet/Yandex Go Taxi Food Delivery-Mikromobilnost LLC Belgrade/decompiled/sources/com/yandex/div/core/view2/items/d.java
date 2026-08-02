package com.yandex.div.core.view2.items;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div2.DivSizeUnit;
import defpackage.bql;
import defpackage.jl40;
import defpackage.m3k;
import defpackage.m810;
import defpackage.scc;
import defpackage.tls;
import defpackage.w511;
import defpackage.wls;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class d {
    public static final ArrayList a(ArrayList arrayList, String str, tls tlsVar) {
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Integer valueOf = jl40.l(((m3k) tlsVar.invoke(obj)).d().getId(), str) ? Integer.valueOf(i) : null;
            if (valueOf != null) {
                arrayList2.add(valueOf);
            }
            i = i2;
        }
        return arrayList2;
    }

    public static final LinearLayoutManager b(RecyclerView recyclerView) {
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public static final int c(RecyclerView recyclerView) {
        int computeVerticalScrollRange;
        int t;
        LinearLayoutManager b = b(recyclerView);
        Integer valueOf = b != null ? Integer.valueOf(b.J) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            computeVerticalScrollRange = recyclerView.computeHorizontalScrollRange();
            t = com.yandex.div.core.view2.divs.a.u(recyclerView);
        } else {
            computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
            t = com.yandex.div.core.view2.divs.a.t(recyclerView);
        }
        return computeVerticalScrollRange - t;
    }

    public static final void d(RecyclerView recyclerView, int i, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics, boolean z) {
        RecyclerView recyclerView2;
        wls divViewWithItemsKt$scrollTo$scroll$2;
        int i2 = bql.b[divSizeUnit.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = m810.b(com.yandex.div.core.view2.divs.a.E(Integer.valueOf(i), displayMetrics));
            } else {
                if (i2 != 3) {
                    w511.b();
                    return;
                }
                i = com.yandex.div.core.view2.divs.a.p(Integer.valueOf(i), displayMetrics);
            }
        }
        LinearLayoutManager b = b(recyclerView);
        if (b == null) {
            return;
        }
        if (z) {
            recyclerView2 = recyclerView;
            divViewWithItemsKt$scrollTo$scroll$2 = new DivViewWithItemsKt$scrollTo$scroll$1(2, recyclerView2, RecyclerView.class, "smoothScrollBy", "smoothScrollBy(II)V", 0);
        } else {
            recyclerView2 = recyclerView;
            divViewWithItemsKt$scrollTo$scroll$2 = new DivViewWithItemsKt$scrollTo$scroll$2(2, recyclerView, RecyclerView.class, "scrollBy", "scrollBy(II)V", 0);
        }
        int i3 = b.J;
        if (i3 == 0) {
            divViewWithItemsKt$scrollTo$scroll$2.invoke(Integer.valueOf(i - recyclerView2.computeHorizontalScrollOffset()), 0);
        } else {
            if (i3 != 1) {
                return;
            }
            divViewWithItemsKt$scrollTo$scroll$2.invoke(0, Integer.valueOf(i - recyclerView2.computeVerticalScrollOffset()));
        }
    }
}
