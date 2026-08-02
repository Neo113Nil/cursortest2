package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import xsna.gx8;

/* compiled from: CacheRegistryImpl.kt */
/* loaded from: classes.dex */
public final class ix8 implements gx8 {
    public final ConcurrentHashMap<CacheTarget, List<gx8.a>> a = new ConcurrentHashMap<>();

    @Override // xsna.gx8
    public final ConcurrentHashMap a() {
        return this.a;
    }

    @Override // xsna.gx8
    public final List<gx8.a> b(CacheTarget cacheTarget) {
        return this.a.getOrDefault(cacheTarget, EmptyList.b);
    }

    @Override // xsna.gx8
    public final void c(gx8.a aVar) {
        List<gx8.a> putIfAbsent;
        CacheTarget a = aVar.a();
        ConcurrentHashMap<CacheTarget, List<gx8.a>> concurrentHashMap = this.a;
        List<gx8.a> list = concurrentHashMap.get(a);
        if (list == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a, (list = new ArrayList<>()))) != null) {
            list = putIfAbsent;
        }
        list.add(aVar);
    }
}
