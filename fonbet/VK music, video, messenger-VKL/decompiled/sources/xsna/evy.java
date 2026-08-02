package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.dt1;
import xsna.q630;
import xsna.xel0;

/* compiled from: LazyList.kt */
/* loaded from: classes11.dex */
public final class evy {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final q630 q630Var, xvy xvyVar, final s890 s890Var, final boolean z, final tpr tprVar, final boolean z2, final e490 e490Var, dt1.b bVar, a.n nVar, dt1.c cVar, a.e eVar, final izs izsVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        androidx.compose.runtime.a aVar2;
        final dt1.b bVar2;
        final a.n nVar2;
        final dt1.c cVar2;
        final a.e eVar2;
        int i8;
        int i9;
        dt1.b bVar3;
        a.n nVar3;
        dt1.c cVar3;
        int i10;
        a.e eVar3;
        int i11;
        int i12;
        boolean z3;
        Object x;
        a.C0011a.C0012a c0012a;
        int i13;
        boolean z4;
        Object x2;
        Object x3;
        rcy rcyVar;
        int i14;
        boolean o;
        Object x4;
        a.C0011a.C0012a c0012a2;
        int i15;
        int i16;
        a.n nVar4;
        a.e eVar4;
        dt1.b bVar4;
        dt1.c cVar4;
        xvy xvyVar2;
        rcy rcyVar2;
        q630 q630Var2;
        xvy xvyVar3 = xvyVar;
        androidx.compose.runtime.a M = aVar.M(924924659);
        if ((i & 6) == 0) {
            i4 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.J(xvyVar3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= M.J(s890Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= M.l(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= M.l(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= M.J(tprVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= M.J(e490Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i17 = i3 & 512;
        if (i17 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= M.J(bVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i18 = i3 & 1024;
        if (i18 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (M.J(nVar) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i19 = i3 & 2048;
        if (i19 != 0) {
            i5 |= 48;
            i6 = i19;
        } else if ((i2 & 48) == 0) {
            i6 = i19;
            i5 |= M.J(cVar) ? 32 : 16;
        } else {
            i6 = i19;
        }
        int i20 = i5;
        int i21 = i3 & 4096;
        if (i21 != 0) {
            i7 = i20 | 384;
        } else if ((i2 & 384) == 0) {
            i7 = i20 | (M.J(eVar) ? 256 : 128);
        } else {
            i7 = i20;
        }
        if ((i2 & 3072) == 0) {
            i7 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i22 = i7;
        if (M.t(i4 & 1, ((i4 & 306783379) == 306783378 && (i22 & 1171) == 1170) ? false : true)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    i8 = -234881025;
                    i9 = i21;
                    androidx.compose.runtime.b.f(-325845985, 0, -1, "androidx.compose.foundation.lazy.defaultLazyListBeyondBoundsItemCount (LazyList.android.kt:20)");
                } else {
                    i8 = -234881025;
                    i9 = i21;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i23 = i4 & i8;
                bVar3 = i17 != 0 ? null : bVar;
                nVar3 = i18 != 0 ? null : nVar;
                cVar3 = i6 != 0 ? null : cVar;
                i10 = i23;
                if (i9 != 0) {
                    eVar3 = null;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(924924659, i10, i22, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                    }
                    int i24 = i10 >> 3;
                    int i25 = i24 & 14;
                    int i26 = i25 | ((i22 >> 6) & 112);
                    if (androidx.compose.runtime.b.d()) {
                        i11 = i10;
                        i12 = i25;
                    } else {
                        i11 = i10;
                        i12 = i25;
                        androidx.compose.runtime.b.f(-343736148, i26, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:41)");
                    }
                    wh50 c = androidx.compose.runtime.k.c(izsVar, M, (i26 >> 3) & 14);
                    z3 = (((i26 & 14) ^ 6) <= 4 && M.J(xvyVar3)) || (i26 & 6) == 4;
                    x = M.x();
                    c0012a = a.C0011a.a;
                    if (!z3 || x == c0012a) {
                        lsy lsyVar = new lsy();
                        lsyVar.a = androidx.compose.runtime.i.a(Integer.MAX_VALUE);
                        lsyVar.b = androidx.compose.runtime.i.a(Integer.MAX_VALUE);
                        hg10 hg10Var = hg10.g;
                        koi koiVar = new koi(1, c);
                        jbk0<m9x> jbk0Var = bbk0.a;
                        x = new avy(new f1m(new ry3(new f1m(koiVar, hg10Var), xvyVar3, lsyVar, 4), hg10Var), mtk0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        M.R(x);
                    }
                    rcy rcyVar3 = (rcy) x;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int i27 = i11 >> 9;
                    int i28 = i12 | (i27 & 112);
                    if (androidx.compose.runtime.b.d()) {
                        i13 = i27;
                    } else {
                        i13 = i27;
                        androidx.compose.runtime.b.f(596174919, i28, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
                    }
                    z4 = ((((i28 & 14) ^ 6) <= 4 && M.J(xvyVar3)) || (i28 & 6) == 4) | ((((i28 & 112) ^ 48) <= 32 && M.l(z)) || (i28 & 48) == 32);
                    x2 = M.x();
                    if (!z4 || x2 == c0012a) {
                        x2 = new nuy(xvyVar3, z);
                        M.R(x2);
                    }
                    luy luyVar = (luy) x2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = bap.j(EmptyCoroutineContext.b, M);
                        M.R(x3);
                    }
                    yvj yvjVar = (yvj) x3;
                    kdu kduVar = (kdu) M.r(uvi.g);
                    xel0.a.C3999a c3999a = ((Boolean) M.r(uvi.w)).booleanValue() ? null : xel0.a.a;
                    int i29 = i22 << 18;
                    int i30 = (i11 & 65520) | (i13 & 3670016) | (i29 & 29360128) | (i29 & 234881024) | ((i22 << 27) & 1879048192);
                    if (androidx.compose.runtime.b.d()) {
                        rcyVar = rcyVar3;
                        i14 = i24;
                    } else {
                        rcyVar = rcyVar3;
                        i14 = i24;
                        androidx.compose.runtime.b.f(406165748, i30, 0, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:187)");
                    }
                    o = ((((i30 & 1879048192) ^ 805306368) <= 536870912 && M.J(nVar3)) || (i30 & 805306368) == 536870912) | ((((i30 & 112) ^ 48) <= 32 && M.J(xvyVar3)) || (i30 & 48) == 32) | ((((i30 & 896) ^ 384) <= 256 && M.J(s890Var)) || (i30 & 384) == 256) | ((((i30 & 7168) ^ 3072) <= 2048 && M.l(false)) || (i30 & 3072) == 2048) | ((((i30 & 57344) ^ 24576) <= 16384 && M.l(z)) || (i30 & 24576) == 16384) | M.o(0) | ((((i30 & 3670016) ^ 1572864) <= 1048576 && M.J(bVar3)) || (i30 & 1572864) == 1048576) | ((((i30 & 29360128) ^ 12582912) <= 8388608 && M.J(cVar3)) || (i30 & 12582912) == 8388608) | ((((i30 & 234881024) ^ 100663296) <= 67108864 && M.J(eVar3)) || (i30 & 100663296) == 67108864) | M.J(kduVar) | M.J(c3999a);
                    x4 = M.x();
                    if (!o || x4 == c0012a) {
                        aVar2 = M;
                        a.e eVar5 = eVar3;
                        c0012a2 = c0012a;
                        i15 = 4;
                        i16 = i12;
                        dt1.b bVar5 = bVar3;
                        rcy rcyVar4 = rcyVar;
                        dvy dvyVar = new dvy(xvyVar3, z, s890Var, rcyVar4, nVar3, eVar5, yvjVar, kduVar, c3999a, bVar5, cVar3);
                        nVar4 = nVar3;
                        eVar4 = eVar5;
                        bVar4 = bVar5;
                        cVar4 = cVar3;
                        xvyVar2 = xvyVar3;
                        rcyVar2 = rcyVar4;
                        aVar2.R(dvyVar);
                        x4 = dvyVar;
                    } else {
                        i16 = i12;
                        eVar4 = eVar3;
                        bVar4 = bVar3;
                        nVar4 = nVar3;
                        aVar2 = M;
                        c0012a2 = c0012a;
                        cVar4 = cVar3;
                        i15 = 4;
                        xvyVar2 = xvyVar3;
                        rcyVar2 = rcyVar;
                    }
                    oty otyVar = (oty) x4;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Orientation orientation = !z ? Orientation.Vertical : Orientation.Horizontal;
                    if (z2) {
                        aVar2.K(-2076718545);
                        aVar2.j();
                        q630Var2 = q630.a.a;
                    } else {
                        aVar2.K(-2077147368);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1877443446, i16, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:27)");
                        }
                        boolean o2 = aVar2.o(0) | ((((i14 & 14) ^ 6) > i15 && aVar2.J(xvyVar2)) || (i14 & 6) == i15);
                        Object x5 = aVar2.x();
                        if (o2 || x5 == c0012a2) {
                            x5 = new suy(xvyVar2);
                            aVar2.R(x5);
                        }
                        suy suyVar = (suy) x5;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var2 = q6x.y(suyVar, xvyVar2.p, orientation);
                        aVar2.j();
                    }
                    rcy rcyVar5 = rcyVar2;
                    q630 g = gcd0.o(q630Var.g(xvyVar2.m).g(xvyVar2.n), rcyVar2, luyVar, orientation, z2, ((i11 >> 6) & 57344) | ((i11 << 6) & 458752)).g(q630Var2).g(xvyVar2.o.k);
                    xvyVar3 = xvyVar2;
                    nty.a(rcyVar5, sdi.t(g, xvyVar3, orientation, e490Var, z2, tprVar, xvyVar3.g, null), xvyVar3.q, otyVar, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    bVar2 = bVar4;
                    cVar2 = cVar4;
                    eVar2 = eVar4;
                    nVar2 = nVar4;
                }
            } else {
                M.h();
                bVar3 = bVar;
                nVar3 = nVar;
                cVar3 = cVar;
                i10 = i4 & (-234881025);
            }
            eVar3 = eVar;
            M.S();
            if (androidx.compose.runtime.b.d()) {
            }
            int i242 = i10 >> 3;
            int i252 = i242 & 14;
            int i262 = i252 | ((i22 >> 6) & 112);
            if (androidx.compose.runtime.b.d()) {
            }
            wh50 c2 = androidx.compose.runtime.k.c(izsVar, M, (i262 >> 3) & 14);
            if (((i262 & 14) ^ 6) <= 4) {
            }
            x = M.x();
            c0012a = a.C0011a.a;
            if (!z3) {
            }
            lsy lsyVar2 = new lsy();
            lsyVar2.a = androidx.compose.runtime.i.a(Integer.MAX_VALUE);
            lsyVar2.b = androidx.compose.runtime.i.a(Integer.MAX_VALUE);
            hg10 hg10Var2 = hg10.g;
            koi koiVar2 = new koi(1, c2);
            jbk0<m9x> jbk0Var2 = bbk0.a;
            x = new avy(new f1m(new ry3(new f1m(koiVar2, hg10Var2), xvyVar3, lsyVar2, 4), hg10Var2), mtk0.class, "value", "getValue()Ljava/lang/Object;", 0);
            M.R(x);
            rcy rcyVar32 = (rcy) x;
            if (androidx.compose.runtime.b.d()) {
            }
            int i272 = i11 >> 9;
            int i282 = i12 | (i272 & 112);
            if (androidx.compose.runtime.b.d()) {
            }
            z4 = ((((i282 & 14) ^ 6) <= 4 && M.J(xvyVar3)) || (i282 & 6) == 4) | ((((i282 & 112) ^ 48) <= 32 && M.l(z)) || (i282 & 48) == 32);
            x2 = M.x();
            if (!z4) {
            }
            x2 = new nuy(xvyVar3, z);
            M.R(x2);
            luy luyVar2 = (luy) x2;
            if (androidx.compose.runtime.b.d()) {
            }
            x3 = M.x();
            if (x3 == c0012a) {
            }
            yvj yvjVar2 = (yvj) x3;
            kdu kduVar2 = (kdu) M.r(uvi.g);
            xel0.a.C3999a c3999a2 = ((Boolean) M.r(uvi.w)).booleanValue() ? null : xel0.a.a;
            int i292 = i22 << 18;
            int i302 = (i11 & 65520) | (i13 & 3670016) | (i292 & 29360128) | (i292 & 234881024) | ((i22 << 27) & 1879048192);
            if (androidx.compose.runtime.b.d()) {
            }
            o = ((((i302 & 1879048192) ^ 805306368) <= 536870912 && M.J(nVar3)) || (i302 & 805306368) == 536870912) | ((((i302 & 112) ^ 48) <= 32 && M.J(xvyVar3)) || (i302 & 48) == 32) | ((((i302 & 896) ^ 384) <= 256 && M.J(s890Var)) || (i302 & 384) == 256) | ((((i302 & 7168) ^ 3072) <= 2048 && M.l(false)) || (i302 & 3072) == 2048) | ((((i302 & 57344) ^ 24576) <= 16384 && M.l(z)) || (i302 & 24576) == 16384) | M.o(0) | ((((i302 & 3670016) ^ 1572864) <= 1048576 && M.J(bVar3)) || (i302 & 1572864) == 1048576) | ((((i302 & 29360128) ^ 12582912) <= 8388608 && M.J(cVar3)) || (i302 & 12582912) == 8388608) | ((((i302 & 234881024) ^ 100663296) <= 67108864 && M.J(eVar3)) || (i302 & 100663296) == 67108864) | M.J(kduVar2) | M.J(c3999a2);
            x4 = M.x();
            if (o) {
            }
            aVar2 = M;
            a.e eVar52 = eVar3;
            c0012a2 = c0012a;
            i15 = 4;
            i16 = i12;
            dt1.b bVar52 = bVar3;
            rcy rcyVar42 = rcyVar;
            dvy dvyVar2 = new dvy(xvyVar3, z, s890Var, rcyVar42, nVar3, eVar52, yvjVar2, kduVar2, c3999a2, bVar52, cVar3);
            nVar4 = nVar3;
            eVar4 = eVar52;
            bVar4 = bVar52;
            cVar4 = cVar3;
            xvyVar2 = xvyVar3;
            rcyVar2 = rcyVar42;
            aVar2.R(dvyVar2);
            x4 = dvyVar2;
            oty otyVar2 = (oty) x4;
            if (androidx.compose.runtime.b.d()) {
            }
            Orientation orientation2 = !z ? Orientation.Vertical : Orientation.Horizontal;
            if (z2) {
            }
            rcy rcyVar52 = rcyVar2;
            q630 g2 = gcd0.o(q630Var.g(xvyVar2.m).g(xvyVar2.n), rcyVar2, luyVar2, orientation2, z2, ((i11 >> 6) & 57344) | ((i11 << 6) & 458752)).g(q630Var2).g(xvyVar2.o.k);
            xvyVar3 = xvyVar2;
            nty.a(rcyVar52, sdi.t(g2, xvyVar3, orientation2, e490Var, z2, tprVar, xvyVar3.g, null), xvyVar3.q, otyVar2, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
            }
            bVar2 = bVar4;
            cVar2 = cVar4;
            eVar2 = eVar4;
            nVar2 = nVar4;
        } else {
            aVar2 = M;
            aVar2.h();
            bVar2 = bVar;
            nVar2 = nVar;
            cVar2 = cVar;
            eVar2 = eVar;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final xvy xvyVar4 = xvyVar3;
            s.d = new wzs() { // from class: xsna.bvy
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    evy.a(q630.this, xvyVar4, s890Var, z, tprVar, z2, e490Var, bVar2, nVar2, cVar2, eVar2, izsVar, (androidx.compose.runtime.a) obj, I, I2, i3);
                    return s3q0.a;
                }
            };
        }
    }
}
