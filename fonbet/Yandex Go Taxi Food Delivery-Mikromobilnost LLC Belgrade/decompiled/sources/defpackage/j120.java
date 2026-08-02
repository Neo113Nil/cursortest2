package defpackage;

import com.adjust.sdk.AdjustConfig;
import com.yandex.messenger.websdk.api.MessengerEnvironment;

/* loaded from: classes8.dex */
public final class j120 extends MessengerEnvironment {
    public final String b;
    public final String c;
    public final String d;

    public j120(String str, String str2, String str3) {
        super(AdjustConfig.ENVIRONMENT_PRODUCTION);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.yandex.messenger.websdk.api.MessengerEnvironment
    public final String a() {
        return oyr.p("https://", this.b, "/api/");
    }

    @Override // com.yandex.messenger.websdk.api.MessengerEnvironment
    public final String b() {
        return this.d;
    }

    @Override // com.yandex.messenger.websdk.api.MessengerEnvironment
    public final String c() {
        return oyr.p("https://", this.b, "/logout_client/");
    }

    @Override // com.yandex.messenger.websdk.api.MessengerEnvironment
    public final String d() {
        return "MessengerWebSdk";
    }

    @Override // com.yandex.messenger.websdk.api.MessengerEnvironment
    public final String e() {
        return oyr.p("https://", this.c, "/unread_count");
    }
}
