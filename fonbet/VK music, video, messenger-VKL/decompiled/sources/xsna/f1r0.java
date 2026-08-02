package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UsersGetSubscriptions.java */
/* loaded from: classes15.dex */
public final class f1r0 extends aay<UserProfile> {
    @Override // xsna.aay
    public final UserProfile a(JSONObject jSONObject) throws JSONException {
        return (jSONObject.has("type") && ("page".equals(jSONObject.getString("type")) || "group".equals(jSONObject.getString("type")) || NotificationCompat.CATEGORY_EVENT.equals(jSONObject.getString("type")))) ? new UserProfile(new Group(jSONObject)) : new UserProfile(jSONObject);
    }
}
