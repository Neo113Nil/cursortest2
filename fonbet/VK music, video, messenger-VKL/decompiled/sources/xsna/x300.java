package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.ApiLongPollException;
import com.vk.im.engine.internal.api_parsers.a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.k7r0;
import xsna.w300;

/* compiled from: LongPollApiResponseParser.kt */
/* loaded from: classes2.dex */
public final class x300 implements k7r0<w300.a> {
    public final Peer b;
    public final com.vk.im.engine.internal.api_parsers.a c;

    public x300(Peer peer, com.vk.im.engine.internal.api_parsers.a aVar) {
        this.b = peer;
        this.c = aVar;
    }

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            return b(jSONObject);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    public final w300.a b(JSONObject jSONObject) {
        long j;
        List list;
        if (jSONObject.has("failed")) {
            throw new ApiLongPollException(jSONObject.optInt("failed", 3));
        }
        long j2 = jSONObject.getInt("ts");
        long j3 = jSONObject.getInt("pts");
        JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_UPDATES);
        if (optJSONArray == null) {
            list = EmptyList.b;
            j = j3;
        } else {
            Peer peer = this.b;
            j = j3;
            com.vk.im.engine.internal.api_parsers.a aVar = this.c;
            aVar.getClass();
            try {
                a.C1114a c1114a = new a.C1114a(0);
                List list2 = c1114a.g;
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    aVar.f(c1114a, optJSONArray.getJSONArray(i), peer, j);
                }
                com.vk.im.engine.internal.api_parsers.a.a(c1114a);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    f900.a.a(((e900) it.next()).toString());
                }
                list = list2;
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }
        return new w300.a(list, j2, j);
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
