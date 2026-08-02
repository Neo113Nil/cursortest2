package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vk.core.compose.component.tile.TileContentType;
import xsna.iev;
import xsna.q630;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class moa implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ moa(int i, tpo tpoVar) {
        this.c = i;
        this.d = tpoVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((noa) this.d).g(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                final tpo tpoVar = (tpo) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1006565513, intValue, -1, "com.vk.catalog2.feature.music.holders.MusicDynamicGridItemVh.bind.<anonymous>.<anonymous> (MusicDynamicGridItemVh.kt:50)");
                    }
                    q630 E = s200.E(txj0.f(q630.a.a, 1.0f), pj40.n, pj40.o);
                    final int i = this.c;
                    ua8.a(E, null, false, kai.c(1103877473, new yzs() { // from class: xsna.nj40
                        @Override // xsna.yzs
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            va8 va8Var = (va8) obj3;
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= aVar2.J(va8Var) ? 4 : 2;
                            }
                            if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1103877473, intValue2, -1, "com.vk.catalog2.feature.music.holders.MusicDynamicGridItemVh.bind.<anonymous>.<anonymous>.<anonymous> (MusicDynamicGridItemVh.kt:58)");
                                }
                                float f = ((pco) swe0.c(new pco(va8Var.j() - pj40.p), new pco(0))).b;
                                TileContentType tileContentType = TileContentType.Avatar;
                                tpo tpoVar2 = tpoVar;
                                yq5 a = HorizontalListItem$VisualContent.a.a(new oj40(tpoVar2), null, null, 0, aVar2, 0, 30);
                                long b = byc0.b(f, f);
                                us2.b b2 = xga0.b(-30615093, aVar2);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                }
                                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                int m = b2.m(wuv0Var.T.a.a);
                                try {
                                    b2.g(tpoVar2.a);
                                    s3q0 s3q0Var = s3q0.a;
                                    b2.k(m);
                                    us2 n = b2.n();
                                    aVar2.j();
                                    Object x = aVar2.x();
                                    a.C0011a.C0012a c0012a = a.C0011a.a;
                                    if (x == c0012a) {
                                        x = new g53(28);
                                        aVar2.R(x);
                                    }
                                    u3k0 b3 = iev.c.b(null, n, null, null, 0, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), aVar2, 0, 29);
                                    q630 f2 = txj0.f(q630.a.a, 1.0f);
                                    int i2 = i;
                                    boolean o = aVar2.o(i2);
                                    Object x2 = aVar2.x();
                                    if (o || x2 == c0012a) {
                                        x2 = new ueo(i2, 1);
                                        aVar2.R(x2);
                                    }
                                    asv0.d(tileContentType, a, b, b3, egi0.b(f2, false, (izs) x2), false, false, null, null, null, aVar2, 6, 992);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } catch (Throwable th) {
                                    b2.k(m);
                                    throw th;
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar), aVar, 3078, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ moa(noa noaVar, int i) {
        this.d = noaVar;
        this.c = i;
    }
}
