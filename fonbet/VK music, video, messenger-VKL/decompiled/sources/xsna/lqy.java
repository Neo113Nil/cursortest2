package xsna;

import androidx.compose.foundation.layout.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import org.chromium.net.NetError;
import xsna.dt1;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes11.dex */
public final class lqy {
    /* JADX WARN: Removed duplicated region for block: B:116:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, xvy xvyVar, s890 s890Var, a.n nVar, dt1.b bVar, tpr tprVar, boolean z, e490 e490Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        xvy xvyVar2;
        s890 s890Var2;
        a.n nVar2;
        int i4;
        dt1.b bVar2;
        tpr tprVar2;
        int i5;
        e490 e490Var2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final xvy xvyVar3;
        final s890 s890Var3;
        final a.n nVar3;
        final e490 e490Var3;
        final dt1.b bVar3;
        final tpr tprVar3;
        final boolean z2;
        androidx.compose.runtime.f s;
        int i6;
        s890 s890Var4;
        q630 q630Var4;
        a.n nVar4;
        dt1.b bVar4;
        tpr tprVar4;
        boolean z3;
        int i7;
        xvy xvyVar4;
        s890 s890Var5;
        e490 e490Var4;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.a M = aVar.M(53695811);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                xvyVar2 = xvyVar;
                if (M.J(xvyVar2)) {
                    i11 = 32;
                    i3 |= i11;
                }
            } else {
                xvyVar2 = xvyVar;
            }
            i11 = 16;
            i3 |= i11;
        } else {
            xvyVar2 = xvyVar;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            s890Var2 = s890Var;
            i3 |= M.J(s890Var2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= M.l(false) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    nVar2 = nVar;
                    if (M.J(nVar2)) {
                        i10 = 16384;
                        i3 |= i10;
                    }
                } else {
                    nVar2 = nVar;
                }
                i10 = 8192;
                i3 |= i10;
            } else {
                nVar2 = nVar;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                bVar2 = bVar;
                i3 |= M.J(bVar2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        tprVar2 = tprVar;
                        if (M.J(tprVar2)) {
                            i9 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            i3 |= i9;
                        }
                    } else {
                        tprVar2 = tprVar;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    tprVar2 = tprVar;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= M.l(z) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0) {
                        e490Var2 = e490Var;
                        if (M.J(e490Var2)) {
                            i8 = 67108864;
                            i3 |= i8;
                        }
                    } else {
                        e490Var2 = e490Var;
                    }
                    i8 = 33554432;
                    i3 |= i8;
                } else {
                    e490Var2 = e490Var;
                }
                if ((i & 805306368) == 0) {
                    i3 |= M.y(izsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                }
                if (M.t(i3 & 1, (i3 & 306783379) != 306783378)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        q630 q630Var5 = i12 != 0 ? q630.a.a : q630Var2;
                        if ((i2 & 2) != 0) {
                            xvy a = zvy.a(0, 3, M);
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            xvyVar2 = a;
                            i6 = 0;
                        } else {
                            i6 = 0;
                        }
                        if (i13 != 0) {
                            float f = i6;
                            s890Var4 = new u890(f, f, f, f);
                        } else {
                            s890Var4 = s890Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            nVar2 = androidx.compose.foundation.layout.a.c;
                        }
                        if (i4 != 0) {
                            dt1.a.getClass();
                            bVar2 = dt1.a.n;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            tprVar2 = k7b0.f(6, M);
                        }
                        boolean z4 = i5 == 0 ? z : true;
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            q630Var4 = q630Var5;
                            nVar4 = nVar2;
                            bVar4 = bVar2;
                            tprVar4 = tprVar2;
                            z3 = z4;
                            i7 = 53695811;
                            e490Var4 = g490.a(M);
                            xvyVar4 = xvyVar2;
                            s890Var5 = s890Var4;
                        } else {
                            q630Var4 = q630Var5;
                            nVar4 = nVar2;
                            bVar4 = bVar2;
                            tprVar4 = tprVar2;
                            z3 = z4;
                            i7 = 53695811;
                            xvyVar4 = xvyVar2;
                            s890Var5 = s890Var4;
                            e490Var4 = e490Var2;
                        }
                    } else {
                        M.h();
                        if ((i2 & 2) != 0) {
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                        }
                        z3 = z;
                        q630Var4 = q630Var2;
                        nVar4 = nVar2;
                        e490Var4 = e490Var2;
                        bVar4 = bVar2;
                        tprVar4 = tprVar2;
                        i7 = 53695811;
                        xvyVar4 = xvyVar2;
                        s890Var5 = s890Var2;
                    }
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(i7, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:399)");
                    }
                    int i14 = i3 >> 3;
                    aVar2 = M;
                    evy.a(q630Var4, xvyVar4, s890Var5, true, tprVar4, z3, e490Var4, bVar4, nVar4, null, null, izsVar, aVar2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var3 = q630Var4;
                    xvyVar3 = xvyVar4;
                    s890Var3 = s890Var5;
                    tprVar3 = tprVar4;
                    z2 = z3;
                    e490Var3 = e490Var4;
                    bVar3 = bVar4;
                    nVar3 = nVar4;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    q630Var3 = q630Var2;
                    xvyVar3 = xvyVar2;
                    s890Var3 = s890Var2;
                    nVar3 = nVar2;
                    e490Var3 = e490Var2;
                    bVar3 = bVar2;
                    tprVar3 = tprVar2;
                    z2 = z;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.kqy
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lqy.a(q630.this, xvyVar3, s890Var3, nVar3, bVar3, tprVar3, z2, e490Var3, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            bVar2 = bVar;
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (M.t(i3 & 1, (i3 & 306783379) != 306783378)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        s890Var2 = s890Var;
        if ((i2 & 8) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        bVar2 = bVar;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 306783379) != 306783378)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(q630 q630Var, xvy xvyVar, s890 s890Var, a.e eVar, dt1.c cVar, tpr tprVar, boolean z, e490 e490Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        xvy xvyVar2;
        s890 s890Var2;
        a.e eVar2;
        int i4;
        dt1.c cVar2;
        tpr tprVar2;
        int i5;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final xvy xvyVar3;
        final s890 s890Var3;
        final a.e eVar3;
        final dt1.c cVar3;
        final tpr tprVar3;
        final boolean z2;
        final e490 e490Var2;
        androidx.compose.runtime.f s;
        int i6;
        s890 s890Var4;
        q630 q630Var4;
        int i7;
        tpr tprVar4;
        boolean z3;
        e490 a;
        s890 s890Var5;
        int i8;
        int i9;
        int i10;
        androidx.compose.runtime.a M = aVar.M(-1884325601);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                xvyVar2 = xvyVar;
                if (M.J(xvyVar2)) {
                    i10 = 32;
                    i3 |= i10;
                }
            } else {
                xvyVar2 = xvyVar;
            }
            i10 = 16;
            i3 |= i10;
        } else {
            xvyVar2 = xvyVar;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            s890Var2 = s890Var;
            i3 |= M.J(s890Var2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= M.l(false) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    eVar2 = eVar;
                    if (M.J(eVar2)) {
                        i9 = 16384;
                        i3 |= i9;
                    }
                } else {
                    eVar2 = eVar;
                }
                i9 = 8192;
                i3 |= i9;
            } else {
                eVar2 = eVar;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                cVar2 = cVar;
                i3 |= M.J(cVar2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        tprVar2 = tprVar;
                        if (M.J(tprVar2)) {
                            i8 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            i3 |= i8;
                        }
                    } else {
                        tprVar2 = tprVar;
                    }
                    i8 = 524288;
                    i3 |= i8;
                } else {
                    tprVar2 = tprVar;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= M.l(z) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i3 |= 33554432;
                }
                if ((i & 805306368) == 0) {
                    i3 |= M.y(izsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                }
                if (M.t(i3 & 1, (i3 & 306783379) != 306783378)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        q630 q630Var5 = i11 != 0 ? q630.a.a : q630Var2;
                        if ((i2 & 2) != 0) {
                            xvy a2 = zvy.a(0, 3, M);
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            xvyVar2 = a2;
                            i6 = 0;
                        } else {
                            i6 = 0;
                        }
                        if (i12 != 0) {
                            float f = i6;
                            s890Var4 = new u890(f, f, f, f);
                        } else {
                            s890Var4 = s890Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            eVar2 = androidx.compose.foundation.layout.a.a;
                        }
                        if (i4 != 0) {
                            dt1.a.getClass();
                            cVar2 = dt1.a.k;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            tprVar2 = k7b0.f(6, M);
                        }
                        q630Var4 = q630Var5;
                        i7 = (-234881025) & i3;
                        tprVar4 = tprVar2;
                        z3 = i5 == 0 ? z : true;
                        a = g490.a(M);
                        s890Var5 = s890Var4;
                    } else {
                        M.h();
                        if ((i2 & 2) != 0) {
                            i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        i7 = i3 & (-234881025);
                        z3 = z;
                        a = e490Var;
                        q630Var4 = q630Var2;
                        tprVar4 = tprVar2;
                        s890Var5 = s890Var2;
                    }
                    a.e eVar4 = eVar2;
                    dt1.c cVar4 = cVar2;
                    xvy xvyVar4 = xvyVar2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1884325601, i7, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:339)");
                    }
                    int i13 = i7 >> 3;
                    aVar2 = M;
                    evy.a(q630Var4, xvyVar4, s890Var5, false, tprVar4, z3, a, null, null, cVar4, eVar4, izsVar, aVar2, (i7 & 14) | 24576 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (458752 & i13) | (i13 & 3670016), ((i7 >> 12) & 112) | ((i7 >> 6) & 896) | ((i7 >> 18) & 7168), 1792);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var3 = q630Var4;
                    xvyVar3 = xvyVar4;
                    s890Var3 = s890Var5;
                    tprVar3 = tprVar4;
                    z2 = z3;
                    e490Var2 = a;
                    cVar3 = cVar4;
                    eVar3 = eVar4;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    q630Var3 = q630Var2;
                    xvyVar3 = xvyVar2;
                    s890Var3 = s890Var2;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    tprVar3 = tprVar2;
                    z2 = z;
                    e490Var2 = e490Var;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.jqy
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lqy.b(q630.this, xvyVar3, s890Var3, eVar3, cVar3, tprVar3, z2, e490Var2, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            cVar2 = cVar;
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (M.t(i3 & 1, (i3 & 306783379) != 306783378)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        s890Var2 = s890Var;
        if ((i2 & 8) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        cVar2 = cVar;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 306783379) != 306783378)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
