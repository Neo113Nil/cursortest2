package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.polls.PhotoPoll;
import org.json.JSONObject;

/* compiled from: PoolsSavePhoto.kt */
/* loaded from: classes15.dex */
public final class yvb0 extends rsg0<PhotoPoll> {
    public yvb0(String str, String str2) {
        super("polls.savePhoto");
        K("photo", str);
        K("hash", str2);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        Serializer.c<PhotoPoll> cVar = PhotoPoll.CREATOR;
        return PhotoPoll.a.a(jSONObject.getJSONObject("response"));
    }
}
