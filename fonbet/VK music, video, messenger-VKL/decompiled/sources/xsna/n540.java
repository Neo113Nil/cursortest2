package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.us2;
import xsna.v4s;

/* compiled from: MultiParagraphIntrinsics.kt */
/* loaded from: classes11.dex */
public final class n540 implements ch90 {
    public final us2 a;
    public final List<us2.d<esa0>> b;
    public final Object c;
    public final Object d;
    public final ArrayList e;

    /* JADX WARN: Multi-variable type inference failed */
    public n540(us2 us2Var, nmo0 nmo0Var, List<us2.d<esa0>> list, azl azlVar, v4s.a aVar) {
        int i;
        ArrayList arrayList;
        int i2;
        String str;
        us2 us2Var2 = us2Var;
        nmo0 nmo0Var2 = nmo0Var;
        this.a = us2Var2;
        this.b = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, new qfj(this, 22));
        this.d = msy.a(lazyThreadSafetyMode, new w4u(this, 15));
        fh90 fh90Var = nmo0Var2.b;
        us2 us2Var3 = zs2.a;
        ArrayList arrayList2 = us2Var2.e;
        String str2 = us2Var2.c;
        int i3 = 0;
        List list2 = (arrayList2 == null || (list2 = j5g.D0(new ys2(i3), arrayList2)) == null) ? EmptyList.b : list2;
        ArrayList arrayList3 = new ArrayList();
        sk3 sk3Var = new sk3();
        int size = list2.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            us2.d dVar = (us2.d) list2.get(i4);
            us2.d a = us2.d.a(dVar, fh90Var.a((fh90) dVar.a), i3, 14);
            T t = a.a;
            int i6 = a.c;
            int i7 = a.b;
            while (i5 < i7 && !sk3Var.isEmpty()) {
                us2.d dVar2 = (us2.d) sk3Var.last();
                int i8 = dVar2.c;
                List list3 = list2;
                T t2 = dVar2.a;
                if (i7 < i8) {
                    arrayList3.add(new us2.d(t2, i5, i7));
                    i5 = i7;
                    list2 = list3;
                } else {
                    int i9 = size;
                    arrayList3.add(new us2.d(t2, i5, i8));
                    i5 = dVar2.c;
                    while (!sk3Var.isEmpty() && i5 == ((us2.d) sk3Var.last()).c) {
                        sk3Var.removeLast();
                    }
                    list2 = list3;
                    size = i9;
                }
            }
            List list4 = list2;
            int i10 = size;
            if (i5 < i7) {
                arrayList3.add(new us2.d(fh90Var, i5, i7));
                i5 = i7;
            }
            us2.d dVar3 = (us2.d) sk3Var.g();
            if (dVar3 != null) {
                int i11 = dVar3.c;
                T t3 = dVar3.a;
                int i12 = dVar3.b;
                if (i12 == i7 && i11 == i6) {
                    sk3Var.removeLast();
                    sk3Var.addLast(new us2.d(((fh90) t3).a((fh90) t), i7, i6));
                } else if (i12 == i11) {
                    arrayList3.add(new us2.d(t3, i12, i11));
                    sk3Var.removeLast();
                    sk3Var.addLast(new us2.d(t, i7, i6));
                } else {
                    if (i11 < i6) {
                        throw new IllegalArgumentException();
                    }
                    sk3Var.addLast(new us2.d(((fh90) t3).a((fh90) t), i7, i6));
                }
            } else {
                sk3Var.addLast(new us2.d(t, i7, i6));
            }
            i4++;
            list2 = list4;
            size = i10;
            i3 = 0;
        }
        while (i5 <= str2.length() && !sk3Var.isEmpty()) {
            us2.d dVar4 = (us2.d) sk3Var.last();
            T t4 = dVar4.a;
            int i13 = dVar4.c;
            arrayList3.add(new us2.d(t4, i5, i13));
            while (!sk3Var.isEmpty() && i13 == ((us2.d) sk3Var.last()).c) {
                sk3Var.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str2.length()) {
            arrayList3.add(new us2.d(fh90Var, i5, str2.length()));
        }
        if (arrayList3.isEmpty()) {
            i = 0;
            arrayList3.add(new us2.d(fh90Var, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i14 = i;
        while (i14 < size2) {
            us2.d dVar5 = (us2.d) arrayList3.get(i14);
            int i15 = dVar5.b;
            int i16 = dVar5.c;
            String substring = i15 != i16 ? str2.substring(i15, i16) : "";
            List b = zs2.b(us2Var2, i15, i16, new wh1(2));
            us2 us2Var4 = new us2(substring, (List<? extends us2.d<? extends us2.a>>) (b == null ? EmptyList.b : b));
            fh90 fh90Var2 = (fh90) dVar5.a;
            if (fh90Var2.b == 0) {
                arrayList = arrayList3;
                i2 = size2;
                fh90Var2 = new fh90(fh90Var2.a, fh90Var.b, fh90Var2.c, fh90Var2.d, fh90Var2.e, fh90Var2.f, fh90Var2.g, fh90Var2.h, fh90Var2.i);
            } else {
                arrayList = arrayList3;
                i2 = size2;
            }
            nmo0 nmo0Var3 = new nmo0(nmo0Var2.a, fh90Var.a(fh90Var2));
            List list5 = us2Var4.b;
            List list6 = list5 == null ? EmptyList.b : list5;
            List<us2.d<esa0>> list7 = this.b;
            ArrayList arrayList5 = new ArrayList(list7.size());
            int size3 = list7.size();
            int i17 = 0;
            while (i17 < size3) {
                us2.d<esa0> dVar6 = list7.get(i17);
                int i18 = dVar6.b;
                fh90 fh90Var3 = fh90Var;
                int i19 = dVar6.c;
                if (zs2.c(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        vzw.a("placeholder can not overlap with paragraph.");
                    }
                    str = str2;
                    arrayList5.add(new us2.d(dVar6.a, i18 - i15, i19 - i15));
                } else {
                    str = str2;
                }
                i17++;
                fh90Var = fh90Var3;
                str2 = str;
            }
            arrayList4.add(new bh90(new bb2(substring, nmo0Var3, list6, arrayList5, aVar, azlVar), i15, i16));
            i14++;
            us2Var2 = us2Var;
            nmo0Var2 = nmo0Var;
            arrayList3 = arrayList;
            size2 = i2;
        }
        this.e = arrayList4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ch90
    public final float a() {
        return ((Number) this.d.getValue()).floatValue();
    }

    @Override // xsna.ch90
    public final boolean b() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((bh90) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ch90
    public final float c() {
        return ((Number) this.c.getValue()).floatValue();
    }
}
