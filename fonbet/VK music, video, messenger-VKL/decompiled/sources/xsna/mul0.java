package xsna;

import com.vk.dto.stories.model.StoryEntry;
import org.json.JSONObject;

/* compiled from: StoriesSave.kt */
/* loaded from: classes15.dex */
public final class mul0 extends rsg0<StoryEntry> {
    public JSONObject s;

    public mul0(String str) {
        super("stories.save");
        K("upload_results", str);
    }

    public final JSONObject F0() {
        return this.s;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        this.s = jSONObject.getJSONObject("response").getJSONArray("items").getJSONObject(0);
        return new StoryEntry(this.s);
    }
}
