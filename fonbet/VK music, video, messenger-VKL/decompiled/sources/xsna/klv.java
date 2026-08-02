package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.device.Vendor;
import com.vk.device.store.AppStore;
import java.util.EnumMap;

/* compiled from: HuaweiStoreLinkResolver.kt */
/* loaded from: classes18.dex */
public final class klv implements z93 {
    public final AppStore a = AppStore.HUAWEI;

    @Override // xsna.z93
    public final String a(EnumMap<AppStore, String> enumMap) {
        String str = enumMap.get(this.a);
        if (BuildInfo.k() || (BuildInfo.j() && Vendor.HUAWEI.a(true))) {
            return str;
        }
        return null;
    }

    @Override // xsna.z93
    public final AppStore getAppStore() {
        return this.a;
    }
}
