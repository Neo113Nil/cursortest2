package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CommunityReviewItem.kt */
/* loaded from: classes18.dex */
public final class sxh {
    public static final qxh a(txh txhVar, boolean z, sdz sdzVar, boolean z2) {
        int i = txhVar.a;
        big0 big0Var = txhVar.d;
        String str = big0Var.b;
        UserId userId = big0Var.a;
        boolean z3 = txhVar.k;
        boolean z4 = txhVar.l;
        vhg0 vhg0Var = new vhg0(big0Var.g, Float.valueOf(txhVar.b), null, txhVar.n, txhVar.r, txhVar.s, z2, 12);
        List<List<jxh>> list = txhVar.i;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<jxh> list2 = (List) it.next();
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, i2));
            String str2 = null;
            for (jxh jxhVar : list2) {
                if (str2 == null) {
                    str2 = jxhVar.d;
                }
                arrayList2.add(new ImageSize(jxhVar.a, jxhVar.b, jxhVar.c, null, (char) 0, false, 56, null));
            }
            i2 = 10;
            arrayList.add(new y2u0(arrayList2, str2 != null ? arm0.m(10, str2) : null));
        }
        return new qxh(i, userId, z3, z4, str, vhg0Var, new ugg0(arrayList, new dce0(a020.r(txhVar.c)), new odo0(sdzVar.m(txhVar.e), null, txhVar.h, 2), txhVar.o), txhVar.m, txhVar.s, txhVar.t, z, txhVar.u);
    }
}
