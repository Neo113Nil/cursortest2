package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.dto.music.MusicTracksPage;
import com.vk.newsfeed.posting.impl.domain.request.ParsedAttachment;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MoneyGetParams.java */
/* loaded from: classes15.dex */
public final class l730 extends rsg0 {
    public final /* synthetic */ int s = 1;

    public /* synthetic */ l730(String str) {
        super(str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                Serializer.c<MoneyReceiverInfo> cVar = MoneyReceiverInfo.CREATOR;
                return MoneyReceiverInfo.a.a(jSONObject2);
            case 1:
                MusicTracksPage.a aVar = MusicTracksPage.d;
                JSONObject jSONObject3 = jSONObject.getJSONObject("response");
                aVar.getClass();
                return new MusicTracksPage(jSONObject3);
            default:
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                Map e = vj90.e(optJSONObject);
                JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("data") : null;
                if (optJSONArray == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject4 = optJSONArray.getJSONObject(i);
                    arrayList.add(new ParsedAttachment(com.vkontakte.android.attachments.a.c(jSONObject4, e, null), jSONObject4.has("source_url") ? jSONObject4.optString("source_url") : ""));
                }
                return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l730(int i, String str, String str2, boolean z) {
        super("audio.getButtonTracks");
        int i2 = z ? -1 : 0;
        K("id", str);
        C(i, "count");
        C(i2, "shuffle_seed");
        K("ref", str2);
    }

    public l730(UserId userId) {
        super("money.getParams");
        if (userId != null) {
            F(userId, "receiver_id");
        }
    }
}
