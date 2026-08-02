package xsna;

import com.vk.dto.actionlinks.ActionButtonStat;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GetRandomPodcastEpisode.kt */
/* loaded from: classes15.dex */
public final class qtt extends rsg0 {
    public final /* synthetic */ int s = 0;

    public qtt() {
        super("podcasts.getRandomEpisode");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                if (optJSONObject != null) {
                    return new MusicTrack(optJSONObject);
                }
                return null;
            default:
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray("response");
                int length = jSONArray.length() - 1;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        arrayList.add(new ActionButtonStat(jSONArray.getJSONObject(i)));
                        if (i != length) {
                            i++;
                        }
                    }
                }
                return arrayList;
        }
    }

    public qtt(UserId userId, int i) {
        super("video.getActionButtonsStats");
        F(userId, "owner_id");
        C(i, "video_id");
        C(1, "extended");
        C(3, "func_v");
    }
}
