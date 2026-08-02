package xsna;

import com.ironsource.C4217a2;
import com.vk.dto.actionlinks.ActionLinksResponse;
import org.json.JSONObject;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;

/* compiled from: VideoGetStreamOptions.java */
/* loaded from: classes15.dex */
public final class qns0 extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qns0(String str, String str2) {
        super("notifications.action");
        this.s = 2;
        K("query", str);
        K("text", str2);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                rit0 rit0Var = new rit0();
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                rit0Var.a = jSONObject2.optInt(BadConnectionSignaling.KEY_BAD_NET_BITRATE);
                rit0Var.b = jSONObject2.optInt("width");
                rit0Var.c = jSONObject2.optInt("height");
                rit0Var.d = jSONObject2.optInt("rotation");
                rit0Var.e = jSONObject2.optInt(C4217a2.e);
                return rit0Var;
            case 1:
                return new ActionLinksResponse(jSONObject.getJSONObject("response"), new y20());
            case 2:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
            default:
                return vj90.g(jSONObject);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qns0(String str, int i) {
        super(str);
        this.s = i;
        switch (i) {
            case 3:
                super("specials.getSpecialPopup");
                K("id", str);
                R("extended", true);
                K("fields", "photo_base");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qns0() {
        super("video.getStreamOptions");
        this.s = 0;
    }
}
