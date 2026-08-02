package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.requirements.models.net.CompoundSelectDto;
import ru.yandex.taxi.requirements.models.net.c;

/* loaded from: classes6.dex */
public abstract class iqb1 {
    public static final void a(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(474680640);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            ymb1.j(str, an91.k(c530.a, 16.0f), 0L, null, lzr.G, 0L, 0L, 0L, null, 0, false, 1, null, null, btsVar, (i2 & 14) | 24624, HProv.ALG_TYPE_SECURECHANNEL, 57324);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qpm0(str, i, 8);
        }
    }

    public static final float b(long j, long j2) {
        return Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
    }

    public static final float c(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
    }

    public static final boolean d(yg70 yg70Var, yg70 yg70Var2) {
        if (yg70Var == yg70Var2) {
            return true;
        }
        return jl40.l(yg70Var.a, yg70Var2.a) && jl40.l(yg70Var.b, yg70Var2.b);
    }

    public static final c e(c cVar, c cVar2) {
        c cVar3;
        yg70 yg70Var;
        Object obj;
        Object obj2;
        yg70 yg70Var2;
        je70 je70Var;
        je70 je70Var2;
        int i;
        boolean z;
        yg70 yg70Var3 = cVar2.g;
        if (!(cVar == cVar2 ? true : (jl40.l(cVar.a, cVar2.a) && jl40.l(cVar.b, cVar2.b) && jl40.l(cVar.c, cVar2.c) && jl40.l(cVar.d, cVar2.d) && cVar.c() == cVar2.c() && cVar.h == cVar2.h && jl40.l(cVar.m, cVar2.m) && jl40.l(cVar.q, cVar2.q) && jl40.l(cVar.t, cVar2.t) && jl40.l(cVar.v, cVar2.v) && jl40.l(cVar.w, cVar2.w) && jl40.l(cVar.x, cVar2.x) && jl40.l(cVar.y, cVar2.y) && jl40.l(cVar.z, cVar2.z) && jl40.l(cVar.A, cVar2.A)) ? d(cVar.g, yg70Var3) : false)) {
            return null;
        }
        f1b0 f1b0Var = cVar.u;
        CompoundSelectDto compoundSelectDto = cVar.s;
        f1b0 f1b0Var2 = cVar2.u;
        CompoundSelectDto compoundSelectDto2 = cVar2.s;
        if (f1b0Var != null) {
            f1b0Var2 = f1b0Var;
        }
        if ("boolean".equals(cVar.f)) {
            return c.a(cVar, null, null, null, false, false, null, null, f1b0Var2, null, 535822335);
        }
        yg70 yg70Var4 = cVar.g;
        if (d(yg70Var4, yg70Var3)) {
            List list = yg70Var4.c;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((je70) it.next()).c);
            }
            List list2 = yg70Var3.c;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((je70) it2.next()).c);
            }
            LinkedHashSet<String> U = a.U(arrayList, a.N0(arrayList2));
            ArrayList arrayList3 = new ArrayList();
            for (String str : U) {
                Iterator it3 = yg70Var4.c.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (jl40.l(((je70) obj).c, str)) {
                        break;
                    }
                }
                je70 je70Var3 = (je70) obj;
                Iterator it4 = yg70Var3.c.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it4.next();
                    if (jl40.l(((je70) obj2).c, str)) {
                        break;
                    }
                }
                je70 je70Var4 = (je70) obj2;
                if (je70Var3 == null || je70Var4 == null) {
                    yg70Var2 = yg70Var3;
                    je70Var = null;
                } else {
                    if (je70Var3 == je70Var4 || (jl40.l(je70Var3.a, je70Var4.a) && jl40.l(je70Var3.b, je70Var4.b) && jl40.l(je70Var3.c, je70Var4.c) && jl40.l(je70Var3.f, je70Var4.f) && je70Var3.g == je70Var4.g && jl40.l(je70Var3.h, je70Var4.h) && jl40.l(je70Var3.i, je70Var4.i) && jl40.l(je70Var3.j, je70Var4.j) && jl40.l(je70Var3.m, je70Var4.m) && jl40.l(je70Var3.n, je70Var4.n) && jl40.l(je70Var3.o, je70Var4.o))) {
                        yg70Var2 = yg70Var3;
                        je70Var2 = new je70(je70Var3.a, je70Var3.b, je70Var3.c, Integer.valueOf(je70Var4.b() + je70Var3.b()), Math.min(je70Var3.a(), je70Var4.a()), je70Var3.f, je70Var3.g, je70Var3.h, je70Var3.i, je70Var3.j, je70Var3.k, je70Var3.l, je70Var3.m, je70Var3.n, je70Var3.o);
                    } else {
                        yg70Var2 = yg70Var3;
                        je70Var2 = null;
                    }
                    je70Var = je70Var2;
                }
                if (je70Var != null) {
                    arrayList3.add(je70Var);
                }
                yg70Var3 = yg70Var2;
            }
            cVar3 = null;
            String str2 = yg70Var4.a;
            String str3 = yg70Var4.b;
            yg70Var4.getClass();
            yg70Var = new yg70(str2, str3, arrayList3);
        } else {
            yg70Var = null;
            cVar3 = null;
        }
        if (yg70Var == null) {
            return cVar3;
        }
        CompoundSelectDto compoundSelectDto3 = compoundSelectDto.a.size() <= compoundSelectDto2.a.size() ? compoundSelectDto : compoundSelectDto2;
        int intValue = cVar2.i.intValue() + cVar.i.intValue();
        if (cVar.j && cVar2.j) {
            i = intValue;
            z = true;
        } else {
            i = intValue;
            z = false;
        }
        return c.a(cVar, jl40.l(cVar.e, cVar2.e) ? cVar.e : "", yg70Var, Integer.valueOf(i), z, cVar.k && cVar2.k, compoundSelectDto3, null, f1b0Var2, null, 535427247);
    }
}
