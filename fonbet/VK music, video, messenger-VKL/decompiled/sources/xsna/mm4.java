package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import java.util.List;
import org.json.JSONObject;

/* compiled from: AudioCreatePlaylist.kt */
/* loaded from: classes14.dex */
public final class mm4 extends rsg0 {
    public final /* synthetic */ int s = 0;

    public /* synthetic */ mm4(String str) {
        super(str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return new Playlist(jSONObject.getJSONObject("response"));
            default:
                return jSONObject.getJSONObject("response").optString("url", null);
        }
    }

    public mm4(UserId userId, String str, String str2, List list) {
        super("audio.createPlaylist");
        F(userId, "owner_id");
        K("title", str);
        K("description", "");
        G("audio_ids", list);
        K("ref", str2);
    }
}
