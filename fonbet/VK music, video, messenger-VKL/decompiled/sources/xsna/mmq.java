package xsna;

import com.vk.dto.photo.Photo;
import com.vk.log.L;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FaveAddVideo.kt */
/* loaded from: classes18.dex */
public final class mmq extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmq(String str, int i) {
        super(str);
        this.s = i;
        switch (i) {
            case 1:
                super("photos.saveBackgroundPhoto");
                K("response_json", str);
                break;
            default:
                break;
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
            default:
                try {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = jSONObject.getJSONArray("response");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(new Photo(jSONArray.getJSONObject(i)));
                    }
                    return arrayList;
                } catch (Exception e) {
                    L.C("Vk", e);
                    return null;
                }
        }
    }
}
