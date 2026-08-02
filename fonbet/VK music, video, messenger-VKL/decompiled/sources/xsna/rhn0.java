package xsna;

import com.vk.superapp.deviceid.huawei.VkHuaweiDeviceIdProvider;
import java.util.List;

/* compiled from: SuperappVendorConfigFactory.kt */
/* loaded from: classes11.dex */
public final class rhn0 {
    public static List a() {
        zwu0 zwu0Var;
        feu0[] feu0VarArr = new feu0[2];
        VkHuaweiDeviceIdProvider vkHuaweiDeviceIdProvider = null;
        try {
            zwu0Var = zwu0.a;
        } catch (Throwable unused) {
            zwu0Var = null;
        }
        feu0VarArr[0] = zwu0Var;
        try {
            vkHuaweiDeviceIdProvider = VkHuaweiDeviceIdProvider.INSTANCE;
        } catch (Throwable unused2) {
        }
        feu0VarArr[1] = vkHuaweiDeviceIdProvider;
        return rl3.I(feu0VarArr);
    }
}
