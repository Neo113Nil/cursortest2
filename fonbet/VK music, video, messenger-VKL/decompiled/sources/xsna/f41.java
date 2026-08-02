package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import java.util.List;
import java.util.Map;
import xsna.gi0;

/* compiled from: SuperappAdBridge.kt */
/* loaded from: classes6.dex */
public interface f41 {
    long a(AdvertisementType advertisementType, long j);

    void b();

    void c(AdvertisementType advertisementType, long j, int i);

    Map<Integer, hi0> d();

    void e(AdvertisementType advertisementType, WebAdConfig webAdConfig, boolean z, int i);

    com.vk.superapp.advertisement.b f();

    io.reactivex.rxjava3.internal.operators.single.r g(AdvertisementType advertisementType, WebAdConfig webAdConfig, boolean z, boolean z2);

    void h(gi0.a aVar, WebAdConfig webAdConfig);

    io.reactivex.rxjava3.core.x<gi0> i(AdvertisementType advertisementType, List<Integer> list, boolean z, boolean z2);

    void j();

    com.vk.superapp.advertisement.b j0();

    boolean k(AdvertisementType advertisementType, WebAdConfig webAdConfig);

    void l();

    void m();

    long n(AdvertisementType advertisementType, int i);

    void o(AdvertisementType advertisementType, List<Integer> list, boolean z, int i);
}
