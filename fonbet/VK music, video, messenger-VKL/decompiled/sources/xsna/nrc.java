package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.clips.ClipsDraftMusicOld;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.log.L;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ClipDraftJsonMigration4to5.kt */
/* loaded from: classes14.dex */
public final class nrc extends be {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    @Override // xsna.be
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject S(JSONObject jSONObject) {
        StoryMusicInfo storyMusicInfo;
        StoryMusicInfo storyMusicInfo2;
        JSONArray jSONArray = new JSONArray();
        JSONArray optJSONArray = jSONObject.optJSONArray("stickers");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(jSONObject2);
                jSONArray.put(jSONArray2);
            }
        }
        jSONObject.put("stickers", jSONArray);
        StoryMusicInfo.a aVar = StoryMusicInfo.o;
        if (jSONObject.has("editor_music")) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("editor_music");
                aVar.getClass();
                storyMusicInfo = new StoryMusicInfo(jSONObject3);
            } catch (JSONException e) {
                L.i(e);
            }
            storyMusicInfo2 = storyMusicInfo;
            if (storyMusicInfo2 != null) {
                jSONObject.put("editor_music", new ClipsDraftMusicOld(storyMusicInfo2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 6, null).e5());
            }
            return jSONObject;
        }
        storyMusicInfo = null;
        storyMusicInfo2 = storyMusicInfo;
        if (storyMusicInfo2 != null) {
        }
        return jSONObject;
    }
}
