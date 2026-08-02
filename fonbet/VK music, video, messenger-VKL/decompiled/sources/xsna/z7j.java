package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.contacts.Contact;
import org.json.JSONObject;

/* compiled from: ContactApiParser.kt */
/* loaded from: classes2.dex */
public final class z7j {
    public static final Contact a(JSONObject jSONObject) {
        long j = jSONObject.getLong("id");
        String string = jSONObject.getString("name");
        String string2 = jSONObject.getString("phone");
        ImageList a = pr5.a(jSONObject);
        String string3 = jSONObject.has("local_name") ? jSONObject.getString("local_name") : "";
        String string4 = jSONObject.has("local_phone") ? jSONObject.getString("local_phone") : "";
        boolean z = jSONObject.has("new_user") ? jSONObject.getBoolean("new_user") : false;
        String string5 = jSONObject.has("device_local_id") ? jSONObject.getString("device_local_id") : "";
        Long z2 = f370.z(jSONObject, "user_id");
        Contact.LastSeenStatus.a aVar = Contact.LastSeenStatus.Companion;
        String optString = jSONObject.optString("last_seen_status");
        aVar.getClass();
        return new Contact(j, string, string2, string3, string4, z, a, string5, z2, 0L, 0L, Contact.LastSeenStatus.a.a(optString), jSONObject.has("can_write") ? jSONObject.getBoolean("can_write") : true, jSONObject.has("can_call") ? jSONObject.getBoolean("can_call") : true, f370.A("calls_id", jSONObject));
    }
}
