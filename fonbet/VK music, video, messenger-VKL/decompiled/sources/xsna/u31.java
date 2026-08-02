package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AdvertisementCache.kt */
/* loaded from: classes6.dex */
public interface u31 {
    long a(AdvertisementType advertisementType, long j);

    void b();

    void c(AdvertisementType advertisementType, long j, int i);

    void d(ConcurrentHashMap concurrentHashMap);

    void e(AdvertisementConfig advertisementConfig, String str);

    void f(ConcurrentHashMap concurrentHashMap);

    void g(int i, long j);

    long h(long j);

    AdvertisementConfig i(String str);
}
