package defpackage;

import androidx.compose.foundation.text.g;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.navigator.incidents.AnalyticsIncidentType;
import com.yandex.go.navigator.incidents.IncidentType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class m5b1 {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final kk2 kk2Var, final f530 f530Var, final ety0 ety0Var, tls tlsVar, final int i, boolean z, final int i2, int i3, final Map map, xfc xfcVar, fid fidVar, final int i4, final int i5, final int i6) {
        int i7;
        f530 f530Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        bts btsVar;
        final tls tlsVar2;
        final boolean z2;
        final int i14;
        final xfc xfcVar2;
        aii0 v;
        tls tlsVar3;
        int i15;
        boolean z3;
        lkq0 lkq0Var;
        boolean z4;
        boolean z5;
        tls tlsVar4;
        boolean z6;
        List list;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1343466571);
        if ((i4 & 6) == 0) {
            i7 = (btsVar2.k(kk2Var) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            f530Var2 = f530Var;
            i7 |= btsVar2.k(f530Var2) ? 32 : 16;
        } else {
            f530Var2 = f530Var;
        }
        if ((i4 & 384) == 0) {
            i7 |= btsVar2.k(ety0Var) ? 256 : 128;
        }
        int i16 = i6 & 8;
        if (i16 != 0) {
            i7 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i7 |= btsVar2.e(tlsVar) ? 2048 : 1024;
            if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i7 |= btsVar2.c(i) ? 16384 : 8192;
            }
            i8 = i6 & 32;
            if (i8 == 0) {
                i7 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i4) == 0) {
                i7 |= btsVar2.a(z) ? 131072 : 65536;
                if ((1572864 & i4) == 0) {
                    i7 |= btsVar2.c(i2) ? 1048576 : 524288;
                }
                i9 = i6 & 128;
                if (i9 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= btsVar2.c(i3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                }
                if ((i4 & 100663296) == 0) {
                    i10 = i16;
                    i7 |= btsVar2.e(map) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                } else {
                    i10 = i16;
                }
                i11 = i6 & 512;
                if (i11 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    i12 = i7 | (btsVar2.e(xfcVar) ? 536870912 : SelfTester_JCP.IMITA);
                    if ((i6 & 1024) == 0) {
                        i13 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        i13 = i5 | ((i5 & 8) == 0 ? btsVar2.k(null) : btsVar2.e(null) ? 4 : 2);
                    } else {
                        i13 = i5;
                    }
                    if (btsVar2.V(i12 & 1, (i12 & 306783379) == 306783378 || (i13 & 3) != 2)) {
                        btsVar = btsVar2;
                        btsVar.Y();
                        tlsVar2 = tlsVar;
                        z2 = z;
                        i14 = i3;
                        xfcVar2 = xfcVar;
                    } else {
                        tls tlsVar5 = i10 != 0 ? null : tlsVar;
                        boolean z7 = i8 != 0 ? true : z;
                        int i17 = i9 != 0 ? 1 : i3;
                        xfc xfcVar3 = i11 != 0 ? null : xfcVar;
                        v0b1.c(i17, i2);
                        zkq0 zkq0Var = (zkq0) btsVar2.m(alq0.a);
                        Object obj = did.a;
                        if (zkq0Var != null) {
                            btsVar2.e0(1588268245);
                            long j = ((osy0) btsVar2.m(psy0.a)).b;
                            Object[] objArr = {zkq0Var};
                            tlsVar3 = tlsVar5;
                            i15 = i13;
                            z3 = z7;
                            tig0 tig0Var = new tig0(new tn1(22, zkq0Var), new l75(9));
                            boolean e = btsVar2.e(zkq0Var);
                            Object Q = btsVar2.Q();
                            if (e || Q == obj) {
                                Q = new oe5(zkq0Var, 1);
                                btsVar2.o0(Q);
                            }
                            long longValue = ((Number) cvw.W(objArr, tig0Var, (sls) Q, btsVar2, 0)).longValue();
                            boolean d = btsVar2.d(longValue) | btsVar2.k(zkq0Var) | btsVar2.d(j);
                            Object Q2 = btsVar2.Q();
                            if (d || Q2 == obj) {
                                Q2 = new lkq0(longValue, zkq0Var, j);
                                btsVar2.o0(Q2);
                            }
                            btsVar2.t(false);
                            lkq0Var = (lkq0) Q2;
                        } else {
                            tlsVar3 = tlsVar5;
                            i15 = i13;
                            z3 = z7;
                            btsVar2.e0(1588759409);
                            btsVar2.t(false);
                            lkq0Var = null;
                        }
                        Pair pair = pk2.a;
                        int length = kk2Var.b.length();
                        List list2 = kk2Var.a;
                        if (list2 != null) {
                            int size = list2.size();
                            int i18 = 0;
                            while (i18 < size) {
                                ik2 ik2Var = (ik2) list2.get(i18);
                                if (ik2Var.a instanceof wsu0) {
                                    list = list2;
                                    if ("androidx.compose.foundation.text.inlineContent".equals(ik2Var.d)) {
                                        z4 = false;
                                        if (mk2.d(0, length, ik2Var.b, ik2Var.c)) {
                                            z5 = true;
                                            break;
                                        } else {
                                            i18++;
                                            list2 = list;
                                        }
                                    }
                                } else {
                                    list = list2;
                                }
                                i18++;
                                list2 = list;
                            }
                        }
                        z4 = false;
                        z5 = false;
                        boolean b = ilb1.b(kk2Var);
                        dyr dyrVar = (dyr) btsVar2.m(j.k);
                        if (z5 || b) {
                            tlsVar4 = tlsVar3;
                            z6 = z3;
                            btsVar = btsVar2;
                            boolean z8 = z4;
                            btsVar.e0(1590022070);
                            boolean z9 = (i12 & 14) == 4 ? true : z8;
                            Object Q3 = btsVar.Q();
                            if (z9 || Q3 == obj) {
                                Q3 = f.j(kk2Var);
                                btsVar.o0(Q3);
                            }
                            oz40 oz40Var = (oz40) Q3;
                            kk2 kk2Var2 = (kk2) oz40Var.getValue();
                            boolean k = btsVar.k(oz40Var);
                            Object Q4 = btsVar.Q();
                            if (k || Q4 == obj) {
                                Q4 = new w5(11, oz40Var);
                                btsVar.o0(Q4);
                            }
                            int i19 = i12 << 6;
                            c(f530Var, kk2Var2, tlsVar4, z5, map, ety0Var, i, z6, i2, i17, dyrVar, lkq0Var, xfcVar3, (tls) Q4, null, btsVar, ((i12 >> 3) & 910) | ((i12 >> 12) & HProv.ALG_CLASS_ALL) | ((i12 << 9) & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & i19) | (29360128 & i19) | (234881024 & i19) | (i19 & 1879048192), ((i12 >> 21) & 896) | ((i15 << 12) & HProv.ALG_CLASS_ALL));
                            btsVar.t(false);
                        } else {
                            btsVar2.e0(1589006262);
                            ve5.a(kk2Var, ety0Var, dyrVar, null, btsVar2);
                            int i20 = i17;
                            btsVar = btsVar2;
                            tls tlsVar6 = tlsVar3;
                            boolean z10 = z3;
                            f530 f = f(f530Var2, kk2Var, ety0Var, tlsVar6, i, z10, i2, i20, dyrVar, null, null, lkq0Var, xfcVar3, null, null);
                            tlsVar4 = tlsVar6;
                            i17 = i20;
                            z6 = z10;
                            int hashCode = Long.hashCode(btsVar.T);
                            f530 d2 = b.d(btsVar, f);
                            r1b0 o = btsVar.o();
                            ohd.G1.getClass();
                            sls slsVar = d.b;
                            if (btsVar.a == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar.i0();
                            if (btsVar.S) {
                                btsVar.n(slsVar);
                            } else {
                                btsVar.r0();
                            }
                            qje.W(btsVar, d.f, lwn.a);
                            qje.W(btsVar, d.e, o);
                            qje.M(btsVar, d.h);
                            qje.W(btsVar, d.d, d2);
                            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                            btsVar.t(true);
                            btsVar.t(false);
                        }
                        tlsVar2 = tlsVar4;
                        z2 = z6;
                        i14 = i17;
                        xfcVar2 = xfcVar3;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: se5
                            @Override // defpackage.wls
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int O = vng.O(i4 | 1);
                                int O2 = vng.O(i5);
                                m5b1.a(kk2.this, f530Var, ety0Var, tlsVar2, i, z2, i2, i14, map, xfcVar2, (fid) obj2, O, O2, i6);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i12 = i7;
                if ((i6 & 1024) == 0) {
                }
                if (btsVar2.V(i12 & 1, (i12 & 306783379) == 306783378 || (i13 & 3) != 2)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            if ((1572864 & i4) == 0) {
            }
            i9 = i6 & 128;
            if (i9 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i11 = i6 & 512;
            if (i11 != 0) {
            }
            i12 = i7;
            if ((i6 & 1024) == 0) {
            }
            if (btsVar2.V(i12 & 1, (i12 & 306783379) == 306783378 || (i13 & 3) != 2)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        i8 = i6 & 32;
        if (i8 == 0) {
        }
        if ((1572864 & i4) == 0) {
        }
        i9 = i6 & 128;
        if (i9 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i11 = i6 & 512;
        if (i11 != 0) {
        }
        i12 = i7;
        if ((i6 & 1024) == 0) {
        }
        if (btsVar2.V(i12 & 1, (i12 & 306783379) == 306783378 || (i13 & 3) != 2)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, f530 f530Var, final ety0 ety0Var, tls tlsVar, int i, boolean z, int i2, int i3, xfc xfcVar, xt3 xt3Var, fid fidVar, final int i4, final int i5) {
        int i6;
        f530 f530Var2;
        int i7;
        tls tlsVar2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final String str2;
        final int i17;
        final xt3 xt3Var2;
        final f530 f530Var3;
        final tls tlsVar3;
        final int i18;
        bts btsVar;
        final boolean z2;
        final int i19;
        final xfc xfcVar2;
        aii0 v;
        int i20;
        boolean z3;
        lkq0 lkq0Var;
        boolean z4;
        int i21;
        int i22;
        f530 f;
        int i23;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (btsVar2.k(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i24 = i5 & 2;
        if (i24 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            f530Var2 = f530Var;
            i6 |= btsVar2.k(f530Var2) ? 32 : 16;
            if ((i4 & 384) == 0) {
                i6 |= btsVar2.k(ety0Var) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                tlsVar2 = tlsVar;
                i6 |= btsVar2.e(tlsVar2) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i9 = i;
                    i6 |= btsVar2.c(i9) ? 16384 : 8192;
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i6 |= ImageMetadata.EDGE_MODE;
                    } else if ((196608 & i4) == 0) {
                        i6 |= btsVar2.a(z) ? 131072 : 65536;
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i6 |= btsVar2.c(i2) ? 1048576 : 524288;
                        }
                        i12 = i5 & 128;
                        if (i12 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i13 = i12;
                            i6 |= btsVar2.c(i3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                            i14 = i5 & 256;
                            if (i14 == 0) {
                                i6 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                i15 = i14;
                                i6 |= btsVar2.e(xfcVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                                i16 = i5 & 512;
                                int i25 = 805306368;
                                if (i16 == 0) {
                                    if ((i4 & 805306368) == 0) {
                                        i25 = (i4 & 1073741824) == 0 ? btsVar2.k(xt3Var) : btsVar2.e(xt3Var) ? 536870912 : SelfTester_JCP.IMITA;
                                    }
                                    if (btsVar2.V(i6 & 1, (i6 & 306783379) == 306783378)) {
                                        str2 = str;
                                        btsVar2.Y();
                                        i17 = i2;
                                        xt3Var2 = xt3Var;
                                        f530Var3 = f530Var2;
                                        tlsVar3 = tlsVar2;
                                        i18 = i9;
                                        btsVar = btsVar2;
                                        z2 = z;
                                        i19 = i3;
                                        xfcVar2 = xfcVar;
                                    } else {
                                        f530 f530Var4 = i24 != 0 ? c530.a : f530Var2;
                                        int i26 = i13;
                                        tls tlsVar4 = i7 != 0 ? null : tlsVar2;
                                        int i27 = i8 != 0 ? 1 : i9;
                                        boolean z5 = i10 != 0 ? true : z;
                                        int i28 = i11 != 0 ? Integer.MAX_VALUE : i2;
                                        int i29 = i26 != 0 ? 1 : i3;
                                        xfc xfcVar3 = i15 != 0 ? null : xfcVar;
                                        xt3 xt3Var3 = i16 != 0 ? null : xt3Var;
                                        v0b1.c(i29, i28);
                                        zkq0 zkq0Var = (zkq0) btsVar2.m(alq0.a);
                                        if (zkq0Var != null) {
                                            btsVar2.e0(356423075);
                                            long j = ((osy0) btsVar2.m(psy0.a)).b;
                                            Object[] objArr = {zkq0Var};
                                            i20 = i27;
                                            tig0 tig0Var = new tig0(new tn1(22, zkq0Var), new l75(9));
                                            boolean e = btsVar2.e(zkq0Var);
                                            Object Q = btsVar2.Q();
                                            z3 = z5;
                                            o430 o430Var = did.a;
                                            if (e || Q == o430Var) {
                                                i23 = 0;
                                                Q = new oe5(zkq0Var, 0);
                                                btsVar2.o0(Q);
                                            } else {
                                                i23 = 0;
                                            }
                                            long longValue = ((Number) cvw.W(objArr, tig0Var, (sls) Q, btsVar2, i23)).longValue();
                                            boolean d = btsVar2.d(longValue) | btsVar2.k(zkq0Var) | btsVar2.d(j);
                                            Object Q2 = btsVar2.Q();
                                            if (d || Q2 == o430Var) {
                                                Q2 = new lkq0(longValue, zkq0Var, j);
                                                btsVar2.o0(Q2);
                                            }
                                            btsVar2.t(false);
                                            lkq0Var = (lkq0) Q2;
                                        } else {
                                            i20 = i27;
                                            z3 = z5;
                                            btsVar2.e0(356914239);
                                            btsVar2.t(false);
                                            lkq0Var = null;
                                        }
                                        dyr dyrVar = (dyr) btsVar2.m(j.k);
                                        Executor executor = (Executor) btsVar2.m(ve5.a);
                                        if (executor == null || !ve5.b(str.length())) {
                                            z4 = false;
                                            btsVar2.e0(1255914055);
                                            btsVar2.t(false);
                                        } else {
                                            btsVar2.e0(1254298614);
                                            try {
                                                try {
                                                    executor.execute(new te5(ety0Var, (LayoutDirection) btsVar2.m(j.n), str, (fwi) btsVar2.m(j.h), dyrVar, 0));
                                                } catch (RejectedExecutionException unused) {
                                                    dyrVar = dyrVar;
                                                }
                                            } catch (RejectedExecutionException unused2) {
                                            }
                                            z4 = false;
                                            btsVar2.t(false);
                                        }
                                        if (lkq0Var == null && tlsVar4 == null && xt3Var3 == null) {
                                            btsVar2.e0(357875859);
                                            btsVar2.t(z4);
                                            str2 = str;
                                            i21 = i28;
                                            i22 = i29;
                                            f = f530Var4.k(new xsy0(str2, ety0Var, dyrVar, i20, z3, i28, i29, xfcVar3));
                                        } else {
                                            str2 = str;
                                            i21 = i28;
                                            i22 = i29;
                                            btsVar2.e0(357232113);
                                            f = f(f530Var4, new kk2(str2), ety0Var, tlsVar4, i20, z3, i21, i22, (dyr) btsVar2.m(j.k), null, null, lkq0Var, xfcVar3, null, xt3Var3);
                                            btsVar2.t(false);
                                        }
                                        int hashCode = Long.hashCode(btsVar2.T);
                                        f530 d2 = b.d(btsVar2, f);
                                        r1b0 o = btsVar2.o();
                                        ohd.G1.getClass();
                                        sls slsVar = d.b;
                                        if (btsVar2.a == null) {
                                            cma1.b0();
                                            throw null;
                                        }
                                        btsVar2.i0();
                                        if (btsVar2.S) {
                                            btsVar2.n(slsVar);
                                        } else {
                                            btsVar2.r0();
                                        }
                                        qje.W(btsVar2, d.f, lwn.a);
                                        qje.W(btsVar2, d.e, o);
                                        qje.M(btsVar2, d.h);
                                        qje.W(btsVar2, d.d, d2);
                                        qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                        btsVar2.t(true);
                                        btsVar = btsVar2;
                                        f530Var3 = f530Var4;
                                        tlsVar3 = tlsVar4;
                                        i18 = i20;
                                        z2 = z3;
                                        i17 = i21;
                                        xt3Var2 = xt3Var3;
                                        xfcVar2 = xfcVar3;
                                        i19 = i22;
                                    }
                                    v = btsVar.v();
                                    if (v == null) {
                                        v.d = new wls() { // from class: re5
                                            @Override // defpackage.wls
                                            public final Object invoke(Object obj, Object obj2) {
                                                ((Integer) obj2).getClass();
                                                m5b1.b(str2, f530Var3, ety0Var, tlsVar3, i18, z2, i17, i19, xfcVar2, xt3Var2, (fid) obj, vng.O(i4 | 1), i5);
                                                return zy11.a;
                                            }
                                        };
                                        return;
                                    }
                                    return;
                                }
                                i6 |= i25;
                                if (btsVar2.V(i6 & 1, (i6 & 306783379) == 306783378)) {
                                }
                                v = btsVar.v();
                                if (v == null) {
                                }
                            }
                            i15 = i14;
                            i16 = i5 & 512;
                            int i252 = 805306368;
                            if (i16 == 0) {
                            }
                            i6 |= i252;
                            if (btsVar2.V(i6 & 1, (i6 & 306783379) == 306783378)) {
                            }
                            v = btsVar.v();
                            if (v == null) {
                            }
                        }
                        i13 = i12;
                        i14 = i5 & 256;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        i16 = i5 & 512;
                        int i2522 = 805306368;
                        if (i16 == 0) {
                        }
                        i6 |= i2522;
                        if (btsVar2.V(i6 & 1, (i6 & 306783379) == 306783378)) {
                        }
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i5 & 256;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    i16 = i5 & 512;
                    int i25222 = 805306368;
                    if (i16 == 0) {
                    }
                    i6 |= i25222;
                    if (btsVar2.V(i6 & 1, (i6 & 306783379) == 306783378)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                i9 = i;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i5 & 256;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i5 & 512;
                int i252222 = 805306368;
                if (i16 == 0) {
                }
                i6 |= i252222;
                if (btsVar2.V(i6 & 1, (i6 & 306783379) == 306783378)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            tlsVar2 = tlsVar;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i5 & 256;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i5 & 512;
            int i2522222 = 805306368;
            if (i16 == 0) {
            }
            i6 |= i2522222;
            if (btsVar2.V(i6 & 1, (i6 & 306783379) == 306783378)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        if ((i4 & 384) == 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        tlsVar2 = tlsVar;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i5 & 256;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i5 & 512;
        int i25222222 = 805306368;
        if (i16 == 0) {
        }
        i6 |= i25222222;
        if (btsVar2.V(i6 & 1, (i6 & 306783379) == 306783378)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.compose.foundation.text.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4, types: [bts, fid] */
    /* JADX WARN: Type inference failed for: r7v1, types: [bts, fid] */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList] */
    public static final void c(f530 f530Var, kk2 kk2Var, tls tlsVar, boolean z, Map map, ety0 ety0Var, int i, boolean z2, int i2, int i3, dyr dyrVar, lkq0 lkq0Var, xfc xfcVar, tls tlsVar2, xt3 xt3Var, fid fidVar, int i4, int i5) {
        int i6;
        int i7;
        bts btsVar;
        ?? r0;
        mw2 mw2Var;
        sls slsVar;
        Pair pair;
        Object obj;
        oz40 oz40Var;
        int i8;
        tls tlsVar3;
        Object kry0Var;
        Collection collection;
        int i9;
        Map map2 = map;
        ?? r7 = (bts) fidVar;
        r7.g0(-2118572703);
        if ((i4 & 6) == 0) {
            i6 = (r7.k(f530Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= r7.k(kk2Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= r7.e(tlsVar) ? 256 : 128;
        }
        if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i6 |= r7.a(z) ? 2048 : 1024;
        }
        if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i6 |= r7.e(map2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= r7.k(ety0Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i6 |= r7.c(i) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= r7.a(z2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= r7.c(i2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= r7.c(i3) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (r7.e(dyrVar) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= r7.e(lkq0Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= r7.e(xfcVar) ? 256 : 128;
        }
        if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i7 |= r7.e(tlsVar2) ? 2048 : 1024;
        }
        if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i7 |= (32768 & i5) == 0 ? r7.k(xt3Var) : r7.e(xt3Var) ? 16384 : 8192;
        }
        if (r7.V(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            boolean b = ilb1.b(kk2Var);
            o430 o430Var = did.a;
            if (b) {
                r7.e0(145641571);
                boolean z3 = (i6 & 112) == 32;
                Object Q = r7.Q();
                Object obj2 = Q;
                if (z3 || Q == o430Var) {
                    g gVar = new g(kk2Var);
                    r7.o0(gVar);
                    obj2 = gVar;
                }
                r7.t(false);
                r0 = (g) obj2;
            } else {
                r7.e0(145707228);
                r7.t(false);
                r0 = 0;
            }
            if (ilb1.b(kk2Var)) {
                r7.e0(145905443);
                boolean k = ((i6 & 112) == 32) | r7.k(r0);
                ?? Q2 = r7.Q();
                mw2 mw2Var2 = Q2;
                if (k || Q2 == o430Var) {
                    mw2 mw2Var3 = new mw2(24, r0, kk2Var);
                    r7.o0(mw2Var3);
                    mw2Var2 = mw2Var3;
                }
                mw2Var = mw2Var2;
                r7.t(false);
            } else {
                r7.e0(146002721);
                boolean z4 = (i6 & 112) == 32;
                Object Q3 = r7.Q();
                Object obj3 = Q3;
                if (z4 || Q3 == o430Var) {
                    l95 l95Var = new l95(11, kk2Var);
                    r7.o0(l95Var);
                    obj3 = l95Var;
                }
                mw2Var = (sls) obj3;
                r7.t(false);
            }
            if (z) {
                if (map2 != null) {
                    Pair pair2 = pk2.a;
                    if (!map2.isEmpty()) {
                        int length = kk2Var.b.length();
                        slsVar = mw2Var;
                        List list = kk2Var.a;
                        if (list != null) {
                            collection = new ArrayList(list.size());
                            int size = list.size();
                            int i10 = 0;
                            while (i10 < size) {
                                List list2 = list;
                                ik2 ik2Var = (ik2) list.get(i10);
                                int i11 = size;
                                Object obj4 = ik2Var.a;
                                int i12 = i10;
                                int i13 = ik2Var.c;
                                int i14 = ik2Var.b;
                                String str = ik2Var.d;
                                if ((obj4 instanceof wsu0) && "androidx.compose.foundation.text.inlineContent".equals(str) && mk2.d(0, length, i14, i13)) {
                                    collection.add(new ik2(i14, i13, ((wsu0) ik2Var.a).a, str));
                                }
                                i10 = i12 + 1;
                                size = i11;
                                list = list2;
                            }
                        } else {
                            collection = EmptyList.a;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = collection.size();
                        int i15 = 0;
                        List list3 = collection;
                        while (i15 < size2) {
                            ik2 ik2Var2 = (ik2) list3.get(i15);
                            Object obj5 = ik2Var2.a;
                            List list4 = list3;
                            int i16 = ik2Var2.c;
                            int i17 = ik2Var2.b;
                            oxv oxvVar = (oxv) map2.get(obj5);
                            if (oxvVar != null) {
                                i9 = size2;
                                arrayList.add(new ik2(oxvVar.a, i17, i16));
                                arrayList2.add(new ik2(oxvVar.b, i17, i16));
                            } else {
                                i9 = size2;
                            }
                            i15++;
                            map2 = map;
                            list3 = list4;
                            size2 = i9;
                        }
                        pair = new Pair(arrayList, arrayList2);
                        obj = null;
                    }
                }
                slsVar = mw2Var;
                pair = pk2.a;
                obj = null;
            } else {
                slsVar = mw2Var;
                obj = null;
                pair = new Pair(null, null);
            }
            List list5 = (List) pair.getFirst();
            List list6 = (List) pair.getSecond();
            if (z) {
                r7.e0(146318828);
                ?? Q4 = r7.Q();
                oz40 oz40Var2 = Q4;
                if (Q4 == o430Var) {
                    oz40 j = f.j(obj);
                    r7.o0(j);
                    oz40Var2 = j;
                }
                oz40Var = oz40Var2;
                r7.t(false);
            } else {
                r7.e0(146406588);
                r7.t(false);
                oz40Var = null;
            }
            if (z) {
                r7.e0(146499837);
                boolean k2 = r7.k(oz40Var);
                ?? Q5 = r7.Q();
                w5 w5Var = Q5;
                if (k2 || Q5 == o430Var) {
                    w5 w5Var2 = new w5(12, oz40Var);
                    r7.o0(w5Var2);
                    w5Var = w5Var2;
                }
                i8 = 0;
                r7.t(false);
                tlsVar3 = w5Var;
            } else {
                i8 = 0;
                r7.e0(146571260);
                r7.t(false);
                tlsVar3 = null;
            }
            int i18 = (i6 >> 3) & 14;
            ve5.a(kk2Var, ety0Var, dyrVar, list5, r7);
            kk2 kk2Var2 = (kk2) slsVar.invoke();
            int i19 = ((i6 & 896) == 256 ? 1 : i8) | (r7.e(r0) ? 1 : 0);
            Object Q6 = r7.Q();
            Object obj6 = Q6;
            if (i19 != 0 || Q6 == o430Var) {
                pe5 pe5Var = new pe5(r0, tlsVar, i8);
                r7.o0(pe5Var);
                obj6 = pe5Var;
            }
            ?? r3 = r7;
            ?? r2 = i8;
            f530 f = f(f530Var, kk2Var2, ety0Var, (tls) obj6, i, z2, i2, i3, dyrVar, list5, tlsVar3, lkq0Var, xfcVar, tlsVar2, xt3Var);
            if (z) {
                r3.e0(147927697);
                boolean e = r3.e(r0);
                Object Q7 = r3.Q();
                Object obj7 = Q7;
                if (e || Q7 == o430Var) {
                    qe5 qe5Var = new qe5(r0, 1);
                    r3.o0(qe5Var);
                    obj7 = qe5Var;
                }
                sls slsVar2 = (sls) obj7;
                boolean k3 = r3.k(oz40Var);
                Object Q8 = r3.Q();
                Object obj8 = Q8;
                if (k3 || Q8 == o430Var) {
                    w01 w01Var = new w01(3, oz40Var);
                    r3.o0(w01Var);
                    obj8 = w01Var;
                }
                kry0Var = new kry0(slsVar2, (sls) obj8);
                r3.t(r2);
            } else {
                r3.e0(147750935);
                boolean e2 = r3.e(r0);
                Object Q9 = r3.Q();
                Object obj9 = Q9;
                if (e2 || Q9 == o430Var) {
                    qe5 qe5Var2 = new qe5(r0, r2 == true ? 1 : 0);
                    r3.o0(qe5Var2);
                    obj9 = qe5Var2;
                }
                kry0Var = new dqy((sls) obj9);
                r3.t(r2);
            }
            int hashCode = Long.hashCode(r3.T);
            r1b0 o = r3.o();
            f530 d = b.d(r3, f);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (r3.a == null) {
                cma1.b0();
                throw null;
            }
            r3.i0();
            if (r3.S) {
                r3.n(slsVar3);
            } else {
                r3.r0();
            }
            qje.W(r3, d.f, kry0Var);
            qje.W(r3, d.e, o);
            qje.W(r3, d.g, Integer.valueOf(hashCode));
            qje.M(r3, d.h);
            qje.W(r3, d.d, d);
            if (r0 == 0) {
                r3.e0(-433557001);
            } else {
                r3.e0(-291080374);
                r0.a(r3, r2 == true ? 1 : 0);
            }
            r3.t(r2);
            if (list6 == null) {
                r3.e0(-433506223);
                r3.t(r2);
            } else {
                r3.e0(-433506222);
                pk2.a(kk2Var, list6, r3, i18);
                r3.t(r2);
            }
            r3.t(true);
            btsVar = r3;
        } else {
            bts btsVar2 = r7;
            btsVar2.Y();
            btsVar = btsVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dx0(f530Var, kk2Var, tlsVar, z, map, ety0Var, i, z2, i2, i3, dyrVar, lkq0Var, xfcVar, tlsVar2, xt3Var, i4, i5);
        }
    }

    public static final void d(sls slsVar, a aVar, fid fidVar, int i) {
        aii0 v;
        ngd ngdVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1893302201);
        int i2 = (btsVar.e(null) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.e0(-1855176291);
            aVar.invoke(btsVar, 6);
            btsVar.t(false);
            v = btsVar.v();
            if (v == null) {
                return;
            } else {
                ngdVar = new ngd(slsVar, aVar, i, 1);
            }
        } else {
            btsVar.Y();
            v = btsVar.v();
            if (v == null) {
                return;
            } else {
                ngdVar = new ngd(slsVar, aVar, i, 2);
            }
        }
        v.d = ngdVar;
    }

    public static final ArrayList e(List list, sls slsVar) {
        kn1 kn1Var;
        if (!((Boolean) slsVar.invoke()).booleanValue()) {
            return null;
        }
        new bsy0();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            x910 x910Var = (x910) list.get(i);
            r3k0 r3k0Var = ((csy0) x910Var.a()).a;
            g gVar = (g) r3k0Var.b;
            ik2 ik2Var = (ik2) r3k0Var.c;
            dry0 dry0Var = (dry0) gVar.a.getValue();
            if (dry0Var == null) {
                kn1Var = new kn1(0, 0, new y6y0(24));
            } else {
                ik2 c = g.c(ik2Var, dry0Var);
                if (c == null) {
                    kn1Var = new kn1(0, 0, new y6y0(25));
                } else {
                    f6w P = s8o.P(dry0Var.m(c.b, c.c).i());
                    kn1Var = new kn1(P.d(), P.b(), new oew0(19, P));
                }
            }
            int i2 = kn1Var.b;
            int i3 = kn1Var.c;
            arrayList.add(new Pair(x910Var.l0(qje.m(i2, i2, i3, i3)), (sls) kn1Var.w));
        }
        return arrayList;
    }

    public static final f530 f(f530 f530Var, kk2 kk2Var, ety0 ety0Var, tls tlsVar, int i, boolean z, int i2, int i3, dyr dyrVar, List list, tls tlsVar2, lkq0 lkq0Var, xfc xfcVar, tls tlsVar3, xt3 xt3Var) {
        if (lkq0Var == null) {
            return f530Var.k(c530.a).k(new vjy0(kk2Var, ety0Var, dyrVar, tlsVar, i, z, i2, i3, list, tlsVar2, xfcVar, xt3Var, tlsVar3));
        }
        return f530Var.k(lkq0Var.y).k(new jfq0(kk2Var, ety0Var, dyrVar, tlsVar, i, z, i2, i3, list, tlsVar2, lkq0Var, xfcVar, xt3Var));
    }

    public static final AnalyticsIncidentType g(IncidentType incidentType) {
        int i = epv.a[incidentType.ordinal()];
        if (i == 1) {
            return AnalyticsIncidentType.Camera;
        }
        if (i == 2) {
            return AnalyticsIncidentType.Police;
        }
        if (i == 3) {
            return AnalyticsIncidentType.RoadWorks;
        }
        if (i == 4) {
            return AnalyticsIncidentType.Accident;
        }
        w511.b();
        return null;
    }
}
