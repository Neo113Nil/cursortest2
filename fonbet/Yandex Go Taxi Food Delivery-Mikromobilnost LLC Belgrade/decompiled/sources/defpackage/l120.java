package defpackage;

import com.adjust.sdk.AdjustConfig;
import com.yandex.messenger.websdk.api.MessengerEnvironment;

/* loaded from: classes15.dex */
public final class l120 extends MessengerEnvironment {
    public static final l120 b = new l120(AdjustConfig.ENVIRONMENT_PRODUCTION);

    @Override // com.yandex.messenger.websdk.api.MessengerEnvironment
    public final String a() {
        return "https://api.messenger.yandex.net/api/";
    }

    @Override // com.yandex.messenger.websdk.api.MessengerEnvironment
    public final String b() {
        return "yandex.ru";
    }

    @Override // com.yandex.messenger.websdk.api.MessengerEnvironment
    public final String c() {
        return "https://api.messenger.yandex.net/logout_client/";
    }

    @Override // com.yandex.messenger.websdk.api.MessengerEnvironment
    public final String d() {
        return "MessengerWebSdk";
    }

    @Override // com.yandex.messenger.websdk.api.MessengerEnvironment
    public final String e() {
        return "https://backend.messenger.yandex.net/unread_count";
    }
}
