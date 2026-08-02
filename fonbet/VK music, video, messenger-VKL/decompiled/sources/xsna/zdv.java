package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import xsna.aa90;
import xsna.q630;
import xsna.udt;
import xsna.x9k0;

/* compiled from: HorizontalGameBannerSectionHolder.kt */
/* loaded from: classes17.dex */
public final class zdv {
    public static final float a;

    static {
        float f = kqu0.a;
        a = kqu0.t;
    }

    public static final void a(final izs izsVar, final udt.d dVar, final b7t b7tVar, final xvy xvyVar, final rha rhaVar, final boolean z, final boolean z2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-953161874);
        int i2 = i | (M.y(izsVar) ? 4 : 2) | (M.J(dVar) ? 32 : 16) | (M.J(b7tVar) ? 256 : 128) | (M.J(xvyVar) ? 2048 : 1024) | (M.J(rhaVar) ? 16384 : 8192) | (M.l(z) ? 131072 : 65536) | (M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(q630Var) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-953161874, i2, -1, "com.vk.games.presentation.components.items.HorizontalGameBannerItems (HorizontalGameBannerSectionHolder.kt:34)");
            }
            int size = dVar.b.size() * 1000;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new jrh(dVar, 16);
                M.R(x);
            }
            final yjl b = rc90.b(size, (gzs) x, M, 0, 2);
            if (rhaVar.b) {
                M.K(-1617751148);
            } else {
                M.K(-1615964990);
                Integer valueOf = Integer.valueOf(b.k());
                boolean J = (i3 == 32) | M.J(b) | ((i2 & 14) == 4);
                Object x2 = M.x();
                if (J || x2 == c0012a) {
                    x2 = new ydv(b, dVar, izsVar, null);
                    M.R(x2);
                }
                bap.g(valueOf, (wzs) x2, M, 0);
            }
            M.j();
            yo5.a(b, z2, M, (i2 >> 15) & 112);
            aVar2 = M;
            nb90.a(b, ahn.E(q630Var, "horizontalBannerFeaturing"), null, new aa90.b(b7tVar.a), 0, a, null, null, false, null, null, x9k0.a.a, null, kai.c(-2012257459, new zzs() { // from class: xsna.wdv
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    k6t k6tVar;
                    izs izsVar2;
                    int intValue = ((Integer) obj2).intValue();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2012257459, intValue2, -1, "com.vk.games.presentation.components.items.HorizontalGameBannerItems.<anonymous> (HorizontalGameBannerSectionHolder.kt:58)");
                    }
                    udt.d dVar2 = udt.d.this;
                    int size2 = intValue % dVar2.b.size();
                    l6t l6tVar = (l6t) dVar2.b.get(size2);
                    rha rhaVar2 = rhaVar;
                    boolean z4 = rhaVar2.d;
                    boolean z5 = rhaVar2.b;
                    q630 q630Var2 = q630.a.a;
                    izs izsVar3 = izsVar;
                    boolean z6 = z;
                    b7t b7tVar2 = b7tVar;
                    xvy xvyVar2 = xvyVar;
                    yjl yjlVar = b;
                    boolean z7 = z2;
                    Object obj5 = a.C0011a.a;
                    if (z4) {
                        aVar3.K(1991738998);
                        k6t k6tVar2 = new k6t(z6, b7tVar2, size2, intValue);
                        String str = dVar2.a;
                        float f = rhaVar2.c;
                        boolean J2 = aVar3.J(izsVar3) | aVar3.J(l6tVar);
                        Object x3 = aVar3.x();
                        if (J2 || x3 == obj5) {
                            x3 = new ig1(15, izsVar3, l6tVar);
                            aVar3.R(x3);
                        }
                        gzs gzsVar = (gzs) x3;
                        boolean J3 = aVar3.J(izsVar3) | aVar3.J(l6tVar);
                        Object x4 = aVar3.x();
                        if (J3 || x4 == obj5) {
                            x4 = new p5(12, izsVar3, l6tVar);
                            aVar3.R(x4);
                        }
                        gzs gzsVar2 = (gzs) x4;
                        if (z5) {
                            izsVar2 = izsVar3;
                            q630Var2 = vbh0.g(q630Var2, xvyVar2, yjlVar, z7, f, str, gzsVar, gzsVar2, 8);
                        } else {
                            izsVar2 = izsVar3;
                            float f2 = vbh0.a;
                        }
                        a7t.a(l6tVar, izsVar2, k6tVar2, q630Var2, aVar3, 0);
                        aVar3.j();
                    } else {
                        aVar3.K(1992727898);
                        k6t k6tVar3 = new k6t(z6, b7tVar2, size2, intValue);
                        String str2 = dVar2.a;
                        float f3 = rhaVar2.c;
                        boolean J4 = aVar3.J(izsVar3) | aVar3.J(l6tVar);
                        Object x5 = aVar3.x();
                        if (J4 || x5 == obj5) {
                            x5 = new com.vk.movika.sdk.base.presenter.c(12, izsVar3, l6tVar);
                            aVar3.R(x5);
                        }
                        gzs gzsVar3 = (gzs) x5;
                        boolean J5 = aVar3.J(izsVar3) | aVar3.J(l6tVar);
                        Object x6 = aVar3.x();
                        if (J5 || x6 == obj5) {
                            x6 = new zv(11, izsVar3, l6tVar);
                            aVar3.R(x6);
                        }
                        gzs gzsVar4 = (gzs) x6;
                        if (z5) {
                            k6tVar = k6tVar3;
                            q630Var2 = vbh0.g(q630Var2, xvyVar2, yjlVar, z7, f3, str2, gzsVar3, gzsVar4, 8);
                        } else {
                            k6tVar = k6tVar3;
                            float f4 = vbh0.a;
                        }
                        x6t.a(l6tVar, izsVar3, k6tVar, q630Var2, aVar3, 0);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 196608, 24960, 12244);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(dVar, b7tVar, xvyVar, rhaVar, z, z2, q630Var, i) { // from class: xsna.xdv
                public final /* synthetic */ udt.d c;
                public final /* synthetic */ b7t d;
                public final /* synthetic */ xvy e;
                public final /* synthetic */ rha f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ q630 i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    zdv.a(izs.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
