package com.yandex.passport.internal.push;

import android.content.Context;
import defpackage.lxj;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class a0 {
    public final androidx.core.app.s0 a;

    public a0(Context context) {
        this.a = new androidx.core.app.s0(context);
    }

    public final List a() {
        List list;
        lxj k = com.yandex.passport.internal.util.p.k(this.a);
        if (k == null || (list = (List) k.d) == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((androidx.core.app.p) obj).b == 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((androidx.core.app.p) it.next()).a);
        }
        return arrayList2;
    }
}
