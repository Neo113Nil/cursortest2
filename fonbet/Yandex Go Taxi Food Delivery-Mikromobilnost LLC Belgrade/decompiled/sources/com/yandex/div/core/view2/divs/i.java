package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import defpackage.aw5;
import defpackage.egk;
import defpackage.f3l;
import defpackage.hgk;
import defpackage.hsk;
import defpackage.m2k;
import defpackage.m3k;
import defpackage.r8;
import defpackage.rvo;
import defpackage.scc;
import defpackage.tje;
import defpackage.tls;
import defpackage.uml;
import defpackage.uvo;
import defpackage.ycc;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class i extends r8 {
    public final f3l c;
    public final yvf0 w;
    public final yvf0 x;

    public i(e eVar, f3l f3lVar, yvf0 yvf0Var, yvf0 yvf0Var2) {
        super(4, eVar);
        this.c = f3lVar;
        this.w = yvf0Var;
        this.x = yvf0Var2;
    }

    public static void Hg(egk egkVar, rvo rvoVar, View view) {
        int i;
        Expression c = egkVar.c();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        int i2 = 1;
        if (divLayoutParams != null) {
            if (c != null) {
                long longValue = ((Number) c.a(rvoVar)).longValue();
                long j = longValue >> 31;
                i = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                i = 1;
            }
            if (divLayoutParams.getColumnSpan() != i) {
                divLayoutParams.setColumnSpan(i);
                view.requestLayout();
            }
        }
        Expression f = egkVar.f();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        DivLayoutParams divLayoutParams2 = layoutParams2 instanceof DivLayoutParams ? (DivLayoutParams) layoutParams2 : null;
        if (divLayoutParams2 == null) {
            return;
        }
        if (f != null) {
            long longValue2 = ((Number) f.a(rvoVar)).longValue();
            long j2 = longValue2 >> 31;
            if (j2 == 0 || j2 == -1) {
                i2 = (int) longValue2;
            } else {
                i2 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        if (divLayoutParams2.getRowSpan() != i2) {
            divLayoutParams2.setRowSpan(i2);
            view.requestLayout();
        }
    }

    @Override // defpackage.r8
    public final void Hc(View view, aw5 aw5Var, egk egkVar, egk egkVar2) {
        final DivGridLayout divGridLayout = (DivGridLayout) view;
        hsk hskVar = (hsk) egkVar;
        divGridLayout.setReleaseViewVisitor$div_release(aw5Var.a.getReleaseViewVisitor$div_release());
        a.c(divGridLayout, aw5Var, hskVar.b, hskVar.d, hskVar.A, hskVar.q, hskVar.w, hskVar.v, hskVar.E, hskVar.D, hskVar.c, hskVar.k);
        Expression expression = hskVar.l;
        final rvo rvoVar = aw5Var.b;
        divGridLayout.addSubscription(expression.d(rvoVar, new tls() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$bind$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                long longValue = ((Number) obj).longValue();
                long j = longValue >> 31;
                DivGridLayout.this.setColumnCount((j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                return zy11.a;
            }
        }));
        final Expression expression2 = hskVar.n;
        final Expression expression3 = hskVar.o;
        divGridLayout.setGravity(uml.b((DivAlignmentHorizontal) expression2.a(rvoVar), (DivAlignmentVertical) expression3.a(rvoVar)));
        tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$observeContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                DivGridLayout.this.setGravity(uml.b((DivAlignmentHorizontal) expression2.a(rvoVar), (DivAlignmentVertical) expression3.a(rvoVar)));
                return zy11.a;
            }
        };
        divGridLayout.addSubscription(expression2.c(rvoVar, tlsVar));
        divGridLayout.addSubscription(expression3.c(rvoVar, tlsVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ig(aw5 aw5Var, DivGridLayout divGridLayout, m2k m2kVar, com.yandex.div.core.state.b bVar) {
        List list;
        Iterator it;
        List singletonList;
        final i iVar = this;
        final rvo rvoVar = aw5Var.b;
        Bg(aw5Var, divGridLayout, m2kVar, bVar);
        hsk hskVar = m2kVar.c;
        m2k div = divGridLayout.getDiv();
        hsk hskVar2 = div != null ? div.c : null;
        List list2 = hskVar.y;
        if (list2 == null) {
            list2 = EmptyList.a;
        }
        Div2View div2View = aw5Var.a;
        tje.j0(divGridLayout, div2View, com.yandex.div.internal.core.a.h(list2, rvoVar), iVar.x);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list2.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            m3k m3kVar = (m3k) next;
            int i4 = i + i2;
            String id = m3kVar.d().getId();
            if (id == null || div2View.getComplexRebindInProgress$div_release()) {
                it = it2;
                singletonList = Collections.singletonList(m3kVar);
            } else {
                LinkedHashMap b = iVar.c.b(aw5Var, id);
                if (b == null) {
                    singletonList = Collections.singletonList(m3kVar);
                    it = it2;
                } else {
                    divGridLayout.removeViewAt(i4);
                    Iterator it3 = b.entrySet().iterator();
                    int i5 = 0;
                    while (it3.hasNext()) {
                        divGridLayout.addView((View) ((Map.Entry) it3.next()).getValue(), i5 + i4, new DivLayoutParams(-2, -2));
                        i5++;
                        it2 = it2;
                    }
                    it = it2;
                    singletonList = kotlin.collections.a.J0(b.keySet());
                }
            }
            i2 += singletonList.size() - 1;
            ycc.r(singletonList, arrayList);
            i = i3;
            it2 = it;
        }
        ArrayList f = com.yandex.div.core.state.a.f(arrayList);
        Iterator it4 = arrayList.iterator();
        int i6 = 0;
        while (it4.hasNext()) {
            Object next2 = it4.next();
            int i7 = i6 + 1;
            if (i6 < 0) {
                scc.m();
                throw null;
            }
            m3k m3kVar2 = (m3k) next2;
            final View childAt = divGridLayout.getChildAt(i6);
            final egk d = m3kVar2.d();
            ((hgk) iVar.w.get()).b(aw5Var, childAt, m3kVar2, bVar.a((String) f.get(i6)));
            Hg(d, rvoVar, childAt);
            if (childAt instanceof uvo) {
                tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$bindLayoutParams$callback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        i iVar2 = i.this;
                        View view = childAt;
                        rvo rvoVar2 = rvoVar;
                        egk egkVar = d;
                        iVar2.getClass();
                        i.Hg(egkVar, rvoVar2, view);
                        return zy11.a;
                    }
                };
                uvo uvoVar = (uvo) childAt;
                Expression c = d.c();
                uvoVar.addSubscription(c != null ? c.c(rvoVar, tlsVar) : null);
                Expression f2 = d.f();
                uvoVar.addSubscription(f2 != null ? f2.c(rvoVar, tlsVar) : null);
            }
            if (uml.g(d)) {
                div2View.bindViewToDiv$div_release(childAt, m3kVar2);
            } else {
                div2View.unbindViewFromDiv$div_release(childAt);
            }
            iVar = this;
            i6 = i7;
        }
        a.L(divGridLayout, div2View, com.yandex.div.internal.core.a.h(arrayList, rvoVar), (hskVar2 == null || (list = hskVar2.y) == null) ? null : com.yandex.div.internal.core.a.h(list, rvoVar));
    }
}
