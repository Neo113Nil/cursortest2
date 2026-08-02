package xsna;

import androidx.compose.runtime.a;
import com.vk.games.model.GamesCatalogScreenTab;
import xsna.dt1;
import xsna.jdt;
import xsna.q630;

/* compiled from: GamesCatalogScreen.kt */
/* loaded from: classes17.dex */
public final class tdt {
    public static final void a(final jdt.e eVar, final GamesCatalogScreenTab gamesCatalogScreenTab, final izs izsVar, final rha rhaVar, final q630 q630Var, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1984477334);
        int i2 = i | (M.J(eVar) ? 4 : 2) | (M.o(gamesCatalogScreenTab.ordinal()) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(rhaVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192) | (M.y(gzsVar) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1984477334, i2, -1, "com.vk.games.presentation.catalog.screen.GamesCatalogScreen (GamesCatalogScreen.kt:20)");
            }
            boolean z = eVar.a.b;
            boolean z2 = (i2 & 896) == 256;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new w2(izsVar, 3);
                M.R(x);
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            dt1.a.getClass();
            dge0.a(z, (gzs) x, d, null, dt1.a.f, kai.c(-1727449496, new yzs() { // from class: xsna.rdt
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1727449496, intValue, -1, "com.vk.games.presentation.catalog.screen.GamesCatalogScreen.<anonymous> (GamesCatalogScreen.kt:28)");
                        }
                        jdt.e eVar2 = jdt.e.this;
                        jdt.b bVar = eVar2.b;
                        kbt kbtVar = eVar2.a.c;
                        boolean isEmpty = bVar.a.isEmpty();
                        izs izsVar2 = izsVar;
                        q630 q630Var2 = q630Var;
                        if (!isEmpty) {
                            aVar2.K(-149726710);
                            kat.a(eVar2, izsVar2, gamesCatalogScreenTab, GamesCatalogScreenTab.CATALOG, rhaVar, q630Var2, aVar2, 3072);
                            aVar2.j();
                        } else if (kbtVar != null) {
                            aVar2.K(-149311682);
                            boolean J = aVar2.J(izsVar2);
                            Object x2 = aVar2.x();
                            if (J || x2 == a.C0011a.a) {
                                x2 = new dn7(izsVar2, 3);
                                aVar2.R(x2);
                            }
                            jbt.a(kbtVar, (gzs) x2, txj0.d(q630Var2, 1.0f), aVar2, 0);
                            aVar2.j();
                        } else {
                            aVar2.K(-149061946);
                            qyj0.a(q630Var2, aVar2, 0);
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 221568, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(gamesCatalogScreenTab, izsVar, rhaVar, q630Var, gzsVar, i) { // from class: xsna.sdt
                public final /* synthetic */ GamesCatalogScreenTab c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ rha e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ gzs g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    tdt.a(jdt.e.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
