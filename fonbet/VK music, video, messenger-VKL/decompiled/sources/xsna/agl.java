package xsna;

import com.vk.metrics.performance.images.ImageCacheSource;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import xsna.egl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class agl implements izs {
    public final /* synthetic */ egl b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ConcurrentHashMap<ImageCacheSource, egl.c> concurrentHashMap = this.b.b;
        LinkedHashMap m = pn00.m(new Pair("sum_hit_rate", Integer.valueOf(egl.c(concurrentHashMap))));
        Iterator<T> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ImageCacheSource imageCacheSource = (ImageCacheSource) entry.getKey();
            egl.c cVar = (egl.c) entry.getValue();
            m.put(imageCacheSource.h(), Integer.valueOf(egl.d(cVar.b().get(), cVar.a().get())));
        }
        return m;
    }
}
