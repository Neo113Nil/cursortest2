package xsna;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.dto.common.data.ApiApplication;
import org.json.JSONObject;

/* compiled from: AppsGetRecommendations.kt */
/* loaded from: classes14.dex */
public final class ye3 extends aay<ApiApplication> {
    @Override // xsna.aay
    public final ApiApplication a(JSONObject jSONObject) {
        return new ApiApplication(jSONObject.getJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP));
    }
}
