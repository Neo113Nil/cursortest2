package yads;

import android.os.Build;
import com.ironsource.O6;
import com.ironsource.X3;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;

/* loaded from: classes10.dex */
public abstract class ix3 {
    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        px3.a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        px3.a(jSONObject, EndpointParameters.Name.OS_VERSION, Integer.toString(Build.VERSION.SDK_INT));
        px3.a(jSONObject, O6.F, X3.d);
        return jSONObject;
    }
}
