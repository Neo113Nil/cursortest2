package com.yandex.passport.internal.util.storage;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import defpackage.bgx;
import defpackage.g3r;
import defpackage.tls;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class a implements Map, bgx {
    public final ConcurrentHashMap a;
    public final tls b;
    public final tls c;
    public final File w;
    public boolean x;

    public a(ConcurrentHashMap concurrentHashMap, String str, tls tlsVar, tls tlsVar2) {
        this.a = concurrentHashMap;
        this.b = tlsVar;
        this.c = tlsVar2;
        File file = new File(com.yandex.passport.common.util.a.b().getFilesDir(), str);
        this.w = file;
        concurrentHashMap.clear();
        if (file.exists()) {
            try {
                concurrentHashMap.putAll((Map) tlsVar2.invoke(g3r.c(file)));
            } catch (Throwable th) {
                c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Can't read from " + file + " or parse data", th);
                }
            }
        }
    }

    public final void a() {
        if (this.x) {
            return;
        }
        g3r.f(this.w, (byte[]) this.b.invoke(this.a));
    }

    @Override // java.util.Map
    public final void clear() {
        this.a.clear();
        a();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.a.entrySet();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put = this.a.put(obj, obj2);
        a();
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.a.putAll(map);
        a();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object remove = this.a.remove(obj);
        a();
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.a.values();
    }
}
