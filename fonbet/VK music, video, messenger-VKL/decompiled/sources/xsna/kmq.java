package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: FaveAddPodcast.kt */
/* loaded from: classes14.dex */
public final class kmq extends rsg0<Boolean> {
    public final UserId s;
    public final int t;

    public /* synthetic */ kmq(UserId userId, int i, String str) {
        this(userId, i, str, null);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        boolean z = jSONObject.getInt("response") == 1;
        if (z) {
            xqq.b.ie(this.t, this.s, true);
        }
        return Boolean.valueOf(z);
    }

    public kmq(UserId userId, int i, String str, String str2) {
        super("fave.addPodcastEpisode");
        this.s = userId;
        this.t = i;
        F(userId, "owner_id");
        C(i, "episode_id");
        if (str != null && str.length() != 0) {
            K("ref", str);
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        K("track_code", str2);
    }
}
