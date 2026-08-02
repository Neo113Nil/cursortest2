package defpackage;

import androidx.compose.foundation.text.selection.Direction;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class eqb1 {
    public static final void a(adz0 adz0Var, f530 f530Var, fid fidVar, int i) {
        long g;
        ArrayList arrayList = adz0Var.a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(195328827);
        int i2 = (btsVar.k(adz0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            lhl0 a = khl0.a(lr20.e, x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            if (!arrayList.isEmpty()) {
                btsVar.e0(-2115673141);
                int i3 = 0;
                for (Object obj : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        scc.m();
                        throw null;
                    }
                    tru truVar = (tru) obj;
                    if (truVar.a) {
                        btsVar.e0(147537294);
                        g = ((el51) btsVar.m(gl51.a)).f();
                        btsVar.t(false);
                    } else {
                        btsVar.e0(147612717);
                        g = ((el51) btsVar.m(gl51.a)).g();
                        btsVar.t(false);
                    }
                    c(0.0f, g, truVar.b, btsVar, 0);
                    if (i3 != scc.f(arrayList)) {
                        btsVar.e0(147866452);
                        b(g, btsVar, 0);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(147927956);
                        btsVar.t(false);
                    }
                    i3 = i4;
                }
                btsVar.t(false);
            } else {
                btsVar.e0(-2115142018);
                d(((el51) btsVar.m(gl51.a)).g(), btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hex0(adz0Var, f530Var, i, 13);
        }
    }

    public static final void b(long j, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(914606318);
        int i2 = (btsVar.d(j) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 e = ljs0.e(ljs0.q(c530.a, 10.0f), 6.0f);
            gji0 gji0Var = qke.q;
            pi6.a(m4m0.b(ymb1.l(e, gji0Var), j, gji0Var), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ot6(i, 7, j);
        }
    }

    public static final void c(float f, long j, v4v v4vVar, fid fidVar, int i) {
        long j2;
        float f2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(428528992);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= btsVar.d(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(v4vVar) ? 256 : 128;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            a S = wwg.S(460898618, true, new j7a0(v4vVar, i3), btsVar);
            int i4 = i2 << 3;
            j2 = j;
            u3b1.g(null, 40.0f, j2, 0.0f, S, btsVar, (i4 & 112) | HProv.ALG_CLASS_DATA_ENCRYPT | (i4 & 896), 9);
            f2 = 40.0f;
        } else {
            j2 = j;
            btsVar.Y();
            f2 = f;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new btm(f2, j2, v4vVar, i);
        }
    }

    public static final void d(long j, fid fidVar, int i) {
        long j2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2046781455);
        int i2 = (btsVar.d(j) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.e0(-138041798);
            int i3 = 0;
            while (i3 < 2) {
                long j3 = j;
                c(0.0f, j3, null, btsVar, ((i2 << 3) & 112) | 384);
                b(j3, btsVar, i2 & 14);
                i3++;
                j = j3;
            }
            j2 = j;
            btsVar.t(false);
            c(0.0f, j2, null, btsVar, ((i2 << 3) & 112) | 384);
        } else {
            j2 = j;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ot6(i, 6, j2);
        }
    }

    public static final Direction e(Direction direction, Direction direction2, tkq0 tkq0Var, long j, bkq0 bkq0Var) {
        if (bkq0Var != null) {
            int compare = tkq0Var.f.compare(Long.valueOf(bkq0Var.c), Long.valueOf(j));
            Direction direction3 = compare < 0 ? Direction.BEFORE : compare > 0 ? Direction.AFTER : Direction.ON;
            if (direction3 != null) {
                return direction3;
            }
        }
        return z8b1.e(direction, direction2);
    }

    public static final LinkedHashMap f(List list) {
        Collection collection;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            String str = (String) obj;
            ArrayList arrayList2 = new ArrayList(str.length());
            int i3 = 0;
            int i4 = 0;
            while (i3 < str.length()) {
                arrayList2.add(new Pair(Character.valueOf(str.charAt(i3)), new Pair(Integer.valueOf(i), Integer.valueOf(i4))));
                i3++;
                i4++;
            }
            ycc.r(arrayList2, arrayList);
            i = i2;
        }
        Map s = kotlin.collections.b.s(arrayList);
        Set keySet = s.keySet();
        int d = gw00.d(tcc.n(keySet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj2 : keySet) {
            Character ch = (Character) obj2;
            ch.getClass();
            Pair pair = (Pair) s.get(ch);
            if (pair == null) {
                collection = EmptySet.a;
            } else {
                int intValue = ((Number) pair.getFirst()).intValue();
                int intValue2 = ((Number) pair.getSecond()).intValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i5 = -1; i5 < 2; i5++) {
                    for (int i6 = -1; i6 < 2; i6++) {
                        if (i5 != 0 || i6 != 0) {
                            int i7 = intValue2 + i6;
                            String str2 = (String) kotlin.collections.a.S(intValue + i5, list);
                            if (str2 != null && i7 >= 0 && i7 < str2.length()) {
                                linkedHashSet.add(Character.valueOf(str2.charAt(i7)));
                            }
                        }
                    }
                }
                collection = linkedHashSet;
            }
            linkedHashMap.put(obj2, collection);
        }
        return linkedHashMap;
    }

    public static final int g(long j, dry0 dry0Var) {
        int i = (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j);
        if (Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        hm40 hm40Var = dry0Var.b;
        return intBitsToFloat >= hm40Var.e ? dry0Var.a.a.b.length() : hm40Var.g(j);
    }
}
