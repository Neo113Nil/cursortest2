package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.music.PlaylistLink;
import org.json.JSONObject;

/* compiled from: AudioFollowPlaylist.java */
/* loaded from: classes14.dex */
public final class ro4 extends rsg0<PlaylistLink> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        return new PlaylistLink(jSONObject.optJSONObject("response"));
    }
}
