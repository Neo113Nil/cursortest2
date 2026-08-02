package xsna;

import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistOwner;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.aay;

/* compiled from: AudioGetPlaylists.java */
/* loaded from: classes14.dex */
public final class gp4 extends rsg0<com.vk.dto.music.a> {
    public final UserId s;

    /* compiled from: AudioGetPlaylists.java */
    public static final class a {
        public final UserId a;
        public String b;
        public int c;
        public int d;
        public String e;

        public a(UserId userId) {
            this.a = userId;
        }
    }

    public gp4(a aVar) {
        super("audio.getPlaylists");
        UserId userId = aVar.a;
        this.s = userId;
        if (TextUtils.isEmpty(aVar.e)) {
            C(aVar.c, SignalingProtocol.KEY_OFFSET);
            C(aVar.d, "count");
        } else {
            K("start_from", aVar.e);
        }
        if (!"all".equals(aVar.b)) {
            G("filters", Collections.singletonList(aVar.b));
        }
        C(1, "extended");
        K("fields", "first_name_gen,sex");
        F(userId, "owner_id");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        VKList vKList = new VKList(jSONObject2, Playlist.Q);
        ArrayList a2 = aay.a.a(jSONObject2, "profiles", UserProfile.g0);
        ArrayList a3 = aay.a.a(jSONObject2, "groups", Group.z0);
        dlv dlvVar = new dlv();
        dlvVar.b(a2);
        dlvVar.a(a3);
        dlvVar.d(vx2.d.c(), vKList);
        return new com.vk.dto.music.a(vKList, (PlaylistOwner) ((LinkedHashMap) dlvVar.b).get(this.s));
    }
}
