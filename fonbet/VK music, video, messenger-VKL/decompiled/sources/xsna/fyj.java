package xsna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.tra0;

/* compiled from: CountersBlock.kt */
/* loaded from: classes16.dex */
public final class fyj implements cp10 {
    public static final fyj a = new fyj();

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        public final /* synthetic */ ArrayList b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int intValue = ((Number) t).intValue();
            ArrayList arrayList = this.b;
            return jw5.b((Integer) arrayList.get(intValue), (Integer) arrayList.get(((Number) t2).intValue()));
        }
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        final int r0 = ep10Var.r0(4);
        List<? extends zo10> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (zo10 zo10Var : list2) {
            arrayList.add(new q9x((zo10Var.Z(o6j.i(j)) & 4294967295L) | (zo10Var.l0(o6j.h(j)) << 32)));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int i = (int) (((q9x) next).a & 4294967295L);
            do {
                Object next2 = it.next();
                int i2 = (int) (((q9x) next2).a & 4294967295L);
                if (i < i2) {
                    next = next2;
                    i = i2;
                }
            } while (it.hasNext());
        }
        final int i3 = (int) (((q9x) next).a & 4294967295L);
        int h = o6j.h(j);
        if (i3 > h) {
            i3 = h;
        }
        int i4 = o6j.i(j) - ((e43.g(list).c + 2) * r0);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf((int) (((q9x) it2.next()).a >> 32)));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        int size = arrayList3.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = i5;
        }
        a aVar = new a(arrayList3);
        Integer[] B = jw5.B(iArr);
        jw5.A(B, aVar);
        List asList = Arrays.asList(B);
        int size2 = asList.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size2) {
                break;
            }
            int intValue = ((Number) arrayList3.get(((Number) asList.get(i6)).intValue())).intValue();
            int size3 = arrayList3.size() - i6;
            if ((intValue * size3) + i7 > i4) {
                int i8 = (i4 - i7) / size3;
                int size4 = asList.size();
                while (i6 < size4) {
                    arrayList3.set(((Number) asList.get(i6)).intValue(), Integer.valueOf(i8));
                    i6++;
                }
            } else {
                i7 += intValue;
                arrayList3.set(((Number) asList.get(i6)).intValue(), Integer.valueOf(intValue));
                i6++;
            }
        }
        final ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
        int i9 = 0;
        for (Object obj : list2) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                e43.t();
                throw null;
            }
            zo10 zo10Var2 = (zo10) obj;
            Integer num = (Integer) j5g.b0(i9, arrayList3);
            int intValue2 = num != null ? num.intValue() : 0;
            if (intValue2 < 0) {
                wzw.a("width must be >= 0");
            }
            arrayList4.add(zo10Var2.N(s6j.h(intValue2, intValue2, 0, Integer.MAX_VALUE)));
            i9 = i10;
        }
        int F0 = i4 - j5g.F0(arrayList3);
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = (F0 / 2) + r0;
        return ep10Var.Q(o6j.i(j), i3, jgp.b, new izs() { // from class: xsna.eyj
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                tra0.a aVar2 = (tra0.a) obj2;
                for (tra0 tra0Var : arrayList4) {
                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                    tra0.a.x(aVar2, tra0Var, ref$IntRef2.element, (i3 - tra0Var.m0()) / 2);
                    ref$IntRef2.element = tra0Var.n0() + r0 + ref$IntRef2.element;
                }
                return s3q0.a;
            }
        });
    }
}
