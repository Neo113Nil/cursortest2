package xsna;

import com.ironsource.Hb;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PhotosSave.java */
/* loaded from: classes15.dex */
public final class sga0 extends rsg0 {
    public final /* synthetic */ int s = 1;

    public /* synthetic */ sga0(String str) {
        super(str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                try {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = jSONObject.getJSONArray("response");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(new Photo(jSONArray.getJSONObject(i)));
                    }
                    return arrayList;
                } catch (Exception e) {
                    L.C("Vk", e);
                    return null;
                }
            default:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
        }
    }

    public sga0(String str, String str2, String str3, int i, UserId userId, String str4) {
        super("photos.save");
        C(i, "album_id");
        if (userId.b < 0) {
            F(fkq0.e(userId), "group_id");
        }
        K(Hb.a, str);
        K("photos_list", str2);
        K("hash", str3);
        K("caption", str4);
        C(1, "photo_sizes");
    }
}
