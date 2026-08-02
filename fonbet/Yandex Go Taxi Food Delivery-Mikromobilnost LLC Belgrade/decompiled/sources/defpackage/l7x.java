package defpackage;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.yandex.auth.LegacyAccountType;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* loaded from: classes12.dex */
public final class l7x {
    public final tls a;

    public l7x(tls tlsVar) {
        this.a = tlsVar;
    }

    @JavascriptInterface
    public final void send(String str) {
        tls tlsVar = this.a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(Constants.KEY_MESSAGE);
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.KEY_DATA);
            jSONObject.optString("requestId");
            if (string != null) {
                switch (string.hashCode()) {
                    case -1955007466:
                        if (string.equals("chooseAccount")) {
                            tlsVar.invoke(t7x.a);
                            return;
                        }
                        return;
                    case -1097329270:
                        if (string.equals("logout")) {
                            tlsVar.invoke(q7x.a);
                            return;
                        }
                        return;
                    case 94756344:
                        if (string.equals("close")) {
                            tlsVar.invoke(n7x.a);
                            return;
                        }
                        return;
                    case 103149417:
                        if (string.equals(LegacyAccountType.STRING_LOGIN)) {
                            tlsVar.invoke(p7x.a);
                            return;
                        }
                        return;
                    case 108386723:
                        if (string.equals(UgcLiveVideoData.UgcLiveStatus.READY)) {
                            if (optJSONObject == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            tlsVar.invoke(new s7x(jl40.l(optJSONObject.optString(ACSPConstants.STATUS), WriteBlocks.OK)));
                            return;
                        }
                        return;
                    case 1175633762:
                        if (string.equals("bstExpired")) {
                            if (optJSONObject != null) {
                                optJSONObject.optBoolean("reload");
                            }
                            tlsVar.invoke(new m7x());
                            return;
                        }
                        return;
                    case 1306583290:
                        if (string.equals("openExternalUrl")) {
                            if (optJSONObject == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            String string2 = optJSONObject.getString("url");
                            tlsVar.invoke(new r7x(Uri.parse(string2), optJSONObject.optBoolean("isAuthRequired"), optJSONObject.optBoolean("isWebViewClosed")));
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } catch (Throwable th) {
            tlsVar.invoke(new o7x(th));
        }
    }
}
