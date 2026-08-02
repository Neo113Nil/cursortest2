package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.ArrayList;
import xsna.efu;
import xsna.q630;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes11.dex */
public final class uqy {
    public static final void a(final efu.b bVar, final q630 q630Var, final dsy dsyVar, s890 s890Var, final a.e eVar, a.n nVar, tpr tprVar, boolean z, e490 e490Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        final s890 s890Var2;
        final a.n nVar2;
        final tpr tprVar2;
        final boolean z2;
        final e490 e490Var2;
        s890 u890Var;
        tpr f;
        int i2;
        a.n nVar3;
        boolean z3;
        androidx.compose.runtime.a M = aVar.M(635941664);
        int i3 = i | (M.J(bVar) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.J(dsyVar) ? 256 : 128) | 27648 | (M.J(eVar) ? 131072 : 65536) | 374865920;
        int i4 = M.y(izsVar) ? 4 : 2;
        if (M.t(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                float f2 = 0;
                u890Var = new u890(f2, f2, f2, f2);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                f = k7b0.f(6, M);
                i2 = i3 & (-1908408321);
                nVar3 = mVar;
                z3 = 6;
                e490Var2 = g490.a(M);
                z2 = true;
            } else {
                M.h();
                i2 = i3 & (-1908408321);
                u890Var = s890Var;
                nVar3 = nVar;
                f = tprVar;
                z2 = z;
                z3 = 6;
                e490Var2 = e490Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(635941664, i2, i4, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:168)");
            }
            int i5 = i2 >> 15;
            int i6 = (i2 & 14) | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-150818144, i6, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:245)");
            }
            boolean z4 = (((i6 & 14) ^ 6) > 4 && M.J(bVar)) || (i6 & 6) == 4;
            Object x = M.x();
            if (z4 || x == a.C0011a.a) {
                x = new ggu(new au7(3, bVar, nVar3));
                M.R(x);
            }
            vry vryVar = (vry) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i7 = i2 >> 3;
            int i8 = (i7 & 112) | (i7 & 14) | 196608 | 817916928;
            int i9 = (i5 & 14) | ((i4 << 3) & 112);
            s890 s890Var3 = u890Var;
            tprVar2 = f;
            jry.a(q630Var, dsyVar, vryVar, s890Var3, false, tprVar2, z2, e490Var2, nVar3, eVar, izsVar, M, i8, i9);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            s890Var2 = s890Var3;
            nVar2 = nVar3;
        } else {
            M.h();
            s890Var2 = s890Var;
            nVar2 = nVar;
            tprVar2 = tprVar;
            z2 = z;
            e490Var2 = e490Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var, dsyVar, s890Var2, eVar, nVar2, tprVar2, z2, e490Var2, izsVar, i) { // from class: xsna.sqy
                public final /* synthetic */ q630 c;
                public final /* synthetic */ dsy d;
                public final /* synthetic */ s890 e;
                public final /* synthetic */ a.e f;
                public final /* synthetic */ a.n g;
                public final /* synthetic */ tpr h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ e490 j;
                public final /* synthetic */ izs k;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    uqy.a(efu.b.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final efu efuVar, q630 q630Var, dsy dsyVar, s890 s890Var, a.n nVar, a.e eVar, tpr tprVar, boolean z, e490 e490Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        dsy dsyVar2;
        int i5;
        s890 s890Var2;
        int i6;
        a.n nVar2;
        int i7;
        int i8;
        a.e eVar2;
        int i9;
        int i10;
        androidx.compose.runtime.a aVar2;
        final tpr tprVar2;
        final q630 q630Var3;
        final dsy dsyVar3;
        final s890 s890Var3;
        final a.e eVar3;
        final a.n nVar3;
        final boolean z2;
        final e490 e490Var2;
        androidx.compose.runtime.f s;
        s890 s890Var4;
        int i11;
        tpr f;
        boolean z3;
        s890 s890Var5;
        boolean z4;
        e490 a;
        int i12;
        int i13;
        androidx.compose.runtime.a M = aVar.M(-2072102870);
        if ((i & 6) == 0) {
            i4 = (M.J(efuVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    dsyVar2 = dsyVar;
                    if (M.J(dsyVar2)) {
                        i13 = 256;
                        i4 |= i13;
                    }
                } else {
                    dsyVar2 = dsyVar;
                }
                i13 = 128;
                i4 |= i13;
            } else {
                dsyVar2 = dsyVar;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                s890Var2 = s890Var;
                i4 |= M.J(s890Var2) ? 2048 : 1024;
                i6 = i4 | 24576;
                if ((i & 196608) == 0) {
                    if ((i3 & 32) == 0) {
                        nVar2 = nVar;
                        if (M.J(nVar2)) {
                            i12 = 131072;
                            i6 |= i12;
                        }
                    } else {
                        nVar2 = nVar;
                    }
                    i12 = 65536;
                    i6 |= i12;
                } else {
                    nVar2 = nVar;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i6 |= 1572864;
                    i8 = 196608;
                    eVar2 = eVar;
                } else {
                    i8 = 196608;
                    eVar2 = eVar;
                    if ((i & 1572864) == 0) {
                        i6 |= M.J(eVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    i6 |= 4194304;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i6 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i6 |= M.l(z) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    i6 |= 268435456;
                }
                if ((i2 & 6) == 0) {
                    i10 = i2 | (M.y(izsVar) ? 4 : 2);
                } else {
                    i10 = i2;
                }
                if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i10 & 3) != 2)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        if (i14 != 0) {
                            q630Var2 = q630.a.a;
                        }
                        if ((i3 & 4) != 0) {
                            dsyVar2 = gsy.a(0, 3, M);
                            i6 &= -897;
                        }
                        if (i5 != 0) {
                            float f2 = 0;
                            s890Var4 = new u890(f2, f2, f2, f2);
                        } else {
                            s890Var4 = s890Var2;
                        }
                        if ((i3 & 32) != 0) {
                            i6 &= -458753;
                            nVar2 = androidx.compose.foundation.layout.a.c;
                        }
                        if (i7 != 0) {
                            eVar2 = androidx.compose.foundation.layout.a.a;
                        }
                        i11 = i6 & (-1908408321);
                        f = k7b0.f(6, M);
                        z3 = i9 != 0 ? true : z;
                        s890Var5 = s890Var4;
                        z4 = true;
                        a = g490.a(M);
                    } else {
                        M.h();
                        if ((i3 & 4) != 0) {
                            i6 &= -897;
                        }
                        if ((i3 & 32) != 0) {
                            i6 &= -458753;
                        }
                        f = tprVar;
                        z3 = z;
                        i11 = i6 & (-1908408321);
                        s890Var5 = s890Var2;
                        z4 = true;
                        a = e490Var;
                    }
                    a.e eVar4 = eVar2;
                    a.n nVar4 = nVar2;
                    q630 q630Var4 = q630Var2;
                    dsy dsyVar4 = dsyVar2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2072102870, i11, i10, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                    }
                    int i15 = (i11 & 14) | ((i11 >> 15) & 112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-76500289, i15, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
                    }
                    boolean z5 = (((((i15 & 14) ^ 6) <= 4 || !M.J(efuVar)) && (i15 & 6) != 4) ? false : z4) | (((((i15 & 112) ^ 48) > 32 && M.J(eVar4)) || (i15 & 48) == 32) ? z4 : false);
                    Object x = M.x();
                    if (z5 || x == a.C0011a.a) {
                        x = new ggu(new fd1(5, efuVar, eVar4));
                        M.R(x);
                    }
                    vry vryVar = (vry) x;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int i16 = i11 >> 3;
                    aVar2 = M;
                    jry.a(q630Var4, dsyVar4, vryVar, s890Var5, true, f, z3, a, nVar4, eVar4, izsVar, aVar2, (i16 & 29360128) | (i16 & 14) | i8 | (i16 & 112) | (i11 & 7168) | (57344 & i11) | ((i11 << 12) & 1879048192), ((i11 >> 18) & 14) | ((i10 << 3) & 112));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var3 = q630Var4;
                    dsyVar3 = dsyVar4;
                    s890Var3 = s890Var5;
                    tprVar2 = f;
                    z2 = z3;
                    e490Var2 = a;
                    nVar3 = nVar4;
                    eVar3 = eVar4;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    tprVar2 = tprVar;
                    q630Var3 = q630Var2;
                    dsyVar3 = dsyVar2;
                    s890Var3 = s890Var2;
                    eVar3 = eVar2;
                    nVar3 = nVar2;
                    z2 = z;
                    e490Var2 = e490Var;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.tqy
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uqy.b(efu.this, q630Var3, dsyVar3, s890Var3, nVar3, eVar3, tprVar2, z2, e490Var2, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), ne7.I(i2), i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            s890Var2 = s890Var;
            i6 = i4 | 24576;
            if ((i & 196608) == 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i10 & 3) != 2)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        s890Var2 = s890Var;
        i6 = i4 | 24576;
        if ((i & 196608) == 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i10 & 3) != 2)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final ArrayList c(int i, int i2, int i3) {
        int i4 = i - ((i2 - 1) * i3);
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }
}
