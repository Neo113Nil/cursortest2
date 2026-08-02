package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.VideoPreview;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.im.Image;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: DocUploadParser.kt */
/* loaded from: classes2.dex */
public final class ltn implements k7r0<ktn> {
    public static final ltn b = new ltn();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        Image image;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response").getJSONObject("doc");
            otn.a.a("DocUploadServerInfoParser", "DocSaveInfo response: " + jSONObject);
            long j = jSONObject2.getLong("id");
            jSONObject2.getInt("owner_id");
            jSONObject2.optString("title", "");
            jSONObject2.getLong("date");
            jSONObject2.getInt("size");
            jSONObject2.optInt("type", 8);
            jSONObject2.getString("ext");
            ktn ktnVar = new ktn(j, jSONObject2.getString("url"));
            if (jSONObject2.has("preview")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("preview");
                if (jSONObject3.has("photo")) {
                    JSONArray jSONArray = jSONObject3.getJSONObject("photo").getJSONArray("sizes");
                    ArrayList arrayList = new ArrayList(jSONArray.length());
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                        int i2 = jSONObject4.getInt("width");
                        int i3 = jSONObject4.getInt("height");
                        String string = jSONObject4.getString("src");
                        if (i2 != 0 && i3 != 0) {
                            image = new Image(i2, i3, string, false);
                            arrayList.add(image);
                        }
                        ImageSizeKey imageSizeKey = ImageSizeKey.SIZE_M_0130;
                        image = new Image(imageSizeKey.getWidth(), imageSizeKey.getHeight(), string, false);
                        arrayList.add(image);
                    }
                    ktnVar.c = arrayList;
                }
                if (jSONObject3.has("video")) {
                    JSONObject jSONObject5 = jSONObject3.getJSONObject("video");
                    VideoPreview videoPreview = new VideoPreview();
                    videoPreview.e = jSONObject5.getString("src");
                    videoPreview.b = jSONObject5.getInt("width");
                    videoPreview.c = jSONObject5.getInt("height");
                    videoPreview.d = jSONObject5.getLong("file_size");
                    ktnVar.d = Collections.singletonList(videoPreview);
                }
            }
            return ktnVar;
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
