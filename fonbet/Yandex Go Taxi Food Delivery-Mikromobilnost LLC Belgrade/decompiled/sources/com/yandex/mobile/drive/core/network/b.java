package com.yandex.mobile.drive.core.network;

import defpackage.cvu0;
import defpackage.i3y;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.m3e;
import defpackage.qsr;
import java.util.Map;

/* loaded from: classes15.dex */
public abstract class b {
    public static final i3y a = kotlin.a.a(new m3e(22));

    public static kwu a(String str, qsr qsrVar, Map map) {
        boolean x = cvu0.x(str, "http", false);
        if (!x) {
            str = qsrVar.a.concat(str);
        }
        jwu jwuVar = new jwu();
        jwuVar.i(null, str);
        jwu g = jwuVar.e().g();
        for (Map.Entry entry : map.entrySet()) {
            g.d((String) entry.getKey(), (String) entry.getValue());
        }
        if (!x) {
            for (Map.Entry entry2 : qsrVar.b.entrySet()) {
                g.d((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        return g.e();
    }
}
