package com.yandex.passport.internal.util.storage;

import defpackage.kgx;
import defpackage.tls;
import defpackage.vbi0;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class b implements vbi0 {
    public final tls a;
    public final tls b;
    public final String c;
    public a w;

    public b(String str, tls tlsVar, tls tlsVar2) {
        this.a = tlsVar;
        this.b = tlsVar2;
        this.c = str;
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        a aVar = this.w;
        if (aVar == null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String str = this.c;
            if (str == null) {
                str = obj.getClass().getName() + '.' + kgxVar.getName() + ".persistableMap";
            }
            aVar = new a(concurrentHashMap, str, this.a, this.b);
            this.w = aVar;
        }
        return aVar;
    }
}
