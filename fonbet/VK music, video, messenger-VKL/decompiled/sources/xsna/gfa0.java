package xsna;

import androidx.annotation.NonNull;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.photo.PhotoTag;
import com.vk.log.L;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PhotosGetTags.java */
/* loaded from: classes15.dex */
public final class gfa0 extends rsg0<ArrayList<PhotoTag>> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(@NonNull JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("response");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                Serializer.c<PhotoTag> cVar = PhotoTag.CREATOR;
                arrayList.add(PhotoTag.a.a(jSONObject2));
            }
            return arrayList;
        } catch (Exception e) {
            L.E(e, new Object[0]);
            return null;
        }
    }
}
