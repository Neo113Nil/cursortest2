package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.semantics.b;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.d;
import defpackage.hcc;
import defpackage.icc;
import defpackage.rty;
import defpackage.scc;
import defpackage.uh;
import defpackage.wh;
import defpackage.wu60;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public abstract class a {
    public static final boolean a(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = EmptyList.a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int f = scc.f(arrayList);
                int i = 0;
                while (i < f) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    c cVar = (c) obj2;
                    c cVar2 = (c) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (cVar2.g().c() >> 32)) - Float.intBitsToFloat((int) (cVar.g().c() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (cVar2.g().c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (cVar.g().c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                    arrayList2.add(new wu60((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((wu60) kotlin.collections.a.P(list)).a;
            } else {
                if (list.isEmpty()) {
                    rty.c("Empty collection can't be reduced.");
                }
                Object P = kotlin.collections.a.P(list);
                int f2 = scc.f(list);
                if (1 <= f2) {
                    int i2 = 1;
                    while (true) {
                        P = new wu60(wu60.f(((wu60) P).a, ((wu60) list.get(i2)).a));
                        if (i2 == f2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((wu60) P).a;
            }
            if (Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void b(c cVar, wh whVar) {
        icc iccVar = (icc) b.a(cVar.k(), d.g);
        if (iccVar != null) {
            whVar.s(uh.a(iccVar.b(), 1, iccVar.a(), 1, false, ((Boolean) cVar.k().e(d.J, CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1.w)).booleanValue()));
        }
        c l = cVar.l();
        if (l == null || b.a(l.k(), d.e) == null) {
            return;
        }
        hcc hccVar = (hcc) b.a(l.k(), d.f);
        if (hccVar == null || (hccVar.b() >= 0 && hccVar.a() >= 0)) {
            if (cVar.k().a.b(d.J)) {
                ArrayList arrayList = new ArrayList();
                List j = c.j(l, 4);
                int size = j.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    c cVar2 = (c) j.get(i2);
                    if (cVar2.k().a.b(d.J)) {
                        arrayList.add(cVar2);
                        if (cVar2.c.t() < cVar.c.t()) {
                            i++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean a = a(arrayList);
                whVar.s(uh.a(a ? 0 : i, 1, a ? i : 0, 1, false, ((Boolean) cVar.k().e(d.J, CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.w)).booleanValue()));
            }
        }
    }
}
