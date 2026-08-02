package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* compiled from: ProfilesParser.kt */
/* loaded from: classes2.dex */
public final class i1e0 implements k7r0<ProfilesSimpleInfo> {
    public static ProfilesSimpleInfo b(JSONObject jSONObject) {
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
        JSONArray optJSONArray = jSONObject.optJSONArray("profiles");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("groups");
        JSONArray optJSONArray3 = jSONObject.optJSONArray("emails");
        JSONArray optJSONArray4 = jSONObject.optJSONArray("contacts");
        if (optJSONArray4 == null) {
            optJSONArray4 = new JSONArray();
        }
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                User f = jgq0.f(optJSONArray.getJSONObject(i), null);
                profilesSimpleInfo.b.put(Long.valueOf(f.b), f);
            }
        }
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                Group a = ygu.a(optJSONArray2.getJSONObject(i2));
                profilesSimpleInfo.e.put(Long.valueOf(a.b), a);
            }
        }
        if (optJSONArray3 != null) {
            int length3 = optJSONArray3.length();
            for (int i3 = 0; i3 < length3; i3++) {
                JSONObject jSONObject2 = optJSONArray3.getJSONObject(i3);
                try {
                    Email email = new Email(jSONObject2.getLong("id"), jSONObject2.getString(RTCStatsConstants.KEY_ADDRESS));
                    profilesSimpleInfo.d.put(Long.valueOf(email.b), email);
                } catch (JSONException e) {
                    throw new VKApiIllegalResponseException(e);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length4 = optJSONArray4.length();
        for (int i4 = 0; i4 < length4; i4++) {
            Contact a2 = z7j.a(optJSONArray4.getJSONObject(i4));
            linkedHashMap.put(Long.valueOf(a2.b), a2);
        }
        profilesSimpleInfo.c.putAll(linkedHashMap);
        return profilesSimpleInfo;
    }
}
