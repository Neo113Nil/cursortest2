package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.superapp.multiaccount.api.analytics.VkAnalyticsUserType;

/* compiled from: VkAnalyticsUserType.kt */
/* loaded from: classes6.dex */
public final class c8u0 {
    public static final VkAnalyticsUserType a(AccountProfileType accountProfileType) {
        return accountProfileType == AccountProfileType.RELATED ? VkAnalyticsUserType.Related : VkAnalyticsUserType.Master;
    }

    public static final VkAnalyticsUserType b(com.vk.superapp.multiaccount.api.f fVar) {
        com.vk.superapp.multiaccount.api.g a;
        return (fVar == null || (a = fVar.a()) == null || !a.d()) ? VkAnalyticsUserType.Master : VkAnalyticsUserType.Related;
    }
}
