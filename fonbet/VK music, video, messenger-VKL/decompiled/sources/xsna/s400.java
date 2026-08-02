package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.r400;
import xsna.v400;

/* compiled from: LongPollResponseParserChannelsImpl.kt */
/* loaded from: classes2.dex */
public final class s400 implements r400 {
    @Override // xsna.r400
    public final r400.a a(JSONObject jSONObject) {
        try {
            new v400.a(dhb.b(jSONObject).a);
            throw null;
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }
}
