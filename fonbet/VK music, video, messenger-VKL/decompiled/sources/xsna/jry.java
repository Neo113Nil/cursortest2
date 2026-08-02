package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.q630;
import xsna.xel0;

/* compiled from: LazyGrid.kt */
/* loaded from: classes11.dex */
public final class jry {
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02dc, code lost:
    
        if (r15.l(false) != false) goto L199;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0373  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final q630 q630Var, dsy dsyVar, final vry vryVar, final s890 s890Var, final boolean z, final tpr tprVar, final boolean z2, final e490 e490Var, final a.n nVar, final a.e eVar, final izs izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        final dsy dsyVar2;
        androidx.compose.runtime.a aVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        rcy rcyVar;
        xel0.a.C3999a c3999a;
        yvj yvjVar;
        boolean z3;
        boolean J;
        Object x;
        a.C0011a.C0012a c0012a;
        int i9;
        int i10;
        boolean z4;
        dsy dsyVar3;
        rcy rcyVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(708740370);
        if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(dsyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? M.J(vryVar) : M.y(vryVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(s890Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.l(false) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= M.l(z) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= M.J(tprVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= M.l(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= M.J(e490Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.J(nVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.J(eVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.y(izsVar) ? 32 : 16;
        }
        int i11 = i4;
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i11 & 19) == 18) ? false : true)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(708740370, i3, i11, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
            }
            int i12 = i3 >> 3;
            int i13 = i12 & 14;
            int i14 = i13 | (i11 & 112);
            if (androidx.compose.runtime.b.d()) {
                i5 = i13;
                i6 = i3;
                androidx.compose.runtime.b.f(-1898306282, i14, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
            } else {
                i5 = i13;
                i6 = i3;
            }
            wh50 c = androidx.compose.runtime.k.c(izsVar, M, (i14 >> 3) & 14);
            boolean z5 = (((i14 & 14) ^ 6) > 4 && M.J(dsyVar)) || (i14 & 6) == 4;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z5 || x2 == c0012a2) {
                hg10 hg10Var = hg10.g;
                i7 = i11;
                mni mniVar = new mni(1, c);
                jbk0<m9x> jbk0Var = bbk0.a;
                x2 = new bry(new f1m(new a94(10, new f1m(mniVar, hg10Var), dsyVar), hg10Var), mtk0.class, "value", "getValue()Ljava/lang/Object;", 0);
                M.R(x2);
            } else {
                i7 = i11;
            }
            rcy rcyVar3 = (rcy) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i15 = i6 >> 9;
            int i16 = i5 | (i15 & 112);
            if (androidx.compose.runtime.b.d()) {
                i8 = i15;
                rcyVar = rcyVar3;
                androidx.compose.runtime.b.f(-1247008005, i16, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
            } else {
                i8 = i15;
                rcyVar = rcyVar3;
            }
            boolean z6 = ((((i16 & 14) ^ 6) > 4 && M.J(dsyVar)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) > 32 && M.l(false)) || (i16 & 48) == 32);
            Object x3 = M.x();
            if (z6 || x3 == c0012a2) {
                x3 = new lwy(dsyVar);
                M.R(x3);
            }
            lwy lwyVar = (lwy) x3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x4 = M.x();
            if (x4 == c0012a2) {
                x4 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x4);
            }
            yvj yvjVar2 = (yvj) x4;
            kdu kduVar = (kdu) M.r(uvi.g);
            xel0.a.C3999a c3999a2 = !((Boolean) M.r(uvi.w)).booleanValue() ? xel0.a.a : null;
            int i17 = (i6 & 524272) | ((i7 << 18) & 3670016) | ((i6 >> 6) & 29360128);
            if (androidx.compose.runtime.b.d()) {
                c3999a = c3999a2;
                yvjVar = yvjVar2;
                androidx.compose.runtime.b.f(-1030995717, i17, 0, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:179)");
            } else {
                c3999a = c3999a2;
                yvjVar = yvjVar2;
            }
            boolean z7 = ((((i17 & 896) ^ 384) > 256 && M.J(vryVar)) || (i17 & 384) == 256) | ((((i17 & 112) ^ 48) > 32 && M.J(dsyVar)) || (i17 & 48) == 32) | ((((i17 & 7168) ^ 3072) > 2048 && M.J(s890Var)) || (i17 & 3072) == 2048);
            if (((i17 & 57344) ^ 24576) <= 16384) {
            }
            if ((i17 & 24576) != 16384) {
                z3 = false;
                J = z7 | z3 | ((((i17 & 458752) ^ 196608) <= 131072 && M.l(z)) || (i17 & 196608) == 131072) | ((((i17 & 3670016) ^ 1572864) <= 1048576 && M.J(eVar)) || (i17 & 1572864) == 1048576) | ((((i17 & 29360128) ^ 12582912) <= 8388608 && M.J(nVar)) || (i17 & 12582912) == 8388608) | M.J(kduVar);
                x = M.x();
                if (!J || x == c0012a2) {
                    c0012a = c0012a2;
                    i9 = i5;
                    rcy rcyVar4 = rcyVar;
                    i10 = 4;
                    z4 = true;
                    iry iryVar = new iry(dsyVar, z, s890Var, rcyVar4, vryVar, nVar, eVar, yvjVar, kduVar, c3999a);
                    dsyVar3 = dsyVar;
                    rcyVar2 = rcyVar4;
                    M.R(iryVar);
                    x = iryVar;
                } else {
                    dsyVar3 = dsyVar;
                    c0012a = c0012a2;
                    i9 = i5;
                    rcyVar2 = rcyVar;
                    i10 = 4;
                    z4 = true;
                }
                oty otyVar = (oty) x;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Orientation orientation = !z ? Orientation.Vertical : Orientation.Horizontal;
                if (z2) {
                    M.K(27577840);
                    M.j();
                    q630Var2 = q630.a.a;
                } else {
                    M.K(27281635);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2004349821, i9, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:24)");
                    }
                    if (((i9 ^ 6) <= i10 || !M.J(dsyVar3)) && (i12 & 6) != i10) {
                        z4 = false;
                    }
                    Object x5 = M.x();
                    if (z4 || x5 == c0012a) {
                        x5 = new rqy(dsyVar3);
                        M.R(x5);
                    }
                    rqy rqyVar = (rqy) x5;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var2 = q6x.y(rqyVar, dsyVar3.n, orientation);
                    M.j();
                }
                rcy rcyVar5 = rcyVar2;
                q630 g = gcd0.o(q630Var.g(dsyVar3.k).g(dsyVar3.l), rcyVar2, lwyVar, orientation, z2, (i8 & 57344) | ((i6 << 3) & 458752)).g(q630Var2).g(dsyVar3.m.k);
                dsy dsyVar4 = dsyVar3;
                q630 t = sdi.t(g, dsyVar4, orientation, e490Var, z2, tprVar, dsyVar4.f, null);
                dsyVar2 = dsyVar4;
                aVar2 = M;
                nty.a(rcyVar5, t, dsyVar2.o, otyVar, aVar2, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            z3 = true;
            J = z7 | z3 | ((((i17 & 458752) ^ 196608) <= 131072 && M.l(z)) || (i17 & 196608) == 131072) | ((((i17 & 3670016) ^ 1572864) <= 1048576 && M.J(eVar)) || (i17 & 1572864) == 1048576) | ((((i17 & 29360128) ^ 12582912) <= 8388608 && M.J(nVar)) || (i17 & 12582912) == 8388608) | M.J(kduVar);
            x = M.x();
            if (J) {
            }
            c0012a = c0012a2;
            i9 = i5;
            rcy rcyVar42 = rcyVar;
            i10 = 4;
            z4 = true;
            iry iryVar2 = new iry(dsyVar, z, s890Var, rcyVar42, vryVar, nVar, eVar, yvjVar, kduVar, c3999a);
            dsyVar3 = dsyVar;
            rcyVar2 = rcyVar42;
            M.R(iryVar2);
            x = iryVar2;
            oty otyVar2 = (oty) x;
            if (androidx.compose.runtime.b.d()) {
            }
            Orientation orientation2 = !z ? Orientation.Vertical : Orientation.Horizontal;
            if (z2) {
            }
            rcy rcyVar52 = rcyVar2;
            q630 g2 = gcd0.o(q630Var.g(dsyVar3.k).g(dsyVar3.l), rcyVar2, lwyVar, orientation2, z2, (i8 & 57344) | ((i6 << 3) & 458752)).g(q630Var2).g(dsyVar3.m.k);
            dsy dsyVar42 = dsyVar3;
            q630 t2 = sdi.t(g2, dsyVar42, orientation2, e490Var, z2, tprVar, dsyVar42.f, null);
            dsyVar2 = dsyVar42;
            aVar2 = M;
            nty.a(rcyVar52, t2, dsyVar2.o, otyVar2, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            dsyVar2 = dsyVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.fry
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jry.a(q630.this, dsyVar2, vryVar, s890Var, z, tprVar, z2, e490Var, nVar, eVar, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), ne7.I(i2));
                    return s3q0.a;
                }
            };
        }
    }
}
