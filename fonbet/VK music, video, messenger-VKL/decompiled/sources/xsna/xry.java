package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: LazyGridSpanLayoutProvider.kt */
/* loaded from: classes11.dex */
public final class xry {
    public final wqy a;
    public final ArrayList<a> b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public Object h;
    public int i;

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    public static final class b implements ery {
        public static final b a = new b();
        public static int b;

        @Override // xsna.ery
        public final int a() {
            return b;
        }
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    public static final class c {
        public final int a;
        public final List<tfu> b;

        public c(int i, List<tfu> list) {
            this.a = i;
            this.b = list;
        }
    }

    public xry(wqy wqyVar) {
        this.a = wqyVar;
        ArrayList<a> arrayList = new ArrayList<>();
        arrayList.add(new a(0, 0));
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.h = EmptyList.b;
    }

    public final int a() {
        return ((int) Math.sqrt((d() * 1.0d) / this.i)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r9 < r7) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c b(int i) {
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        boolean z = true;
        if (!this.a.c) {
            int i5 = this.i;
            int i6 = i * i5;
            int d = d() - i6;
            if (i5 > d) {
                i5 = d;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 == this.h.size()) {
                arrayList = this.h;
            } else {
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i7 = 0; i7 < i5; i7++) {
                    arrayList2.add(new tfu(n34.a(1)));
                }
                this.h = arrayList2;
                arrayList = arrayList2;
            }
            return new c(i6, arrayList);
        }
        int a2 = i / a();
        ArrayList<a> arrayList3 = this.b;
        int min = Math.min(a2, arrayList3.size() - 1);
        int a3 = a() * min;
        int i8 = arrayList3.get(min).a;
        int i9 = arrayList3.get(min).b;
        int i10 = this.c;
        ArrayList arrayList4 = this.g;
        if (a3 <= i10 && i10 <= i) {
            i8 = this.d;
            i9 = this.e;
            a3 = i10;
        } else if (min == this.f && (i2 = i - a3) < arrayList4.size()) {
            i8 = ((Number) arrayList4.get(i2)).intValue();
            a3 = i;
            i9 = 0;
        }
        if (a3 % a() == 0) {
            int a4 = a();
            int i11 = i - a3;
            if (2 <= i11) {
            }
        }
        z = false;
        if (z) {
            this.f = min;
            arrayList4.clear();
        }
        if (a3 > i) {
            xzw.c("currentLine (" + a3 + ") > lineIndex (" + i + ')');
        }
        while (a3 < i && i8 < d()) {
            if (z) {
                arrayList4.add(Integer.valueOf(i8));
            }
            int i12 = 0;
            while (i12 < this.i && i8 < d()) {
                if (i9 == 0) {
                    i4 = i9;
                    i9 = e(i8);
                } else {
                    i4 = 0;
                }
                i12 += i9;
                if (i12 > this.i) {
                    break;
                }
                i8++;
                i9 = i4;
            }
            a3++;
            if (a3 % a() == 0 && i8 < d()) {
                if (arrayList3.size() != a3 / a()) {
                    xzw.c("invalid starting point");
                }
                arrayList3.add(new a(i8, i9));
            }
        }
        this.c = i;
        this.d = i8;
        this.e = i9;
        ArrayList arrayList5 = new ArrayList();
        int i13 = 0;
        int i14 = i8;
        while (i13 < this.i && i14 < d()) {
            if (i9 == 0) {
                int i15 = i9;
                i9 = e(i14);
                i3 = i15;
            } else {
                i3 = 0;
            }
            i13 += i9;
            if (i13 > this.i) {
                break;
            }
            i14++;
            arrayList5.add(new tfu(n34.a(i9)));
            i9 = i3;
        }
        return new c(i8, arrayList5);
    }

    public final int c(int i) {
        int b2;
        if (d() <= 0) {
            return 0;
        }
        if (i >= d()) {
            xzw.a("ItemIndex > total count");
        }
        if (!this.a.c) {
            return i / this.i;
        }
        c9 c9Var = new c9(i, 1);
        ArrayList<a> arrayList = this.b;
        b2 = e43.b(arrayList.size(), arrayList, c9Var);
        if (b2 < 0) {
            b2 = (-b2) - 2;
        }
        int a2 = a() * b2;
        int i2 = arrayList.get(b2).a;
        if (i2 > i) {
            xzw.a("currentItemIndex > itemIndex");
        }
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            int e = e(i2);
            i3 += e;
            int i5 = this.i;
            if (i3 >= i5) {
                if (i3 == i5) {
                    a2++;
                    i3 = 0;
                } else {
                    a2++;
                    i3 = e;
                }
            }
            if (a2 % a() == 0 && a2 / a() >= arrayList.size()) {
                arrayList.add(new a(i4 - (i3 <= 0 ? 0 : 1), 0));
            }
            i2 = i4;
        }
        return e(i) + i3 > this.i ? a2 + 1 : a2;
    }

    public final int d() {
        return this.a.b.b;
    }

    public final int e(int i) {
        b.b = this.i;
        nox b2 = this.a.b.b(i);
        int i2 = i - b2.a;
        return (int) ((vqy) b2.c).b.invoke(b.a, Integer.valueOf(i2)).a;
    }
}
