package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CommentParsers.kt */
/* loaded from: classes4.dex */
public final class ccg {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r7 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(JSONObject jSONObject, HashMap hashMap, HashMap hashMap2) {
        String a;
        JSONArray optJSONArray = jSONObject.optJSONArray("profiles");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                Serializer.c<Owner> cVar = Owner.CREATOR;
                Owner f = Owner.a.f(jSONObject2);
                String optString = jSONObject2.optString("photo_base");
                if (optString.length() > 0) {
                    a = js5.a(iah0.f().density > 1.0f ? 100 : 50, optString);
                } else {
                    String a2 = cqm0.a(jSONObject2.optString("photo_200"));
                    String a3 = cqm0.a(jSONObject2.optString("photo_100"));
                    a = cqm0.a(jSONObject2.optString("photo_50"));
                    if (iah0.f().density > 1.0f) {
                        if (a3 == null) {
                            if (a2 == null) {
                            }
                            a = a2;
                        }
                        a = a3;
                    } else if (a != null) {
                    }
                }
                f.e = a;
                hashMap.put(f.b, f);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("groups");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                Serializer.c<Owner> cVar2 = Owner.CREATOR;
                Owner d = Owner.a.d(optJSONArray2.getJSONObject(i2));
                hashMap.put(d.b, d);
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("names_dat");
        JSONArray optJSONArray4 = jSONObject.optJSONArray("ids_dat");
        if (optJSONArray3 == null || optJSONArray4 == null) {
            return;
        }
        int length3 = optJSONArray3.length();
        for (int i3 = 0; i3 < length3; i3++) {
            hashMap2.put(new UserId(optJSONArray4.getLong(i3)), optJSONArray3.getString(i3));
        }
    }
}
