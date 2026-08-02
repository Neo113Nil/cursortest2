package com.yandex.runtime.bindings.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.TypeDictionary;
import defpackage.oyr;
import defpackage.yci0;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class TypeDictionaryImpl<T> implements TypeDictionary<T> {
    private Map<String, T> map;
    private NativeObject nativeObject;

    private TypeDictionaryImpl(NativeObject nativeObject) {
        this.map = new ConcurrentHashMap();
        this.nativeObject = nativeObject;
    }

    private <U extends T> U getItemByKey(String str) {
        U u;
        T t = this.map.get(str);
        return (t != null || this.nativeObject == null || (t = (U) getItemNative(str)) == null || (u = (U) this.map.putIfAbsent(str, t)) == null) ? t : u;
    }

    private native Object getItemNative(String str);

    private native List<String> getKeys();

    private <U> String keyForClass(Class<U> cls) {
        try {
            return (String) cls.getMethod("getNativeName", null).invoke(null, null);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            yci0.p(oyr.p("Objects of class ", cls.getName(), " cannot be stored in com.yandex.runtime.bindings.internal.TypeDictionaryImpl"), e);
            return null;
        }
    }

    @Override // com.yandex.runtime.TypeDictionary
    public Map<String, T> getAllItems() {
        if (this.nativeObject != null) {
            Iterator<String> it = getKeys().iterator();
            while (it.hasNext()) {
                getItemByKey(it.next());
            }
        }
        return this.map;
    }

    @Override // com.yandex.runtime.TypeDictionary
    public <U extends T> U getItem(Class<U> cls) {
        String keyForClass = keyForClass(cls);
        if (keyForClass == null) {
            return null;
        }
        return (U) getItemByKey(keyForClass);
    }

    public TypeDictionaryImpl(Map<String, T> map) {
        new ConcurrentHashMap();
        this.map = map;
    }
}
