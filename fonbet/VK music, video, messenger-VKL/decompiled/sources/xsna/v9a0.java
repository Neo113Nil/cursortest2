package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* compiled from: PhotoGetPhotoWithRecognitionTags.kt */
/* loaded from: classes15.dex */
public final class v9a0 extends rsg0<List<? extends Photo>> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        if (optJSONObject == null) {
            return EmptyList.b;
        }
        Serializer.c<TagsSuggestions> cVar = TagsSuggestions.CREATOR;
        List<TagsSuggestions.Item> list = TagsSuggestions.a.a(optJSONObject, null).i;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (TagsSuggestions.Item item : list) {
            Photo photo = item.e;
            photo.b = item.f;
            arrayList.add(photo);
        }
        return arrayList;
    }
}
