package com.yandex.passport.api.exception;

import com.yandex.passport.sloth.k;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class b {
    public static PassportHostProcessedException a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) it.next()).a);
        }
        return new PassportHostProcessedException(arrayList);
    }

    public final KSerializer serializer() {
        return a.a;
    }
}
