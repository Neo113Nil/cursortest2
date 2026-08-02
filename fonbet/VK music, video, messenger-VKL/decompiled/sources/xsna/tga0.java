package xsna;

import com.ironsource.Hb;
import com.vk.dto.common.id.UserId;
import com.vk.dto.live.LiveSpectators;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import com.vkontakte.android.attachments.PhotoAttachment;
import org.json.JSONObject;

/* compiled from: PhotosSaveMessagesPhoto.java */
/* loaded from: classes6.dex */
public final class tga0 extends rsg0 {
    public final /* synthetic */ int s = 2;

    public tga0(int i, UserId userId) {
        super("video.liveGetSpectators");
        C(i, "video_id");
        F(userId, "owner_id");
        C(300, "count");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                try {
                    return new PhotoAttachment(new Photo(jSONObject.getJSONArray("response").getJSONObject(0)));
                } catch (Exception e) {
                    L.E(e, new Object[0]);
                    return null;
                }
            case 1:
                return new LiveSpectators(jSONObject.getJSONObject("response"));
            default:
                return Boolean.TRUE;
        }
    }

    public tga0(String str, String str2, String str3) {
        super("photos.saveMessagesPhoto");
        K(Hb.a, str);
        K("photo", str2);
        K("hash", str3);
        C(1, "photo_sizes");
    }

    public tga0() {
        super("stats.trackInstalledApps");
    }
}
