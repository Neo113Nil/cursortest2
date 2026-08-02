package xsna;

import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* compiled from: GroupsGetById.java */
/* loaded from: classes15.dex */
public final class rpu extends rsg0<Group> {
    public static final String[] s = {"members_count", "is_closed", "start_date", "can_message", "is_messages_blocked", "member_status", "ban_info", "is_market_cart_enabled", "enabled_features"};

    public rpu(UserId userId) {
        this(userId, s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            return new Group(jSONObject.getJSONObject("response").getJSONArray("groups").getJSONObject(0));
        } catch (Exception e) {
            L.e("error", e);
            return (Group) jSONObject;
        }
    }

    public rpu(UserId userId, String[] strArr) {
        super("groups.getById");
        F(userId, "group_ids");
        K("fields", TextUtils.join(StringUtils.COMMA, strArr));
        ahn.D(this);
    }
}
