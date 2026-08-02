package com.yandex.div.core.expression.local;

import defpackage.all0;
import defpackage.tls;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class c {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    public static void a(all0 all0Var, tls tlsVar) {
        ((RuntimeStoreImpl$traverseFrom$1) tlsVar).invoke(all0Var);
        Iterator it = all0Var.c.iterator();
        while (it.hasNext()) {
            a((all0) it.next(), tlsVar);
        }
    }
}
