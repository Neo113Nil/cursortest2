package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.im.engine.exceptions.ApiLongPollException;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ehb;
import xsna.k7r0;

/* compiled from: ChannelsLongPollApiResponseParser.kt */
/* loaded from: classes2.dex */
public final class dhb implements k7r0<chb> {
    public static chb b(JSONObject jSONObject) {
        List list;
        if (jSONObject.has("failed")) {
            throw new ApiLongPollException(jSONObject.optInt("failed", 3));
        }
        long optLong = jSONObject.optLong("new_version", -1L);
        Long valueOf = Long.valueOf(optLong);
        if (optLong == -1) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : jSONObject.getLong("ts");
        long optLong2 = jSONObject.optLong("old_version", -1L);
        Long valueOf2 = optLong2 != -1 ? Long.valueOf(optLong2) : null;
        JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_UPDATES);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            list = EmptyList.b;
        } else {
            try {
                ehb.a aVar = new ehb.a(0);
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    ehb.d(aVar, optJSONArray.getJSONArray(i));
                }
                ehb.a(aVar);
                list = aVar.e;
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }
        return new chb(longValue, valueOf2, list);
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
