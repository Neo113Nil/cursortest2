package xsna;

import com.vk.dto.group.Group;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccountGetCommentGroups.java */
/* loaded from: classes14.dex */
public final class eo extends aay<Group> {
    @Override // xsna.aay
    public final Group a(JSONObject jSONObject) throws JSONException {
        return new Group(jSONObject);
    }
}
