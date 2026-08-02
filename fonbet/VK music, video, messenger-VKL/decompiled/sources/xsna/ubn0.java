package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.k7r0;

/* compiled from: SuperAppSseQueueResponseParser.kt */
/* loaded from: classes5.dex */
public final class ubn0 implements k7r0<ran0> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    public static ran0 b(JSONObject jSONObject) {
        ?? r2;
        long y = f370.y(jSONObject, "ts", -1L);
        Integer x = f370.x(jSONObject, "failed");
        pan0 pan0Var = x != null ? new pan0(x.intValue()) : null;
        JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_UPDATES);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            r2 = EmptyList.b;
        } else {
            r2 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                r2.add(optJSONArray.getJSONObject(i));
            }
        }
        return new ran0(r2, y, pan0Var);
    }

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            return b(jSONObject);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
