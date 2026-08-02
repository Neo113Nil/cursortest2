package xsna;

import com.vk.superapp.ads.js.bridge.api.events.ShowBannerAd$Error;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class zvp {
    public final com.vk.superapp.base.js.bridge.b a;

    public zvp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, String str2) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppShowBannerAd"), new ShowBannerAd$Error(null, new ShowBannerAd$Error.Data(ShowBannerAd$Error.Data.Type.CLIENT_ERROR, str, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), str, 1, null)), 1, 0 == true ? 1 : 0), str2, null, 8);
    }
}
