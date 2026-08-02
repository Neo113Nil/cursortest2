package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.FaveTag;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FaveGetTags.kt */
/* loaded from: classes4.dex */
public final class jqq extends rsg0<List<? extends FaveTag>> {
    public jqq() {
        super("fave.getTags");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ArrayList arrayList;
        JSONArray jSONArray = jSONObject.getJSONObject("response").getJSONArray("items");
        if (jSONArray != null) {
            arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    Serializer.c<FaveTag> cVar = FaveTag.CREATOR;
                    arrayList.add(FaveTag.a.a(optJSONObject));
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList != null ? arrayList : EmptyList.b;
    }
}
