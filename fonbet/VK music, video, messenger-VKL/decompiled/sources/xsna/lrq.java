package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: FaveRemovePodcast.kt */
/* loaded from: classes14.dex */
public final class lrq extends rsg0<Boolean> {
    public final UserId s;
    public final int t;

    public lrq(UserId userId, int i, String str) {
        super("fave.removePodcastEpisode");
        this.s = userId;
        this.t = i;
        F(userId, "owner_id");
        C(i, "episode_id");
        K("ref", str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        boolean z = jSONObject.getInt("response") == 1;
        if (z) {
            xqq.b.ie(this.t, this.s, false);
        }
        return Boolean.valueOf(z);
    }
}
