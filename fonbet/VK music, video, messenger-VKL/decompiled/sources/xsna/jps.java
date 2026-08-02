package xsna;

import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: FriendsHideSuggestion.java */
/* loaded from: classes14.dex */
public final class jps extends rsg0<Integer> {
    public jps(UserId userId) {
        super("friends.hideSuggestion");
        if (TextUtils.isEmpty(null) || fkq0.c(userId)) {
            F(userId, "user_id");
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        return 1;
    }
}
