package yads;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class em {
    public static dm a(JSONObject jSONObject) {
        Object opt = jSONObject.opt("top");
        String str = opt instanceof String ? (String) opt : null;
        Object opt2 = jSONObject.opt(TtmlNode.RIGHT);
        String str2 = opt2 instanceof String ? (String) opt2 : null;
        Object opt3 = jSONObject.opt(TtmlNode.LEFT);
        String str3 = opt3 instanceof String ? (String) opt3 : null;
        Object opt4 = jSONObject.opt("bottom");
        return new dm(str, str2, str3, opt4 instanceof String ? (String) opt4 : null);
    }
}
