package xsna;

import java.util.ArrayList;

/* compiled from: LazyLayoutStickyItems.kt */
/* loaded from: classes11.dex */
public interface xel0 {

    /* compiled from: LazyLayoutStickyItems.kt */
    public static final class a {
        public static final C3999a a = new C3999a();

        /* compiled from: LazyLayoutStickyItems.kt */
        /* renamed from: xsna.xel0$a$a, reason: collision with other inner class name */
        public static final class C3999a implements xel0 {
            @Override // xsna.xel0
            public final int a(ArrayList arrayList, int i, int i2, int i3, int i4) {
                Object obj;
                int i5;
                int size = arrayList.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i6);
                    if (((rty) obj).getIndex() != i) {
                        break;
                    }
                    i6++;
                }
                rty rtyVar = (rty) obj;
                if (rtyVar != null) {
                    long o = rtyVar.o(0);
                    i5 = (int) (rtyVar.h() ? o & 4294967295L : o >> 32);
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                int max = i3 == Integer.MIN_VALUE ? -i4 : Math.max(-i4, i3);
                return i5 != Integer.MIN_VALUE ? Math.min(max, i5 - i2) : max;
            }

            @Override // xsna.xel0
            public final ng50 b(int i, int i2, a9x a9xVar) {
                int i3;
                if (i2 - i < 0 || (i3 = a9xVar.b) == 0) {
                    return b9x.a;
                }
                k9x q = swe0.q(0, i3);
                int i4 = q.b;
                int i5 = q.c;
                int i6 = -1;
                if (i4 <= i5) {
                    while (a9xVar.a(i4) <= i) {
                        i6 = a9xVar.a(i4);
                        if (i4 == i5) {
                            break;
                        }
                        i4++;
                    }
                }
                if (i6 == -1) {
                    return b9x.a;
                }
                ng50 ng50Var = b9x.a;
                ng50 ng50Var2 = new ng50(1);
                ng50Var2.c(i6);
                return ng50Var2;
            }
        }
    }

    int a(ArrayList arrayList, int i, int i2, int i3, int i4);

    ng50 b(int i, int i2, a9x a9xVar);
}
