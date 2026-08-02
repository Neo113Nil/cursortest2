package defpackage;

import com.yandex.go.design.compose.slot.SlotSize;
import java.util.Map;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class gtb1 {
    public static final void a(c711 c711Var, f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1807650144);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(c711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(1405645749);
            c(c711Var, f530Var, null, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            btsVar.e0(1405696341);
            b(c711Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(c711Var, f530Var, z, i, 19);
        }
    }

    public static final void b(c711 c711Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-415147255);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(c711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(ljs0.b(f530Var, 0.0f, SlotSize.XS.getSize(), 1), 1.0f);
            ted.a.getClass();
            ydb1.a(c, ted.b, wwg.S(-1547159464, true, new jvx0(19, c711Var), btsVar), null, ted.c, null, SlotSize.L, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(c711Var, f530Var, i, 9);
        }
    }

    public static final void c(c711 c711Var, f530 f530Var, ety0 ety0Var, fid fidVar, int i) {
        int i2;
        ety0 ety0Var2;
        ety0 ety0Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1095480672);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(c711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                ety0Var3 = xya1.e(btsVar).h.a;
            } else {
                btsVar.Y();
                ety0Var3 = ety0Var;
            }
            btsVar.u();
            String str = c711Var.b;
            String str2 = c711Var.c;
            boolean z = str.length() > 0;
            boolean k = btsVar.k(str) | btsVar.k(str2);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str2.length() <= 0) {
                    str2 = null;
                }
                Q = a.X(j73.A(new String[]{str, str2}), " ", null, null, null, 62);
                btsVar.o0(Q);
            }
            String str3 = (String) Q;
            String str4 = c711Var.b;
            boolean k2 = btsVar.k(str3);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new il01(str3, i3);
                btsVar.o0(Q2);
            }
            f530 a = fnq0.a(f530Var, (tls) Q2);
            SlotSize slotSize = SlotSize.XS;
            a5l0.d(str4, a, slotSize.getSize(), slotSize.getSize(), x4c.x, 0.0f, null, new y7m(0.0f), wwg.S(-1462487142, true, new kj6(z, 7), btsVar), wwg.S(-1612091216, true, new hex0(21, c711Var, ety0Var3), btsVar), btsVar, 918577152, 96);
            ety0Var2 = ety0Var3;
        } else {
            btsVar.Y();
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(c711Var, f530Var, ety0Var2, i, 6);
        }
    }

    public static final boolean d(qy40 qy40Var, Map map) {
        if (qy40Var != null && qy40Var.e == map.size()) {
            Object[] objArr = qy40Var.b;
            int[] iArr = qy40Var.c;
            long[] jArr = qy40Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                return true;
            }
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            int i5 = iArr[i4];
                            Integer num = (Integer) map.get((kt1) obj);
                            if (num == null || num.intValue() != i5) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i == length) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static final e530 e(cqh cqhVar, int i) {
        e530 child$ui = cqhVar.getNode().getChild$ui();
        if (child$ui == null || (child$ui.getAggregateChildKindSet$ui() & i) == 0) {
            return null;
        }
        while (child$ui != null) {
            int kindSet$ui = child$ui.getKindSet$ui();
            if ((kindSet$ui & 2) != 0) {
                return null;
            }
            if ((kindSet$ui & i) != 0) {
                return child$ui;
            }
            child$ui = child$ui.getChild$ui();
        }
        return null;
    }
}
