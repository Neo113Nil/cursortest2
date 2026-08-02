package com.yandex.div.storage;

import com.yandex.div.storage.c;
import com.yandex.div.storage.d;
import com.yandex.div.storage.database.StorageException;
import defpackage.g9i0;
import defpackage.i9i0;
import defpackage.qv10;
import defpackage.tcc;
import defpackage.tls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0012*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0016*\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\n2\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"J#\u0010(\u001a\u00020'2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010*R$\u0010-\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020$0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u0016\u0010/\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010.R \u00101\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00100¨\u00062"}, d2 = {"Lcom/yandex/div/storage/e;", "Lcom/yandex/div/storage/d;", "Lcom/yandex/div/storage/c;", "divStorage", "<init>", "(Lcom/yandex/div/storage/c;)V", "", "", "Lcom/yandex/div/storage/JsonId;", "ids", "Lcom/yandex/div/storage/f;", "e", "(Ljava/util/Set;)Lcom/yandex/div/storage/f;", "deletedRecords", "Lzy11;", "f", "(Ljava/util/Set;)V", CA20Status.STATUS_REQUEST_K, CA20Status.STATUS_CERTIFICATE_V, "", "d", "(Ljava/util/Map;)Ljava/util/Set;", "", "Lcom/yandex/div/storage/database/StorageException;", "Lcom/yandex/div/storage/RawJsonRepositoryException;", "g", "(Ljava/util/List;)Ljava/util/List;", "Lcom/yandex/div/storage/d$a;", "payload", "c", "(Lcom/yandex/div/storage/d$a;)Lcom/yandex/div/storage/f;", "b", "(Ljava/util/List;)Lcom/yandex/div/storage/f;", "getAll", "()Lcom/yandex/div/storage/f;", "Lkotlin/Function1;", "Lg9i0;", "", "predicate", "Li9i0;", "a", "(Ltls;)Li9i0;", "Lcom/yandex/div/storage/c;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "inMemoryData", "Z", "areJsonsSynchronizedWithInMemory", "Ljava/util/Set;", "jsonIdsWithErrors", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements d {

    /* renamed from: a, reason: from kotlin metadata */
    private final c divStorage;

    /* renamed from: c, reason: from kotlin metadata */
    private boolean areJsonsSynchronizedWithInMemory;

    /* renamed from: b, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, g9i0> inMemoryData = new ConcurrentHashMap<>();

    /* renamed from: d, reason: from kotlin metadata */
    private Set<String> jsonIdsWithErrors = EmptySet.a;

    public e(c cVar) {
        this.divStorage = cVar;
    }

    private final <K, V> Set<K> d(Map<K, ? extends V> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            K key = it.next().getKey();
            if (key != null) {
                linkedHashSet.add(key);
            }
        }
        return linkedHashSet;
    }

    private final f e(Set<String> ids) {
        ArrayList arrayList = new ArrayList();
        c.a<g9i0> c = this.divStorage.c(ids);
        List<g9i0> a = c.a();
        arrayList.addAll(g(c.b()));
        return new f(a, arrayList);
    }

    private final void f(Set<String> deletedRecords) {
        Iterator<T> it = deletedRecords.iterator();
        while (it.hasNext()) {
            this.inMemoryData.remove((String) it.next());
        }
    }

    private final List<RawJsonRepositoryException> g(List<? extends StorageException> list) {
        List<? extends StorageException> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new RawJsonRepositoryException((StorageException) it.next()));
        }
        return arrayList;
    }

    @Override // com.yandex.div.storage.d
    public final i9i0 a(tls predicate) {
        c.b j = this.divStorage.j(predicate);
        Set<String> a = j.a();
        List<RawJsonRepositoryException> g = g(j.b());
        f(a);
        return new i9i0(a, g);
    }

    @Override // com.yandex.div.storage.d
    public final f b(List<String> ids) {
        if (ids.isEmpty()) {
            f.INSTANCE.getClass();
            return f.d;
        }
        List<String> list = ids;
        Set<String> M0 = kotlin.collections.a.M0(list);
        ArrayList arrayList = new ArrayList(ids.size());
        for (String str : list) {
            g9i0 g9i0Var = this.inMemoryData.get(str);
            if (g9i0Var != null) {
                arrayList.add(g9i0Var);
                M0.remove(str);
            }
        }
        if (M0.isEmpty()) {
            return new f(arrayList, EmptyList.a);
        }
        f e = e(M0);
        for (g9i0 g9i0Var2 : e.h()) {
            this.inMemoryData.put(g9i0Var2.getId(), g9i0Var2);
        }
        return e.b(arrayList);
    }

    @Override // com.yandex.div.storage.d
    public final f c(d.a payload) {
        List<g9i0> f = payload.f();
        for (g9i0 g9i0Var : f) {
            this.inMemoryData.put(g9i0Var.getId(), g9i0Var);
        }
        List<StorageException> a = this.divStorage.m(f, payload.e()).a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(g(a));
        return new f(f, arrayList);
    }

    @Override // com.yandex.div.storage.d
    public final f getAll() {
        if (this.areJsonsSynchronizedWithInMemory && this.jsonIdsWithErrors.isEmpty()) {
            return new f(kotlin.collections.a.J0(this.inMemoryData.values()), EmptyList.a);
        }
        f e = e(this.areJsonsSynchronizedWithInMemory ? this.jsonIdsWithErrors : EmptySet.a);
        f b = e.b(this.inMemoryData.values());
        for (g9i0 g9i0Var : e.h()) {
            this.inMemoryData.put(g9i0Var.getId(), g9i0Var);
        }
        this.areJsonsSynchronizedWithInMemory = true;
        List<RawJsonRepositoryException> g = e.g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : g) {
            String jsonId = ((RawJsonRepositoryException) obj).getJsonId();
            Object obj2 = linkedHashMap.get(jsonId);
            if (obj2 == null) {
                obj2 = qv10.w(jsonId, linkedHashMap);
            }
            ((List) obj2).add(obj);
        }
        this.jsonIdsWithErrors = d(linkedHashMap);
        return b;
    }
}
