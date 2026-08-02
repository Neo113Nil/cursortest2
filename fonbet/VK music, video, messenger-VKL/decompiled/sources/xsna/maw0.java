package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerRender;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VmojiQueueEvent.kt */
/* loaded from: classes5.dex */
public final class maw0 implements dre0<List<? extends StickerRender>> {
    public final UserId a;

    public maw0(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.dre0
    public final List<? extends StickerRender> a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null) {
            return EmptyList.b;
        }
        try {
            JSONArray jSONArray = optJSONObject.getJSONArray("sticker_renders");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                Serializer.c<StickerRender> cVar = StickerRender.CREATOR;
                arrayList.add(StickerRender.a.a(jSONObject2));
            }
            return arrayList;
        } catch (JSONException unused) {
            return EmptyList.b;
        }
    }

    @Override // xsna.dre0
    public final String b() {
        return "vmoji_" + this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof maw0) && epx.f(this.a, ((maw0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("VmojiQueueEvent(userId="), this.a, ')');
    }
}
