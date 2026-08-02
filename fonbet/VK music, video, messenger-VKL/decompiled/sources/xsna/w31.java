package xsna;

import com.google.gson.Gson;
import com.vk.core.preference.Preference;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AdvertisementCacheImpl.kt */
/* loaded from: classes6.dex */
public final class w31 implements u31 {
    public final Gson a;
    public final sni b;
    public final LinkedHashMap c = new LinkedHashMap();

    public w31(Gson gson, sni sniVar) {
        this.a = gson;
        this.b = sniVar;
    }

    @Override // xsna.u31
    public final long a(AdvertisementType advertisementType, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(advertisementType);
        sb.append(j);
        return ((Number) this.c.getOrDefault(sb.toString(), 0L)).longValue();
    }

    @Override // xsna.u31
    public final void b() {
        Preference.C("com.vk.superapp.advertisement", "key_ads_skipped_slots");
    }

    @Override // xsna.u31
    public final void c(AdvertisementType advertisementType, long j, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(advertisementType);
        sb.append(j);
        this.c.put(sb.toString(), Long.valueOf(this.b.i() + i));
    }

    @Override // xsna.u31
    public final void d(ConcurrentHashMap concurrentHashMap) {
        String s;
        s = Preference.s("com.vk.superapp.advertisement", "key_ads_skipped_slots", new String());
        if (s.length() == 0) {
            return;
        }
        try {
            concurrentHashMap.putAll((Map) this.a.fromJson(s, new v31().getType()));
        } catch (Throwable th) {
            xgx0.a.getClass();
            xgx0.d(th);
        }
    }

    @Override // xsna.u31
    public final void e(AdvertisementConfig advertisementConfig, String str) {
        Preference.H("com.vk.superapp.advertisement", "key_advertisement_config", this.a.toJson(advertisementConfig));
        if (str == null) {
            str = "";
        }
        Preference.H("com.vk.superapp.advertisement", "key_active_features", str);
    }

    @Override // xsna.u31
    public final void f(ConcurrentHashMap concurrentHashMap) {
        Preference.H("com.vk.superapp.advertisement", "key_ads_skipped_slots", this.a.toJson(concurrentHashMap));
    }

    @Override // xsna.u31
    public final void g(int i, long j) {
        this.c.put(defpackage.k0.a(j, "key_banner_ad_limit_expiration_time"), Long.valueOf(this.b.i() + i));
    }

    @Override // xsna.u31
    public final long h(long j) {
        return ((Number) this.c.getOrDefault(defpackage.k0.a(j, "key_banner_ad_limit_expiration_time"), 0L)).longValue();
    }

    @Override // xsna.u31
    public final AdvertisementConfig i(String str) {
        String s;
        String s2;
        try {
            s = Preference.s("com.vk.superapp.advertisement", "key_active_features", new String());
            if (str == null) {
                str = "";
            }
            if (str.equals(s)) {
                s2 = Preference.s("com.vk.superapp.advertisement", "key_advertisement_config", new String());
                if (s2.length() > 0) {
                    return (AdvertisementConfig) this.a.fromJson(s2, AdvertisementConfig.class);
                }
            }
            return null;
        } catch (Throwable th) {
            xgx0.a.getClass();
            xgx0.d(th);
            return null;
        }
    }
}
