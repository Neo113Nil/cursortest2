package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.builders.MapBuilder;

/* compiled from: HeadersMap.kt */
/* loaded from: classes8.dex */
public final class pyu implements Map<String, List<? extends String>>, gcy {
    public final MapBuilder b;
    public final Set<Map.Entry<String, List<String>>> c;
    public final Set<String> d;
    public final int e;
    public final Collection<List<String>> f;

    public pyu(Map<String, ? extends List<String>> map) {
        MapBuilder mapBuilder = new MapBuilder();
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mapBuilder.put(((String) entry.getKey()).toLowerCase(Locale.ROOT), j5g.C0((List) entry.getValue()));
        }
        MapBuilder h = mapBuilder.h();
        this.b = h;
        this.c = h.entrySet();
        this.d = h.keySet();
        this.e = h.size();
        this.f = h.values();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ List<? extends String> compute(String str, BiFunction<? super String, ? super List<? extends String>, ? extends List<? extends String>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ List<? extends String> computeIfAbsent(String str, Function<? super String, ? extends List<? extends String>> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ List<? extends String> computeIfPresent(String str, BiFunction<? super String, ? super List<? extends String>, ? extends List<? extends String>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.b.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        return this.b.containsValue((List) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, List<? extends String>>> entrySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final List<? extends String> get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (List) this.b.get(((String) obj).toLowerCase(Locale.ROOT));
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.d;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ List<? extends String> merge(String str, List<? extends String> list, BiFunction<? super List<? extends String>, ? super List<? extends String>, ? extends List<? extends String>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ List<? extends String> put(String str, List<? extends String> list) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends List<? extends String>> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ List<? extends String> putIfAbsent(String str, List<? extends String> list) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final List<? extends String> remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ List<? extends String> replace(String str, List<? extends String> list) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super List<? extends String>, ? extends List<? extends String>> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.e;
    }

    @Override // java.util.Map
    public final Collection<List<? extends String>> values() {
        return this.f;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, List<? extends String> list, List<? extends String> list2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
