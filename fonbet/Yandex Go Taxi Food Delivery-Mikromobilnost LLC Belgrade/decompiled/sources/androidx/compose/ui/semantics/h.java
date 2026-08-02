package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.nnq0;
import defpackage.pzo;
import defpackage.rvr;
import defpackage.scc;
import defpackage.tls;
import defpackage.wls;
import defpackage.wx40;
import defpackage.xcc;
import defpackage.y5w;
import defpackage.z0y;
import defpackage.zii0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes10.dex */
public abstract class h {
    public static final Comparator[] a;
    public static final wls b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            rvr rvrVar = i == 0 ? rvr.w : rvr.c;
            z0y z0yVar = LayoutNode.m0;
            comparatorArr[i] = new pzo(4, new pzo(rvrVar));
            i++;
        }
        a = comparatorArr;
        b = SemanticsSortKt$UnmergedConfigComparator$1.w;
    }

    public static final void a(c cVar, ArrayList arrayList, tls tlsVar, tls tlsVar2, wx40 wx40Var) {
        boolean booleanValue = ((Boolean) cVar.d.e(d.n, SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1.w)).booleanValue();
        if ((booleanValue || ((Boolean) tlsVar2.invoke(cVar)).booleanValue()) && ((Boolean) tlsVar.invoke(cVar)).booleanValue()) {
            arrayList.add(cVar);
        }
        if (booleanValue) {
            wx40Var.i(cVar.f, b(cVar, tlsVar, tlsVar2, c.j(cVar, 7)));
            return;
        }
        List j = c.j(cVar, 7);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            a((c) j.get(i), arrayList, tlsVar, tlsVar2, wx40Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee A[LOOP:1: B:11:0x0044->B:29:0x00ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4 A[EDGE_INSN: B:30:0x00f4->B:31:0x00f4 BREAK  A[LOOP:1: B:11:0x0044->B:29:0x00ee], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(c cVar, tls tlsVar, tls tlsVar2, List list) {
        wx40 a2 = y5w.a();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((c) list.get(i), arrayList, tlsVar, tlsVar2, a2);
        }
        char c = cVar.c.S == LayoutDirection.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int f = scc.f(arrayList);
        if (f >= 0) {
            int i2 = 0;
            while (true) {
                c cVar2 = (c) arrayList.get(i2);
                if (i2 != 0) {
                    float f2 = cVar2.h().b;
                    float f3 = cVar2.h().d;
                    boolean z = f2 >= f3;
                    int f4 = scc.f(arrayList2);
                    if (f4 >= 0) {
                        int i3 = 0;
                        while (true) {
                            zii0 zii0Var = (zii0) ((Pair) arrayList2.get(i3)).c();
                            float f5 = zii0Var.b;
                            float f6 = zii0Var.d;
                            boolean z2 = f5 >= f6;
                            if (!z && !z2 && Math.max(f2, f5) < Math.min(f3, f6)) {
                                arrayList2.set(i3, new Pair(new zii0(Math.max(zii0Var.a, 0.0f), Math.max(zii0Var.b, f2), Math.min(zii0Var.c, Float.POSITIVE_INFINITY), Math.min(f6, f3)), ((Pair) arrayList2.get(i3)).f()));
                                ((List) ((Pair) arrayList2.get(i3)).f()).add(cVar2);
                                break;
                            }
                            if (i3 == f4) {
                                break;
                            }
                            i3++;
                        }
                        if (i2 != f) {
                            break;
                        }
                        i2++;
                    }
                }
                arrayList2.add(new Pair(cVar2.h(), scc.i(cVar2)));
                if (i2 != f) {
                }
            }
        }
        xcc.q(arrayList2, rvr.x);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Pair pair = (Pair) arrayList2.get(i4);
            xcc.q((List) pair.f(), comparator);
            arrayList3.addAll((Collection) pair.f());
        }
        int i5 = 0;
        xcc.q(arrayList3, new nnq0(b, 0));
        while (i5 <= scc.f(arrayList3)) {
            List list2 = (List) a2.b(((c) arrayList3.get(i5)).f);
            if (list2 != null) {
                if (((Boolean) tlsVar2.invoke(arrayList3.get(i5))).booleanValue()) {
                    i5++;
                } else {
                    arrayList3.remove(i5);
                }
                arrayList3.addAll(i5, list2);
                i5 += list2.size();
            } else {
                i5++;
            }
        }
        return arrayList3;
    }
}
