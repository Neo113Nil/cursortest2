package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.metrics.performance.images.ImageCacheSource;
import com.vk.stat.model.builders.imagecache.ImageCacheStatEventBuilder;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import xsna.egl;

/* compiled from: AppUtils.kt */
/* loaded from: classes11.dex */
public final class ob3 implements m1q0 {
    public final /* synthetic */ egl a;

    public ob3(egl eglVar) {
        this.a = eglVar;
    }

    @Override // xsna.m1q0
    public final void a(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2) {
        egl.c putIfAbsent;
        egl eglVar = this.a;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a;
        if (!eglVar.a || mobileOfficialAppsCoreNavStat$EventScreen == MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = eglVar.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ImageCacheSource imageCacheSource = (ImageCacheSource) entry.getKey();
            egl.c cVar = (egl.c) entry.getValue();
            ConcurrentHashMap<ImageCacheSource, egl.c> concurrentHashMap = eglVar.c;
            egl.c cVar2 = concurrentHashMap.get(imageCacheSource);
            if (cVar2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(imageCacheSource, (cVar2 = new egl.c()))) != null) {
                cVar2 = putIfAbsent;
            }
            egl.c cVar3 = cVar2;
            egl.c cVar4 = new egl.c();
            cVar4.a().set(cVar.a().get() - cVar3.a().get());
            cVar4.b().set(cVar.b().get() - cVar3.b().get());
            linkedHashMap.put(imageCacheSource, cVar4);
            long j = cVar.b().get();
            long j2 = cVar.a().get();
            cVar3.b().set(j);
            cVar3.a().set(j2);
        }
        LinkedHashMap m = pn00.m(new Pair("sum_hit_rate", Integer.valueOf(egl.c(linkedHashMap))));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            ImageCacheSource imageCacheSource2 = (ImageCacheSource) entry2.getKey();
            egl.c cVar5 = (egl.c) entry2.getValue();
            m.put(imageCacheSource2.h(), Integer.valueOf(egl.d(cVar5.b().getAndSet(0L), cVar5.a().getAndSet(0L))));
        }
        egl.f(m, ImageCacheStatEventBuilder.HitEventType.SCREEN, mobileOfficialAppsCoreNavStat$EventScreen);
    }
}
