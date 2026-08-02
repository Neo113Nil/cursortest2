package xsna;

import com.ironsource.Hb;
import com.vk.dto.live.LiveSpectators;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AudioSave.java */
/* loaded from: classes14.dex */
public final class yw4 extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw4(String str, String str2, String str3) {
        super("audio.save");
        this.s = 0;
        K("audio", str);
        K("hash", str2);
        K(Hb.a, str3);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                try {
                    return new MusicTrack(jSONObject.getJSONObject("response"));
                } catch (Exception e) {
                    L.E(e, new Object[0]);
                    return null;
                }
            case 1:
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray("response");
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(new Photo(jSONArray.getJSONObject(i)));
                }
                return arrayList;
            default:
                return new LiveSpectators(jSONObject.getJSONObject("response"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw4(String str, int i) {
        super("photos.getById");
        this.s = i;
        switch (i) {
            case 2:
                super(str);
                break;
            default:
                K("photos", str);
                C(1, "photo_sizes");
                C(1, "extended");
                break;
        }
    }
}
