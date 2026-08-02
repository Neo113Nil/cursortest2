package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PhotosCreateAlbum.java */
/* loaded from: classes15.dex */
public final class qea0 extends rsg0 {
    public final /* synthetic */ int s = 1;

    public /* synthetic */ qea0(String str) {
        super(str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                try {
                    return new PhotoAlbum(jSONObject.getJSONObject("response"));
                } catch (Exception e) {
                    L.E(e, new Object[0]);
                    return null;
                }
            case 1:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
            default:
                VKList vKList = new VKList();
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                ArrayList arrayList = null;
                JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("items") : null;
                if (optJSONArray != null) {
                    arrayList = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                        if (optJSONObject2 != null) {
                            UserProfile userProfile = new UserProfile(optJSONObject2);
                            userProfile.r = optJSONObject2.optString("description");
                            arrayList.add(userProfile);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        vKList.add(new fyh0((UserProfile) it.next()));
                    }
                }
                vKList.o(jSONObject.optJSONObject("response").optInt("count", 0));
                return vKList;
        }
    }

    public qea0(String str, String str2, UserId userId) {
        super("photos.createAlbum");
        K("title", str);
        K("description", str2);
        if (userId.b < 0) {
            F(fkq0.a(userId), "group_id");
        }
    }

    public qea0(UserId userId, String str, String str2, String str3, String str4) {
        super("fave.removePage");
        F(fkq0.a(userId), fkq0.b(userId) ? "group_id" : "user_id");
        K("ref", str);
        if (str2 != null && str2.length() != 0) {
            K("track_code", str2);
        }
        if (str3 != null && str3.length() != 0) {
            K("ref_screen", str3);
        }
        if (str4 == null || str4.length() == 0) {
            return;
        }
        K("source", str4);
    }

    public qea0(String str, String str2, String str3, String str4, UserId userId) {
        this(str, str2, userId);
        K("privacy_view", str3);
        K("privacy_comment", str4);
    }

    public qea0(UserId userId, String str, String str2, boolean z, boolean z2) {
        this(str, str2, userId);
        K("upload_by_admins_only", z ? "1" : "0");
        K("comments_disabled", z2 ? "1" : "0");
    }
}
