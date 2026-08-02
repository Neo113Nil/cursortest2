package xsna;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.vk.dto.common.data.VKList;
import com.vk.dto.user.UserProfile;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: UsersGetSubscriptions.java */
/* loaded from: classes15.dex */
public final class g1r0 extends pug0<UserProfile> {
    @Override // xsna.pug0, xsna.oer0, xsna.k7r0
    @NonNull
    /* renamed from: F0 */
    public final VKList<UserProfile> a(@NonNull JSONObject jSONObject) throws Exception {
        VKList<UserProfile> a = super.a(jSONObject);
        JSONArray optJSONArray = jSONObject.getJSONObject("response").optJSONArray("track_codes");
        if (optJSONArray != null) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                long optLong = jSONObject2.optLong("owner_id", 0L);
                String optString = jSONObject2.optString("track_code");
                if (optLong != 0 && !TextUtils.isEmpty(optString)) {
                    hashMap.put(Long.valueOf(optLong), optString);
                }
            }
            Iterator<UserProfile> it = a.iterator();
            while (it.hasNext()) {
                UserProfile next = it.next();
                String str = (String) hashMap.get(Long.valueOf(next.c.b));
                if (str != null) {
                    next.J = str;
                }
            }
        }
        return a;
    }
}
