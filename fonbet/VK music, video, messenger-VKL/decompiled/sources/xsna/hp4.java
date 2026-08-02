package xsna;

import com.vk.dto.music.Artist;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AudioGetRelatedArtistById.kt */
/* loaded from: classes3.dex */
public final class hp4 extends rsg0<List<? extends Artist>> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ArrayList arrayList;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        Artist.a aVar = Artist.o;
        JSONArray optJSONArray = jSONObject2.optJSONArray("artists");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    try {
                        aVar.getClass();
                        arrayList.add(new Artist(optJSONObject));
                    } catch (Exception e) {
                        L.i(e);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? new ArrayList() : arrayList;
    }
}
