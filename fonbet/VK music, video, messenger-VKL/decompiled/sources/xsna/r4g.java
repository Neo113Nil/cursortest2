package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import xsna.am;

/* compiled from: CollectionInfo.android.kt */
/* loaded from: classes11.dex */
public final class r4g {

    /* compiled from: CollectionInfo.android.kt */
    public static final class a extends Lambda implements gzs<Boolean> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final boolean a(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = EmptyList.b;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int h = e43.h(arrayList);
                int i = 0;
                while (i < h) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    igi0 igi0Var = (igi0) obj2;
                    igi0 igi0Var2 = (igi0) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (igi0Var2.g().c() >> 32)) - Float.intBitsToFloat((int) (igi0Var.g().c() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (igi0Var2.g().c() & 4294967295L)) - Float.intBitsToFloat((int) (igi0Var.g().c() & 4294967295L)));
                    arrayList2.add(new ov70((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((ov70) j5g.Y(list)).a;
            } else {
                if (list.isEmpty()) {
                    hgz.d("Empty collection can't be reduced.");
                }
                Object Y = j5g.Y(list);
                int h2 = e43.h(list);
                if (1 <= h2) {
                    int i2 = 1;
                    while (true) {
                        Y = new ov70(ov70.f(((ov70) Y).a, ((ov70) list.get(i2)).a));
                        if (i2 == h2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((ov70) Y).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void b(am amVar, igi0 igi0Var) {
        q4g q4gVar = (q4g) zfi0.a(igi0Var.k(), ngi0.f);
        if (q4gVar != null) {
            amVar.p(am.g.a(q4gVar.a, q4gVar.b, 0, false));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (zfi0.a(igi0Var.k(), ngi0.e) != null) {
            List j = igi0.j(4, igi0Var);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                igi0 igi0Var2 = (igi0) j.get(i);
                if (igi0Var2.k().b.b(ngi0.J)) {
                    arrayList.add(igi0Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean a2 = a(arrayList);
        amVar.p(am.g.a(a2 ? 1 : arrayList.size(), a2 ? arrayList.size() : 1, 0, false));
    }

    public static final void c(am amVar, igi0 igi0Var) {
        t4g t4gVar = (t4g) zfi0.a(igi0Var.k(), ngi0.g);
        if (t4gVar != null) {
            amVar.q(am.h.a(t4gVar.a, 1, 0, 1, ((Boolean) igi0Var.k().d(ngi0.J, s4g.i)).booleanValue()));
        }
        igi0 l = igi0Var.l();
        if (l == null || zfi0.a(l.k(), ngi0.e) == null) {
            return;
        }
        q4g q4gVar = (q4g) zfi0.a(l.k(), ngi0.f);
        if (q4gVar == null || (q4gVar.a >= 0 && q4gVar.b >= 0)) {
            if (igi0Var.k().b.b(ngi0.J)) {
                ArrayList arrayList = new ArrayList();
                List j = igi0.j(4, l);
                int size = j.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    igi0 igi0Var2 = (igi0) j.get(i2);
                    if (igi0Var2.k().b.b(ngi0.J)) {
                        arrayList.add(igi0Var2);
                        if (igi0Var2.c.J() < igi0Var.c.J()) {
                            i++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean a2 = a(arrayList);
                amVar.q(am.h.a(a2 ? 0 : i, 1, a2 ? i : 0, 1, ((Boolean) igi0Var.k().d(ngi0.J, a.i)).booleanValue()));
            }
        }
    }
}
