package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.base.VkPaginationList;
import com.vk.dto.geo.GeoLocation;
import java.util.ArrayList;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: PlacesSearchGeo.kt */
/* loaded from: classes15.dex */
public final class usa0 extends rsg0<VkPaginationList<GeoLocation>> {
    public usa0(double d, double d2, String str, int i, int i2) {
        super("places.search");
        K("latitude", String.valueOf(d));
        K("longitude", String.valueOf(d2));
        C(i, SignalingProtocol.KEY_OFFSET);
        if (i2 > 0) {
            C(i2, "count");
        }
        if (str.length() > 0) {
            K(CampaignEx.JSON_KEY_AD_Q, str);
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            return tav0.a(jSONObject.optJSONObject("response"), new n9w(14));
        } catch (Exception unused) {
            return new VkPaginationList(new ArrayList(), 0, false, 0, 8, null);
        }
    }
}
