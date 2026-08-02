package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.FaveTag;
import org.json.JSONObject;

/* compiled from: FaveAddTag.kt */
/* loaded from: classes4.dex */
public final class lmq extends rsg0<FaveTag> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        Serializer.c<FaveTag> cVar = FaveTag.CREATOR;
        return FaveTag.a.a(jSONObject.getJSONObject("response"));
    }
}
