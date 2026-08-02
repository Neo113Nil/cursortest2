package com.yandex.passport.internal.database.auth_cookie;

import defpackage.evu0;
import defpackage.jl40;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class e {
    public static f a(String str, List list) {
        Object obj;
        Object obj2;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((f) obj2).c, str)) {
                break;
            }
        }
        f fVar = (f) obj2;
        if (fVar != null) {
            return fVar;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (evu0.J(((f) next).c)) {
                obj = next;
                break;
            }
        }
        return (f) obj;
    }
}
