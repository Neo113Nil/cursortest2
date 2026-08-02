package com.yandex.plus.di;

import defpackage.i3y;
import defpackage.tls;
import defpackage.w511;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class a {
    public final tls a;
    public final i3y b = kotlin.a.a(BasePlusDiComponentHolder$components$2.b);

    public a(tls tlsVar) {
        this.a = tlsVar;
    }

    public final Object a(String str) {
        Object obj = ((Map) this.b.getValue()).get(str);
        if (obj != null) {
            return obj;
        }
        w511.i((String) this.a.invoke(str));
        return null;
    }
}
