package com.yandex.passport.common.core;

import defpackage.ny61;
import defpackage.qv10;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class a {
    public static Environment a(int i) {
        Object obj;
        Iterator<E> it = Environment.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Environment) obj).getInteger() == i) {
                break;
            }
        }
        Environment environment = (Environment) obj;
        if (environment != null) {
            return environment;
        }
        ny61.r(qv10.g(i, "No environment for integer "));
        return null;
    }
}
