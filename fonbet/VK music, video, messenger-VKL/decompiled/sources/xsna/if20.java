package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: MessagesHideRecentGraffiti.java */
@Deprecated
/* loaded from: classes15.dex */
public final class if20 extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ if20(String str, int i) {
        super(str);
        this.s = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        Object jmf0Var;
        switch (this.s) {
            case 0:
                try {
                    return Integer.valueOf(jSONObject.getInt("response"));
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                try {
                    return Integer.valueOf(jSONObject.getJSONObject("response").getInt("post_id"));
                } catch (Exception e) {
                    L.C("vk", e);
                    return null;
                }
            case 2:
                Integer x = f370.x(jSONObject.getJSONObject("response"), "invites_send_count");
                return new lqu(x != null ? x.intValue() : 0);
            case 3:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
            default:
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                String string = jSONObject2.getString("status");
                String optString = jSONObject2.optString("description");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -952828083:
                            if (string.equals("invalid_pin")) {
                                return lpx.a;
                            }
                            break;
                        case -776144932:
                            if (string.equals("redirect")) {
                                jmf0Var = new jmf0(jSONObject2.getString("redirect_uri"));
                                break;
                            }
                            break;
                        case -599445191:
                            if (string.equals(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE)) {
                                jmf0Var = new w7i(optString, jSONObject2.optString("receipt_uri"));
                                break;
                            }
                            break;
                        case 3641717:
                            if (string.equals("wait")) {
                                return z7x0.a;
                            }
                            break;
                        case 96784904:
                            if (string.equals("error")) {
                                return new wup(optString);
                            }
                            break;
                    }
                    return jmf0Var;
                }
                return new wup("");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if20(int i) {
        super("friends.deleteList");
        this.s = 3;
        C(i, "list_id");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if20(String str, String str2) {
        super("money.getTransferStatus");
        this.s = 4;
        K("id", str);
        if (str2 != null) {
            K("section", str2);
        }
    }
}
