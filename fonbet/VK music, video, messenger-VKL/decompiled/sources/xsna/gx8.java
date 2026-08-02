package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: CacheRegistry.kt */
/* loaded from: classes.dex */
public interface gx8 {

    /* compiled from: CacheRegistry.kt */
    public interface a {
        CacheTarget a();

        void dispose();

        String getDescription();

        long u();
    }

    ConcurrentHashMap a();

    List<a> b(CacheTarget cacheTarget);

    void c(a aVar);
}
