package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class kry0 implements z910 {
    public final sls a;
    public final sls b;

    public kry0(sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.b = slsVar2;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        ArrayList arrayList;
        aa10 w;
        ArrayList arrayList2;
        Pair pair;
        ArrayList arrayList3 = new ArrayList(list.size());
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(((x910) obj).a() instanceof csy0)) {
                arrayList3.add(obj);
            }
        }
        List list3 = (List) this.b.invoke();
        if (list3 != null) {
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size2 = list3.size();
            int i2 = 0;
            while (i2 < size2) {
                zii0 zii0Var = (zii0) list3.get(i2);
                if (zii0Var != null) {
                    float f = zii0Var.b;
                    float f2 = zii0Var.a;
                    arrayList2 = arrayList4;
                    o l0 = ((x910) arrayList3.get(i2)).l0(p8e.b(0, (int) Math.floor(zii0Var.c - f2), 0, (int) Math.floor(zii0Var.d - f), 5));
                    int round = Math.round(f2);
                    pair = new Pair(l0, new z5w((Math.round(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (round << 32)));
                } else {
                    arrayList2 = arrayList4;
                    pair = null;
                }
                ArrayList arrayList5 = arrayList2;
                if (pair != null) {
                    arrayList5.add(pair);
                }
                i2++;
                arrayList4 = arrayList5;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list.get(i3);
            if (((x910) obj2).a() instanceof csy0) {
                arrayList6.add(obj2);
            }
        }
        w = kVar.w(n8e.i(j), n8e.h(j), b.f(), new bjj0(arrayList, m5b1.e(arrayList6, this.a), 2));
        return w;
    }
}
