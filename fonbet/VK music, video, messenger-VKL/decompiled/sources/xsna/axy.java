package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.q630;

/* compiled from: LazyStaggeredGrid.kt */
/* loaded from: classes11.dex */
public final class axy {
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0258, code lost:
    
        if (r14.l(false) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x032d, code lost:
    
        if (r14.l(false) == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0342, code lost:
    
        if (r3 == r0) goto L231;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0330  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(uxy uxyVar, final Orientation orientation, final yry yryVar, final q630 q630Var, final u890 u890Var, final tpr tprVar, final boolean z, final e490 e490Var, final float f, final float f2, final izs izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        uxy uxyVar2;
        androidx.compose.runtime.a aVar2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean J;
        Object x;
        a.C0011a.C0012a c0012a;
        int i8;
        int i9;
        boolean z3;
        uxy uxyVar3;
        rcy rcyVar;
        int i10;
        boolean z4;
        boolean z5;
        boolean z6;
        a.C0011a.C0012a c0012a2;
        Orientation orientation2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1904835166);
        if ((i & 6) == 0) {
            i3 = (M.J(uxyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.o(orientation.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? M.J(yryVar) : M.y(yryVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(u890Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= M.l(false) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= M.J(tprVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= M.l(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= M.J(e490Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.n(f) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.n(f2) ? 4 : 2);
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
                androidx.compose.runtime.b.f(-1904835166, i3, i11, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:62)");
            }
            int i12 = i3 & 14;
            int i13 = (i11 & 112) | i12;
            if (androidx.compose.runtime.b.d()) {
                i5 = i12;
                i6 = i3;
                androidx.compose.runtime.b.f(690901732, i13, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProviderLambda (LazyStaggeredGridItemProvider.kt:37)");
            } else {
                i5 = i12;
                i6 = i3;
            }
            wh50 c = androidx.compose.runtime.k.c(izsVar, M, (i13 >> 3) & 14);
            boolean z7 = (((i13 & 14) ^ 6) > 4 && M.J(uxyVar)) || (i13 & 6) == 4;
            Object x2 = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (z7 || x2 == c0012a3) {
                hg10 hg10Var = hg10.g;
                i7 = i11;
                k7y k7yVar = new k7y(c, 1);
                jbk0<m9x> jbk0Var = bbk0.a;
                x2 = new wwy(new f1m(new defpackage.e0(12, new f1m(k7yVar, hg10Var), uxyVar), hg10Var), mtk0.class, "value", "getValue()Ljava/lang/Object;", 0);
                M.R(x2);
            } else {
                i7 = i11;
            }
            rcy rcyVar2 = (rcy) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x3 = M.x();
            if (x3 == c0012a3) {
                x3 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x3);
            }
            yvj yvjVar = (yvj) x3;
            kdu kduVar = (kdu) M.r(uvi.g);
            int i14 = i6 >> 6;
            int i15 = i6 >> 12;
            int i16 = i5 | (i14 & 896) | (i14 & 7168) | ((i6 << 9) & 57344) | (i15 & 458752) | ((i7 << 18) & 3670016) | ((i6 << 18) & 234881024);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(234882793, i16, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:50)");
            }
            boolean J2 = ((((i16 & 14) ^ 6) > 4 && M.J(uxyVar)) || (i16 & 6) == 4) | M.J(rcyVar2) | ((((i16 & 896) ^ 384) > 256 && M.J(u890Var)) || (i16 & 384) == 256);
            if (((i16 & 7168) ^ 3072) <= 2048) {
            }
            if ((i16 & 3072) != 2048) {
                z2 = false;
                J = ((((i16 & 234881024) ^ 100663296) <= 67108864 && M.J(yryVar)) || (i16 & 100663296) == 67108864) | J2 | z2 | ((((i16 & 57344) ^ 24576) <= 16384 && M.o(orientation.ordinal())) || (i16 & 24576) == 16384) | ((((i16 & 458752) ^ 196608) <= 131072 && M.n(f)) || (i16 & 196608) == 131072) | ((((i16 & 3670016) ^ 1572864) <= 1048576 && M.n(f2)) || (i16 & 1572864) == 1048576) | M.J(kduVar);
                x = M.x();
                if (!J || x == c0012a3) {
                    c0012a = c0012a3;
                    i8 = i5;
                    i9 = -1;
                    z3 = true;
                    jxy jxyVar = new jxy(uxyVar, orientation, yryVar, rcyVar2, u890Var, f, yvjVar, kduVar);
                    uxyVar3 = uxyVar;
                    rcyVar = rcyVar2;
                    M.R(jxyVar);
                    x = jxyVar;
                } else {
                    uxyVar3 = uxyVar;
                    rcyVar = rcyVar2;
                    c0012a = c0012a3;
                    i8 = i5;
                    i9 = -1;
                    z3 = true;
                }
                oty otyVar = (oty) x;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i10 = (i15 & 112) | i8;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1629354903, i10, i9, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:31)");
                }
                boolean z8 = ((((i10 & 14) ^ 6) > 4 || !M.J(uxyVar3)) && (i10 & 6) != 4) ? false : z3;
                if (((i10 & 112) ^ 48) <= 32) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if ((i10 & 48) != 32) {
                    z5 = z4;
                    z6 = z5 | z8;
                    Object x4 = M.x();
                    if (z6) {
                        c0012a2 = c0012a;
                    } else {
                        c0012a2 = c0012a;
                    }
                    x4 = new qxy(uxyVar3);
                    M.R(x4);
                    qxy qxyVar = (qxy) x4;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (z) {
                        M.K(-1834596342);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-363070453, i8, i9, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridBeyondBoundsState (LazyStaggeredGridBeyondBoundsModifier.kt:25)");
                        }
                        boolean z9 = (((i8 ^ 6) <= 4 || !M.J(uxyVar3)) && (i6 & 6) != 4) ? z4 : z3;
                        Object x5 = M.x();
                        if (z9 || x5 == c0012a2) {
                            x5 = new owy(uxyVar3);
                            M.R(x5);
                        }
                        owy owyVar = (owy) x5;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        orientation2 = orientation;
                        q630Var2 = q6x.y(owyVar, uxyVar3.k, orientation2);
                        M.j();
                    } else {
                        orientation2 = orientation;
                        M.K(-1834291488);
                        M.j();
                        q630Var2 = q630.a.a;
                    }
                    rcy rcyVar3 = rcyVar;
                    q630 g = gcd0.o(q630Var.g(uxyVar3.i).g(uxyVar3.j), rcyVar, qxyVar, orientation2, z, (i6 & 458752) | ((i6 << 6) & 7168) | ((i6 >> 9) & 57344)).g(q630Var2).g(uxyVar3.t.k);
                    uxy uxyVar4 = uxyVar3;
                    uxyVar2 = uxyVar4;
                    aVar2 = M;
                    nty.a(rcyVar3, sdi.t(g, uxyVar4, orientation, e490Var, z, tprVar, uxyVar4.r, null), uxyVar2.m, otyVar, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
                z5 = z3;
                z6 = z5 | z8;
                Object x42 = M.x();
                if (z6) {
                }
                x42 = new qxy(uxyVar3);
                M.R(x42);
                qxy qxyVar2 = (qxy) x42;
                if (androidx.compose.runtime.b.d()) {
                }
                if (z) {
                }
                rcy rcyVar32 = rcyVar;
                q630 g2 = gcd0.o(q630Var.g(uxyVar3.i).g(uxyVar3.j), rcyVar, qxyVar2, orientation2, z, (i6 & 458752) | ((i6 << 6) & 7168) | ((i6 >> 9) & 57344)).g(q630Var2).g(uxyVar3.t.k);
                uxy uxyVar42 = uxyVar3;
                uxyVar2 = uxyVar42;
                aVar2 = M;
                nty.a(rcyVar32, sdi.t(g2, uxyVar42, orientation, e490Var, z, tprVar, uxyVar42.r, null), uxyVar2.m, otyVar, aVar2, 0);
                if (androidx.compose.runtime.b.d()) {
                }
            }
            z2 = true;
            J = ((((i16 & 234881024) ^ 100663296) <= 67108864 && M.J(yryVar)) || (i16 & 100663296) == 67108864) | J2 | z2 | ((((i16 & 57344) ^ 24576) <= 16384 && M.o(orientation.ordinal())) || (i16 & 24576) == 16384) | ((((i16 & 458752) ^ 196608) <= 131072 && M.n(f)) || (i16 & 196608) == 131072) | ((((i16 & 3670016) ^ 1572864) <= 1048576 && M.n(f2)) || (i16 & 1572864) == 1048576) | M.J(kduVar);
            x = M.x();
            if (J) {
            }
            c0012a = c0012a3;
            i8 = i5;
            i9 = -1;
            z3 = true;
            jxy jxyVar2 = new jxy(uxyVar, orientation, yryVar, rcyVar2, u890Var, f, yvjVar, kduVar);
            uxyVar3 = uxyVar;
            rcyVar = rcyVar2;
            M.R(jxyVar2);
            x = jxyVar2;
            oty otyVar2 = (oty) x;
            if (androidx.compose.runtime.b.d()) {
            }
            i10 = (i15 & 112) | i8;
            if (androidx.compose.runtime.b.d()) {
            }
            if (((i10 & 14) ^ 6) > 4) {
            }
            if (((i10 & 112) ^ 48) <= 32) {
            }
            if ((i10 & 48) != 32) {
            }
            z5 = z3;
            z6 = z5 | z8;
            Object x422 = M.x();
            if (z6) {
            }
            x422 = new qxy(uxyVar3);
            M.R(x422);
            qxy qxyVar22 = (qxy) x422;
            if (androidx.compose.runtime.b.d()) {
            }
            if (z) {
            }
            rcy rcyVar322 = rcyVar;
            q630 g22 = gcd0.o(q630Var.g(uxyVar3.i).g(uxyVar3.j), rcyVar, qxyVar22, orientation2, z, (i6 & 458752) | ((i6 << 6) & 7168) | ((i6 >> 9) & 57344)).g(q630Var2).g(uxyVar3.t.k);
            uxy uxyVar422 = uxyVar3;
            uxyVar2 = uxyVar422;
            aVar2 = M;
            nty.a(rcyVar322, sdi.t(g22, uxyVar422, orientation, e490Var, z, tprVar, uxyVar422.r, null), uxyVar2.m, otyVar2, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            uxyVar2 = uxyVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final uxy uxyVar5 = uxyVar2;
            s.d = new wzs() { // from class: xsna.zwy
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    axy.a(uxy.this, orientation, yryVar, q630Var, u890Var, tprVar, z, e490Var, f, f2, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), ne7.I(i2));
                    return s3q0.a;
                }
            };
        }
    }
}
