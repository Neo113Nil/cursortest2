package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vkontakte.android.R;
import org.json.JSONObject;

/* compiled from: BoardGetTopics.java */
/* loaded from: classes6.dex */
public final class ai7 extends rsg0<fj7> {
    public ai7(UserId userId, int i) {
        super("board.getTopics");
        F(userId, "group_id");
        C(i, "topic_ids");
        C(1, "extended");
        C(2, "preview");
        C(150, "preview_length");
        K("fields", "sex,online,online_info,screen_name,photo_base");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            return new fj7(jSONObject.getJSONObject("response"), vx2.d.b(), new zj(5), new ak(3), vx2.d.getContext().getResources().getString(R.string.attachment));
        } catch (Exception e) {
            L.C("vk", e);
            return null;
        }
    }
}
