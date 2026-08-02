package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.Peer;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.a400;
import xsna.r400;
import xsna.v400;
import xsna.w300;

/* compiled from: LongPollResponseParserMessagesImpl.kt */
/* loaded from: classes2.dex */
public final class u400 implements r400 {
    public final a400.b a;
    public final x300 b;

    public u400(Peer peer, a400.b bVar, com.vk.im.engine.internal.api_parsers.a aVar) {
        this.a = bVar;
        this.b = new x300(peer, aVar);
    }

    @Override // xsna.r400
    public final r400.a a(JSONObject jSONObject) {
        try {
            w300.a b = this.b.b(jSONObject);
            return new r400.a(a400.b.c(this.a, new v400.b(b.b, b.a)), b.c);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }
}
