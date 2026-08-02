package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class mdb1 {
    public static au2 a;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final float f, f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        final f530 f530Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(984440357);
        if ((i & 48) == 0) {
            i3 = (btsVar.b(f) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            if (btsVar.V(i3 & 1, (i3 & 147) == 146)) {
                btsVar.Y();
                f530Var3 = f530Var2;
            } else {
                f530Var3 = i4 != 0 ? c530.a : f530Var2;
                f530 n = ljs0.n(f530Var3, f, 16.0f);
                byk0 b = ((YandexShapes) btsVar.m(qm51.a)).b();
                a7u0 a7u0Var = gl51.a;
                ocb1.c(n, 0.0f, ((el51) btsVar.m(a7u0Var)).c(), ((el51) btsVar.m(a7u0Var)).d(), b, 0, null, btsVar, 0, 98);
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: nls0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int O = vng.O(i | 1);
                        mdb1.a(f, f530Var3, (fid) obj, O, i2);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if (btsVar.V(i3 & 1, (i3 & 147) == 146)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(final float f, fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-551073965);
        if ((i & 6) == 0) {
            i2 = (btsVar.b(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 m = an91.m(ljs0.c(ljs0.e(c530.a, f), 1.0f), 16.0f, 0.0f, 2);
            byk0 b = ((YandexShapes) btsVar.m(qm51.a)).b();
            a7u0 a7u0Var = gl51.a;
            ocb1.c(m, 0.0f, ((el51) btsVar.m(a7u0Var)).c(), ((el51) btsVar.m(a7u0Var)).d(), b, 0, null, btsVar, 0, 98);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: pls0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    mdb1.b(f, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-863398421);
        int i2 = 0;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            f530 m = ljs0.m(c530.a, 40.0f);
            byk0 byk0Var = cyk0.a;
            a7u0 a7u0Var = gl51.a;
            ocb1.b(m, 0.0f, ((el51) btsVar.m(a7u0Var)).c(), ((el51) btsVar.m(a7u0Var)).d(), byk0Var, 0, null, btsVar, 0, 98);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qls0(i, i2);
        }
    }

    public static final void d(float f, int i, fid fidVar, f530 f530Var) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-635026119);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.b(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(c530Var, 8.0f, 0.0f, 2);
            ndd.a.getClass();
            web1.c(m, 0.0f, false, 0.0f, null, ndd.b, wwg.S(-1728368867, true, new k0(f, i3), btsVar), null, null, null, null, null, false, btsVar, 1769472, 0, 8094);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i740(f, f530Var2, i);
        }
    }

    public static final List e(r100 r100Var, int i, int i2, ArrayList arrayList, u5w u5wVar, int i3, int i4, int i5, tls tlsVar) {
        int i6;
        vx40 vx40Var;
        long j;
        long j2;
        int i7;
        Object obj;
        int i8;
        if (r100Var == null || arrayList.isEmpty() || (i6 = u5wVar.b) == 0) {
            return EmptyList.a;
        }
        int i9 = -1;
        if (i2 - i < 0 || i6 == 0) {
            vx40Var = v5w.a;
        } else {
            d6w n = y6i0.n(0, i6);
            int i10 = n.a;
            int i11 = n.b;
            int i12 = -1;
            if (i10 <= i11) {
                while (u5wVar.a(i10) <= i) {
                    i12 = u5wVar.a(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10++;
                }
            }
            if (i12 == -1) {
                vx40Var = v5w.a;
            } else {
                vx40 vx40Var2 = v5w.a;
                vx40Var = new vx40(1);
                vx40Var.c(i12);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj2 = arrayList.get(i13);
            int index = ((u5y) obj2).getIndex();
            int[] iArr = u5wVar.a;
            int i14 = u5wVar.b;
            int i15 = 0;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                if (iArr[i15] == index) {
                    arrayList3.add(obj2);
                    break;
                }
                i15++;
            }
        }
        int[] iArr2 = vx40Var.a;
        int i16 = vx40Var.b;
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr2[i17];
            Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = i9;
                    break;
                }
                if (((u5y) it.next()).getIndex() == i18) {
                    break;
                }
                i19++;
            }
            u5y u5yVar = i19 == i9 ? (u5y) tlsVar.invoke(Integer.valueOf(i18)) : (u5y) arrayList.remove(i19);
            int j3 = u5yVar.j();
            if (i19 == i9) {
                j = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                i7 = Integer.MIN_VALUE;
            } else {
                long l = u5yVar.l(0);
                if (u5yVar.g()) {
                    j = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                    j2 = l & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                } else {
                    j = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                    j2 = l >> 32;
                }
                i7 = (int) j2;
            }
            int size2 = arrayList3.size();
            int i20 = 0;
            while (true) {
                if (i20 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i20);
                if (((u5y) obj).getIndex() != i18) {
                    break;
                }
                i20++;
            }
            u5y u5yVar2 = (u5y) obj;
            if (u5yVar2 != null) {
                long l2 = u5yVar2.l(0);
                i8 = (int) (u5yVar2.g() ? l2 & j : l2 >> 32);
            } else {
                i8 = Integer.MIN_VALUE;
            }
            int max = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                max = Math.min(max, i8 - j3);
            }
            u5yVar.h();
            u5yVar.c(max, 0, i4, i5);
            arrayList2.add(u5yVar);
            i17++;
            i9 = -1;
        }
        return arrayList2;
    }
}
