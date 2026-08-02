package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.apps.VkBuildAppStore;
import com.vk.device.store.AppStore;
import java.util.EnumMap;

/* compiled from: RuStoreLinkResolver.kt */
/* loaded from: classes18.dex */
public final class brg0 implements z93 {
    public final AppStore a = AppStore.RUSTORE;

    @Override // xsna.z93
    public final String a(EnumMap<AppStore, String> enumMap) {
        AppStore appStore = this.a;
        String str = enumMap.get(appStore);
        if (!BuildInfo.n()) {
            BuildInfo.Client client = BuildInfo.a;
            if ((BuildInfo.c() != VkBuildAppStore.SMALL_STORE || !dy2.i(appStore.j())) && (!BuildInfo.j() || !dy2.i(appStore.j()))) {
                return null;
            }
        }
        return str;
    }

    @Override // xsna.z93
    public final AppStore getAppStore() {
        return this.a;
    }
}
