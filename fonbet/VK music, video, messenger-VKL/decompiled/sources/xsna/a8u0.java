package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;

/* compiled from: VkAnalyticsFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class a8u0 implements com.vk.superapp.navigation.api.di.c {
    @Override // com.vk.superapp.navigation.api.di.c
    public final k1w0 a(String str, String str2, WebApiApplication webApiApplication) {
        return new zfu0(str, str2, webApiApplication);
    }

    @Override // com.vk.superapp.navigation.api.di.c
    public final VkBridgeAnalytics b(long j, String str, String str2, String str3, boolean z, j19 j19Var) {
        return new jfu0(j, str2, str3, str, z, j19Var);
    }

    @Override // com.vk.superapp.navigation.api.di.c
    public final qfu0 c(boolean z, String str, Long l, long j) {
        return new rfu0(z, str, l, j);
    }
}
