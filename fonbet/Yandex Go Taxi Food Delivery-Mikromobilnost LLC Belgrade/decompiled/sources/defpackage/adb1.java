package defpackage;

import androidx.compose.foundation.c;
import androidx.compose.foundation.gestures.g;
import androidx.compose.foundation.lazy.a;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.f;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayDeque;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class adb1 {
    /* JADX WARN: Removed duplicated region for block: B:118:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, b bVar, j690 j690Var, k43 k43Var, it1 it1Var, snr snrVar, boolean z, c cVar, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        b bVar2;
        j690 j690Var2;
        int i4;
        k43 k43Var2;
        int i5;
        it1 it1Var2;
        snr snrVar2;
        int i6;
        boolean z2;
        c cVar2;
        int i7;
        bts btsVar;
        f530 f530Var2;
        b bVar3;
        j690 j690Var3;
        k43 k43Var3;
        it1 it1Var3;
        snr snrVar3;
        boolean z3;
        c cVar3;
        aii0 v;
        int i8;
        k43 k43Var4;
        snr snrVar4;
        f530 f530Var3;
        b bVar4;
        k43 k43Var5;
        it1 it1Var4;
        snr snrVar5;
        boolean z4;
        c cVar4;
        j690 j690Var4;
        int i9;
        int i10;
        int i11;
        int i12;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(53695811);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                bVar2 = bVar;
                if (btsVar2.k(bVar2)) {
                    i12 = 32;
                    i3 |= i12;
                }
            } else {
                bVar2 = bVar;
            }
            i12 = 16;
            i3 |= i12;
        } else {
            bVar2 = bVar;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            j690Var2 = j690Var;
            i3 |= btsVar2.k(j690Var2) ? 256 : 128;
            i4 = i3 | HProv.ALG_TYPE_SECURECHANNEL;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
                if ((i2 & 16) == 0) {
                    k43Var2 = k43Var;
                    if (btsVar2.k(k43Var2)) {
                        i11 = 16384;
                        i4 |= i11;
                    }
                } else {
                    k43Var2 = k43Var;
                }
                i11 = 8192;
                i4 |= i11;
            } else {
                k43Var2 = k43Var;
            }
            i5 = i2 & 32;
            if (i5 == 0) {
                i4 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i) == 0) {
                it1Var2 = it1Var;
                i4 |= btsVar2.k(it1Var2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        snrVar2 = snrVar;
                        if (btsVar2.k(snrVar2)) {
                            i10 = 1048576;
                            i4 |= i10;
                        }
                    } else {
                        snrVar2 = snrVar;
                    }
                    i10 = 524288;
                    i4 |= i10;
                } else {
                    snrVar2 = snrVar;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    z2 = z;
                    i4 |= btsVar2.a(z2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    if ((100663296 & i) != 0) {
                        if ((i2 & 256) == 0) {
                            cVar2 = cVar;
                            if (btsVar2.k(cVar2)) {
                                i9 = SelfTester_JCP.DECRYPT_CBC;
                                i4 |= i9;
                            }
                        } else {
                            cVar2 = cVar;
                        }
                        i9 = SelfTester_JCP.DECRYPT_CFB;
                        i4 |= i9;
                    } else {
                        cVar2 = cVar;
                    }
                    if ((i & 805306368) == 0) {
                        i4 |= btsVar2.e(tlsVar) ? 536870912 : SelfTester_JCP.IMITA;
                    }
                    i7 = i4;
                    if (btsVar2.V(i7 & 1, (i4 & 306783379) == 306783378)) {
                        btsVar = btsVar2;
                        btsVar.Y();
                        f530Var2 = f530Var;
                        bVar3 = bVar2;
                        j690Var3 = j690Var2;
                        k43Var3 = k43Var2;
                        it1Var3 = it1Var2;
                        snrVar3 = snrVar2;
                        z3 = z2;
                        cVar3 = cVar2;
                    } else {
                        btsVar2.a0();
                        if ((i & 1) == 0 || btsVar2.C()) {
                            f530 f530Var4 = i13 != 0 ? c530.a : f530Var;
                            if ((i2 & 2) != 0) {
                                bVar2 = a7y.a(0, 3, btsVar2);
                                i8 = i7 & (-113);
                            } else {
                                i8 = i7;
                            }
                            j690 l690Var = i14 != 0 ? new l690(0.0f, 0.0f, 0.0f, 0.0f) : j690Var2;
                            if ((i2 & 16) != 0) {
                                i8 &= -57345;
                                k43Var4 = lr20.c;
                            } else {
                                k43Var4 = k43Var2;
                            }
                            it1 it1Var5 = i5 != 0 ? x4c.G : it1Var2;
                            if ((i2 & 64) != 0) {
                                gxg a = ist0.a(btsVar2);
                                boolean k = btsVar2.k(a);
                                Object Q = btsVar2.Q();
                                if (k || Q == did.a) {
                                    Q = new g(a);
                                    btsVar2.o0(Q);
                                }
                                snrVar4 = (g) Q;
                                i8 &= -3670017;
                            } else {
                                snrVar4 = snrVar2;
                            }
                            if (i6 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 256) != 0) {
                                i8 &= -234881025;
                                f530Var3 = f530Var4;
                                bVar4 = bVar2;
                                k43Var5 = k43Var4;
                                it1Var4 = it1Var5;
                                snrVar5 = snrVar4;
                                cVar4 = m290.a(btsVar2);
                                z4 = z2;
                            } else {
                                f530Var3 = f530Var4;
                                bVar4 = bVar2;
                                k43Var5 = k43Var4;
                                it1Var4 = it1Var5;
                                snrVar5 = snrVar4;
                                z4 = z2;
                                cVar4 = cVar2;
                            }
                            j690Var4 = l690Var;
                        } else {
                            btsVar2.Y();
                            i8 = (i2 & 2) != 0 ? i7 & (-113) : i7;
                            if ((i2 & 16) != 0) {
                                i8 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i8 &= -3670017;
                            }
                            if ((i2 & 256) != 0) {
                                i8 &= -234881025;
                            }
                            bVar4 = bVar2;
                            k43Var5 = k43Var2;
                            it1Var4 = it1Var2;
                            snrVar5 = snrVar2;
                            z4 = z2;
                            cVar4 = cVar2;
                            f530Var3 = f530Var;
                            j690Var4 = j690Var2;
                        }
                        btsVar2.u();
                        int i15 = i8 >> 3;
                        btsVar = btsVar2;
                        a.a(f530Var3, bVar4, j690Var4, true, snrVar5, z4, cVar4, it1Var4, k43Var5, null, null, tlsVar, btsVar, (i8 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (458752 & i15) | (3670016 & i15) | (i15 & 29360128) | ((i8 << 12) & 1879048192), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
                        f530Var2 = f530Var3;
                        bVar3 = bVar4;
                        j690Var3 = j690Var4;
                        snrVar3 = snrVar5;
                        z3 = z4;
                        cVar3 = cVar4;
                        it1Var3 = it1Var4;
                        k43Var3 = k43Var5;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new q3y(f530Var2, bVar3, j690Var3, k43Var3, it1Var3, snrVar3, z3, cVar3, tlsVar, i, i2, 0);
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((100663296 & i) != 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i7 = i4;
                if (btsVar2.V(i7 & 1, (i4 & 306783379) == 306783378)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            it1Var2 = it1Var;
            if ((1572864 & i) == 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            z2 = z;
            if ((100663296 & i) != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i7 = i4;
            if (btsVar2.V(i7 & 1, (i4 & 306783379) == 306783378)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        j690Var2 = j690Var;
        i4 = i3 | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        it1Var2 = it1Var;
        if ((1572864 & i) == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        z2 = z;
        if ((100663296 & i) != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i7 = i4;
        if (btsVar2.V(i7 & 1, (i4 & 306783379) == 306783378)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, b bVar, j690 j690Var, h43 h43Var, to5 to5Var, snr snrVar, boolean z, c cVar, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        b bVar2;
        j690 j690Var2;
        h43 h43Var2;
        int i4;
        to5 to5Var2;
        snr snrVar2;
        int i5;
        boolean z2;
        c cVar2;
        int i6;
        bts btsVar;
        f530 f530Var2;
        b bVar3;
        j690 j690Var3;
        h43 h43Var3;
        to5 to5Var3;
        snr snrVar3;
        boolean z3;
        aii0 v;
        int i7;
        j690 j690Var4;
        h43 h43Var4;
        c cVar3;
        to5 to5Var4;
        snr snrVar4;
        boolean z4;
        f530 f530Var3;
        int i8;
        int i9;
        int i10;
        int i11;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1884325601);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                bVar2 = bVar;
                if (btsVar2.k(bVar2)) {
                    i11 = 32;
                    i3 |= i11;
                }
            } else {
                bVar2 = bVar;
            }
            i11 = 16;
            i3 |= i11;
        } else {
            bVar2 = bVar;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            j690Var2 = j690Var;
            i3 |= btsVar2.k(j690Var2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar2.a(false) ? 2048 : 1024;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
                if ((i2 & 16) == 0) {
                    h43Var2 = h43Var;
                    if (btsVar2.k(h43Var2)) {
                        i10 = 16384;
                        i3 |= i10;
                    }
                } else {
                    h43Var2 = h43Var;
                }
                i10 = 8192;
                i3 |= i10;
            } else {
                h43Var2 = h43Var;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i) == 0) {
                to5Var2 = to5Var;
                i3 |= btsVar2.k(to5Var2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        snrVar2 = snrVar;
                        if (btsVar2.k(snrVar2)) {
                            i9 = 1048576;
                            i3 |= i9;
                        }
                    } else {
                        snrVar2 = snrVar;
                    }
                    i9 = 524288;
                    i3 |= i9;
                } else {
                    snrVar2 = snrVar;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    z2 = z;
                    i3 |= btsVar2.a(z2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    if ((i & 100663296) != 0) {
                        if ((i2 & 256) == 0) {
                            cVar2 = cVar;
                            if (btsVar2.k(cVar2)) {
                                i8 = SelfTester_JCP.DECRYPT_CBC;
                                i3 |= i8;
                            }
                        } else {
                            cVar2 = cVar;
                        }
                        i8 = SelfTester_JCP.DECRYPT_CFB;
                        i3 |= i8;
                    } else {
                        cVar2 = cVar;
                    }
                    if ((i & 805306368) != 0) {
                        i6 = i12;
                        i3 |= btsVar2.e(tlsVar) ? 536870912 : SelfTester_JCP.IMITA;
                    } else {
                        i6 = i12;
                    }
                    if (btsVar2.V(i3 & 1, (i3 & 306783379) == 306783378)) {
                        btsVar = btsVar2;
                        btsVar.Y();
                        f530Var2 = f530Var;
                        bVar3 = bVar2;
                        j690Var3 = j690Var2;
                        h43Var3 = h43Var2;
                        to5Var3 = to5Var2;
                        snrVar3 = snrVar2;
                        z3 = z2;
                    } else {
                        btsVar2.a0();
                        if ((i & 1) == 0 || btsVar2.C()) {
                            f530 f530Var4 = i6 != 0 ? c530.a : f530Var;
                            if ((i2 & 2) != 0) {
                                i7 = -234881025;
                                i3 &= -113;
                                bVar2 = a7y.a(0, 3, btsVar2);
                            } else {
                                i7 = -234881025;
                            }
                            if (i13 != 0) {
                                j690Var2 = new l690(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                h43Var2 = lr20.a;
                            }
                            if (i4 != 0) {
                                to5Var2 = x4c.D;
                            }
                            if ((i2 & 64) != 0) {
                                gxg a = ist0.a(btsVar2);
                                boolean k = btsVar2.k(a);
                                Object Q = btsVar2.Q();
                                if (k || Q == did.a) {
                                    Q = new g(a);
                                    btsVar2.o0(Q);
                                }
                                i3 &= -3670017;
                                snrVar2 = (g) Q;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= i7;
                                cVar3 = m290.a(btsVar2);
                                j690Var4 = j690Var2;
                                h43Var4 = h43Var2;
                            } else {
                                j690Var4 = j690Var2;
                                h43Var4 = h43Var2;
                                cVar3 = cVar2;
                            }
                            to5Var4 = to5Var2;
                            snrVar4 = snrVar2;
                            z4 = z2;
                            f530Var3 = f530Var4;
                        } else {
                            btsVar2.Y();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
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
                            j690Var4 = j690Var2;
                            h43Var4 = h43Var2;
                            cVar3 = cVar2;
                            to5Var4 = to5Var2;
                            snrVar4 = snrVar2;
                            z4 = z2;
                            f530Var3 = f530Var;
                        }
                        b bVar4 = bVar2;
                        btsVar2.u();
                        int i14 = i3 >> 3;
                        btsVar = btsVar2;
                        a.a(f530Var3, bVar4, j690Var4, false, snrVar4, z4, cVar3, null, null, to5Var4, h43Var4, tlsVar, btsVar, (i3 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
                        f530Var2 = f530Var3;
                        bVar3 = bVar4;
                        j690Var3 = j690Var4;
                        snrVar3 = snrVar4;
                        z3 = z4;
                        cVar2 = cVar3;
                        to5Var3 = to5Var4;
                        h43Var3 = h43Var4;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new q3y(f530Var2, bVar3, j690Var3, h43Var3, to5Var3, snrVar3, z3, cVar2, tlsVar, i, i2, 1);
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((i & 100663296) != 0) {
                }
                if ((i & 805306368) != 0) {
                }
                if (btsVar2.V(i3 & 1, (i3 & 306783379) == 306783378)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            to5Var2 = to5Var;
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i & 100663296) != 0) {
            }
            if ((i & 805306368) != 0) {
            }
            if (btsVar2.V(i3 & 1, (i3 & 306783379) == 306783378)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        j690Var2 = j690Var;
        if ((i2 & 8) == 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        to5Var2 = to5Var;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i & 100663296) != 0) {
        }
        if ((i & 805306368) != 0) {
        }
        if (btsVar2.V(i3 & 1, (i3 & 306783379) == 306783378)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void c(f530 f530Var, b bVar, l690 l690Var, h43 h43Var, to5 to5Var, snr snrVar, boolean z, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        boolean z2;
        f530 f530Var3;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1724297413);
        int i2 = i | 6 | (btsVar.k(bVar) ? 32 : 16) | (btsVar.k(l690Var) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL | (btsVar.k(h43Var) ? 16384 : 8192) | (btsVar.k(snrVar) ? 1048576 : 524288) | 12582912 | (btsVar.e(tlsVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
        if (btsVar.V(i2 & 1, (38347923 & i2) != 38347922)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                f530Var3 = c530.a;
                z3 = true;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
                z3 = z;
            }
            btsVar.u();
            int i3 = (33554430 & i2) | ((i2 << 3) & 1879048192);
            f530 f530Var4 = f530Var3;
            b(f530Var4, bVar, l690Var, h43Var, to5Var, snrVar, z3, m290.a(btsVar), tlsVar, btsVar, i3, 0);
            f530Var2 = f530Var4;
            z2 = z3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            z2 = z;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fc0(f530Var2, bVar, l690Var, h43Var, to5Var, snrVar, z2, tlsVar, i);
        }
    }

    public static final void d(egs0 egs0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-696785482);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar2.k(egs0Var) : btsVar2.e(egs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = n.f(egs0Var.b, btsVar2);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = n.f(egs0Var.c, btsVar2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = f.j(String.valueOf((int) egs0Var.a));
                btsVar2.o0(Q3);
            }
            oz40 oz40Var3 = (oz40) Q3;
            Object Q4 = btsVar2.Q();
            if (Q4 == o430Var) {
                Q4 = f.j(Boolean.FALSE);
                btsVar2.o0(Q4);
            }
            btsVar = btsVar2;
            qy20.a(null, null, null, false, wwg.S(126634964, true, new ags0(oz40Var, oz40Var2, oz40Var3, (oz40) Q4, tlsVar, egs0Var, 0), btsVar2), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(egs0Var, tlsVar, i, i3);
        }
    }

    public static byte[] e(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] f(o77 o77Var) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = o77Var.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return e(arrayDeque, i);
                }
                i2 += read;
                i += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (o77Var.read() == -1) {
            return e(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
