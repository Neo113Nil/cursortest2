package xsna;

import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: NotificationsResponseData.kt */
/* loaded from: classes18.dex */
public final class zj70 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;

    public zj70(JSONObject jSONObject) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        JSONArray optJSONArray = jSONObject.optJSONArray("profiles");
        HashMap hashMap5 = null;
        if (optJSONArray != null) {
            hashMap = new HashMap();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    UserProfile userProfile = new UserProfile(optJSONObject);
                    hashMap.put(userProfile.c, userProfile);
                }
            }
        } else {
            hashMap = null;
        }
        this.a = hashMap;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("groups");
        if (optJSONArray2 != null) {
            hashMap2 = new HashMap();
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    Group group = new Group(optJSONObject2);
                    hashMap2.put(group.c, group);
                }
            }
        } else {
            hashMap2 = null;
        }
        this.b = hashMap2;
        JSONArray optJSONArray3 = jSONObject.optJSONArray("photos");
        if (optJSONArray3 != null) {
            hashMap3 = new HashMap();
            int length3 = optJSONArray3.length();
            for (int i3 = 0; i3 < length3; i3++) {
                JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i3);
                if (optJSONObject3 != null) {
                    Photo photo = new Photo(optJSONObject3);
                    StringBuilder sb = new StringBuilder();
                    sb.append(photo.e);
                    sb.append('_');
                    sb.append(photo.c);
                    hashMap3.put(sb.toString(), photo);
                }
            }
        } else {
            hashMap3 = null;
        }
        this.c = hashMap3;
        JSONArray optJSONArray4 = jSONObject.optJSONArray("videos");
        if (optJSONArray4 != null) {
            hashMap4 = new HashMap();
            int length4 = optJSONArray4.length();
            for (int i4 = 0; i4 < length4; i4++) {
                JSONObject optJSONObject4 = optJSONArray4.optJSONObject(i4);
                if (optJSONObject4 != null) {
                    VideoFileOld b = com.vk.dto.common.c.b(optJSONObject4);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b.b);
                    sb2.append('_');
                    sb2.append(b.c);
                    hashMap4.put(sb2.toString(), b);
                }
            }
        } else {
            hashMap4 = null;
        }
        this.d = hashMap4;
        JSONArray optJSONArray5 = jSONObject.optJSONArray("apps");
        if (optJSONArray5 != null) {
            hashMap5 = new HashMap();
            int length5 = optJSONArray5.length();
            for (int i5 = 0; i5 < length5; i5++) {
                JSONObject optJSONObject5 = optJSONArray5.optJSONObject(i5);
                if (optJSONObject5 != null) {
                    ApiApplication apiApplication = new ApiApplication(optJSONObject5);
                    hashMap5.put(String.valueOf(apiApplication.b.b), apiApplication);
                }
            }
        }
        this.e = hashMap5;
    }
}
