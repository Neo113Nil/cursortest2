package defpackage;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class mb70 extends gc70 {
    public static final mb70 c = new mb70(1, 0, 2);

    @Override // defpackage.gc70
    public final void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        int[] iArr;
        yss yssVar;
        int c2;
        int a = vc70Var.a(0);
        if (ows0Var.n != 0) {
            lid.a("Cannot move a group while inserting");
        }
        if (a < 0) {
            lid.a("Parameter offset is out of bounds");
        }
        if (a == 0) {
            return;
        }
        int i = ows0Var.t;
        int i2 = ows0Var.v;
        int i3 = ows0Var.u;
        int i4 = i;
        while (true) {
            iArr = ows0Var.b;
            if (a <= 0) {
                break;
            }
            i4 += uus0.a(ows0Var.r(i4), iArr);
            if (i4 > i3) {
                lid.a("Parameter offset is out of bounds");
            }
            a--;
        }
        int a2 = uus0.a(ows0Var.r(i4), iArr);
        int g = ows0Var.g(ows0Var.r(ows0Var.t), ows0Var.b);
        int g2 = ows0Var.g(ows0Var.r(i4), ows0Var.b);
        int i5 = i4 + a2;
        int g3 = ows0Var.g(ows0Var.r(i5), ows0Var.b);
        int i6 = g3 - g2;
        ows0Var.x(i6, Math.max(ows0Var.t - 1, 0));
        ows0Var.w(a2);
        int[] iArr2 = ows0Var.b;
        int r = ows0Var.r(i5) * 5;
        f73.d(ows0Var.r(i) * 5, r, (a2 * 5) + r, iArr2, iArr2);
        if (i6 > 0) {
            Object[] objArr = ows0Var.c;
            int h = ows0Var.h(g2 + i6);
            System.arraycopy(objArr, h, objArr, g, ows0Var.h(g3 + i6) - h);
        }
        int i7 = g2 + i6;
        int i8 = i7 - g;
        int i9 = ows0Var.k;
        int i10 = ows0Var.l;
        int length = ows0Var.c.length;
        int i11 = ows0Var.m;
        int i12 = i + a2;
        int i13 = i;
        while (i13 < i12) {
            int r2 = ows0Var.r(i13);
            int i14 = i8;
            int[] iArr3 = iArr2;
            iArr3[(r2 * 5) + 4] = ows0.i(ows0.i(ows0Var.g(r2, iArr2) - i14, i11 < r2 ? 0 : i9, i10, length), ows0Var.k, ows0Var.l, ows0Var.c.length);
            i13++;
            i8 = i14;
            iArr2 = iArr3;
            i9 = i9;
        }
        int i15 = i5 + a2;
        int p = ows0Var.p();
        int b = uus0.b(i5, p, ows0Var.d);
        ArrayList arrayList = new ArrayList();
        if (b >= 0) {
            while (b < ows0Var.d.size() && (c2 = ows0Var.c((yssVar = (yss) ows0Var.d.get(b)))) >= i5 && c2 < i15) {
                arrayList.add(yssVar);
            }
        }
        int i16 = i - i5;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            yss yssVar2 = (yss) arrayList.get(i17);
            int c3 = ows0Var.c(yssVar2) + i16;
            if (c3 >= ows0Var.g) {
                yssVar2.a = -(p - c3);
            } else {
                yssVar2.a = c3;
            }
            ows0Var.d.add(uus0.b(c3, p, ows0Var.d), yssVar2);
        }
        if (ows0Var.K(i5, a2)) {
            lid.a("Unexpectedly removed anchors");
        }
        ows0Var.m(i2, ows0Var.u, i);
        if (i6 > 0) {
            ows0Var.L(i7, i6, i5 - 1);
        }
    }
}
