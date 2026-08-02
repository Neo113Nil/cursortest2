package xsna;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* compiled from: SemanticsSort.kt */
/* loaded from: classes11.dex */
public final class wgi0 {
    public static final Comparator<igi0>[] a;
    public static final a b;

    /* compiled from: SemanticsSort.kt */
    public static final class a extends Lambda implements wzs<igi0, igi0, Integer> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final Integer invoke(igi0 igi0Var, igi0 igi0Var2) {
            xfi0 xfi0Var = igi0Var.d;
            sgi0<Float> sgi0Var = ngi0.u;
            return Integer.valueOf(Float.compare(((Number) xfi0Var.d(sgi0Var, ugi0.i)).floatValue(), ((Number) igi0Var2.d.d(sgi0Var, vgi0.i)).floatValue()));
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        public final /* synthetic */ Comparator b;

        public b(Comparator comparator) {
            LayoutNode.c cVar = LayoutNode.S;
            this.b = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.b.compare(t, t2);
            return compare != 0 ? compare : LayoutNode.V.compare(((igi0) t).c, ((igi0) t2).c);
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class c<T> implements Comparator {
        public final /* synthetic */ b b;

        public c(b bVar) {
            this.b = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.b.compare(t, t2);
            return compare != 0 ? compare : jw5.b(Integer.valueOf(((igi0) t).f), Integer.valueOf(((igi0) t2).f));
        }
    }

    static {
        Comparator<igi0>[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            Comparator comparator = i == 0 ? wpg0.c : t900.c;
            LayoutNode.c cVar = LayoutNode.S;
            comparatorArr[i] = new c(new b(comparator));
            i++;
        }
        a = comparatorArr;
        b = a.i;
    }

    public static final void a(igi0 igi0Var, ArrayList arrayList, d62 d62Var, e62 e62Var, pg50 pg50Var) {
        boolean booleanValue = ((Boolean) igi0Var.d.d(ngi0.n, xgi0.i)).booleanValue();
        if ((booleanValue || ((Boolean) e62Var.invoke(igi0Var)).booleanValue()) && ((Boolean) d62Var.invoke(igi0Var)).booleanValue()) {
            arrayList.add(igi0Var);
        }
        if (booleanValue) {
            pg50Var.k(igi0Var.f, b(igi0Var, d62Var, e62Var, igi0.j(7, igi0Var)));
            return;
        }
        List j = igi0.j(7, igi0Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            a((igi0) j.get(i), arrayList, d62Var, e62Var, pg50Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee A[LOOP:1: B:11:0x0044->B:29:0x00ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4 A[EDGE_INSN: B:30:0x00f4->B:31:0x00f4 BREAK  A[LOOP:1: B:11:0x0044->B:29:0x00ee], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(igi0 igi0Var, d62 d62Var, e62 e62Var, List list) {
        pg50 a2 = g9x.a();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((igi0) list.get(i), arrayList, d62Var, e62Var, a2);
        }
        char c2 = igi0Var.c.A == LayoutDirection.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int h = e43.h(arrayList);
        if (h >= 0) {
            int i2 = 0;
            while (true) {
                igi0 igi0Var2 = (igi0) arrayList.get(i2);
                if (i2 != 0) {
                    float f = igi0Var2.h().b;
                    float f2 = igi0Var2.h().d;
                    boolean z = f >= f2;
                    int h2 = e43.h(arrayList2);
                    if (h2 >= 0) {
                        int i3 = 0;
                        while (true) {
                            zhf0 zhf0Var = (zhf0) ((Pair) arrayList2.get(i3)).i();
                            float f3 = zhf0Var.b;
                            float f4 = zhf0Var.d;
                            boolean z2 = f3 >= f4;
                            if (!z && !z2 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i3, new Pair(new zhf0(Math.max(zhf0Var.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Math.max(zhf0Var.b, f), Math.min(zhf0Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((Pair) arrayList2.get(i3)).j()));
                                ((List) ((Pair) arrayList2.get(i3)).j()).add(igi0Var2);
                                break;
                            }
                            if (i3 == h2) {
                                break;
                            }
                            i3++;
                        }
                        if (i2 != h) {
                            break;
                        }
                        i2++;
                    }
                }
                arrayList2.add(new Pair(igi0Var2.h(), e43.o(igi0Var2)));
                if (i2 != h) {
                }
            }
        }
        g5g.L(arrayList2, h8p0.c);
        ArrayList arrayList3 = new ArrayList();
        Comparator<igi0> comparator = a[c2 ^ 1];
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Pair pair = (Pair) arrayList2.get(i4);
            g5g.L((List) pair.j(), comparator);
            arrayList3.addAll((Collection) pair.j());
        }
        g5g.L(arrayList3, new com.vk.movika.tools.controls.seekbar.e(1, b));
        int i5 = 0;
        while (i5 <= e43.h(arrayList3)) {
            List list2 = (List) a2.b(((igi0) arrayList3.get(i5)).f);
            if (list2 != null) {
                if (((Boolean) e62Var.invoke(arrayList3.get(i5))).booleanValue()) {
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
