package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public interface brr extends ghl0 {
    @Override // defpackage.ghl0
    default void a(int i, int[] iArr, int[] iArr2, k kVar) {
        crr crrVar = (crr) this;
        if (crrVar.a) {
            crrVar.b.u(kVar, i, iArr, kVar.getLayoutDirection(), iArr2);
        } else {
            crrVar.c.m(kVar, i, iArr, iArr2);
        }
    }

    @Override // defpackage.ghl0
    default long c(int i, int i2, int i3, boolean z) {
        if (((crr) this).a) {
            lhl0 lhl0Var = khl0.a;
            return !z ? p8e.a(i, i2, 0, i3) : qje.m(i, i2, 0, i3);
        }
        sic sicVar = qic.a;
        return !z ? p8e.a(0, i3, i, i2) : qje.l(0, i3, i, i2);
    }

    @Override // defpackage.ghl0
    default int d(o oVar) {
        return ((crr) this).a ? oVar.m0() : oVar.n0();
    }

    @Override // defpackage.ghl0
    default int h(o oVar) {
        return ((crr) this).a ? oVar.n0() : oVar.m0();
    }

    @Override // defpackage.ghl0
    default aa10 j(final o[] oVarArr, k kVar, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        aa10 w;
        boolean z = ((crr) this).a;
        if (z) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
        }
        final LayoutDirection layoutDirection = z ? LayoutDirection.Ltr : kVar.getLayoutDirection();
        w = kVar.w(i7, i6, b.f(), new tls() { // from class: arr
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                vtb1 vtb1Var;
                o.a aVar = (o.a) obj;
                int[] iArr3 = iArr2;
                int i8 = iArr3 != null ? iArr3[i3] : 0;
                int i9 = i4;
                for (int i10 = i9; i10 < i5; i10++) {
                    o oVar = oVarArr[i10];
                    Object a = oVar.a();
                    hhl0 hhl0Var = a instanceof hhl0 ? (hhl0) a : null;
                    brr brrVar = this;
                    if (hhl0Var == null || (vtb1Var = hhl0Var.c) == null) {
                        vtb1Var = ((crr) brrVar).e;
                    }
                    int b = vtb1Var.b(i2, brrVar.d(oVar), layoutDirection) + i8;
                    boolean z2 = ((crr) brrVar).a;
                    int[] iArr4 = iArr;
                    if (z2) {
                        aVar.g(oVar, iArr4[i10 - i9], b, 0.0f);
                    } else {
                        aVar.g(oVar, b, iArr4[i10 - i9], 0.0f);
                    }
                }
                return zy11.a;
            }
        });
        return w;
    }
}
