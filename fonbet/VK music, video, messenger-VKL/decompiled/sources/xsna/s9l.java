package xsna;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;

/* compiled from: DefaultAdCacheProvider.kt */
/* loaded from: classes6.dex */
public final class s9l {
    public final Gson a;
    public final sni b;

    public s9l() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        AdvertisementConfig.SlotConfig slotConfig = AdvertisementConfig.SlotConfig.a;
        this.a = gsonBuilder.registerTypeAdapter(AdvertisementConfig.SlotConfig.class, new x31()).create();
        this.b = new sni(14);
    }
}
