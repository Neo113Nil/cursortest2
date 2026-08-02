package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class dxk implements lbl {
    public final Div2View a;
    public final hgk b;

    public dxk(Div2View div2View, hgk hgkVar) {
        this.a = div2View;
        this.b = hgkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x010f, code lost:
    
        if (defpackage.jl40.l(kotlin.collections.a.S(1, r15), (java.lang.String) r18.f()) != false) goto L51;
     */
    @Override // defpackage.lbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(aw5 aw5Var, mmk mmkVar, List list) {
        String id;
        Div2View div2View;
        b bVar;
        String str;
        Object bVar2;
        Div2View div2View2;
        long j;
        int i;
        rvo rvoVar = aw5Var.b;
        Div2View div2View3 = this.a;
        int i2 = 0;
        View childAt = div2View3.getChildAt(0);
        m3k m3kVar = mmkVar.a;
        long j2 = mmkVar.b;
        egk d = m3kVar.d();
        if (d instanceof dbl) {
            dbl dblVar = (dbl) d;
            id = dblVar.p;
            if (id == null) {
                id = dblVar.x;
            }
        } else {
            id = d.getId();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j2);
        sb.append(id != null ? ":".concat(id) : "");
        b bVar3 = new b(j2, EmptyList.a, Collections.singletonList(sb.toString()), 8);
        int size = list.size();
        if (size != 0) {
            int i3 = 1;
            if (size != 1) {
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    w511.x("Empty collection can't be reduced.");
                    return;
                }
                Object obj = it.next();
                while (it.hasNext()) {
                    b bVar4 = (b) it.next();
                    b bVar5 = (b) obj;
                    if (bVar5.a != bVar4.a) {
                        div2View2 = div2View3;
                        bVar2 = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = bVar5.b.iterator();
                        int i4 = i2;
                        while (true) {
                            if (!it2.hasNext()) {
                                str = null;
                                break;
                            }
                            Object next = it2.next();
                            int i5 = i4 + 1;
                            str = null;
                            if (i4 < 0) {
                                scc.m();
                                throw null;
                            }
                            Pair pair = (Pair) next;
                            Pair pair2 = (Pair) a.S(i4, bVar4.b);
                            if (pair2 == null || !jl40.l(pair, pair2)) {
                                break;
                            }
                            arrayList.add(pair);
                            i4 = i5;
                        }
                        div2View2 = div2View3;
                        long j3 = bVar5.a;
                        List list2 = bVar5.c;
                        Iterator it3 = arrayList.iterator();
                        int i6 = 0;
                        while (it3.hasNext()) {
                            Pair pair3 = (Pair) it3.next();
                            if (i6 == 0) {
                                String str2 = (String) a.R(list2);
                                j = j3;
                                if (jl40.l(str2 != null ? evu0.c0(':', str2, str2) : str, (String) pair3.c())) {
                                    i = 1;
                                } else {
                                    i = 1;
                                }
                            } else {
                                j = j3;
                                i = i3;
                            }
                            int size2 = list2.size() - i;
                            int i7 = i6;
                            while (i7 < size2) {
                                String str3 = (String) list2.get(i7);
                                int i8 = size2;
                                if (jl40.l(str3, (String) pair3.c()) || evu0.h0('#', str3, str3).equals((String) pair3.c())) {
                                    int i9 = i7 + 1;
                                    if (jl40.l(list2.get(i9), (String) pair3.f())) {
                                        i6 = i9;
                                        break;
                                    }
                                }
                                i7++;
                                size2 = i8;
                            }
                            i = list2.size();
                            i6 = i;
                            j3 = j;
                            i3 = 1;
                        }
                        i2 = 0;
                        bVar2 = new b(j3, arrayList, list2.subList(0, i6 + 1), bVar5.d || bVar4.d);
                    }
                    div2View3 = div2View2;
                    i3 = 1;
                    obj = bVar2 == null ? bVar3 : bVar2;
                }
                div2View = div2View3;
                bVar = (b) obj;
            } else {
                div2View = div2View3;
                bVar = (b) a.P(list);
            }
        } else {
            div2View = div2View3;
            bVar = bVar3;
        }
        if (!bVar.b.isEmpty()) {
            Pair j4 = com.yandex.div.core.state.a.j(childAt, mmkVar, bVar, rvoVar);
            if (j4 == null) {
                return;
            }
            DivStateLayout divStateLayout = (DivStateLayout) j4.getFirst();
            u2k u2kVar = (u2k) j4.getSecond();
            if (divStateLayout != null) {
                b path = divStateLayout.getPath();
                bVar3 = path == null ? bVar : path;
                m3kVar = u2kVar;
                childAt = divStateLayout;
            }
        }
        aw5 v = com.yandex.div.core.view2.divs.a.v(childAt);
        if (v == null) {
            v = div2View.getBindingContext();
        }
        b f = bVar3.f();
        hgk hgkVar = this.b;
        hgkVar.b(v, childAt, m3kVar, f);
        hgkVar.a(v.a);
    }
}
