package xsna;

import com.vk.dto.actionlinks.ActionLinks;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ActionLinksGetByTag.kt */
/* loaded from: classes14.dex */
public final class z20 extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z20(String str, int i) {
        super(str);
        this.s = i;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                if (optJSONObject != null) {
                    return new ActionLinks(optJSONObject);
                }
                throw new Exception();
            default:
                JSONArray jSONArray = jSONObject.getJSONObject("response").getJSONArray("items");
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(com.vk.dto.common.c.b(jSONArray.getJSONObject(i)));
                }
                return arrayList;
        }
    }
}
