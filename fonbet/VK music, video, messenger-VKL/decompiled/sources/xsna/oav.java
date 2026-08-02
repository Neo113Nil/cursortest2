package xsna;

import org.json.JSONObject;
import xsna.cxi;
import xsna.k7r0;

/* compiled from: HolidayInteractionConfigLoader.kt */
/* loaded from: classes7.dex */
public final class oav<Result> implements k7r0 {
    public static final oav<Result> b = new oav<>();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("response");
            return optJSONObject == null ? cxi.a.a : !optJSONObject.optBoolean("is_enabled", false) ? cxi.a.a : new cxi.b(optJSONObject.optString("interaction_id"), optJSONObject.optString("button_gradient_start_color"), optJSONObject.optString("button_gradient_end_color"), optJSONObject.optBoolean("request_button_visible"), optJSONObject.optString("request_button_text"), optJSONObject.optString("request_hint_title"), optJSONObject.optString("request_hint_message"), optJSONObject.optString("hide_button_text"), optJSONObject.optString("outgoing_request_message"), optJSONObject.optString("incoming_request_message"), optJSONObject.optString("opponent_success_text"), optJSONObject.optString("success_text"), optJSONObject.optString("cancel_outgoing_button_text"), optJSONObject.optString("cancel_incoming_button_text"), optJSONObject.optString("accept_button_text"), optJSONObject.optString("accept_button_icon_url"), optJSONObject.optString("accept_with_video_button_text"), optJSONObject.optString("accept_with_video_button_icon_url"), optJSONObject.optString("declined_text"), optJSONObject.optString("stop_button_text"), optJSONObject.optString("burger_menu_action_text"), optJSONObject.optString("burger_menu_icon_url"), optJSONObject.optLong("vibration_duration_ms", 10000L), optJSONObject.optString("action_type"), optJSONObject.optString("action_value"), optJSONObject.optString("enable_camera_to_request_interaction_title"), optJSONObject.optString("enable_camera_to_request_interaction_message"));
        } catch (Exception unused) {
            return cxi.a.a;
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
