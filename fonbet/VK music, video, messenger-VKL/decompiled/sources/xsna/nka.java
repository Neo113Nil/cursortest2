package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.SegmentSize;
import java.util.ArrayList;
import xsna.q630;

/* compiled from: CategoriesTabBar.kt */
/* loaded from: classes18.dex */
public final class nka {
    public static final void a(final int i, final ArrayList arrayList, final izs izsVar, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> mkaVar;
        androidx.compose.runtime.a M = aVar.M(323648677);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.J(arrayList) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(323648677, i3, -1, "com.vk.ecomm.categories.impl.presentation.ui.CategoriesTabBar (CategoriesTabBar.kt:23)");
            }
            if (arrayList.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    mkaVar = new kka(i, arrayList, izsVar, i2);
                    s.d = mkaVar;
                }
                return;
            }
            ejv0.a(s200.E(q630.a.a, kqu0.b, kqu0.c), Integer.valueOf(i), false, SegmentSize.Large, kai.c(-2087011662, new yzs() { // from class: xsna.lka
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    y4i0 y4i0Var = (y4i0) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(y4i0Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2087011662, intValue, -1, "com.vk.ecomm.categories.impl.presentation.ui.CategoriesTabBar.<anonymous> (CategoriesTabBar.kt:33)");
                        }
                        ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        final int i4 = 0;
                        while (i4 < size) {
                            String str = (String) arrayList2.get(i4);
                            boolean z = i4 == i;
                            final izs izsVar2 = izsVar;
                            boolean J = aVar2.J(izsVar2) | aVar2.o(i4);
                            Object x = aVar2.x();
                            if (J || x == a.C0011a.a) {
                                x = new gzs() { // from class: xsna.hka
                                    @Override // xsna.gzs
                                    public final Object invoke() {
                                        izs.this.invoke(Integer.valueOf(i4));
                                        return s3q0.a;
                                    }
                                };
                                aVar2.R(x);
                            }
                            nka.b(intValue & 14, aVar2, str, (gzs) x, y4i0Var, z);
                            i4++;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 << 3) & 112) | 27648, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            mkaVar = new mka(i, arrayList, izsVar, i2);
            s.d = mkaVar;
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final String str, final gzs gzsVar, final y4i0 y4i0Var, final boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1658319761);
        if ((i & 6) == 0) {
            i2 = (M.J(y4i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1658319761, i2, -1, "com.vk.ecomm.categories.impl.presentation.ui.TabBarSegment (CategoriesTabBar.kt:40)");
            }
            y4i0Var.c(z, gzsVar, kai.c(-1971512503, new ika(str, 0), M), null, M, ((i2 >> 3) & 14) | 384 | ((i2 >> 6) & 112) | ((i2 << 12) & 57344), 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.jka
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    nka.b(ne7.I(i | 1), (androidx.compose.runtime.a) obj, str, gzsVar, y4i0Var, z);
                    return s3q0.a;
                }
            };
        }
    }
}
