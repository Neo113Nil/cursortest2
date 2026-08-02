package xsna;

import com.vk.dto.photo.Photo;
import org.json.JSONObject;

/* compiled from: FaveNewAddLink.kt */
/* loaded from: classes18.dex */
public final class rqq extends rsg0<Boolean> {
    public rqq(String str, Photo photo, String str2, String str3, String str4, String str5) {
        super("fave.addLink");
        K("link", str);
        if (str3 != null && str3.length() != 0) {
            K("access_key", str3);
        }
        if (str4 != null && str4.length() != 0) {
            K("track_code", str4);
        }
        if (photo != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(photo.e);
            sb.append('_');
            sb.append(photo.c);
            K("photo", sb.toString());
        }
        if (str2 != null) {
            K("title", str2);
        }
        if (str5 == null || str5.length() == 0) {
            return;
        }
        K("ref", str5);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.getInt("response") == 1);
    }
}
