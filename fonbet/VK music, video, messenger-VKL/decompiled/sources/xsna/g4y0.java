package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.apps.VkBuildAppStore;
import com.vk.device.Vendor;
import com.vk.device.store.AppStore;
import java.util.EnumMap;

/* compiled from: XiaomiStoreLinkResolver.kt */
/* loaded from: classes18.dex */
public final class g4y0 implements z93 {
    public final AppStore a = AppStore.XIAOMI;

    @Override // xsna.z93
    public final String a(EnumMap<AppStore, String> enumMap) {
        String str = enumMap.get(this.a);
        boolean a = Vendor.XIAOMI.a(true);
        BuildInfo.Client client = BuildInfo.a;
        if ((BuildInfo.c() == VkBuildAppStore.SMALL_STORE && a) || (BuildInfo.j() && a)) {
            return str;
        }
        return null;
    }

    @Override // xsna.z93
    public final AppStore getAppStore() {
        return this.a;
    }
}
