package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes14.dex */
public abstract class gia1 {
    public static final void a(final we weVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-917244983);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(weVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new o0(6, tlsVar);
                btsVar.o0(Q);
            }
            ydb1.a(q791.d(c530.a, false, null, null, (sls) Q, 15), wwg.S(-738694689, true, new zls() { // from class: ke
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    we weVar2 = weVar;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                String str = weVar2.c;
                                if (str != null && str.length() != 0) {
                                    btsVar2.e0(959021370);
                                    rdb1.a(ibp0Var, mja1.a(str, null, 6), null, null, null, btsVar2, intValue & 14);
                                    btsVar2.t(false);
                                    break;
                                } else {
                                    btsVar2.e0(959091523);
                                    btsVar2.t(false);
                                    break;
                                }
                            }
                            break;
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                f530 b = ofb1.b(c530.a, weVar2.e, null, 6);
                                int i6 = intValue2;
                                String str2 = weVar2.a;
                                String str3 = weVar2.b;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                p9b1.c(ebp0Var, str2, b, null, null, 0, 0, str3, null, null, 0, 0, null, btsVar3, i6 & 14, 0, 8124);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(531950298, true, new zls() { // from class: ke
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    we weVar2 = weVar;
                    switch (i5) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                String str = weVar2.c;
                                if (str != null && str.length() != 0) {
                                    btsVar2.e0(959021370);
                                    rdb1.a(ibp0Var, mja1.a(str, null, 6), null, null, null, btsVar2, intValue & 14);
                                    btsVar2.t(false);
                                    break;
                                } else {
                                    btsVar2.e0(959091523);
                                    btsVar2.t(false);
                                    break;
                                }
                            }
                            break;
                        default:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                f530 b = ofb1.b(c530.a, weVar2.e, null, 6);
                                int i6 = intValue2;
                                String str2 = weVar2.a;
                                String str3 = weVar2.b;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                p9b1.c(ebp0Var, str2, b, null, null, 0, 0, str3, null, null, 0, 0, null, btsVar3, i6 & 14, 0, 8124);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, wwg.S(63639060, true, new u5(14, weVar, tlsVar), btsVar), null, null, false, btsVar, 25008, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(weVar, tlsVar, i, 5);
        }
    }

    public static void b(int i, HashMap hashMap, String str, int i2, String str2) {
        b64.B(i, hashMap, str, i2, str2);
    }

    public static final boolean c(String str, Set set) {
        if (!set.isEmpty()) {
            Set set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (cvu0.t((String) it.next(), str, true)) {
                }
            }
            return false;
        }
        return true;
    }
}
